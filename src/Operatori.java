public class Operatori {
    public static void main(String[] args) {
        /*
        operatori:
        aritmetici: + - * / %
        de comparare: <> == != >= <=
        logici: && || !

        Flow control - if else
         */
        int a = 3; // declarare && initializare
        int b = 5;
        a=b; // suprascriere
        //System.out.println(a!=b); // 5 dif de 5? false
        System.out.println(a==b);
        System.out.println(7>b && 3>b); // 7>5 si 3>5 = false
        System.out.println(7>b || 3>b); // 7>5 sau 3>5 = true
        System.out.println(7>b && (2>b||3>b)); // true && false
        System.out.println(7>b || (2>b||3>b)); // true || false
        System.out.println(!(7>b)); // !true => false
    }
}
