package ConstructorOverloading;

public class Student {
    static String clgname = "Saraswati";
    String sname;
    int age;
    String gender;
    int year;
    String bg;
    double fees; 
    String stream;

// 1st Constructor - when we dont have student details but we have to create object.
    Student()             
    {
        System.out.println(this);
    }

// 2nd Constructor - when we know all the details of the student.
    Student(String sname, int age, String gender, int year, double fees,  String stream, String bg)
    {
        System.out.println(this);
        this.sname=sname;
        this.age=age;
        this.gender=gender;
        this.year=year;
        this.fees=fees;
        this.stream=stream;
        this.bg=bg;
    } 

// 3rd Constructor - when we know all the details of the student except bloodgroup.
    Student(String sname, int age, String gender, int year, double fees,  String stream)
    {
        System.out.println(this);
        this.sname=sname;
        this.age=age;
        this.gender=gender;
        this.year=year;
        this.fees=fees;
        this.stream=stream;
    }

// 4th Constructor - when student doesn't know about fees and stream not decided.
    Student(String sname, int age, String gender, int year, String bg)
    {
        System.out.println(this);
        this.sname=sname;
        this.age=age;
        this.gender=gender;
        this.year=year;
        this.bg=bg;
    }


// non-static method to display details.
public void printDetails()
    {
    System.out.println("Student College: "+Student.clgname);
    System.out.println("Student Name: "+sname);
    System.out.println("Student Age: "+age);
    System.out.println("Student Gender: "+gender);
    System.out.println("Student Year: "+year );
    System.out.println("Student Fees: "+fees);
    System.out.println("Student Stream: "+stream);
    System.out.println("Student Blood Group: "+bg);
    System.out.println("==========================================");
    }
}
