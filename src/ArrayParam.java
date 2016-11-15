public class ArrayParam extends Quadruple {
    public Address name;
    public Address offset;
    public int size;

    public ArrayParam() {
        name = null;
        offset = null;
        size = 0;
    }

    public ArrayParam(Address name, Address offset, int size) {
        this.name = name;
        this.offset = offset;
        this.size = size;
    }
}
