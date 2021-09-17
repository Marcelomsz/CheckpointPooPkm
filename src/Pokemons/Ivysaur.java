package Pokemons;

public class Ivysaur extends Bulbasaur{
    public Ivysaur(String nome, int level) {
        super(nome, level);
        this.especie = "Ivysaur";
        this.tipo1="Planta";
        this.tipo2="Veneno";

    }
    @Override
    public void gerarStats() {

        this.peso = ((Math.round(Math.random()*10))*0.1) + 13 ;
        this.altura = ((Math.round(Math.random()*10)) * 0.04) + 0.8;
        this.vida = (int) Math.floor(0.01 * (2 * 60 + (Math.round((Math.random() + 1) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 22) * 21.17))) * this.level) + this.level + 10);
        /*Other Stats*/
        this.ataque = (int) ((int) Math.floor(0.025 * (2 * 62 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesa = (int) ((int) Math.floor(0.025 * (2 * 63 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.ataqueEspecial = (int) ((int) Math.floor(0.025 * (2 * 80 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.defesaEspecial = (int) ((int) Math.floor(0.025 * (2 * 80 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));

        this.velocidade = (int) ((int) Math.floor(0.025 * (2 * 60 + (Math.round((Math.random() + 2) * 100)) + Math.floor(0.25 * (Math.round((Math.random() + 2) * this.level))) * this.level) + 5));


    }

    @Override
    public String toString() {
        return "Pokemon - " + especie + ".  Tipo: " + tipo1 +"/"+tipo2+ ".  Level " + level + '\n' + "Nome: " + nome + ".  Natureza : " + natureza + ".  Sexo: " + sexo + '\n' + "Pesa: " + peso + "Kg." + " Mede : " + altura + "M." + '\n' + "Vida: " + vida + "  Ataque: " + ataque + "  Defesa: " + defesa + '\n' + "Ataque Especial: " + ataqueEspecial + "  Defesa Especial: " + defesaEspecial + '\n' + "Velocidade: " + velocidade + "    Shiny? = " + shiny + '\n';
    }

    @Override
    public void bombalodo() {
        System.out.println("Bomba de lodo da dano de :"+0.9*this.ataqueEspecial);
    }

    @Override
    public void raioSolar() {
        System.out.println("Raio Solar da dano de :"+1.2*this.ataqueEspecial);
    }
}
