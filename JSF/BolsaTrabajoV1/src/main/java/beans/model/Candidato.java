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
    private String nombre;
    private String apellido;
    private String salarioDeseado;
    
    //PARA PONER EN PRACTICA EL CILO DE VIDA
    Logger log = LogManager.getRootLogger();
    
    //CONSTRUCTOR VACIO
    public Candidato(){
        log.info("Creando el objeto candidato");
        System.out.println("CON - Creando el objeto candidato");
        this.setNombre("Ingresa tu nombre");
    }
    
    //GENERA getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        //Imprimimos por un Log veremos el momento
        log.info("modificando propiedad nombre: "+this.nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        log.info("modificando propiedad APELLIDO: "+this.apellido);
        System.out.println("modificando propiedad APELLIFDO "+this.apellido);

    }

    public String getSalarioDeseado() {
        return salarioDeseado;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
                log.info("modificando propiedad SALARIO: "+this.salarioDeseado);
        System.out.println("modificando propiedad SALARIO"+this.salarioDeseado);
    }
}
