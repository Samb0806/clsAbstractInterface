public class Fontanero extends Persona implements IEmpleado{

    @Override
    public void trabajar() {
        System.out.println(this.getNombreCompleto() + "Realiza trabajos de Fontaneria");
    }
    public void descansar(){
        System.out.println(this.getNombreCompleto() + "esta descansando");
    }
}
