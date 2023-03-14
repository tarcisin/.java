package InstrumentosDeCorda;

public class BassFactory implements AbstractString {

  @Override
  public Strings createString() {
    return new Bass();
  }
}
