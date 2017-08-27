package alura.desenvolvedorJava.programa;

public class TesteJavaLangStrings {
	public static void main(String[] args) {
		String curso = "fj11";
		
		curso = curso.replace("j", "k");
		curso = curso.toUpperCase();
		
		System.out.println(curso);
		
		String nome = "   Francisco Azevedo Alves   ";
		
		System.out.println("Remove espaços...." + nome.trim());
		System.out.println("Contém 'Azevedo'...." + nome.contains("Azevedo"));
		System.out.println("Número de caracteres...." + nome.length());
		System.out.println("Está vazia...." + nome.isEmpty());
		
		
	}

}
