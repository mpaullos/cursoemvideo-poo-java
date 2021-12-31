package aula12;

public class Aula12 {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		a.locomover();
		m.setPeso(37.8f);
		m.setCorPelo("Marrrom");
		p.alimentar();
		p.locomover();
		p.emitirSom();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		GoldFish u = new GoldFish();
		Tartaruga t = new Tartaruga();
		j.locomover();
		u.fazerBolhas();
		c.locomover();
		k.locomover();
		k.emitirSom();
		t.locomover();
		k.abanarRabo();
		k.enterrarOsso();
	}

}
