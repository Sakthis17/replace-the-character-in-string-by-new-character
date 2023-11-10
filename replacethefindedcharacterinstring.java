public class replacethefindedcharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String k=sc.nextLine();
		System.out.println("which character you have to change");
		char a=sc.next().charAt(0);
		System.out.println("alternate character");
		char d=sc.next().charAt(0);
		k=k.replace(a, d);
		System.out.println("final output:"+k);
	}

} 

INPUT:
HII

OUTPUT:
I //INPUT TO CHANGE
G  //ALTERNATE CHARACTER
HGG //FINAL OUTPUT.