public class david1 {

    public static class persona {
        String nome;
        String cognome;
        private int eta; 


        public persona(String nome, String cognome) {
            this.nome = nome;
            this.cognome = cognome;
        }

        public void pippa() {
            System.out.println("buona sta cocaina");
        }

        public void calcoloEta(int anno) {
            this.eta = 2023 - anno;
            System.out.println("la tua eta' e' " + eta);
        }

        



    }

    public static void main(String[] args) {
        persona pippo = new persona("damiano", "cavallaro");
        pippo.pippa();
        pippo.calcoloEta(1999);

    }

}