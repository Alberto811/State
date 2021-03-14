import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateDemo {
	public static void main(String[] args) {
        CeilingFanPullChain chain = new CeilingFanPullChain();
        int i= 0;
        while (i<2000000) {
        	i++;
            System.out.print(i);
            //getLine();
            chain.pull();
        }
    }
}
