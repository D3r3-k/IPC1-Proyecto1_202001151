package D3r3_k.DataBase;

public class db_digitales {

    private String codeBook;
    private String autor;
    private String year;
    private String titulo;
    private String edicion;
    private String[] p_clave;
    private String desc;
    private String[] temas;
    private String fileSize;
    private int tipo;

    public db_digitales(String codeBook, String autor, String year, String titulo, String edicion, String[] p_clave, String desc, String[] temas, String fileSize, int tipo) {
        this.codeBook = codeBook;
        this.autor = autor;
        this.year = year;
        this.titulo = titulo;
        this.edicion = edicion;
        this.p_clave = p_clave;
        this.desc = desc;
        this.temas = temas;
        this.fileSize = fileSize;
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

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    

}
