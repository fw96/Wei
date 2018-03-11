package poj1001;
import java.math.*;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner in =new Scanner(System.in);
            while(in.hasNext()){
            BigDecimal  val=in.nextBigDecimal();
            int n=in.nextInt();
            BigDecimal ret=val.pow(n).stripTrailingZeros();
            System.out.println(ret.toPlainString().replaceAll("^0", ""));
            	
            	
            	
        }
	}

}
