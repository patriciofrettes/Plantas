public class Flor extends Planta{
    private String colorPetalos;
    private int cantidadPetalos;
    private String colorPistilo;
    private String variedad;
    private String estacion;

    public Flor() {
    }

    public Flor(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal, String colorPetalos, int cantidadPetalos, String colorPistilo, String variedad, String estacion) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantidadPetalos = cantidadPetalos;
        this.colorPistilo = colorPistilo;
        this.variedad = variedad;
        this.estacion = estacion;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantidadPetalos() {
        return cantidadPetalos;
    }

    public void setCantidadPetalos(int cantidadPetalos) {
        this.cantidadPetalos = cantidadPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy una flor");
    }
}
