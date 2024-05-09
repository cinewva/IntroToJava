public class IfElse { /* Flow control - if else evaluates conditions and forks code based on the result */
    public static void main(String[] args) {
        System.out.println("turn on the radio");
        // if I like the song, I play lowder
        boolean piesa_faina = false; // I tell the computer if the music is nice
        if (piesa_faina == true) {
            System.out.println("turn up the radio");
            System.out.println("start humming along");
        }
        System.out.println("turn off the radio");

        // if else checks if a number is even or odd
        int nr = 3;
        if (nr % 2 == 0){
            System.out.println(nr + " is even");
        } else {
            System.out.println(nr + " is odd");
        }
    }
}