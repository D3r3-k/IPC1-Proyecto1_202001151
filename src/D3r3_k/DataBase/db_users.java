package D3r3_k.DataBase;

public class db_users {

    private long id;
    private String name;
    private String lastname;
    private String user;
    private String password;
    private String rol;

    public db_users(long id, String name, String lastname, String user, String password, String rol) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.user = user;
        this.password = password;
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    

    
}
