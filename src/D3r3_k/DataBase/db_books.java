package D3r3_k.DataBase;

public class db_books {
    
    private String codeBook;
    private String titulo;
    private String autor;
    private String desc;
    private String year;
    private String[] p_clave;
    private String edicion;
    private String[] temas; 
    private int copias;
    private int disponibles;
    private int tipo;

    public db_books(String codeBook, String titulo, String autor, String desc, String year, String[] p_clave, String edicion, String[] temas, int copias, int disponibles, int tipo) {
        this.codeBook = codeBook;
        this.titulo = titulo;
        this.autor = autor;
        this.desc = desc;
        this.year = year;
        this.p_clave = p_clave;
        this.edicion = edicion;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String[] getP_clave() {
        return p_clave;
    }

    public void setP_clave(String[] p_clave) {
        this.p_clave = p_clave;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
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
