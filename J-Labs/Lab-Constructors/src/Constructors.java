
public class Constructors {
	
	 public Constructors(){
	        System.out.println("Default constructor ran.");
	    }

	public Constructors(int value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        //create instances here
    	
    	Constructors s = new Constructors(963);
    	
    	Constructors cNoArg = new Constructors();
    }
}
