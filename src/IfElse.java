public class IfElse {
    /*
     Flow control - if else
        evaludeaza conditii si bifurca codul in functie de rezultat
     */
    public static void main(String[] args) {
        System.out.println("pornim radio");
        // daca im im place piesa dau mai tare
        boolean piesa_faina = false; // ii zic la calc daca piesa e faina
        if (piesa_faina == true) {
            System.out.println("dau mai taren radioul");
            System.out.println("incep sa fredonez");
        }

        System.out.println("oprim radio");

            //if else
            int nr = 3;
            if (nr % 2 == 0){
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
    }
}