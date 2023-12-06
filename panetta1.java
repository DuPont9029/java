public class panetta1 {


    public static class Persona {
        String nome;
        String cognome;
        int anno;

        public Persona(String nome, String cognome, int anno) {
            this.nome=nome;
            this.cognome=cognome;
            this.anno=anno;
        }

        public void stampacognome(){
            System.out.println(this.cognome);
        }

        public int geteta(){
            int g=2023-this.anno;
            return g;
        }
    }

    public static void main(String args[]){
        Persona p1 = new Persona("mario", "rossi", 2009);
        p1.stampacognome(); 
        int a = p1.geteta();

    }



}
