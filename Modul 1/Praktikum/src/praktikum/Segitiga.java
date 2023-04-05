package praktikum;

public class Segitiga<T extends Number> {
    private final T Alas;
    private final T Tinggi;
    
    public Segitiga(T alas, T tinggi){
        this.Alas = alas;
        this.Tinggi = tinggi;
    }
    
    public int getResultAsInt(){
        int alas = this.Alas.intValue();
        int tinggi = this.Tinggi.intValue();
        
        return (int) (0.5 * alas * tinggi);
    }
    
    public double getResultAsDouble(){
        double alas = this.Alas.doubleValue();
        double tinggi = this.Tinggi.doubleValue();
        
        return 0.5 * alas * tinggi;
    }
    
}