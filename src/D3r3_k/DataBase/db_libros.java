package D3r3_k.DataBase;

public class db_libros {
    
    private String codeBook;
    private String autor;
    private String year;
    private long isbn;
    private String titulo;
    private String edicion;
    private String[] p_clave;
    private String desc;
    private String[] temas;
    private int copias;
    private int disponibles;
    private int tipo;

    public db_libros(String codeBook, String autor, String year, long isbn, String titulo, String edicion, String[] p_clave, String desc, String[] temas, int copias, int disponibles, int tipo) {
        this.codeBook = codeBook;
        this.autor = autor;
        this.year = year;
        this.isbn = isbn;
        this.titulo = titulo;
        this.edicion = edicion;
        this.p_clave = p_clave;
        this.desc = desc;
        this.temas = temas;
        this.copias = copias;
        this.disponibles = disponibles;
        this.tipo = tipo;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String[] getP_clave() {
        return p_clave;
    }

    public void setP_clave(String[] p_clave) {
        this.p_clave = p_clave;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

        
}
