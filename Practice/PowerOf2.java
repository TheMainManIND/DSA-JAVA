import java.io.*;
import java.util.*;

public class PowerOf2 {
	public static void main(String[] args) {
		
		System.out.println(isPowerOfTwo(2048));
	}

	public static boolean isPowerOfTwo(int n) {
        
        if (n<=0) {
        	return false;
        }
        return (n&(n-1))==0;
    }
}