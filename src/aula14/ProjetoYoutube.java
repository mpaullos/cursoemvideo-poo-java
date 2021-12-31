package aula14;

public class ProjetoYoutube {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 14 de Java");
		v[2] = new Video("Aula 1 de JavaScript");

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Harry", 20, "M", "malfeitofeito");
		g[1] = new Gafanhoto("Voldemort", 33, "M", "orcrux");

		/*
		 * System.out.println(g[0].toString()); System.out.println(g[1].toString());
		 * System.out.println(v[2].toString());
		 */

		Visualizacao vis[] = new Visualizacao[2];
		vis[0] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());

		vis[1] = new Visualizacao(g[0], v[2]);
		vis[1].avaliar(87.0f);
		;
		System.out.println(vis[1].toString());

	}

}
