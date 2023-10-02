public class Student extends Person {
    private int studentID;

    public Student() { 
        super();
        studentID = 0;
    }

    public Student(String name, int age, int studentID) {
        super(name,age);
        this.studentID = studentID;
    }

   
    public boolean equals(Student other) { 
        
        // if(this.getName() == other.getName() && this.getAge() == other.getAge() && this.studentID == other.studentID) {
        //     return true;
        // }else{
        //     return false;
        // }

        return this.getName() == other.getName() && this.getAge() == other.getAge() && this.studentID == other.studentID ? true : false;
    }


    


}