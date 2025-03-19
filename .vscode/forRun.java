

class demo
{
    String name;
}
class forRun
{
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {

        demo obj= new demo();
        obj.name="AShok";
        demo f2 =new demo();
        f2.name="Sai";
        demo students[]=new demo[2];
        students[0]=obj;
        students[1]=f2;
        for(demo n:students)
        {
            System.err.println("n");
        }

    }
}