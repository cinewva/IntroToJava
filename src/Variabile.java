public class Variabile {
    public static void main(String[] args) {
        // variabila = zona din memorie care tine date, cutiuta in care punem ceva
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        System.out.println("Am cumparat o masina marca: "+marcaMasina);
        System.out.println("Este modelul: "+modelMasina);

        // suprascriere
        modelMasina = "XC 60 facelift";
        System.out.println("Am cumparat o masina marca: "+marcaMasina);
        System.out.println("Este modelul: "+modelMasina);

        //declarare
        String nume;
        String prenume;
        int varsta = 34;

        // initializare
        prenume = "Andy";
        nume = "Simpetrean";
        System.out.println(nume+" "+prenume+ " cu varsta de "+varsta);
    }
}
