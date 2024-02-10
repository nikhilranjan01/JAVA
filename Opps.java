
class Pen{
    String Color;
    String type;
    public void write()  {
        System.out.println("Writing somethings");
    }
}
public class Opps {
    public static void main(String args []){
        Pen pen1 =new Pen();
        pen1.Color= "yellow";
        pen1.type="gel";

        pen1.write();
    }
}
