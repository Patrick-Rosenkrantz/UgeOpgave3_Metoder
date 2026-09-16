public class Opgave5 {
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */


    void main() {

        int a = 7, b = 42;

        int smaller = minimum(a,b); // giver smaller en værdi så den bliver gemt


        if (smaller == a) { // Curly brackets i stedet for normal

            System.out.println(a + " is the smallest!"); // "a" er lavet til tekst i stedet for en variabel

        }

    }

    int minimum(int a, int b) { // indsætter int da den skal return en interger og ikke void
        int smaller = 0;
        if (a < b) {
            smaller = a; // gjerne int da den er initialiseret
        } else { // den vil altid være rigtig så den skal bare hedde else
            smaller = b; // fjerne int da den er initialiseret
        }
        return smaller; // Smaller er allerde intialiseret
    }
}
