package beans.model;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/**** @author dahernandez*/

@Named//CLASE ASOCIADA AL HTML reconce al jsf CDI
@RequestScoped//Alcance 
public class Candidato {
    //Atributo 
    private String nombre = "Ingresa tu nombre";
    
    //GENERA getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
