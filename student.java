

class tudent
{
    String name;
    int age;
    int marks;
}

class student
{
    public static void main(String[] args) {
      
        tudent s=new tudent();
        s.name="Vamshi";
        s.age=28;
        s.marks=79;
        tudent s1=new tudent();
        s1.name="Sai";
        s1.age=26;
        s1.marks=78;
        tudent s2=new tudent();
        s2.name="Ashok";
        s2.age=25;
        s2.marks=76;
          tudent students[]=new tudent[3];
          students[0]=s;
          students[1]=s1;
          students[2]=s2;

        for(int i=0;i<=3;i++)
        {
            System.out.println(students[i].name +": "+ students[i].age+ " :" +students[i].marks);
        }
        System.out.println("");
    }
}