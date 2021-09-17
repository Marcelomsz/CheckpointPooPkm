package Pokemons;

public class Dragonite extends Dragonair implements Voar{

    public Dragonite(String nome, int level) {
        super(nome, level);
        this.especie = "Dragonite";
        this.tipo1="Dragão";
        this.tipo2="Voador";
    }

    @Override
    public void gerarStatus() {

        this.peso = ((Math.round(Math.random()*10))*0.1) + 210.0 ;
        this.altura = ((Math.round(Math.random()*10)) * 0.04) + 2;
        this.vida = (int) Math.floor(0.01 * (2 * 91 + (Math.round((Math.random() + 1) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 22) * 21.17))) * this.level) + this.level + 10);
        /*Other Stats*/
        this.ataque = (int) ((int) Math.floor(0.025 * (2 * 134 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesa = (int) ((int) Math.floor(0.025 * (2 * 95 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.ataqueEspecial = (int) ((int) Math.floor(0.025 * (2 * 100 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesaEspecial = (int) ((int) Math.floor(0.025 * (2 * 100 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.velocidade = (int) ((int) Math.floor(0.025 * (2 * 80 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));


    }

    @Override
    public String toString() {
        return "Pokemon - " + especie + ".  Tipo: " + tipo1 +"/"+tipo2+ ".  Level " + level + '\n' + "Nome: " + nome + ".  Natureza : " + natureza + ".  Sexo: " + sexo + '\n' + "Pesa: " + peso + "Kg." + " Mede : " + altura + "M." + '\n' + "Vida: " + vida + "  Ataque: " + ataque + "  Defesa: " + defesa + '\n' + "Ataque Especial: " + ataqueEspecial + "  Defesa Especial: " + defesaEspecial + '\n' + "Velocidade: " + velocidade + "    Shiny? = " + shiny + '\n';
    }

    @Override
    public void voar() {
        System.out.println("voou alto no ceu e acertou por :"+0.9*this.ataque);
    }

    @Override
    public void aquaTail() {
        System.out.println("Aqua Tail acertou por:"+0.9*this.ataque);
    }

    @Override
    public void dragonRush() {
        System.out.println("Acertou DragonRush por :"+this.ataque);
    }
}