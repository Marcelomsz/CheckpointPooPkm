package Pokemons;

public class Squirtle extends Pokemon implements Surfar,HydroBomba,EsmagaCranio{
    public Squirtle(String nome, int level) {
        super(nome, level);
        this.especie = "Squirtle";
        this.tipo1 = "Agua";
        this.tipo2 = "null";
    }

    @Override
    public void gerarStatus() {
        this.peso = ((Math.round(Math.random()*10))*0.1) + 9 ;
        this.altura = ((Math.round(Math.random()*10)) * 0.04) + 0.3 ;
        this.vida = (int) Math.floor(0.01 * (2 * 44 + (Math.round((Math.random() + 1) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 22) * 21.17))) * this.level) + this.level + 10);
        /*Other Stats*/
        this.ataque = (int) ((int) Math.floor(0.025 * (2 * 48 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesa = (int) ((int) Math.floor(0.025 * (2 * 65 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.ataqueEspecial = (int) ((int) Math.floor(0.025 * (2 * 50 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesaEspecial = (int) ((int) Math.floor(0.025 * (2 * 64 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.velocidade = (int) ((int) Math.floor(0.025 * (2 * 43 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));


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