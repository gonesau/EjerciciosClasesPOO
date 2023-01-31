public class Comprador {
    //Atributos
    public String nombre;
    public int edad;
    public String lugarDeResidencia;
    public boolean activo;

    public Comprador(String nombre, int edad, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarDeResidencia() {
        return lugarDeResidencia;
    }

    public void setLugarDeResidencia(String lugarDeResidencia) {
        this.lugarDeResidencia = lugarDeResidencia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}

