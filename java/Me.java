class Parentproperties{
    double land=0.1;
    int plots=2;
    long balance=100000;
    void summary(){
        System.out.println("land = "+land+" plots = "+plots+" balance = "+balance);
    }
}

public class Me extends Parentproperties{
public static void main(String[] args) {
    Me prajwal = new Me();
    prajwal.summary();
    
}
}