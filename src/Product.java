import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public abstract class Product{
    private String name;

    private int srockgodnosti;

    private int a;
    private String crokgodnosty="INF";

    public Product(String name, int srockgodnosti) {
        this.name = name;
        this.srockgodnosti = srockgodnosti;
    }
    public String getCrokgodnosty() {
        return crokgodnosty;
    }

    public void setCrokgodnosty(String crokgodnosty) {
        this.crokgodnosty = crokgodnosty;
    }


    public Product(String name) {
        this.name = name;
    }


    public boolean isFresh(){

        return  a>srockgodnosti?false:true;
    }

    public LocalDate dateDesign(){
        Random random=new Random();
        this.a = random.nextInt(1,200);
        LocalDate producedOn=LocalDate.now().minusDays(a);
        return producedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSrockgodnosti() {
        return srockgodnosti;
    }

    public void setSrockgodnosti(int srockgodnosti) {
        this.srockgodnosti = srockgodnosti;
    }

    public String placeProduct(Product product) {
        String p = null;
        Random random = new Random();
        int b = random.nextInt(1, 2);
        if (b == 1) {
            p = "Icebox";
        } else {
            p = "Showcase";
        }

        return p;
    }
}
