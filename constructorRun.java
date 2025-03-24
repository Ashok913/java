class human
{
    // private String name;
     //private int age;
     String name;
     int age;
    //public human()
    //{
       // name="Ashok";
       // age=25;
       // System.out.println("im construcor");
    //}
    public human(String name,int age)
    {
        this.name=name;
        this.age=age;

    }
   // public String demo()
   // {
        //return name;
   // }
   // public int disc()
    //{
       // return age;
    //}
    public static void main(String[] args) {
        human obj=new human("Ashok",24);
        //System.out.println(obj.demo()+":"+obj.disc());
      System.out.println(obj.name+":"+obj.age);
    }
}