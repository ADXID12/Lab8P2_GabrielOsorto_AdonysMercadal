package lab8p2adonysmercadal;

import java.io.Serializable;

public class User implements Serializable{

    private String usuario, password;
    private boolean tipoUser;

    public User() {
    }

    public User(String usuario, String password, boolean tipoUser) {
        this.usuario = usuario;
        this.password = password;
        this.tipoUser = tipoUser;
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

    public boolean isTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(boolean tipoUser) {
        this.tipoUser = tipoUser;
    }
    

    @Override
    public String toString() {
        return "usuario=" + usuario + ", password=" + password + '}';
    }

}
