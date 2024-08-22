package enumeration;



public enum OpcoesCategoriaLivro{
        INFANTIL (1, "Infantil"),
        JUVENIL(2, "Juvenil"),
        ADULTO(3,"Adulto");
        private Integer numeroCategoriaLivro;



    private String categoriaLivro;

        OpcoesCategoriaLivro(Integer numeroCategoriaLivro, String categoriaLivro) {
            this.numeroCategoriaLivro =numeroCategoriaLivro;
            this.categoriaLivro=categoriaLivro;
        }

        public static OpcoesCategoriaLivro obterPorKeyNumero(Integer key){
            for(OpcoesCategoriaLivro opcoesCategoriaLivro:OpcoesCategoriaLivro.values()){
                if(opcoesCategoriaLivro.numeroCategoriaLivro == key){
                    return opcoesCategoriaLivro;
                }
            }
            return null;
        }

    public Integer getNumeroCategoriaLivro() {
        return numeroCategoriaLivro;
    }

    public void setNumeroCategoriaLivro(Integer numeroCategoriaLivro) {
        this.numeroCategoriaLivro = numeroCategoriaLivro;
    }

    public String getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

 }
