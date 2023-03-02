import java.time.LocalDate;

public class Salt extends Product{

    private String crokgodnosty="INF";
    public Salt(String name) {
        super(name);
    }

    public String getCrokgodnosty() {
        return crokgodnosty;
    }

    public void setCrokgodnosty(String crokgodnosty) {
        this.crokgodnosty = crokgodnosty;
    }

    public Salt(String name, int srockgodnosti) {
        super(name, srockgodnosti);
    }

    @Override
    public boolean isFresh() {
        return super.isFresh();
    }

    @Override
    public LocalDate dateDesign() {
        return super.dateDesign();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getSrockgodnosti() {
        return super.getSrockgodnosti();
    }

    @Override
    public void setSrockgodnosti(int srockgodnosti) {
        super.setSrockgodnosti(srockgodnosti);
    }
}
