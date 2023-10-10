package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
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

    public void setCadidato(Candidato cadidato) {
        this.cadidato = cadidato; //para modificarlo
    }
    
    public String enviar(){
    if(this.cadidato.getNombre().equals("Juan")){
      log.info("ENTRANDO A CASO EXITO ");
    return "exito";
    }else{
        log.info("ENTRANDO A CASO FALLO");
     return "fallo";   
    }
    
}

}
