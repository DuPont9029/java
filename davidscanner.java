import java.util.Scanner;


public class davidscanner {
    
    public static void main(String[] args) {
        int a;
        System.out.println("inserisci un numero");
        Scanner nomeoggetto = new Scanner(System.in);
        a = nomeoggetto.nextInt();
        System.out.println(a);
        nomeoggetto.close();
    }



}
