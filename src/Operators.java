public class Operators {
    public static void main(String[] args) {
        /*
        Operators:
        Arithmetic: + - * / %
        Comparison: <> == != >= <=
        Logical: && || !

        Flow control - if else
         */
        int a = 3; // declaration && initialization
        int b = 5;
        a=b; // overwrite
        //System.out.println(a!=b); // 5 different than 5? false
        System.out.println(a==b);
        System.out.println(7>b && 3>b); // 7>5 and 3>5 = false
        System.out.println(7>b || 3>b); // 7>5 or 3>5 = true
        System.out.println(7>b && (2>b||3>b)); // true && false
        System.out.println(7>b || (2>b||3>b)); // true || false
        System.out.println(!(7>b)); // !true => false
    }
}
