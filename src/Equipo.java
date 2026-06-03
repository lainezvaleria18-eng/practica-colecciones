public class Equipo {

    private String nombre;
    private String pais;
    private int copas;

    public Equipo() {
}
   public  Equipo(String nombre,String pais, int copas){
  this.nombre = nombre;
  this.pais = pais;
  this.copas =copas;
}
  public String getNombre(){
        return nombre;
}

 public String getPais()   {
        return  pais;
}

   public int getCopas() {
    return  copas;
  }
}
