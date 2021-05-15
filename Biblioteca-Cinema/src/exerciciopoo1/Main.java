//package exerciciopoo1;
//import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Video video = new Video();
        
        video = menuCriarFilme();
        
        menuVerificarFilme(video);
     
}
    
    
    public static Video menuCriarFilme() {        
        Scanner scanner = new Scanner(System.in);
        Video aux = new Video();
        
        // Para calcular a data
        Calendar hoje = Calendar.getInstance();
        int anoAtual = hoje.get(Calendar.YEAR);
        
        String nomeFilme, name, country = "Brasil", birthdate; // Informacoes sobre o diretor e ator
        int qntAtores = 0, contadorAtores = 0;
        int lenght = -1, ano = -1, escolhaGenero = 0, escolhaClassIndicativa = 0;
        int op; // Serve para escolher as opcoes do usuario
        int loop = 1; // Serve para prender o usuario em loops e obrigar ele a escolher uma opcao valida
        
        System.out.println("Vamos criar seu filme!");
        pularLinha();
        System.out.println("Primeiro digite um título legal para ele: ");
        System.out.print("Título do filme: ");    
        nomeFilme = scanner.nextLine();
        pularLinha();
            
        while(loop == 1) {
            System.out.println("Você prefere ser chamado pelo (1) nome ou (2) nickname? ");
            System.out.print("Opção escolhida: ");
            op = scanner.nextInt();
            pularLinha();
            
            if(op == 1) {
                System.out.println("Certo. Me diga seu nome por favor: ");
                System.out.print("Seu nome: ");
                name = scanner.nextLine(); 
                loop = 0;
            } else if(op == 2) {
                System.out.println("Legal, também adoro nicknames! Qual é o seu?");
                System.out.print("Seu nickname: ");
                name = scanner.nextLine(); 
                loop = 0;
            } else {
                pularLinha();
                System.out.println("Opção inválida! Por favor escolha uma das duas opções abaixo:");
                pularLinha();
            }
        }
        name = scanner.nextLine(); 
        
        pularLinha();
        System.out.println("Prazer em te conhecer " + name + ". Preciso que você me passe o ano do seu filme, consegue se lembrar quando criou ele?");
        pularLinha();
        System.out.println("(1) Sim, consigo me lembrar");
        System.out.println("(2) Não me lembro");
        System.out.print("Opção escolhida: ");
        op = scanner.nextInt();
        
        loop = 1;
        while(loop == 1) {
                if(op == 1) {
                    pularLinha();
                    System.out.println("Qual o ano?");
                    System.out.print("Ano do filme: ");
                    ano = scanner.nextInt();
                    pularLinha();
                    aux.setYear(ano);
                    if(ano >= 1878 && ano <= anoAtual) {
                        loop = 0;
                    } else {
                        pularLinha();
                        System.out.println("Lembre-se de digitar um ano válido para o filme");
                    }
                } else if(op == 2) {
                    pularLinha();
                    System.out.println("Sem problemas. Para que seu filme não fique sem um ano, irei colocar o ano atual");
                    aux.setYear(ano);
                    if(aux.year >= 1878 && aux.year <= anoAtual) {
                        loop = 0;
                    } else {
                        pularLinha();
                        System.out.println("Lembre-se de digitar um ano válido para o filme");
                    }
                } else {
                    pularLinha();
                    System.out.println("Opção inválida! Digite (1) caso consiga se lembrar e (2) caso não se lembre");
                    System.out.print("Opção escolhida: ");
                    op = scanner.nextInt();
            }
        }
        
        pularLinha();
        System.out.println("Qual sua data de aniversário?");
        pularLinha();
        System.out.print("Lembre-se de digitar formato (DD/MM/YYYY):  ");
        birthdate = scanner.next();
        
        pularLinha();
        System.out.println("Seu país de origem é o Brasil?");
        pularLinha();
        
        loop = 1;
        while(loop == 1) {
            System.out.println("(1) Sim");
            System.out.println("(2) Não");
            System.out.print("Opção escolhida: ");
            op = scanner.nextInt();
        
            if(op == 1) {
                pularLinha();
                System.out.println("Legal! Somos dois então");
                country = "Brasil";
                loop = 0;
            } else if(op == 2) {
                pularLinha();
                System.out.println("Oh, que diferente, então qual é o seu país de origem?");
                System.out.print("Seu país: ");
                country = scanner.next();
                loop = 0;
            } else {
                pularLinha();
                System.out.println("Opção inválida! Por favor escolha (1) se for de origem brasileira ou (2) se não for:");
                pularLinha();
            }
        }
        Director director = new Director(name, country, birthdate);
        
        pularLinha(); pularLinha();
        System.out.println("Agora vamos adicionar atores no seu filme");
        pularLinha();
        System.out.println("Quantos atores ele vai ter?");
        System.out.print("Numero de atores: ");
        qntAtores = scanner.nextInt();
        pularLinha();
        
        ArrayList<Actor> actor = new ArrayList<Actor>();
        
        for(contadorAtores = 0; contadorAtores < qntAtores; contadorAtores++) {
            System.out.print("Nome do ator " + (contadorAtores + 1) + ": " );
            name = scanner.next();
            System.out.print("País de origem do ator " + (contadorAtores + 1) + ": ");
            country = scanner.next();
            pularLinha();
            System.out.print("data de aniversário do ator (DD/MM/YYYY) " + (contadorAtores + 1) + ": " );
            birthdate = scanner.next();
            
            Actor temp = new Actor(name, country, birthdate);
            
            actor.add(temp);
                
            pularLinha();
             
        }
        
        pularLinha();
        System.out.println("Agora uma parte importante: qual a classificação indicativa do seu filme?");
        pularLinha();
        
        loop = 1;
        while(loop == 1) {
            System.out.printf("(1) Livre para todos os publicos\n(2) Para maiores de dez anos\n(3) Para maiores de doze anos\n"
            + "(4) Para maiores de catorze anos\n(5) Para maiores de dezoito anos\n");
            System.out.print("Opção escolhida: ");
            op = scanner.nextInt();
            if(op < 1 || op > 5) {
                pularLinha();
                System.out.println("Opção inválida! Por favor escolha uma das cinco opções abaixo:");
                pularLinha();
            } else {
                pularLinha();
                System.out.println("Lembre-se que se julgarmos que a sua classificação indicativa não é a correta"
                        + " para o filme, iremos altera-la.");
                System.out.println("Mas sinto que posso confiar em você então isso não será necessário!");
                escolhaClassIndicativa = op;
                loop = 0;
            }
            
        }
        pularLinha();
        System.out.println("E em relação ao genero, qual é a opção que melhor descreve seu filme?");
        
        loop = 1;
        while(loop == 1) {
            System.out.println("(1) Meu filme tem muita ação e adrenalina\n(2) Meu filme é sobre uma aventura íncrivel\n(3) Meu filme é feito para rir até doer a barriga\n"
            + "(4) Meu filme é um romance sobre um casal apaixonado <3\n(5) Meu filme trabalha com conceitos ficcionais e imaginativos, pura ficção científica\n"
            + "(6) Meu filme é aterrorizante e consegue causar medo em qualquer um\n(7) Meu filme se concentra em uma trama policial");
            System.out.print("Opção escolhida: ");
            op = scanner.nextInt();
            if(op < 1 || op > 7) {
                pularLinha();
                System.out.println("Opção inválida! Por favor escolha uma das sete opções abaixo:");
                pularLinha();
            } else {
                escolhaGenero = op;
                loop = 0;
            }
        }
        pularLinha();
        System.out.println("Chegamos a última pergunta. Ihuuu!!!");
        pularLinha();
        System.out.println("Qual a duração do seu filme?");
        pularLinha();
        
        loop = 1;
        while(loop == 1) {
            System.out.printf("(1) Vou digitar a duração\n(2) Não sei dizer ao certo");
            pularLinha();
            System.out.print("Opção escolhida: ");
            op = scanner.nextInt();
            if(op == 1) {
                pularLinha();
                System.out.println("OBS: Se a duração do seu vídeo não for exatamente um número inteiro, arredonde para cima");
                System.out.println("Por exemplo: A duração é de 2:21, então coloque a duração como 3");
                pularLinha();
                System.out.print("Digite a duração em números inteiros por favor: ");
                lenght = scanner.nextInt();
                loop = 0;
            } else if(op == 2) {
                pularLinha();
                System.out.println("Ok! Sendo assim, deixaremos sem uma duração definida");
                loop = 0;
            } else {
                System.out.println("Opção inválida! Por favor digite uma das duas opções abaixo:");
            } 
        }
        
        
        
        Video video = new Video(nomeFilme, escolhaGenero, escolhaClassIndicativa, director, actor);
        video.setYear(ano);
        video.setLenght(lenght);
        pularLinha();
        System.out.println("Parabéns, Seu filme foi criado com sucesso!");
        
        return video;
    }
    
    static public void menuVerificarFilme(Video video) {
        Scanner scanner = new Scanner(System.in);
        
        int op, mainLoop = 1, loop, loopDirector, flag = 0;
        float op2;
        
        pularLinha();
        System.out.println("Olá novamente " + video.DIRECTOR.getName() + "! Que operação gostaria de realizar?");
        pularLinha();
        while(mainLoop == 1) {
            System.out.println("(1) Ver o filme\n(2) Verificar dados sobre o filme\n(3) Sair");
            System.out.print("Opção escolhida: ");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    pularLinha();
                    System.out.println("Assistindo...");
                    pularLinha();
                    System.out.println("...");
                    pularLinha();
                    System.out.println("...");
                    pularLinha();
                    
                    video.incrementViews();
                    
                    if(video.lenght != -1){
                        System.out.println("Mais ou menos " + video.lenght + "Horas depois...");
                    } else {
                        System.out.println("Algum tempo depois...");
                    }
                    pularLinha();
                    System.out.println("Depois de algum tempo olhando os créditos, você finalmente acabou o filme");
                    pularLinha();
                    System.out.println("E aí " + video.DIRECTOR.getName() + ", gostou do filme?");
                    
                    loop = 1;
                    while(loop == 1) {
                        System.out.print("(1) Sim, adorei!\n(2) Nâo, acabei ficando com sono\n(3) Mais ou menos...");
                        pularLinha();
                        System.out.print("Opção escolhida: ");
                        op = scanner.nextInt();
                        if(op == 1) {
                            pularLinha();
                            System.out.println("Eba! Achei mesmo que fosse gostar :D");
                            loop = 0;
                        } else if(op == 2) {
                            pularLinha();
                            System.out.println("Poxa, que decepcionante. Talvez em um próximo filme você goste!");
                            loop = 0;
                        } else if(op == 3) {
                            pularLinha();
                            System.out.println("Bom, pelo menos não é um 'não'");
                            loop = 0;
                        } else {
                            pularLinha();
                            System.out.println("Opção inválida! Por favor escolha uma das três opções abaixo: ");
                            pularLinha();
                        }
                    }
                    
                    pularLinha();
                    loop = 1;
                    while(loop == 1) {
                        pularLinha();
                        System.out.println("Agora que já viu o filme, qual foi sua avaliação sobre ele. Escolha uma nota entre 0 a 10");
                        System.out.println("Pode ser tanto números inteiros quanto racionais");
                        System.out.print("Sua nota: ");
                        op2 = scanner.nextInt();
                        if(op2 < 0 || op2 > 10) {
                            pularLinha();
                            System.out.println("Vamos lá, a nota precisa ser exclusivamente entre 0 a 10. Não é dificil, sei que você consegue!");
                        } else {
                            video.addUserRating(op2);
                            pularLinha();
                            if(op == 1) {
                                if(op2 >= 0 && op2 < 6) {
                                    System.out.println("Que estranho, você disse que tinha gostado do filme...");
                                }
                                if(op2 >= 6 && op2 < 8) {
                                    System.out.println("Uma nota bem razoável para alguem que gostou do filme heim");
                                }
                                if(op2 >= 8 && op2 <= 10) {
                                    System.out.println("Aparentemente você adorou mesmo o filme, aí sim!!!");
                                }
                            }
                            if(op == 2) {
                                if(op2 >= 0 && op2 < 6) {
                                    System.out.println("É, pela nota parece que não gostou mesmo D:");
                                }
                                if(op2 >= 6 && op2 < 8) {
                                    System.out.println("Uma nota bem razoável para alguem que não gostou do filme heim");
                                }
                                if(op2 >= 8 && op2 <= 10) {
                                    System.out.println("Considerando sua nota parece que você mudou de ideia sobre o filme. Que bom!");
                                }
                            }
                            if(op == 3) {
                                if(op2 >= 0 && op2 < 6) {
                                    System.out.println("Parece que o seu 'mais ou menos' ta mais pra menos do que pra mais...");
                                }
                                if(op2 >= 6 && op2 < 8) {
                                    System.out.println("Entendo o porquê da nota, é realmente um filme ok");
                                }
                                if(op2 >= 8 && op2 <= 10) {
                                    System.out.println("Uou, to surpreso. Parece que gostou mais do que pensa desse filme");
                                }
                            }
                            loop = 0;
                            pularLinha();
                        }
                    }
                        break;
                    
                case 2:
                    pularLinha();
                    System.out.println("Certo. Qual dado gostaria de verificar?");
                    
                    loop = 1;
                    while(loop == 1) {
                        op = 0;
                        if(flag == 1) {
                            pularLinha();
                            System.out.println("Deseja verificar mais algum dado do filme?");
                            System.out.print("(1) Sim\n(2) Não\n");
                            System.out.print("Opção escolhida: ");
                            op = scanner.nextInt();
                            if(op == 1 || op == 2) {
                                    if(op == 1) {
                                        pularLinha();
                                        System.out.println("Qual informação quer verificar?");
                                    } else if(op == 2) {
                                        pularLinha();
                                        System.out.println("Olá novamente " + video.DIRECTOR.getName()+ "! Que operação gostaria de realizar?");
                                        pularLinha();
                                        break;
                                    }
                                flag = 0;
                            } else {
                                pularLinha();
                                System.out.println("Opção inválida! Por favor escolha uma das duas opções abaixo: ");
                                pularLinha();
                            }
                        }
                        
                        pularLinha();
                        System.out.println("(1) Verificar informações sobre o(a) diretor(a) do filme\n(2) Verificar nome do filme\n(3) Verificar ID do filme\n"
                        + "(4) Verificar duração do filme\n(5) Verificar ano do filme\n(6) Verificar número de visualizações do filme\n"
                        + "(7) Verificar número de avaliações do filme\n(8) Verificar média das avaliações do filme\n"
                        + "(9) Verificar genero do filme\n(10) Verificar classificação indicativa do filme\n(11) Verificar informações sobre os atores");
                        System.out.print("Opção escolhida: ");
                        op = scanner.nextInt();
                        if(op < 1 || op > 11) {
                            System.out.println("Opção inválida! Por favor escolha uma das dez opções abaixo: ");
                        } else {
                            switch (op) {
                                case 1: 
                                    loopDirector = 1;
                                    while(loopDirector == 1) {
                                        
                                        loop = 1;
                                        while(loop == 1) {
                                            op = 0;
                                            if(flag == 1) {
                                                pularLinha();
                                                System.out.println("Quer stalkear mais o(a) diretor(a) ou já esta bom?");
                                                pularLinha();
                                                System.out.print("(1) Quero saber mais!\n(2) Já esta bom\n");
                                                System.out.print("Opção escolhida: ");
                                                op = scanner.nextInt();
                                                if(op == 1 || op == 2) {
                                                        if(op == 1) {
                                                            flag = 0;
                                                        } else if(op == 2) {
                                                            flag = 2;
                                                            break;
                                                        }
                                                } else {
                                                    pularLinha();
                                                    System.out.println("Opção inválida! Por favor escolha uma das duas opções abaixo: ");
                                                    pularLinha();
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        
                                        // Caso o ususario escolher nao verificar mais nenhum dado de diretor
                                        if(flag == 2) {
                                            flag = 1;
                                            break;
                                        }

                                        pularLinha();
                                        System.out.println("O que deseja saber sobre o(a) diretor(a)?");
                                        pularLinha();
                                        System.out.println("(1) Nome\n(2) Nacionalidade\n(3) Data de nascimento\n(4) Idade");
                                        System.out.print("Opção escolhida: ");
                                        op = scanner.nextInt();
                                        pularLinha();
                                        if(op == 1) {
                                            System.out.println("O(a) diretor(a) do filme é: " + video.DIRECTOR.getName());
                                            flag = 1;
                                        } else if(op == 2) {
                                            System.out.println("O país de origem de " + video.DIRECTOR.getName() + " é: " + video.DIRECTOR.getCountry());
                                            flag = 1;
                                        } else if(op == 3) {
                                            System.out.println("O(a) diretor(a) nasceu em " + video.DIRECTOR.dia + "/" + video.DIRECTOR.mes + "/" + video.DIRECTOR.ano);
                                            flag = 1;
                                        } else if(op == 4) {
                                            System.out.println("O(a) diretor(a) tem " + video.DIRECTOR.getAge() + " anos");
                                            flag = 1;
                                        } else {
                                            System.out.println("Opção inválida! Por favor escolha uma das quatro opções abaixo:");
                                        }
                                    }
                                    break;
                                
                                case 2: 
                                    pularLinha();
                                    System.out.println("O nome do filme é: " + video.getNAME());
                                    flag = 1;
                                    break;
                                
                                case 3:
                                    pularLinha();
                                    System.out.println("O ID do filme é: " + video.getID());
                                    flag = 1;
                                    break;
                                
                                case 4:
                                    pularLinha();
                                    if(video.getLenght() != -1) {
                                        pularLinha();
                                        System.out.println("A duração do filme é de +/-: " + video.lenght + " horas");
                                    }
                                    flag = 1;
                                    break;
                                
                                case 5:
                                    pularLinha();
                                    System.out.println("O filme é de: " + video.getYear());
                                    flag = 1;
                                    break;
                                
                                case 6:
                                    pularLinha();
                                    if(video.getNViews() > 1) {
                                        System.out.println("O filme teve " + video.getNViews() + " visualizações");
                                    } else if(video.getNViews() == 0) {
                                        System.out.println("O filme não foi visto ainda");
                                    } else {
                                        System.out.println("O filme teve apenas uma visualização");
                                    }
                                    flag = 1;
                                    break;
                                
                                case 7:
                                    pularLinha();
                                    if(video.getNViews() > 1) {
                                        System.out.println("O filme teve " + video.getNUserRatings() + " avaliações");
                                    } else if(video.getNUserRatings() == 0) {
                                        System.out.println("O filme não foi avaliado ainda");
                                    } else {
                                        System.out.println("O filme teve apenas uma avaliação");
                                    }
                                    flag = 1;
                                    break;
                                
                                case 8: 
                                    pularLinha();
                                    if(video.getNViews() == 0) {
                                        System.out.println("O filme não foi avaliado ainda, portanto não possui uma média definida");
                                    } else {
                                        System.out.println("A média de avaliações desse filme é: " + video.getUserRating());
                                    }
                                    flag = 1;
                                    break;
                                
                                case 9:
                                    pularLinha();
                                    System.out.println("O genero desse filme é: " + video.getGenero());
                                    flag = 1;
                                    break;
                                
                                case 10: 
                                    pularLinha();
                                    System.out.println("A classificação indicativa desse filme é: " + video.getClassIndicativa());
                                    flag = 1;
                                    break;
                                    
                                case 11:
                                    loopDirector = 1; // loopDirector eh usado para ator tambem para nao criar outra variavel
                                    while(loopDirector == 1) {
                                        loop = 1;
                                        while(loop == 1) {
                                            op = 0;
                                            if(flag == 1) {
                                                pularLinha();
                                                System.out.println("Quer saber mais sobre os atores ou já esta bom?");
                                                pularLinha();
                                                System.out.print("(1) Quero saber mais!\n(2) Já esta bom\n");
                                                System.out.print("Opção escolhida: ");
                                                op = scanner.nextInt();
                                                if(op == 1 || op == 2) {
                                                        if(op == 1) {
                                                            flag = 0;
                                                        } else if(op == 2) {
                                                            flag = 2;
                                                            break;
                                                        }
                                                } else {
                                                    pularLinha();
                                                    System.out.println("Opção inválida! Por favor escolha uma das duas opções abaixo: ");
                                                    pularLinha();
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        
                                        // Caso o ususario escolher nao verificar mais nenhum dado de diretor
                                        if(flag == 2) {
                                            flag = 1;
                                            break;
                                        }
                                        
                                        pularLinha();
                                        System.out.println("Qual ator vai escolher?");
                                        pularLinha();
                                        for(int i = 0; i < video.ACTOR.size(); i++) {
                                            System.out.println("Ator numero " + (i + 1));
                                        }
                                        System.out.print("Ator escolhido(a): ");
                                        int atorEscolhido = scanner.nextInt();
                                        
                                        pularLinha();
                                        System.out.println("O que deseja saber sobre esse ator?");
                                        pularLinha();
                                        System.out.println("(1) Nome\n(2) Nacionalidade\n(3) Data de nascimento\n(4) Idade");
                                        System.out.print("Opção escolhida: ");
                                        op = scanner.nextInt();
                                        pularLinha();
                                        if(op == 1) {
                                            System.out.println("O(a) diretor(a) do filme é: " + video.ACTOR.get(atorEscolhido - 1).getName());
                                            flag = 1;
                                        } else if(op == 2) {
                                            System.out.println("O país de origem de " + video.ACTOR.get(atorEscolhido - 1).getName() + " é: " + video.ACTOR.get(atorEscolhido - 1).getCountry());
                                            flag = 1;
                                        } else if(op == 3) {
                                            System.out.println("O(a) diretor(a) nasceu em " + video.ACTOR.get(atorEscolhido - 1).dia + "/" + video.ACTOR.get(atorEscolhido - 1).mes + "/" + video.ACTOR.get(atorEscolhido - 1).ano);
                                            flag = 1;
                                        } else if(op == 4) {
                                            System.out.println("O(a) diretor(a) tem " + video.ACTOR.get(atorEscolhido - 1).getAge() + " anos");
                                            flag = 1;
                                        } else {
                                            System.out.println("Opção inválida! Por favor escolha uma das quatro opções abaixo:");
                                        }
                                    }
                                    break;
                            }
                        }
                        
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public static void pularLinha() {
        System.out.println(""
                + "");
    }
}