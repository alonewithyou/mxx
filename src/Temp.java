import java.util.*;

public class Temp extends Address {
    public static int tempCount = 0;
	public static Map<Temp,String> strConst = new HashMap<>();
	public static List<Temp> univerVar = new ArrayList<Temp>();
	public static List<Quadruple> origins = new ArrayList<>();

    public int num;
	public boolean simple,ever;
	public int offset;
	public boolean universal,isString,strconst;
	public String value;

    public Temp() {
		ever = false;
		simple = true;
		offset = 0;
        num = tempCount++;
		isString = false;
		strconst = false;
		universal = false;
    }
	
	public int calcdis(int baseid,int require){
		return	4 * (require + 40 - (num - baseid));
	}
}
