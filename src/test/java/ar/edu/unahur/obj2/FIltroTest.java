package ar.edu.unahur.obj2;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.filters.FiltroIdioma;
import ar.edu.unahur.obj2.filters.FiltroIslas;
import ar.edu.unahur.obj2.filters.FiltroPoblacion;
import ar.edu.unahur.obj2.filters.FiltroRegion;
import ar.edu.unahur.obj2.filters.IFiltro;
import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;

public class FIltroTest {

    @Test
	void prueba() {
		IPaisService paisService = new PaisService();
        List<Pais> paises = paisService.getPaises();

        // IFiltro filtroIdioma2 = new FiltroIdioma("Arabic").and(new FiltroIdioma("French"));

        IFiltro filtroIsla = new FiltroIslas();

        IFiltro filtroIslaIdioma = new FiltroIslas().and(new FiltroIdioma("Spanish"));
        
        IFiltro filtroPoblacion = new FiltroPoblacion(100000000);

        IFiltro filtroRegion = new FiltroRegion("Asia").and(new FiltroIslas());

        List<Pais> paisesFiltrados2 = paises.stream().filter(p -> filtroRegion.apply(p)).toList();

        // System.out.println(paisesFiltrados);
        System.out.println(paisesFiltrados2);
}
}