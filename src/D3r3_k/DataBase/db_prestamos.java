package D3r3_k.DataBase;

public class db_prestamos {

    private String codeBook;
    private String titulo;
    private String usuario;
    private String estado;
    private int tipo;

    public db_prestamos(String codeBook, String titulo, String usuario, String estado, int tipo) {
        this.codeBook = codeBook;
        this.titulo = titulo;
        this.usuario = usuario;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    
}
