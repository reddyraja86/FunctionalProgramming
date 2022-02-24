package Programming;

final class Immutable{
	private int i;
	
	Immutable(int i){
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public Immutable setI(int i) {
		if(this.i == i) {
			return this;
		}else {
			Immutable newObj = new Immutable(i);
			return newObj;
		}
		
	}
	
}


public class ImmutableTest {

	public static void main(String[] args) {

		Immutable i1= new Immutable(1);
		System.out.println(i1.hashCode());
		
		//try to chnage the value of object
		Immutable i2 = i1.setI(1);
		System.out.println(i2.hashCode());
		
		Immutable i3= new Immutable(2);
		System.out.println(i3.hashCode());
	}

}
