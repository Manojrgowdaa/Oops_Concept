
class upcasting {
	public static void main(String[] args) {
		emp f = new ceo();
		 emp f1 = new cto();
		 
		 ceo c = (ceo)f;
		        
	            f.earn();
	            c.play();
		
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