public class Oops{
private final long balance;
private final String curr;
public Oops(long balance, String curr){
    if(balance<0){
        throw new IllegalArgumentException("garreb");
    }
    else{
this.balance=balance;
    }
    if(curr==null || curr.isEmpty()){
        throw new IllegalArgumentException("kaha hai hai yee currncy???");
    }else{
this.curr=curr;
    }
}
public static Oops paise(long balance, String curr){
    return new Oops(balance*100, curr);
}
public Oops plus(long c, String curr){
    if(curr==null || curr.isEmpty() || this.curr.equals(curr)){
        throw new IllegalArgumentException("kaha hai hai yee currncy???");
    }
    return new Oops(balance+c, curr);
}
    public static void main(String[] args) {
       
    }}