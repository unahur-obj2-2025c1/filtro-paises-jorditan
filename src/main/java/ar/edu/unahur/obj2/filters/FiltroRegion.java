package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroRegion extends Filtro {
  private String prefijo;

  public FiltroRegion(String prefijo) {
    this.prefijo = prefijo;
  }

  @Override
  public Boolean apply(Pais pais) {
    return pais.getRegion().startsWith(this.prefijo);
  }
    
}
