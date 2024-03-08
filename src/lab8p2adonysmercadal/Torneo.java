package lab8p2adonysmercadal;

import java.util.ArrayList;

public class Torneo {

    private String nombre, ganador;
    private ArrayList<Participantes> participantes;
    private boolean SigueAbierto, TorneoFinalizado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public boolean isSigueAbierto() {
        return SigueAbierto;
    }

    public void setSigueAbierto(boolean SigueAbierto) {
        this.SigueAbierto = SigueAbierto;
    }

    public boolean isTorneoFinalizado() {
        return TorneoFinalizado;
    }

    public void setTorneoFinalizado(boolean TorneoFinalizado) {
        this.TorneoFinalizado = TorneoFinalizado;
    }

}
