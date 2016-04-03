package encryptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.naming.InitialContext;
public class encryptor {
	static String ch="";
	 /*
	  * Character occur is seventy five number for each character
	  * but can be a lot more for confusion  
	  * 
	  * Space character is just have one character but can have more
	  */
	static String A []=new String [75];
	static String B []=new String [75];
	static String C []=new String [75];
	static String D []=new String [75];
	static String E []=new String [75];
	static String F []=new String [75];
	static String G []=new String [75];
	static String H []=new String [75];
	static String I []=new String [75];
	static String J []=new String [75];
	static String K []=new String [75];
	static String L []=new String [75];
	static String M []=new String [75];
	static String N []=new String [75];
	static String O []=new String [75];
	static String P []=new String [75];
	static String Q []=new String [75];
	static String R []=new String [75];
	static String S []=new String [75];
	static String T []=new String [75];
	static String U []=new String [75];
	static String V []=new String [75];
	static String W []=new String [75];
	static String X []=new String [75];
	static String Y []=new String [75];
	static String Z []=new String [75];
	
	/*
	 * The numbers occur is ten number 
	 * for each 
	 */
	static String one []=new String [10];
	static String two []=new String [10];
	static String three []=new String [10];
	static String four []=new String [10];
	static String five []=new String [10];
	static String six []=new String [10];
	static String seven []=new String [10];
	static String eight []=new String [10];
	static String nine []=new String [10];
	static String zero []=new String [10];
	static int a[]=new int[100];
	static String keys[]=new String[2200];
	public encryptor() throws FileNotFoundException {
		
	}

	public static void main(String[] args) {
		String key[] = new String [200];
//		for (int i = 0; i < key.length; i++) {
//			key[i]=StreamGenerator();
//			System.out.println(key[i]);
//		}
		Scanner input = null;
		try {
			int j=0;
			input = new Scanner(new File("C:\\Users\\mohammad\\workspace\\encryptor\\src\\encryptor\\k"));
			while (input.hasNext()){
				keys[j]=input.nextLine();
				j++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			input.close();
		}
		init();
		System.out.println(returnBits("A B C D E F G H I J K L M N O P Q R S T U V"));
		
		System.out.println(decryptor());
		
		ch="";
		System.out.println(returnBits(" 1 2 3 4 5 6 7 8 9 0"));
		System.out.println(decryptor());
	}

	
	public static void init(){
		System.arraycopy(keys,0,A,0,75);
		System.arraycopy(keys,75,B,0,75);
		System.arraycopy(keys,150,C,0,75);
		System.arraycopy(keys,225,D,0,75);
		System.arraycopy(keys,300,E,0,75);
		System.arraycopy(keys,375,F,0,75);
		System.arraycopy(keys,450,G,0,75);
		System.arraycopy(keys,525,H,0,75);
		System.arraycopy(keys,600,I,0,75);
		System.arraycopy(keys,675,J,0,75);
		System.arraycopy(keys,750,K,0,75);
		System.arraycopy(keys,825,L,0,75);
		System.arraycopy(keys,900,M,0,75);
		System.arraycopy(keys,975,N,0,75);
		System.arraycopy(keys,1050,O,0,75);
		System.arraycopy(keys,1125,P,0,75);
		System.arraycopy(keys,1200,Q,0,75);
		System.arraycopy(keys,1275,R,0,75);
		System.arraycopy(keys,1350,S,0,75);
		System.arraycopy(keys,1425,T,0,75);
		System.arraycopy(keys,1500,U,0,75);
		System.arraycopy(keys,1575,V,0,75);
		System.arraycopy(keys,1650,W,0,75);
		System.arraycopy(keys,1725,X,0,75);
		System.arraycopy(keys,1800,Y,0,75);
		System.arraycopy(keys,1875,Z,0,75);
		System.arraycopy(keys,1960,one,0,10);
		System.arraycopy(keys,1970,two,0,10);
		System.arraycopy(keys,1980,three,0,10);
		System.arraycopy(keys,1990,four,0,10);
		System.arraycopy(keys,2000,five,0,10);
		System.arraycopy(keys,2010,six,0,10);
		System.arraycopy(keys,2020,seven,0,10);
		System.arraycopy(keys,2030,eight,0,10);
		System.arraycopy(keys,2040,nine,0,10);
		System.arraycopy(keys,2050,zero,0,10);
		// there are 150 free key that can be used for another characters
		
	}
	
	
//	public static String StreamGenerator(){
//		for (int i = 0; i < a.length; i++) {
//			Random r=new Random();
//			a[i]=r.nextInt(2);
//		}
//		
//		String g="";
//		for (int i = 0; i < a.length; i++) {
//			g+=a[i];
//		}
//		return g;
//	}

	
	public static String returnBits(String z){
		char y []=z.toCharArray();
		for (int i = 0; i < y.length; i++) {
			ch+=randBitSelector(y[i]);
		}
		
		return ch;
	}
	
	
	public static String randBitSelector(char c){
		int code;
		if (c=='A'){
			Random r=new Random();
			code=r.nextInt(74);
			return A[code];
		}
		else if(c=='B'){
			Random r=new Random();
			code=r.nextInt(74);
			return B[code];
		}
		
		else if(c=='C'){
			Random r=new Random();
			code=r.nextInt(74);
			return C[code];
		}
		
		else if(c=='D'){
			Random r=new Random();
			code=r.nextInt(74);
			return D[code];
		}
		
		else if(c=='E'){
			Random r=new Random();
			code=r.nextInt(74);
			return E[code];
		}
		
		else if(c=='F'){
			Random r=new Random();
			code=r.nextInt(74);
			return F[code];
		}
		
		else if(c=='G'){
			Random r=new Random();
			code=r.nextInt(74);
			return G[code];
		}
		
		else if(c=='H'){
			Random r=new Random();
			code=r.nextInt(74);
			return H[code];
		}
		
		else if(c=='I'){
			Random r=new Random();
			code=r.nextInt(74);
			return I[code];
		}
		
		else if(c=='J'){
			Random r=new Random();
			code=r.nextInt(74);
			return J[code];
		}
		
		else if(c=='K'){
			Random r=new Random();
			code=r.nextInt(74);
			return K[code];
		}
		
		else if(c=='L'){
			Random r=new Random();
			code=r.nextInt(74);
			return L[code];
		}
		
		else if(c=='M'){
			Random r=new Random();
			code=r.nextInt(74);
			return M[code];
		}
		
		else if(c=='N'){
			Random r=new Random();
			code=r.nextInt(74);
			return N[code];
		}
		
		else if(c=='O'){
			Random r=new Random();
			code=r.nextInt(74);
			return O[code];
		}
		
		else if(c=='P'){
			Random r=new Random();
			code=r.nextInt(74);
			return P[code];
		}
		
		else if(c=='Q'){
			Random r=new Random();
			code=r.nextInt(74);
			return Q[code];
		}
		
		else if(c=='R'){
			Random r=new Random();
			code=r.nextInt(74);
			return R[code];
		}
		
		else if(c=='S'){
			Random r=new Random();
			code=r.nextInt(74);
			return S[code];
		}
		
		else if(c=='T'){
			Random r=new Random();
			code=r.nextInt(74);
			return T[code];
		}
		
		else if(c=='U'){
			Random r=new Random();
			code=r.nextInt(74);
			return U[code];
		}
		
		else if(c=='V'){
			Random r=new Random();
			code=r.nextInt(74);
			return V[code];
		}
		
		else if(c=='W'){
			Random r=new Random();
			code=r.nextInt(74);
			return W[code];
		}
		
		else if(c=='X'){
			Random r=new Random();
			code=r.nextInt(74);
			return X[code];
		}
		
		else if(c=='Y'){
			Random r=new Random();
			code=r.nextInt(74);
			return Y[code];
		}
		
		else if(c=='Z'){
			Random r=new Random();
			code=r.nextInt(74);
			return Z[code];
		}
		else if(c==' ')
			return keys[1950];  // the code 1950 for space character.
		
		else if(c=='1'){
			Random r=new Random();
			code=r.nextInt(9);
			return one[code];
		}
		
		else if(c=='2'){
			Random r=new Random();
			code=r.nextInt(9);
			return two[code];
		}
		
		else if(c=='3'){
			Random r=new Random();
			code=r.nextInt(9);
			return three[code];
		}
		
		else if(c=='4'){
			Random r=new Random();
			code=r.nextInt(9);
			return four[code];
		}
		
		else if(c=='5'){
			Random r=new Random();
			code=r.nextInt(9);
			return five[code];
		}
		
		else if(c=='6'){
			Random r=new Random();
			code=r.nextInt(9);
			return six[code];
		}
		
		else if(c=='7'){
			Random r=new Random();
			code=r.nextInt(9);
			return seven[code];
		}
		
		else if(c=='8'){
			Random r=new Random();
			code=r.nextInt(9);
			return eight[code];
		}
		
		else if(c=='9'){
			Random r=new Random();
			code=r.nextInt(9);
			return nine[code];
		}
		
		else if(c=='0'){
			Random r=new Random();
			code=r.nextInt(9);
			return zero[code];
		}
		
		else
			return null;
	}



	/*
	 * 
	 * Decryptor Methode get the encrypted String of bits then
	 * Decrypt the String n then return the Decrypted message.
	 * 
	 */
	

	private static String decryptor(){
		char d[] = ch.toCharArray();
		String b = "";
		int counter=0;
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ch.length(); i+=100) {
			sb.append(detector(ch.substring(i,i+100)));
			}
		return sb.toString();
	}
	
	private static char detector(String c){
		for (int i = 0; i < A.length; i++) {
			if(A[i].contains(c))
				return 'A';
		}
		
		for (int i = 0; i < B.length; i++) {
			if(B[i].contains(c))
				return 'B';
		}
		
		for (int i = 0; i < C.length; i++) {
			if(C[i].contains(c))
				return 'C';
		}
		
		for (int i = 0; i < D.length; i++) {
			if(D[i].equals(c))
				return 'D';
		}
		
		for (int i = 0; i < E.length; i++) {
			if(E[i].contains(c))
				return 'E';
		}
		
		for (int i = 0; i < F.length; i++) {
			if(F[i].contains(c))
				return 'F';
		}
		
		for (int i = 0; i < G.length; i++) {
			if(G[i].contains(c))
				return 'G';
		}
		
		for (int i = 0; i < H.length; i++) {
			if(H[i].contains(c))
				return 'H';
		}
		
		for (int i = 0; i < I.length; i++) {
			if(I[i].contains(c))
				return 'I';
		}
		
		for (int i = 0; i < J.length; i++) {
			if(J[i].contains(c))
				return 'J';
		}
		
		for (int i = 0; i < K.length; i++) {
			if(K[i].contains(c))
				return 'K';
		}
		
		for (int i = 0; i < L.length; i++) {
			if(L[i].contains(c))
				return 'L';
		}
		
		for (int i = 0; i < M.length; i++) {
			if(M[i].contains(c))
				return 'M';
		}
		
		for (int i = 0; i < N.length; i++) {
			if(N[i].contains(c))
				return 'N';
		}
		
		for (int i = 0; i < O.length; i++) {
			if(O[i].contains(c))
				return 'O';
		}
		
		for (int i = 0; i < P.length; i++) {
			if(P[i].contains(c))
				return 'P';
		}
		
		for (int i = 0; i < Q.length; i++) {
			if(Q[i].contains(c))
				return 'Q';
		}
		
		for (int i = 0; i < R.length; i++) {
			if(R[i].contains(c))
				return 'R';
		}
		
		for (int i = 0; i < S.length; i++) {
			if(S[i].contains(c))
				return 'S';
		}
		
		for (int i = 0; i < T.length; i++) {
			if(T[i].contains(c))
				return 'T';
		}
		
		for (int i = 0; i < U.length; i++) {
			if(U[i].contains(c))
				return 'U';
		}
		
		for (int i = 0; i < V.length; i++) {
			if(V[i].contains(c))
				return 'V';
		}
		
		for (int i = 0; i < W.length; i++) {
			if(W[i].contains(c))
				return 'W';
		}
		
		for (int i = 0; i < X.length; i++) {
			if(X[i].contains(c))
				return 'X';
		}
		
		for (int i = 0; i < Y.length; i++) {
			if(Y[i].contains(c))
				return 'Y';
		}
		
		for (int i = 0; i < Z.length; i++) {
			if(Z[i].contains(c))
				return 'Z';
		}
		
		for (int i = 0; i < one.length; i++) {
			if(one[i].contains(c))
				return '1';
		}
		
		for (int i = 0; i < two.length; i++) {
			if(two[i].contains(c))
				return '2';
		}
		
		for (int i = 0; i < three.length; i++) {
			if(three[i].contains(c))
				return '3';
		}
		
		for (int i = 0; i < four.length; i++) {
			if(four[i].contains(c))
				return '4';
		}
		
		
		for (int i = 0; i < five.length; i++) {
			if(five[i].contains(c))
				return '5';
		}
		
		
		for (int i = 0; i < six.length; i++) {
			if(six[i].contains(c))
				return '6';
		}
		
		
		for (int i = 0; i < seven.length; i++) {
			if(seven[i].contains(c))
				return '7';
		}
		
		
		for (int i = 0; i < eight.length; i++) {
			if(eight[i].contains(c))
				return '8';
		}
		
		
		for (int i = 0; i < nine.length; i++) {
			if(nine[i].contains(c))
				return '9';
		}
		
		for (int i = 0; i < zero.length; i++) {
			if(zero[i].contains(c))
				return '0';
		}
		
		
		return ' ';
	}
	
}