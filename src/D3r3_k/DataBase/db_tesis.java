package D3r3_k.DataBase;

public class db_tesis {

    private String codeBook;
    private String autor;
    private String year;
    private String titulo;
    private String[] p_clave;
    private String area;
    private String[] temas;
    private String desc;
    private String edicion;
    private int copias;
    private int disponibles;
    private int tipo;

    public db_tesis(String codeBook, String autor, String year, String titulo, String[] p_clave, String area, String[] temas, String desc, String edicion, int copias, int disponibles, int tipo) {
        this.codeBook = codeBook;
        this.autor = autor;
        this.year = year;
        this.titulo = titulo;
        this.p_clave = p_clave;
        this.area = area;
        this.temas = temas;
        this.desc = desc;
        this.edicion = edicion;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getP_clave() {
        return p_clave;
    }

    public void setP_clave(String[] p_clave) {
        this.p_clave = p_clave;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
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
