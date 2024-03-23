public class JavaMethods {
    static int sum(int a , int b) {
        return a + b;
    }
    int sub(int a, int b) {
        if(a>b) {
            return a - b;
        }else if( a < b) {
            return b - a;
        }else {
            return 0;
        }
    }
    public static void main( String [] args) {
        int c = sum(2,3);
        JavaMethods obj = new JavaMethods();
        int x = obj.sub(4 , 6);
        System.out.println(c);
        System.out.println(x);
    }
}
