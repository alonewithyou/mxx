public class Br extends Quadruple {
    public Address src;
    public Label label1;
	public Label label2;
	
    public Br(Address src, Label label1, Label label2) {
        this.src = src;
		this.label1 = label1;
		this.label2 = label2;
    }
}
