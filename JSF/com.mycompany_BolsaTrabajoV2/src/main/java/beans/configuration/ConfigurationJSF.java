package beans.configuration;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

//PARA USAR LA ULTIMA VERSION DE JSF
//Activa el CDI Build-in beans
@FacesConfig(
//    version = JSF_2_3
)

@ApplicationScoped
public class ConfigurationJSF {
}
