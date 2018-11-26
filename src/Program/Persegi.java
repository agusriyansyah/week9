package Program;

public class Persegi implements BangunDatar{
    
    public float sisi;

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public void luas() {
        sisi =8;
        sisi=sisi*sisi;
        System.out.println("Luas Persegi = "+sisi);
        
    }

    @Override
    public void keliling() {
        sisi=8;
        sisi= 4*sisi;
        System.out.println("Keliling Persegi = "+sisi);
    }
}
