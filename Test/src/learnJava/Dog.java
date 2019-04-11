package learnJava;
interface pet
{
	public void test();
	int a=0;
	
}
public class Dog implements pet {
	public void test()
	{
		System.out.println("Interface method implemented");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pet P=new Dog();
		P.test();

	}

}
