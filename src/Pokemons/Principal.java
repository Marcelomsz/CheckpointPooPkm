package Pokemons;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    //criando duas arrays pra guardar o time do usuario e o time do rival
    public static ArrayList<Pokemon> pokemons = new ArrayList<>();
    public static ArrayList<Pokemon> rivalpokes = new ArrayList<>();

    //main usa o metodo criar()


    public static void main(String[] args) {
        Criar();
    }
    //Criar() começa pergunta se precisa de uma lista dos pokes que podem ser criados e aceitando uma resposta por scanner , depois disso pergunta o nome e o level , apos isso o objeto pokemon escolhido é criado e colocado no array.
    private static void Criar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Precisa da lista de Pokemons?" + '\n' + ":");
        String lista1 = scan.next();
        if (lista1.equalsIgnoreCase("sim")) {
            System.out.print("id=1 Bulbasaur ,id=2 Ivysaur ,id=3 Venusaur ,id=4 Charmander ,id=5 Charmeleon." + '\n' + "id=6 Charizard ,id=7 Squirtle ,id=8 Wartortle ,id=9 Blastoise ,id=10 Snorlax." + '\n' + "id=11 Pikachu ,id=12 Raichu ,id=13 Dratini ,id=14 Dragonair ,id=15 Dragonite." + '\n');

        }
        System.out.print("Digite id do pokemon: ");
        short id1 = scan.nextShort();

        if (id1 == 1) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            //verificação para se o level for maior que 100 ou menor q 1
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }

            if (lvl1 >= 32) {
                //se pokemon level maior que level requerido ele pode evoluir , aparecendo um scanner para aceitar ou nao.
                System.out.println("Seu Bulbasaur pode evoluir para Venusaur, voce aceita?" + '\n' + ":");

                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon venusaur = new Venusaur(nome1, lvl1);
                    pokemons.add(venusaur);

                } else {
                    Pokemon Bulbasaur = new Bulbasaur(nome1, lvl1);
                    pokemons.add(Bulbasaur);
                }
            } else if (lvl1 >= 16) {
                System.out.println("Seu Bulbasaur pode evoluir para Ivysaur, voce aceita?" + '\n' + ":");
                String char1 = scan.next();
                if (char1.equalsIgnoreCase("sim")) {
                    Pokemon Ivysaur = new Ivysaur(nome1, lvl1);
                    pokemons.add(Ivysaur);
                } else {
                    Pokemon Bulbasaur = new Bulbasaur(nome1, lvl1);
                    pokemons.add(Bulbasaur);
                }
            }


            if (lvl1 < 16) {
                Pokemon Bulbasaur = new Bulbasaur(nome1, lvl1);
                pokemons.add(Bulbasaur);
            }
        }

        if (id1 == 2) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            if (lvl1 >= 32) {
                System.out.println("Seu Ivysaur pode evoluir para Venusaur, voce aceita?" + '\n' + ":");
                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon venusaur = new Venusaur(nome1, lvl1);
                    pokemons.add(venusaur);

                } else {
                    Pokemon Ivysaur = new Ivysaur(nome1, lvl1);
                    pokemons.add(Ivysaur);
                }
            } else {
                Pokemon Ivysaur = new Ivysaur(nome1, lvl1);
                pokemons.add(Ivysaur);
            }

        }
        if (id1 == 3) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            Pokemon Venusaur = new Venusaur(nome1, lvl1);
            pokemons.add(Venusaur);
        }

        if (id1 == 4) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            if (lvl1 >= 32) {
                System.out.println("Seu Charmander pode evoluir para Charizard, voce aceita?" + '\n' + ":");
                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon charizard = new Charizard(nome1, lvl1);
                    pokemons.add(charizard);

                } else {
                    Pokemon charmander = new Charmander(nome1, lvl1);
                    pokemons.add(charmander);
                }
            } else if (lvl1 >= 16) {
                System.out.println("Seu charmander pode evoluir para Charmeleon, voce aceita?" + '\n' + ":");
                String char1 = scan.next();
                if (char1.equalsIgnoreCase("sim")) {
                    Pokemon charmeleon = new Charmeleon(nome1, lvl1);
                    pokemons.add(charmeleon);
                } else {
                    Pokemon charmander = new Charmander(nome1, lvl1);
                    pokemons.add(charmander);
                }
            }
            if (lvl1 < 16) {
                Pokemon charmander = new Charmander(nome1, lvl1);
                pokemons.add(charmander);
            }
        }
        if (id1 == 5) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            if (lvl1 >= 32) {
                System.out.println("Seu Charmeleon pode evoluir para Charizard, voce aceita?" + '\n' + ":");
                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon Charizard = new Charizard(nome1, lvl1);
                    pokemons.add(Charizard);

                } else {
                    Pokemon Charmeleon = new Charmeleon(nome1, lvl1);
                    pokemons.add(Charmeleon);
                }
            } else {
                Pokemon Charmeleon = new Charmeleon(nome1, lvl1);
                pokemons.add(Charmeleon);
            }

        }
        if (id1 == 6) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            Pokemon Charizard = new Charizard(nome1, lvl1);
            pokemons.add(Charizard);
        }

        if (id1 == 7) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            if (lvl1 >= 32) {
                System.out.println("Seu Squirtle pode evoluir para Blastoise, voce aceita?" + '\n' + ":");
                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon Blastoise = new Blastoise(nome1, lvl1);
                    pokemons.add(Blastoise);

                } else {
                    Pokemon Squirtle = new Squirtle(nome1, lvl1);
                    pokemons.add(Squirtle);
                }
            } else if (lvl1 >= 16) {
                System.out.println("Seu Squirtle pode evoluir para Wartortle, voce aceita?" + '\n' + ":");
                String char1 = scan.next();
                if (char1.equalsIgnoreCase("sim")) {
                    Pokemon Wartortle = new Wartortle(nome1, lvl1);
                    pokemons.add(Wartortle);
                } else {
                    Pokemon Squirtle = new Squirtle(nome1, lvl1);
                    pokemons.add(Squirtle);
                }
            }


            if (lvl1 < 16) {
                Pokemon Squirtle = new Squirtle(nome1, lvl1);
                pokemons.add(Squirtle);
            }
        }

        if (id1 == 8) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            if (lvl1 >= 32) {
                System.out.println("Seu Wartortle pode evoluir para Blastoise, voce aceita?" + '\n' + ":");
                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon Blastoise = new Blastoise(nome1, lvl1);
                    pokemons.add(Blastoise);

                } else {
                    Pokemon Wartortle = new Wartortle(nome1, lvl1);
                    pokemons.add(Wartortle);
                }
            } else {
                Pokemon Wartortle = new Wartortle(nome1, lvl1);
                pokemons.add(Wartortle);
            }

        }
        if (id1 == 9) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            Pokemon Blastoise = new Blastoise(nome1, lvl1);
            pokemons.add(Blastoise);
        }
        if (id1 == 10) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            Pokemon Snorlax = new Snorlax(nome1, lvl1);
            pokemons.add(Snorlax);
        }

        if (id1 == 11) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            if (lvl1 >= 48) {
                System.out.println("Seu Pikachu pode evoluir para Raichu, voce aceita?" + '\n' + ":");
                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon Raichu = new Raichu(nome1, lvl1);
                    pokemons.add(Raichu);

                } else {
                    Pokemon Pikachu = new Pikachu(nome1, lvl1);
                    pokemons.add(Pikachu);
                }
            } else {
                Pokemon Pikachu = new Pikachu(nome1, lvl1);
                pokemons.add(Pikachu);
            }
        }

        if (id1 == 12) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            Pokemon Raichu = new Raichu(nome1, lvl1);
            pokemons.add(Raichu);
        }

        if (id1 == 13) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }

            if (lvl1 >= 55) {
                System.out.println("Seu Dratini pode evoluir para Dragonite, voce aceita?" + '\n' + ":");

                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon Dragonite = new Dragonite(nome1, lvl1);
                    pokemons.add(Dragonite);

                } else {
                    Pokemon Dratini = new Dratini(nome1, lvl1);
                    pokemons.add(Dratini);
                }
            } else if (lvl1 >= 30) {
                System.out.println("Seu Dratini pode evoluir para Dragonair, voce aceita?" + '\n' + ":");
                String char1 = scan.next();
                if (char1.equalsIgnoreCase("sim")) {
                    Pokemon Dragonair = new Dragonair(nome1, lvl1);
                    pokemons.add(Dragonair);
                } else {
                    Pokemon Dratini = new Dratini(nome1, lvl1);
                    pokemons.add(Dratini);
                }
            }

            if (lvl1 < 30) {
                Pokemon Dratini = new Dratini(nome1, lvl1);
                pokemons.add(Dratini);
            }
        }

        if (id1 == 14) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            if (lvl1 >= 55) {
                System.out.println("Seu Dragonair pode evoluir para Dragonite, voce aceita?" + '\n' + ":");
                String char2 = scan.next();
                if (char2.equalsIgnoreCase("sim")) {

                    Pokemon Dragonite = new Dragonite(nome1, lvl1);
                    pokemons.add(Dragonite);

                } else {
                    Pokemon Dragonair = new Dragonair(nome1, lvl1);
                    pokemons.add(Dragonair);
                }
            } else {
                Pokemon Dragonair = new Dragonair(nome1, lvl1);
                pokemons.add(Dragonair);
            }

        }
        if (id1 == 15) {
            System.out.print("Digite o nome do pokemon: ");
            String nome1 = scan.next();
            System.out.print("Digite o level do pokemon: ");
            int lvl1 = (int) Math.round(scan.nextDouble());
            if (lvl1 >= 100) {
                lvl1 = 100;
            } else if (lvl1 <= 1) {
                lvl1 = 1;
            }
            Pokemon Dragonite = new Dragonite(nome1, lvl1);
            pokemons.add(Dragonite);
        }

        //verificação para se o numero de objetos no array é maior que cinco.se for o array é impresso , mostrando os objetos e seus atributos.
        if (pokemons.size() > 5) {

            for (Pokemon p : pokemons) {
                System.out.println(p);
            }
            //Alem disso é perguntado se quer remover algum pokemon.
            System.out.println("Seu time já tem seis pokemons ,Deseja trocar algum deles ?" + '\n' + ":");
            String enviar1 = scan.next();
            if (enviar1.equalsIgnoreCase("sim")) {
                System.out.println("Qual ?(numero de 0 a 5)" + '\n' + ":");
                //verificação para se o numero escolhido for maior que 5 ou menor que 0
                int num = (scan.nextByte());
                if (num >= 5) {
                    num = 5;
                } else if (num <= 0) {
                    num = 0;
                }
                pokemons.remove(num);
                //Alem disso é perguntado se quer repor esse pokemon removido.
                System.out.print("Deseja criar outro pokemon? " + '\n' + ":");
                String escolha1 = scan.next();
                if (escolha1.equalsIgnoreCase("sim")) {
                    Criar();
                }
            } else {
                lutar();
            }
        }
        else {
            //retorna aqui se ainda nao tem mais de 5 pokes e chama o metodo criar() novamente.
            System.out.print("Deseja criar outro pokemon? " + '\n' + ":");
            String escolha1 = scan.next();
            if (escolha1.equalsIgnoreCase("sim")) {
                Criar();
            }
            else {
                for (Pokemon p : pokemons) {
                    System.out.println(p);

                }

            }
        }
    }
    //metodo Criarrival() primeiro soma o level de todos os seus pokes e divide pelo numero de pokes que foram criados.Depois um poke sao criados de forma aleatoria e usando a media calculada e nomes pré definidos e é colocado no array rivalpokes.
    private static void Criarrival() {
        int lvlrival = 0;
            for (Pokemon p : pokemons) {
            lvlrival += p.level;
        }
        lvlrival = (int) Math.ceil(lvlrival / pokemons.size())+1;
        int rivaln = (int) Math.round(Math.random() * 14);

        if (rivaln == 0) {
            Pokemon venven = new Bulbasaur("Plantinha", lvlrival);
            rivalpokes.add(venven);
        }
        else if (rivaln == 1) {
            Pokemon ivy = new Ivysaur("Ivy", lvlrival);
            rivalpokes.add(ivy);
        }
        else if (rivaln == 2) {
            Pokemon venu = new Venusaur("Green", lvlrival);
            rivalpokes.add(venu);
        }
        else if (rivaln == 3) {
            Pokemon Draco = new Charmander("Jaiminho", lvlrival);
            rivalpokes.add(Draco);
        }
        else if (rivaln == 4) {
            Pokemon Draco2 = new Charmeleon("Lizardon", lvlrival);
            rivalpokes.add(Draco2);
        }
        else if (rivaln == 5) {
            Pokemon Draco3 = new Charizard("Red", lvlrival);
            rivalpokes.add(Draco3);
        }
        else if (rivaln == 6) {
            Pokemon tarta = new Squirtle("Tortuguita", lvlrival);
            rivalpokes.add(tarta);
        }
        else if (rivaln == 7) {
            Pokemon tarta2 = new Wartortle("Rafael", lvlrival);
            rivalpokes.add(tarta2);
        }
        else if (rivaln == 8) {
            Pokemon tarta3 = new Blastoise("Blue", lvlrival);
            rivalpokes.add(tarta3);
        }
        else if (rivaln == 9) {
            Pokemon fat = new Snorlax("Gordinho", lvlrival);
            rivalpokes.add(fat);
        }
        else if (rivaln == 10) {
            Pokemon Pika = new Pikachu("Pika", lvlrival);
            rivalpokes.add(Pika);
        }
        else if (rivaln == 11) {
            Pokemon Rai = new Raichu("Rai", lvlrival);
            rivalpokes.add(Rai);
        }
        else if (rivaln == 12) {
            Pokemon venven = new Dratini("Titi", lvlrival);
            rivalpokes.add(venven);
        }
        else if (rivaln == 13) {
            Pokemon Draco = new Dragonair("Dina", lvlrival);
            rivalpokes.add(Draco);
        }
        else if (rivaln == 14) {
            Pokemon venven = new Dragonite("Draco", lvlrival);
            rivalpokes.add(venven);
        }
    }
            //Aqui é uma pergunta se quer lutar com o rival , se sim serao criados pokes para ele igual ao numero criado no array pokemon e eles serao imprimidos.
    private static void lutar() {
        System.out.print("Deseja batalhar com o Rival ? " + '\n' + ":");
        Scanner scan = new Scanner(System.in);
        String escolha1 = scan.next();
        if (escolha1.equalsIgnoreCase("sim")) {
            for (Pokemon p : pokemons) {
                Criarrival();
            }
            for (Pokemon r : rivalpokes) {
                System.out.println(r);
                }
            System.out.print("Por enquanto é isso, obrigado!!" +'\n'+
                    "Um sistema de batalha esta sendo desenvolvido");
        }
        System.exit(1);
    }
}






