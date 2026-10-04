
public class fourth {

    public static void main(String[] args) {
        int items = 50;
        float cost = 9.99f;
        float total = cost * items;
        System.out.println("total coast is : " + total + "$");

    }
}

class Solution {
    public int countSeniors(String[] details) {
        for (i = 0; i < details.length; i++) {
            int a = details[i][11];
            int b = details[i][12];
            int number = 0;
            if (a >= 6 && b > 0) {
                number++;
            }
        }
        return number;
    }
}