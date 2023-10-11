package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**** @author dahernandez*/

@Named
@RequestScoped
public class VacanteForm {
    
    @Inject //INJECTAR DEPENDENCIA PARA poder USARLO
    private Candidato cadidato;
    Logger log = LogManager.getRootLogger();//PARA PRUEBA DE LOG CICLO DE VIDA
    
    public VacanteForm(){
    log.info("creando el objeto vacanteForm");
        System.out.println("creando el objeto vacanteFor");
    }
    
    public void setCadidato(Candidato cadidato) {
        this.cadidato = cadidato; //para modificarlo
    }
    
    public String enviar(){
    if(this.cadidato.getNombre().equals("Juan")){
        if(this.cadidato.getApellido().equals("Perez")){
            String msg = "Gracias pero Juan ya trabaja con nosotros";
            //agregar el nivel de error
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,msg);
            FacesContext facesContext = FacesContext.getCurrentInstance();

            String componentId = null;
            facesContext.addMessage(componentId, facesMessage);
            return "index";
        }
      log.info("ENTRANDO A CASO EXITO ");
    return "exito";
    }else{
        log.info("ENTRANDO A CASO FALLO");
     return "fallo";   
    }
    
}

}
