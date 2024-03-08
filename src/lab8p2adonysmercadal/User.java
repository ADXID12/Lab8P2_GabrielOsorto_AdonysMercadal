package lab8p2adonysmercadal;

public class User {

    private String usuario, password;

    public User() {
    }

    public User(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "usuario=" + usuario + ", password=" + password + '}';
    }

}
