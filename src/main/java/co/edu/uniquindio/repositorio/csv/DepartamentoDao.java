package co.edu.uniquindio.repositorio.csv;

import co.edu.uniquindio.modelo.Departamento;

import java.io.IOException;

public class DepartamentoDao extends ADao<Departamento, String> {

    public DepartamentoDao() throws IOException {
        super(System.getProperty("user.dir") + "/src/main/resources/persistenciacvs/esquemas/departamento.csv");
    }
}