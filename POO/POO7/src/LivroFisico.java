    public class LivroFisico extends Livro{
        private int numeroPaginas;

        public LivroFisico(){};

        public LivroFisico(String nome, String autor, int anoPublicacao, int numeroPaginas){
            super(nome, autor, anoPublicacao);
            this.numeroPaginas = numeroPaginas;
        }

        public int getNumeroPaginas() {
            return numeroPaginas;
        }

        public void setNumeroPaginas(int numeroPaginas) {
            this.numeroPaginas = numeroPaginas;
        }

        @Override
        public String toString(){
            return super.toString()+"Número de páginas: "+this.numeroPaginas;
        }
    }
