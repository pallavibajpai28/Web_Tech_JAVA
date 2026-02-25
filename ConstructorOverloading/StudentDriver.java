package ConstructorOverloading;

public class StudentDriver {
    
    public static void main(String[] args) 
    {
        Student s1 = new Student(); //no student data available, 1st constructor is called.
        System.out.println(s1);
        s1.printDetails();

        Student s2 = new Student("Pallavi", 20, "Female", 1, 97000, "IT", "B+ve");   //all details are known
        System.out.println(s2);
        s2.printDetails();

        Student s3 = new Student("Anmol", 24, "Male", 4, 80000, "AI/ML"); //bloodgroup unknown.
        System.out.println(s3);
        s3.printDetails();

        Student s4 = new Student("Harshit", 20, "Male", 1, "AB+ve");   //fees and stream unknown.
        System.out.println(s4);
        s4.printDetails();

        Student s5 = new Student("Vaibhavi", 22, "Female", 2, 70000, "MECH", "B+ve");   //all details are known.
        System.out.println(s5);
        s5.printDetails();
    }
}
