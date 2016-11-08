package Pow;

/*
 * Author : Resul Tugay
 * */
public class Pow {

	public static void main(String[] args) {
		System.out.println(pow_binary(100,5000,37));
	}
	//second commit
	//third
	//first
	public static int pow_binary(int base,int exp,int modulo){
		int r = 1;
		base = (base % modulo);
		while(exp > 0){
			int x = exp % 2;
			if(x > 0){
				r = (r * base) % modulo;
			}
			exp = exp / 2;
			base = (base * base) % modulo;
		}
		return r;
	}
}
