import java.util.*;

public class Call extends Quadruple {
    public Address ret;
    public String callee;
	public List<Address> paras;

    public Call() {
        ret = null;
		callee = null;
		paras = new ArrayList();
    }

    public Call(Address ret, String callee, List<Address> paras) {
		this.ret = ret;
		this.callee = callee;
		this.paras = paras;
    }
}
