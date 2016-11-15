public class Store extends Quadruple {
    public int size;
    public Address dest;
    public Address src;
    public int offset;

    public Store() {
        size = 0;
        dest = null;
        src = null;
        offset = 0;
    }

    public Store(int size,Address dest,Address src,int offset) {
		this.size = size;
        this.dest = dest;
        this.src = src;
        this.offset = offset;
    }
}
