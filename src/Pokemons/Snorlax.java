package Pokemons;

public class Snorlax extends Pokemon implements AltaPotência,GigaImpacto{
    public Snorlax(String nome, int level) {
        super(nome, level);
        this.especie = "Snorlax";
        this.tipo1="Normal";
        this.tipo2="null";
    }

    @Override
    public void gerarStatus() {

        this.peso = ((Math.round(Math.random()*10))*0.1) + 460.0 ;
        this.altura = ((Math.round(Math.random()*10)) * 0.04) + 1.9 ;
        this.vida = (int) Math.floor(0.01 * (2 * 160 + (Math.round((Math.random() + 1) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 22) * 21.17))) * this.level) + this.level + 10);
        /*Other Stats*/
        this.ataque = (int) ((int) Math.floor(0.025 * (2 * 110 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesa = (int) ((int) Math.floor(0.025 * (2 * 65 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.ataqueEspecial = (int) ((int) Math.floor(0.025 * (2 * 65 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesaEspecial = (int) ((int) Math.floor(0.025 * (2 * 110 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.velocidade = (int) ((int) Math.floor(0.025 * (2 * 30 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));


    }

    @Override
    public String toString() {
        return "Pokemon - " + especie + ".  Tipo: " + tipo1 +".  Level " + level + '\n' + "Nome: " + nome + ".  Natureza : " + natureza + ".  Sexo: " + sexo + '\n' + "Pesa: " + peso + "Kg." + " Mede : " + altura + "M." + '\n' + "Vida: " + vida + "  Ataque: " + ataque + "  Defesa: " + defesa + '\n' + "Ataque Especial: " + ataqueEspecial + "  Defesa Especial: " + defesaEspecial + '\n' + "Velocidade: " + velocidade + "    Shiny? = " + shiny + '\n';
    }

    @Override
    public void altaPotencia() {
        System.out.println("lança chamas da dano de :"+0.95*this.ataque);
    }

    @Override
    public void gigaImpact() {
        System.out.println("lança chamas da dano de :"+1.5*this.ataque);
    }
}
