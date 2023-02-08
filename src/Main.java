public class Main {
    public static void main(String[] args) {



        Student StudentIR = new Student("Ian", "Rigden", 21);
        System.out.println(StudentIR.getfName() + " " + StudentIR.getlName() + ", age : " + StudentIR.getAge() + " hah!");

        Student student3 = new Student("Bilbo", "Baggins", 129); // Jen
        System.out.println(student3.getfName() + " " + student3.getlName() + ", age : " + student3.getAge());

        Student student4 = new Student("David", "Bowie", 70); // Nick
        System.out.println(student4.getfName() + " " + student4.getlName() + ", age : " + student4.getAge());

        Student student5 = new Student("Luna", "Lovegood", 16); // Eve
        System.out.println(student5.getfName() + " " + student5.getlName() + ", age : " + student5.getAge());

        Student student6 = new Student("Jim", "Hawkins", 19); // Jeanne
        System.out.println(student6.getfName() + " " + student6.getlName() + ", age : " + student6.getAge());

        Student student10 = new Student("Adam", "Brown", 13); // Ana
        System.out.println(student10.getfName() + " " + student10.getlName() + ", age : " + student10.getAge());

        Student student8 = new Student("John", "Smith", 24); // Martin
        System.out.println(student8.getfName() + " " + student8.getlName() + ", age : " + student8.getAge());



        Student student9 = new Student("Axel", "Folley", 42); // Muz
        System.out.println(student9.getfName() + " " + student9.getlName() + ", age : " + student9.getAge());

        Student student15 = new Student (fName: "Lex", lName: "luthor", age: 46); //Alex
        System.out.println(student15.getfName() + " "+student15.getlName() + ", age :" + student15.getAge());

        Student student1 = new Student("Arthur", "lewis", 32); // Harry
        System.out.println(student1.getfName() + " " + student1.getlName() + ", age : " + student1.getAge());
    }


}
