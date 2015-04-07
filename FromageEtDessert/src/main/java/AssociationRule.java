/**
 * Created by sknz on 4/7/15.
 */
public class AssociationRule {
    private final FrequentPattern x;
    private final FrequentPattern z;
    private FrequentPattern y;

    public AssociationRule(FrequentPattern x, FrequentPattern z) {
        this.x = x;
        this.z = z;
        assert(x.contains(z));
        y = FrequentPattern.substract(x, z);
    }

    @Override
    public String toString() {
        return x + " -> " + z + " conf " + getConf();
    }

    public double getConf() {
        return (double)z.getCount() / x.getCount();
    }
}
