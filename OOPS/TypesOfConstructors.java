public class TypesOfConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Owesh" , 51);
        s2.password = 34235345;
        System.out.println(s2.name + " " + s2.rollnum + " " + s2.password);
        s2.marks[0] = 100;
        s2.marks[1] = 40;
        s2.marks[2] = 600;

        //COpying Constructor
        Student s3 = new Student(s2);
        System.out.println(s3.name + " " + s3.rollnum + " " + s3.password );
        s2.marks[2] = 544;
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s3.marks[i]);
        }
    }
}

class Student{
    String name;
    int rollnum;
    long password;
    int marks[];

    //Default
    Student(){
        System.out.println("Hello Bra I'am default Constructor HeHeEh");
    }

    //Parameterize
    Student(String name , int rollnum){
        marks = new int[3];
        this.name = name;
        this.rollnum = rollnum;
    }

    //shallow Copy Constructor
    // Student(Student s2){
    //     marks = new int[3];
    //     marks = s2.marks;
    //     this.name = s2.name;
    //     this.rollnum = s2.rollnum;
    //     this.password = s2.password;
    // }

    //deep copy Constructor
    Student(Student s2){
        marks = new int[3];
        this.name = s2.name;
        this.rollnum = s2.rollnum;
        this.password = s2.password;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = s2.marks[i];
        }
    }
}