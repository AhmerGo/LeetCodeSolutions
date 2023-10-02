public class ExamTwoDriver {
    public static void main(String[] args){


        StudentAthlete a = new StudentAthlete(123, "John", 0);
        StudentT b = new StudentT(321,"Jose");
        StudentAthlete c = new StudentAthlete(93, "Nate", 1);
        StudentT d = new StudentT(872,"Alden");


        StudentT[] container = {a,b,c,d};


        // set the gpa of both students to 2.75 
        b.setGpa(2.75);
        a.setGpa(2.75);
        c.setGpa(2.9);
        d.setGpa(3.0);

        // student a is an athlete and has been playing for 2 years.
        a.setYearsPlayed(2);
        c.setYearsPlayed(1);
        
        // a qualifies for a scholarship despite only having a 2.75 gpa while b doesn't as isn't a student athlete.
        System.out.println("John's qualification: " + a.qualifiesForScholarship());
        System.out.println("Jose's qualifcation: " + b.qualifiesForScholarship());

        display(container);
    }

    // If the student or studentathlete object returns true in the qualifiesFOrScholarship method then we will display the student's name.
    public static void display(StudentT[] container) {
        for(StudentT a : container ) { 
            if(a.qualifiesForScholarship()) {
                System.out.println(a);
            }
        }
    }





}