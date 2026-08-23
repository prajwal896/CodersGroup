
public class Opps {
    final String college = "indira";
    static int strength = 60;
        int rollno;
        String name;
        int marks;

        public  Opps (int rollno, String name, int marks) {
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
            this.strength = strength+1;
        }
        public Opps (int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
            this.marks = 0;
            this.strength = strength+1;
        }
        public String grade(int marks) {
            if (marks >= 90) {
                return "A";
            }
            else if (marks >= 80) {
                return "B";
            } 
            else if (marks >= 70) {
                return "C";
            } 
            else if (marks >= 60) {
                return "D";
            } 
            else {
                return "Fail";
            }
        }
    public static void main(String[] args) {
        /*
        Opps bca[]={
            new Opps(1,"Rohit",90),
            new Opps(2,"Ramesh",80),
            new Opps(3,"Suresh",70),
            new Opps(4,"Mahesh",60),
            new Opps(5,"Rajesh",50)
        };
        foreach looopke sath
        for (Opps i : bca) {
            System.out.println("strength = " + i.strength + " college = " + i.college + " roll no- " + i.rollno + " name = " + i.name + " marks = " + i.marks);
        }
        //for loop kesath
        for (int i = 0; i < bca.length; i++) {
            System.out.println( "strength = " + bca[i].strength + " college = " + bca[i].college + " roll no- " + bca[i].rollno + " name = " + bca[i].name + " marks = " + bca[i].marks);
        }
        System.out.println("strength="+ Opps.strength);*/
        /* 
        Opps praj = new Opps(45,"prajwall");
        System.out.println("strength="+ praj.strength + " roll no- " + praj.rollno + " name = " + praj.name + " marks = " + praj.marks);
    */
    Opps s1= new Opps(6,"Suresh",85);
    Opps s2= new Opps(7,"Ramesh",75);
    Opps s3= new Opps(8,"Mahesh",65);
    Opps s4= new Opps(9,"Rajesh",55);
    Opps s5= new Opps(10,"Rohit",45);
    System.out.println("Grade for S3: " + s3.grade(65));
        }
}