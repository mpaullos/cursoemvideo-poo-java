package aula09;

public class ProjetoLivro {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];

		p[0] = new Pessoa("Marcos", 345, "M");
		p[1] = new Pessoa("kimberlynn", 345, "F");

		l[0] = new Livro("Os Mentirosos", "E. Lockhart", 336, p[0]);
		l[1] = new Livro("Todas as suas imperfeições", "Colleen Hoover", 260, p[1]);
		l[2] = new Livro("Aprendendo POO", "xxx - xxx", 500, p[0]);

		l[0].abrir();
		l[0].folhear(200);
		l[0].avancarPag();

		l[1].abrir();
		l[0].folhear(59);

		System.out.println(l[0].detalhes());
		System.out.println("");
		System.out.println(l[1].detalhes());

	}

}
