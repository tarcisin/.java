import InstrumentosDeCorda.AbstractFactory;
import InstrumentosDeCorda.AbstractString;
import InstrumentosDeCorda.ConcreteFactory;
import InstrumentosDeCorda.Strings;

public class App {
    public static void main(String[] args) throws Exception {
        AbstractFactory factory = new ConcreteFactory();

        AbstractString string1 = factory.getAbstractString("bass");
        Strings bass = string1.createString();
        bass.play();
        bass.tune();
        bass.switchStrings();

        AbstractString string2 = factory.getAbstractString("electricguitar");
        Strings electric = string2.createString();
        electric.play();
        electric.tune();
        electric.switchStrings();

        AbstractString string3 = factory.getAbstractString("acousticguitar");
        Strings acoustic = string3.createString();
        acoustic.play();
        acoustic.tune();
        acoustic.switchStrings();
    }
}
