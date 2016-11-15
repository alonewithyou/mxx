public class Load extends Quadruple {
    public int size;
    public Address dest;
    public Address src;
    public int offset;

    public Load() {
        size = 0;
        dest = null;
        src = null;
        offset = 0;
    }

    public Load(Address dest,int size,Address src,int offset) {
		this.size = size;
        this.dest = dest;
        this.src = src;
        this.offset = offset;
    }
}
