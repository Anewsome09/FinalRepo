
public class MethodParameters {

	public static void main(String[] args) {
        //create a class instance
        MethodParameters mp = new MethodParameters();

        //call your method here
        double d = mp.convertIntToDouble(89);

        //print the value to the console
        System.out.println(d);

        //call the 2nd method here
        System.out.println(mp.sum(3.0, 5, 8));
    }

    //create your first method here
    public double convertIntToDouble(int num){
        return (double)num;
    }

    //new sum method here
    public double sum(double num1, int num2, int num3){
        return num1 + num2 + num3;
    } 
}
