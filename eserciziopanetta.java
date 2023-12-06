import java.util.Scanner;

public class eserciziopanetta {

    public static class persona{
        String nome;
        String cognome;
        int annonascita;
        float altezza;
        float peso;

        public persona(String nome, String cognome, int anno, float altezza, float peso){
            this.nome=nome;
            this.cognome=cognome;
            this.annonascita=anno;
            this.altezza=altezza;
            this.peso=peso;
        }

        public String getnome(){
            return this.nome;
        }
        
        public String getcognome(){
            return this.cognome;
        }
        public int getanno(){
            return this.annonascita;
        }
        public float getaltezza(){
            return this.altezza;
        }
        public float getpeso(){
            return this.peso;
        }
        public void setpeso(float p){
            this.peso=p;
        }

    }
    
    public static void main(String args[]){
        String nome; 
        String cognome;
        int annonascita;
        float altezza;
        float peso;

        Scanner s=new Scanner(System.in);
        System.out.println("inserisci il nome");
        nome=s.next();
        System.out.println("inserisci il cognome");
        cognome=s.next();
        System.out.println("inserisci l'anno di nascita");
        annonascita=s.nextInt();
        System.out.println("inserisci l'altezza");
        altezza=s.nextFloat();
        System.out.println("inserisci il peso");
        peso=s.nextFloat();

        persona p1=new persona(nome, cognome, annonascita,altezza, peso);


        Scanner s1=new Scanner(System.in);
        System.out.println("inserisci il nome");
        nome=s1.next();
        System.out.println("inserisci il cognome");
        cognome=s1.next();
        System.out.println("inserisci l'anno di nascita");
        annonascita=s1.nextInt();
        System.out.println("inserisci l'altezza");
        altezza=s1.nextFloat();
        System.out.println("inserisci il peso");
        peso=s1.nextFloat();

        persona p2=new persona(nome, cognome, annonascita,altezza, peso);
        
        if(p1.peso > p2.peso){
            System.out.println(p1.nome + " pesa di piu ");
            float sottrazione = (p1.peso * 10)/100;
            p1.peso = p1.peso - sottrazione;
            System.out.println("il nuovo peso di " + p1.nome + " ora è di " + p1.peso);
        
        }

        else{
            System.out.println(p2.nome + " pesa di piu ");
            float sottrazione = (p2.peso * 10)/100;
            p2.peso = p2.peso - sottrazione;
            System.out.println("il nuovo peso di " + p2.nome + " ora è di " + p2.peso);
        }





        //persona p1=new persona
    }
    
}