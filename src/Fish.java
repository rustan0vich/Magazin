import java.time.LocalDate;

public class Fish extends Product{
    public Fish(String name, int srockgodnosti) {
        super(name, srockgodnosti);
    }

    public Fish(String name) {
        super(name);
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
