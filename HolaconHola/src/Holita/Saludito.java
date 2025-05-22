package Holita;

public class Saludito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] saludo="hola".toCharArray();
		char[]ocasional="buen-dia".toCharArray();
		StringBuilder sb= new StringBuilder();
		int azar=(int)(Math.random()*5+1);
		for(int i=0;i<azar;i++) {
			char s=saludo[(int)(Math.random()*saludo.length)];
			char o=ocasional[(int)(Math.random()*ocasional.length)];
			sb.append(s);
			sb.append(o);
			System.out.println(sb);
		}

	}

	}


