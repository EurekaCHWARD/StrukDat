package strukturdata;

/**
 *
 * @author Safira Nur Fatma Rikza_202010370311479
 * @param <T>
 */
public class Segitiga<T extends Number> {
    private final T alas;
    private final T tinggi;

    public Segitiga(T Alas, T Tinggi) {
        this.alas = Alas;
        this.tinggi = Tinggi;
    }

    public int getResultAsInt(){
        int Alas = this.alas.intValue();
        int Tinggi = this.tinggi.intValue();

        return (Alas*Tinggi)/2;
    }

    public double getResultAsDouble(){
        double Alas = this.alas.doubleValue();
        double Tinggi = this.tinggi.doubleValue();

        return (Alas*Tinggi)/2;
    }
}
