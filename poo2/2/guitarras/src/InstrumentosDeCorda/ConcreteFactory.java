package InstrumentosDeCorda;

public class ConcreteFactory extends AbstractFactory{

  @Override
  AbstractString getAbstractString(String stringType) {
    if(stringType.equals("bass")){
      return new BassFactory();
    }
    else if(stringType.equals("electricguitar")){
      return new ElectricFactory();
    }
    else{
      return new AcousticFactory();
    }
  }
}
