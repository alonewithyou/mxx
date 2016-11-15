public class Alloc extends Quadruple {
    public Address dest;
    public Address size;

    public Alloc() {
        dest = null;
		size = null;
    }

    public Alloc(Address dest, Address size) {
        this.dest = dest;
		this.size = size;
    }
}
