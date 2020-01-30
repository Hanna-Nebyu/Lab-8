package Day2;

import java.util.function.Function;
public class Prob1_MyClass {
	
	private int x;
	private String y;

	public Prob1_MyClass(int x, String y) {

		this.x=x;

		this.y=y;
	}
	
	public void mymethod(Prob1_MyClass clas) {

		Function<Prob1_MyClass, Boolean> funct=this::equals;

		System.out.println(funct.apply(clas));

	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj==null)

			return false;

		if(obj.getClass()!=this.getClass())

			return false;

		Prob1_MyClass objclas=(Prob1_MyClass)obj;

		return (objclas.x==this.x&&objclas.y.equals(this.y));
	}

	public static void main(String[] args) {

		Prob1_MyClass m=new Prob1_MyClass(1, "xx");

		Prob1_MyClass m2=new Prob1_MyClass(1, "xx");

		Prob1_MyClass m3=new Prob1_MyClass(2, "ds");

		m.mymethod(m2);

		m.mymethod(m3);

	}

}