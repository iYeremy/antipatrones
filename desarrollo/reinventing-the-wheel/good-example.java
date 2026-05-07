// En lugar de crear StringUtils, usamos lo que ya trae el lenguaje o librerias
import org.apache.commons.lang3.StringUtils;

public class MyService {
    public void process(String name) {
        // Solucion probada y mantenida por la comunidad
        String cleanName = StringUtils.capitalize(name);
        System.out.println(cleanName);
    }
}
