package basicprogram;

public class VowelANDOR {
public static void main(String []args)
{
	char ch='4';
	if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
			System.out.println(ch+ " is vowel");
	else if((ch>=0)&&(ch<=9))
		System.out.println(ch+ " is number);");
		else
		System.out.println(ch+ " is consonant");
	
}
}
