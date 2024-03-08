package lab8p2adonysmercadal;

public class Admin extends User {

    private int TorneosCreados;

    public Admin() {
    }

    public Admin(int TorneosCreados, String usuario, String password) {
        super(usuario, password);
        this.TorneosCreados = TorneosCreados;
    }

    public int getTorneosCreados() {
        return TorneosCreados;
    }

    public void setTorneosCreados(int TorneosCreados) {
        this.TorneosCreados = TorneosCreados;
    }

}
