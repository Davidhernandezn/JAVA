package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**** @author dahernandez*/

@Named
@RequestScoped
public class VacanteForm {
    
    @Inject //INJECTAR DEPENDENCIA PARA poder USARLO
    private Candidato cadidato;

    public void setCadidato(Candidato cadidato) {
        this.cadidato = cadidato; //para modificarlo
    }
    
    public String enviar(){
    if(this.cadidato.getNombre().equals("Juan")){
    return "exito";
    }else{
     return "fallo";   
    }
    
}

}
