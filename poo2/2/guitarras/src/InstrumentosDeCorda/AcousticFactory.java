package InstrumentosDeCorda;

public class AcousticFactory implements AbstractString {

  @Override
  public Strings createString() {
    return new Acoustic();
  }
}

