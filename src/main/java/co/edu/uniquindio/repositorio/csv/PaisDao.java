package co.edu.uniquindio.repositorio.csv;

import co.edu.uniquindio.modelo.Pais;
import java.io.IOException;

public class PaisDao extends ADao<Pais, Integer> {

    public PaisDao() throws IOException {
        super(System.getProperty("user.dir") + "/src/main/resources/persistenciacvs/esquemas/pais.csv");
    }
}
