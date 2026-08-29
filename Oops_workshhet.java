

/*class Player {
String name;
int score;
boolean active;
}

public class Oops_workshhet {
    public static void main(String[] args) {
     Player p = new Player();
System.out.println(p.name);
System.out.println(p.score);
System.out.println(p.active);
    }
}
// my anss= it will priint nothing since we just created a class and we did not assign any values to the variables. the variables
// after runnign it printed null,0,false whch are default values of the variables.
// how many objects exist in memory after the line class Player { ... } is
compiled, but before main runs?  there exist 0 objects in memory after the line class Player { ... } is compiled,
 but before main runs. because we have not created any object yet.*/
/* 
class Player {
        String name;
        int score;
        boolean active;
    }  
 public class Oops_workshhet {
  public static void main(String[] args) {
    Player p1 = new Player();
p1.name = "Riya";
p1.score = 50;
Player p2 = p1; 
p2.score = 90;
Player p3 = new Player();
p3.name = "Riya";
p3.score = 90;
System.out.println(p1.score);
System.out.println(p1 == p2);
System.out.println(p1 == p3); 

 }
}
// e didnt tovh the value of p1.score but it printed 90 because p2 is a reference, kinda autoatic  
// pointer in c variable which is pointing to the same object as p1. so when we changed the value of
//  p2.score it also changed the value of p1.score.
//p1 and p3 hold identical data. but still p1==p3 is false because they are two different objects in memory. while p1 and p2 are pointing to the same object in memory so p1==p2 is true.
class Account {
private long balance;
 void Account(long opening) {
balance = opening;
}
long balance() { 
    return balance;
}
}
public class Oops_workshhet {
  public static void main(String[] args) {
   Account acc = new Account(5000);
System.out.println(acc.balance());

 }}
 //void makes the acc method not a constructor s.. 

class Student {
String name;
int marks;
Student(String name, int marks) {
  this.name = name;
  this.marks = marks;
}
}
public class Oops_workshhet {
  public static void main(String[] args) {
   Student s = new Student("Riya", 88);
System.out.println(s.name + " " + s.marks);

 }}
 // it prints null , 0
 //name = name; in this it is assigning the parameter name to itself and not to the instance variable name. ;
 // i change this to this.name = name; and marks to this.marks = marks; and it printed Riya 88 because this.name refers to thevariable name of the current object and this.marks refers to the variable marks of the current object.

class Ticket {
static int issued = 0; // note the keyword
int id;
Ticket() {
issued++;
id = issued;
}
}
public class Oops_workshhet{
  public static void main(String[] args) {
  Ticket t1 = new Ticket();
Ticket t2 = new Ticket();
Ticket t3 = new Ticket();
System.out.println(t1.id + " " + t2.id + " " + t3.id);
System.out.println(Ticket.issued);
System.out.println(t1.issued);

 }}*/
 // this will print 1 2 3 and 3 and 1 coz when t1 is created issued is incremented to 1 ;
 // no copis of issued creadted coz they inc only one issue var i feel and  3 copis of id, coz of 3 difff obj;
/*public class Oops_workshhet{
    
  public static void main(String[] args) {
    int counter = 0;
  counter++;
System.out.println(counter);

}}

a) Explain the error in your own words. Which object was counter supposed to belong to?
it shuod belong to static ( i know it coz of hte error idk, maybe it isnt in main part yet
b) Fix it in two different ways, and write both. Then say in one line when you would choose each.
added static to counter and it worked, also shhifte htaht counter in main method and it worked. i would choose static when i want to use SOMEWHERE ELSE TOO and i would choose to shift it in main method when i want to use it only in main method.
 c) Connected question, and it is asked in interviews: why is main itself declared static?
 IDK, ILL REFER ANSWER KEY
/*
8th  
class bankaccount{
    private String holder;
    private long balance;


bankaccount(String holder, long balance){
if(balance<0){
    throw new IllegalArgumentException("Balance cannot be negative");
}
else{
    this.holder=holder;
    this.balance=balance;
}
    }

public void deposit(long amount){
        balance+=amount;
    }
public long withdraw(long amount){
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance-=amount;
        return balance;
    }
public String Summary(){
    return "Account Holder: " + holder + "\nAccount Balance: " + balance;

}
}
public class Oops_workshhet{
    
  public static void main(String[] args) {
    bankaccount b1 = new bankaccount("Rohit", 1000);
    System.out.println(b1.Summary());   
  }}*/


/*
class Player {
String name;
int score;

static void giveBonus(Player p) {
p.score += 10;
}
static void reset(Player p) {
p.score = 0;
}
}
public class Oops_workshhet {
    
public static void main(String[] args) {
Player hero = new Player();
hero.name = "Karan";
hero.score = 50;
hero.giveBonus(hero);
System.out.println(hero.score);
hero.reset(hero);
System.out.println(hero.score);
}
}
 
a) Write the two lines this prints.
60 60
b) Both methods received the same variable. Why did one of them change hero and the other one did not?
because in giveBonus method we are modifying the score of the object that hero is pointing to, 
while in reset method we are creating a new Player object and assigning it to the local variable p,
 which does not affect the original hero object.
c) Rewrite reset so that it does reset the caller's player.
done just removed the the  new object creating this
*/

class Employee {
    static final String company = " Codeverse labs"; 
    static int headcount = 0;
    int id;
    String name;
    int salarypraise;

    public Employee(String name, int salarypraise) {
        headcount++;
        this.id = headcount;
        this.name = name;
        this.salarypraise = salarypraise;
    }
    void raise(int amount) {
        salarypraise += amount;
    }
    String card() {
        return "E"+id + "|" + name + "|" + salarypraise + "|" + company;
    }
}
public class Oops_workshhet {
    public static void main(String[] args) {
    Employee  e1 = new Employee("riya", 50000);
    Employee  e2 = new Employee("karran", 50000);
    System.out.println(e1.card());
    System.out.println(e2.card());
    System.out.println(Employee.headcount);
    } 
}