public class ArrayWrite extends Quadruple {
    public Address dest;
    public Address src;
    public Address offset;
    public int size;

    public ArrayWrite() {
        dest = null;
        src = null;
        offset = null;
        size = 0;
    }

    public ArrayWrite(Address dest, Address offset, Address src, int size) {
        this.dest = dest;
        this.offset = offset;
        this.src = src;
        this.size = size;
    }
}
