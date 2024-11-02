public class Carpintero extends Persona implements IEmpleado{

    @Override
    public void trabajar() {
        System.out.println(this.getNombreCompleto() + "Realiza trabajos de Carpinteria");
    }
}
