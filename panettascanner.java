import java.util.Scanner;


public class panettascanner {
    public static void main(String args[]){
        String nome;
        int voto;

        Scanner s=new Scanner(System.in);
        System.out.println("inserisci il nome: ");
        nome=s.next();
        System.out.println("inserisci il voto: ");
        voto=s.nextInt();
        System.out.println(nome + " ha preso: " + voto);
    }
    
}
