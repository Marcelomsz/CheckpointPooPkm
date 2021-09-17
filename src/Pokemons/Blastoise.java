package Pokemons;

public class Blastoise extends Wartortle {
    public Blastoise(String nome, int level) {
        super(nome, level);
        this.especie = "Blastoise";
        this.tipo1="Agua";
        this.tipo2="null";
    }

    @Override
    public void gerarStatus() {
        this.peso = ((Math.round(Math.random()*10))*0.1) + 85.5 ;
        this.altura = ((Math.round(Math.random()*10)) * 0.04) + 1.4 ;
        this.vida = (int) Math.floor(0.01 * (2 * 79 + (Math.round((Math.random() + 1) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 22) * 21.17))) * this.level) + this.level + 10);
        /*Other Stats*/
        this.ataque = (int) ((int) Math.floor(0.025 * (2 * 83 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesa = (int) ((int) Math.floor(0.025 * (2 * 100 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.ataqueEspecial = (int) ((int) Math.floor(0.025 * (2 * 85 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesaEspecial = (int) ((int) Math.floor(0.025 * (2 * 105 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.velocidade = (int) ((int) Math.floor(0.025 * (2 * 78 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));


    }

    @Override
    public String toString() {
        return "Pokemon - " + especie + ".  Tipo: " + tipo1 + ".  Level " + level + '\n' + "Nome: " + nome + ".  Natureza : " + natureza + ".  Sexo: " + sexo + '\n' + "Pesa: " + peso + "Kg." + " Mede : " + altura + "M." + '\n' + "Vida: " + vida + "  Ataque: " + ataque + "  Defesa: " + defesa + '\n' + "Ataque Especial: " + ataqueEspecial + "  Defesa Especial: " + defesaEspecial + '\n' + "Velocidade: " + velocidade + "    Shiny? = " + shiny + '\n';
    }


    @Override
    public void surfar() {
        System.out.println("Surfar da dano de :" + 0.9 * this.ataqueEspecial);
    }

    @Override
    public void esmagaCranio() {
        System.out.println("Surfar da dano de :" + 1.3 * this.ataque);
    }

    @Override
    public void hydroBomba() {
        System.out.println("Surfar da dano de :" + 1.1 * this.ataqueEspecial);
    }
}
