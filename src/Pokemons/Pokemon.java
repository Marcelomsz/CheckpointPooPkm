package Pokemons;

public abstract class Pokemon {
    //Atributos da classe mãe pokemon , o usuario podera escolher apenas nome e level , os outros serao gerados aleatoriamente , gerando sempre pokemons com atributos diferentes//

    protected String nome;
    protected int level;
    protected double peso;
    protected double altura;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;
    protected String natureza;
    protected boolean shiny;
    protected String sexo;
    protected String especie ;
    protected String tipo1;
    protected String tipo2;

    //Metodo construtor vai aceitar nome e level e chama os metodos gerarStatus(),VerificarShiny(), gerarNature() e gerarSexo();
    public Pokemon(String nome, int level) {
        this.nome = nome;
        this.level = level;

        gerarStats();
        VerificarShiny();
        gerarNature();
        gerarSexo();
    }
    //Metodo gerarSexo() define o atributo sexo baseado em um algoritimo "aleatorio" 0 ou 1
    private void gerarSexo() {
        int numero = (int) Math.round(Math.random());
        if (numero==0){
            this.sexo="M";
        }
        else{
            this.sexo="F";
        }
    }
    //Metodo gerarNature() define o atributo Natureza baseado em um algoritimo "aleatorio" de 0 a 24
    private void gerarNature() {
        int numero= (int) Math.round(Math.random()*24);
        if (numero==0){
            natureza="Resistente";
            this.ataque = (int) (this.ataque + (0.04*this.level));
            this.defesa = (int) (this.defesa + (0.04*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.04*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial + (0.04*this.level));
            this.velocidade = (int) (this.velocidade + (0.04*this.level));

        }

        else if (numero==1){
            natureza="Solitário";
            this.ataque = (int) (this.ataque + (0.4*this.level));
            this.defesa = (int) (this.defesa - (0.4*this.level));
        }

        else if (numero==2){
            natureza="Corajoso";
            this.ataque = (int) (this.ataque + (0.4*this.level));
            this.velocidade = (int) (this.velocidade - (0.4*this.level));
        }

        else if (numero==3){
            natureza="Durão";
            this.ataque = (int) (this.ataque + (0.4*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial - (0.4*this.level));
        }

        else if (numero==4){
            natureza="Danadinho";
            this.ataque = (int) (this.ataque + (0.4*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial - (0.4*this.level));
        }

        else if (numero==5){
            natureza="Audacioso";
            this.defesa = (int) (this.defesa + (0.4*this.level));
            this.ataque = (int) (this.ataque - (0.4*this.level));

        }

        else if (numero==6){
            natureza="Dócil";
            this.ataque = (int) (this.ataque + (0.04*this.level));
            this.defesa = (int) (this.defesa + (0.04*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.04*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial + (0.04*this.level));
            this.velocidade = (int) (this.velocidade + (0.04*this.level));
        }

        else if (numero==7){
            natureza="Relaxado";
            this.defesa += this.defesa + (0.4*this.level);
            this.velocidade = (int) (this.velocidade - (0.4*this.level));
        }

        else if (numero==8){
            natureza="Travesso";
            this.defesa = (int) (this.defesa + (0.4*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial - (0.4*this.level));
        }

        else if (numero==9){
            natureza="Descuidado";
            this.defesa = (int) (this.defesa + (0.4*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial - (0.4*this.level));
        }

        else if (numero==10){
            natureza="Sério";
            this.ataque = (int) (this.ataque + (0.04*this.level));
            this.defesa = (int) (this.defesa + (0.04*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.04*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial + (0.04*this.level));
            this.velocidade = (int) (this.velocidade + (0.04*this.level));
        }

        else if (numero==11){
            natureza="Tímido";
            this.velocidade = (int) (this.velocidade + (0.4*this.level));
            this.ataque = (int) (this.ataque - (0.4*this.level));
        }

        else if (numero==12){
            natureza="Apressado";
            this.velocidade = (int) (this.velocidade + (0.4*this.level));
            this.defesa = (int) (this.defesa - (0.4*this.level));

        }
        else if (numero==13){
            natureza="Alegre";
            this.velocidade = (int) (this.velocidade + (0.4*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial - (0.4*this.level));

        }
        else if (numero==14){
            natureza="Ingênuo";
            this.velocidade = (int) (this.velocidade + (0.4*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial - (0.4*this.level));

        }
        else if (numero==15){
            natureza="Reservado";
            this.ataque = (int) (this.ataque + (0.04*this.level));
            this.defesa = (int) (this.defesa + (0.04*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.04*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial + (0.04*this.level));
            this.velocidade = (int) (this.velocidade + (0.04*this.level));

        }
        else if (numero==16){
            natureza="Modesto";
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.4*this.level));
            this.ataque = (int) (this.ataque - (0.4*this.level));

        }
        else if (numero==17){
            natureza="Suave";
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.4*this.level));
            this.defesa = (int) (this.defesa - (0.4*this.level));

        }
        else if (numero==18){
            natureza="Quieto";
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.4*this.level));
            this.velocidade = (int) (this.velocidade - (0.4*this.level));

        }
        else if (numero==19){
            natureza="Precipitado";
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.4*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial - (0.4*this.level));

        }
        else if (numero==20){
            natureza="Peculiar";
            this.ataque = (int) (this.ataque + (0.04*this.level));
            this.defesa = (int) (this.defesa + (0.04*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial + (0.04*this.level));
            this.defesaEspecial = (int) (this.defesaEspecial + (0.04*this.level));
            this.velocidade = (int) (this.velocidade + (0.04*this.level));

        }
        else if (numero==21){
            natureza="Calmo";
            this.defesaEspecial = (int) (this.defesaEspecial + (0.4*this.level));
            this.ataque = (int) (this.ataque - (0.4*this.level));

        }
        else if (numero==22){
            natureza="Gentil";
            this.defesaEspecial = (int) (this.defesaEspecial + (0.4*this.level));
            this.defesa = (int) (this.defesa - (0.4*this.level));

        }
        else if (numero==23){
            natureza="Atrevido";
            this.defesaEspecial = (int) (this.defesaEspecial + (0.4*this.level));
            this.velocidade = (int) (this.velocidade - (0.4*this.level));

        }
        else if (numero==24){
            natureza="Cuidadoso";
            this.defesaEspecial = (int) (this.defesaEspecial + (0.4*this.level));
            this.ataqueEspecial = (int) (this.ataqueEspecial - (0.4*this.level));

        }

    }
    //Metodo gerarStatus() nao é usado aqui mas sera sobreescrito nas classes filhas
    public abstract void gerarStats();
    /*ev=(Math.round((Math.random()+2)*this.level))
        iv=(Math.round((Math.random()+0.1)*100))
        this.vida= (int) Math.floor(0.01*(2*Base + iv + Math.floor(0.25*(Math.round((Math.random()+22)*21.17)))*this.level) + this.level + 10);
    outros Stats = Math.floor(0.01*(2 * Base + IV + Math.floor(0.25 x EV)) x this.level)+5)*Nature
    Nature=(Math.round((Math.random()+0.3)*4))
        this.peso = ((Math.round(Math.random()*10))*0.1) + 8 ;
        this.altura = ((Math.round(Math.random()*10)) * 0.04) + 0.4 ;*/

    //Metodo VerificarShiny() define o atributo boolean shiny baseado em um algoritimo "aleatorio" com chance de 1 em 51 de ser true.
    public void VerificarShiny() {
        int numero = (int) Math.round(Math.random() * 50);
        if (numero == 26) {
            this.shiny = true;
            this.vida += this.vida + 30;
            this.ataque += this.ataque + 30;
            this.defesa += this.defesa + 30;
            this.ataqueEspecial += this.ataqueEspecial + 30;
            this.defesaEspecial += this.defesaEspecial + 30;
            this.velocidade += this.velocidade + 30;


        }

    }
    //Sobreescreve o metodo toString , é onde os atributos do objeto sao escritos após criado.
    @Override
    public String toString() {
        return "Pokemon - " +especie + ".  Tipo: " + tipo1+ ".  Level " + level + '\n' +"Nome: " + nome +".  Natureza : "+natureza+ ".  Sexo: "+sexo+ '\n' + "Pesa: " + peso +"Kg."+" Mede : " + altura +"M."+'\n' + "Vida: " + vida + "  Ataque: " + ataque +  "  Defesa: " + defesa + '\n' + "Ataque Especial: " + ataqueEspecial + "  Defesa Especial: " + defesaEspecial + '\n' + "Velocidade: " + velocidade + "    Shiny? = " + shiny+'\n';
    }
}
