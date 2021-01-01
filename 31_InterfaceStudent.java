
interface Student{
    String name="",id="";
    int age=0;
    void display();
}

class UG_Student implements Student{
    String name,id;
    int age;
    UG_Student(String a,String b,int c){
        name=a;
        id=b;
        age=c;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Age: "+age);
    }
}
class PG_Student implements Student{
    String name,id;
    int age;
    String qualification="Ug Pass";
    PG_Student(String a,String b,int c){
        name=a;
        id=b;
        age=c;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
    }
}

class Main{
    public static void main (String[] args) {
        UG_Student t1=new UG_Student("kevin","123",19);
        PG_Student t2= new PG_Student("Scott","1245",23);
        t1.display();
        t2.display();
    }
}




