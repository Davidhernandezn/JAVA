package beans.model;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**** @author dahernandez*/

@Named//CLASE ASOCIADA AL HTML reconce al jsf CDI
@RequestScoped//Alcance 
public class Candidato {
    //Atributo 
    private String nombre = "Ingresa tu nombre";
    
    //PARA PONER EN PRACTICA EL CILO DE VIDA
    Logger log = LogManager.getRootLogger();
    
    //GENERA getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        //Imprimimos por un Log veremos el momento
        log.info("modificando propiedad nombre: "+this.nombre);
    }
    
}
