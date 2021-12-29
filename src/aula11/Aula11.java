package aula11;

public class Aula11 {
	public static void main(String[] args) {
		/*Visitante v1 = new Visitante();
		v1.setNome("Julius");
		v1.setIdade(12);
		v1.setSexo("M");
		System.out.println(v1.toString());*/
		
		
		Aluno a1 = new Aluno();
		a1.setNome("Lucas");
		a1.setIdade(20);
		a1.setSexo("M");
		a1.setCurso("História");
		a1.setMatricula(2321);
		a1.pagarMensalidade();
		System.out.println(a1.toString());

		Bolsista b1 = new Bolsista();
		b1.setNome("João");
		b1.setMatricula(3423);
		b1.setBolsa(123.f);
		b1.setSexo("M");
		b1.pagarMensalidade();
	}

}
