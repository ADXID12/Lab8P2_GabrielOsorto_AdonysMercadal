package lab8p2adonysmercadal;

import java.io.Serializable;
import java.util.ArrayList;

public class Participante extends User implements Serializable {

    private ArrayList<Torneo> listaTorneos = new ArrayList();
    private ArrayList<Torneo> TorneosGanados = new ArrayList();

    public Participante() {
    }

    public Participante(String usuario, String password, boolean tipoUser,ArrayList listaTorneos, ArrayList TorneosGanados) {
        super(usuario, password, tipoUser);
        this.listaTorneos=listaTorneos;
        this.TorneosGanados=TorneosGanados;
    }

    public ArrayList<Torneo> getListaTorneos() {
        return listaTorneos;
    }

    public void setListaTorneos(ArrayList<Torneo> listaTorneos) {
        this.listaTorneos = listaTorneos;
    }

    public ArrayList<Torneo> getTorneosGanados() {
        return TorneosGanados;
    }

    public void setTorneosGanados(ArrayList<Torneo> TorneosGanados) {
        this.TorneosGanados = TorneosGanados;
    }

}
