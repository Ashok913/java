 class statica
{
    static {
        System.out.println("im static");
    }

    

    static public void disc() {
        System.out.println("im constructor");
    }
    
   
}
public class staticRun{

    
    public static void main(String[] args)   {
        //statica obj1=new statica();
        //System.out.println(obj1);
        statica.disc();

    }

}