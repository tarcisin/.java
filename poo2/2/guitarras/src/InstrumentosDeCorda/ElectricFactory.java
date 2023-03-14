package InstrumentosDeCorda;

public class ElectricFactory implements AbstractString {

  @Override
  public Strings createString() {
    return new Electric();
  }
}
