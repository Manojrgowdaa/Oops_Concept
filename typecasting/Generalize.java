

public class Generalize {
	public static void main(String[] args) {
		Father1 f = new Son();
		        f = new brother();
		        
	            f.earn();
		
	}

}
class Father1{
	void earn() {
		System.out.println("earning");
		
	}
}
class Son extends Father1{
	void play() {
		System.out.println("playing");
	}
}
class brother extends Father1{
	void work() {
		System.out.println("working");
	}
}