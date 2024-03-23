//Similar to javascript rest(...args) parameters
public class VarAgrs {
    static int sum(int a, int ...arr) {
        int res = 0;
        for(int i: arr) {
            res = res + i + a;

        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Sum of numbers: " + sum(2,7,5,3));

    }
}
