package co.edu.uniquindio.repositorio.cache;

import java.util.Map;

public class SuperCache {
    Map cachePaises;
    Map cacheDepartamentos;


    public Map getCachePaises() {
        return cachePaises;
    }

    public void setCachePaises(Map cachePaises) {
        this.cachePaises = cachePaises;
    }

    public Map getCacheDepartamentos() {
        return cacheDepartamentos;
    }

    public void setCacheDepartamentos(Map cacheDepartamentos) {
        this.cacheDepartamentos = cacheDepartamentos;
    }
}
