package lab8p2adonysmercadal;

import java.io.Serializable;

public class Admin extends User implements Serializable{

    private int TorneosCreados;

    public Admin() {
    }

    public Admin(int TorneosCreados, String usuario, String password, boolean tipoUser) {
        super(usuario, password, tipoUser);
        this.TorneosCreados = TorneosCreados;
    }


    public int getTorneosCreados() {
        return TorneosCreados;
    }

    public void setTorneosCreados(int TorneosCreados) {
        this.TorneosCreados = TorneosCreados;
    }

}
