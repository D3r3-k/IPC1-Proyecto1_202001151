package D3r3_k.DataBase;

public class db_enBiblioteca {

    private String usuario;
    private String titulo;
    private String codeBook;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public db_enBiblioteca(String usuario, String titulo, String codeBook) {
        this.usuario = usuario;
        this.titulo = titulo;
        this.codeBook = codeBook;
    }

}
