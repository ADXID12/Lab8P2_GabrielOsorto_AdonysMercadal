
package lab8p2adonysmercadal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class administrar  {
    private User usuarioact = null;
    private ArrayList<User> listaUsuarios = new ArrayList();
    private File archivo = null;

    public administrar(String path) {
        archivo = new File(path);
    }

    public ArrayList<User> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<User> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setUser(User p){
        this.listaUsuarios.add(p);
    }

    public User getUsuarioact() {
        return usuarioact;
    }

    public void setUsuarioact(User usuarioact) {
        this.usuarioact = usuarioact;
    }
    
    public void cargarArchivo() {
        try {            
            listaUsuarios = new ArrayList();
            User temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (User) objeto.readObject()) != null) {
                        listaUsuarios.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (User t : listaUsuarios) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
     
}
