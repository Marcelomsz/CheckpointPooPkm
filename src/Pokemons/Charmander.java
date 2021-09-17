package Pokemons;

public class Charmander extends Pokemon implements LancaChamas {


    public Charmander(String nome, int level) {
        super(nome,level);

        this.especie = "Charmander";
        this.tipo1="Fogo";
        this.tipo2="null";

    }

    @Override
    public void gerarStats() {
        /*ev=(Math.round((Math.random()+2)*this.level))*/
        /*iv=(Math.round((Math.random()+0.1)*100))*/
        /*this.vida= (int) Math.floor(0.01*(2*Base + iv + Math.floor(0.25*(Math.round((Math.random()+22)*21.17)))*this.level) + this.level + 10);*/
        /*Other Stats = Math.floor(0.01*(2 * Base + IV + Math.floor(0.25 x EV)) x this.level)+5)*Nature*/
        /*Nature=(Math.round((Math.random()+0.3)*4))*/
        this.peso = ((Math.round(Math.random()*10))*0.1) + 8 ;
        this.altura = ((Math.round(Math.random()*10)) * 0.04) + 0.4 ;
        this.vida= (int) Math.floor(0.01*(2*39 + (Math.round((Math.random()+1)*100)) + Math.floor(0.25*(Math.round((Math.random()+22)*21.17)))*this.level) + this.level + 10);
        /*Other Stats*/
        this.ataque = (int) ((int) Math.floor(0.025*(2*52+(Math.round((Math.random()+2)*100))+Math.floor(0.25*(Math.round((Math.random()+2)*this.level)))*this.level)+5));

        this.defesa = (int) ((int) Math.floor(0.025*(2*43+(Math.round((Math.random()+2)*100))+Math.floor(0.25*(Math.round((Math.random()+2)*this.level)))*this.level)+5));

        this.ataqueEspecial = (int) ((int) Math.floor(0.025*(2*60+(Math.round((Math.random()+2)*100))+Math.floor(0.25*(Math.round((Math.random()+2)*this.level)))*this.level)+5));

        this.defesaEspecial = (int) ((int) Math.floor(0.025*(2*50+(Math.round((Math.random()+2)*100))+Math.floor(0.25*(Math.round((Math.random()+2)*this.level)))*this.level)+5));

        this.velocidade = (int) ((int) Math.floor(0.025*(2*65+(Math.round((Math.random()+2)*100))+Math.floor(0.25*(Math.round((Math.random()+2)*this.level)))*this.level)+5));



    }

    @Override
    public String toString() {
    return "Pokemon - " +especie + ".  Tipo: " + tipo1+ ".  Level " + level + '\n' +"Nome: " + nome +".  Natureza : "+natureza+ ".  Sexo: "+sexo+ '\n' + "Pesa: " + peso +"Kg."+" Mede : " + altura +"M."+'\n' + "Vida: " + vida + "  Ataque: " + ataque +  "  Defesa: " + defesa + '\n' + "Ataque Especial: " + ataqueEspecial + "  Defesa Especial: " + defesaEspecial + '\n' + "Velocidade: " + velocidade + "    Shiny? = " + shiny+'\n';
}


    @Override
    public void lancaChamas() {

        System.out.println("lança chamas da dano de :"+0.9*this.ataqueEspecial);
    }

}

