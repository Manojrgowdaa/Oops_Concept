
 class downcasting {
	public static void main(String[] args) {
		emp f = new ceo();   
	            f.earn();	
	}

}
class emp{
	void earn() {
		System.out.println("earning");
		
	}
}
class ceo extends emp{
	void play() {
		System.out.println("playing");
	}
}
class cto extends emp{
	void work() {
		System.out.println("working");
	}
}