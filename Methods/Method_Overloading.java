package Methods;

public class Method_Overloading { 
    //Method overloading : method having same name but different parameters
    public static void main(String[] args) {
        System.out.println("Calling function 1 : " + add(10,20));

        System.out.println("Calling function 1 : " + add(10,20,30));

        System.out.println("Calling function : " + add (10.3,28.3));
    }

    public static int add (int x,int y) {
        return x+y;
    }

    public static int add(int x,int y,int z) {
        return x+y+z;
    }

    public static double add(double x, double y){
        return x+y;
    } 
    
}
