import java.io.*; 
import java.util.Scanner;


public class isoccer{

   static int jogador[] = new int[30];
   static String jogadorNome[] = new String[30];
   static String jogadoresPosicao[] = new String[30];
   static String jogadorEmail[] = new String[30];
   static String jogadorCPF[] = new String[30];
   static String jogadorTelefone[] = new String[30];
   static float jogadorSalario[] = new float[30];
   static boolean apto[] = new boolean[30];

   static boolean flagPresidente, flagMedico, flagTecnico;

   static String presidenteNome, presidenteEmail, presidenteCPF, presidenteTelefone;
   static float presidenteSalario;

   static String medicoNome, medicoEmail, medicoCPF, medicoTelefone, medicoCRM;
   static float medicoSalario;

   static String tecnicoNome, tecnicoEmail, tecnicoCPF, tecnicoTelefone;
   static float tecnicoSalario;

   static int preparador[] = new int[10];
   static String preparadorNome[] = new String[10];
   static String preparadorEmail[] = new String[10];
   static String preparadorCPF[] = new String[10];
   static String preparadorTelefone[] = new String[10];
   static float preparadorSalario[] = new float[10];

   static int motorista[] = new int[10];
   static String motoristaNome[] = new String[10];
   static String motoristaEmail[] = new String[10];
   static String motoristaCPF[] = new String[10];
   static String motoristaTelefone[] = new String[10];
   static float motoristaSalario[] = new float[10];

   static int cozinheiro[] = new int[10];
   static String cozinheiroNome[] = new String[10];
   static String cozinheiroEmail[] = new String[10];
   static String cozinheiroCPF[] = new String[10];
   static String cozinheiroTelefone[] = new String[10];
   static float cozinheiroSalario[] = new float[10];

   static int advogado[] = new int[10];
   static String advogadoNome[] = new String[10];
   static String advogadoEmail[] = new String[10];
   static String advogadoCPF[] = new String[10];
   static String advogadoTelefone[] = new String[10];
   static float advogadoSalario[] = new float[10];


    static int socio[]= new int[100];
    static String socioNome[] = new String[100];
   static String socioEmail[] = new String[100];
   static String socioCPF[] = new String[100];
   static String socioTelefone[] = new String[100];
   static String socioEndereco[] = new String[100];
   static float socioValor[] = new float[100];
   static String socioStatus[] = new String[100];
   static Boolean socioAdplencia[] = new Boolean[100]; 
   static float valorJunior=0f, valorSenior=0f, valorElite=0f;

   static boolean onibus;

   static boolean estadio;
   static String estadioNome;
   static int estadioCapacidade;
   static int estadioLanchonete;
   static int estadioBanheiro;

   static boolean centroDeTreinamento;
   static int Dormitorios;


    static Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    static String lixo;

    public static void main(String[] args) 
    {
        int opc;
        String login ="guerreiros";
        String senha="12345";
        String loginDigitado, senhaDigitada;

        System.out.println("Bem vindo a pagina de admnistração dos guerreiros de alagoas");
        System.out.println("Digite seu login");
        loginDigitado=input.next();
        System.out.println("digite sua senha");
        senhaDigitada=input.next();
        limpar();
        if(senha.equals(senhaDigitada) && login.equals(loginDigitado))
        {
            System.out.println("Login efetuado com sucesso!!!");
            opc=menu1();
            while(opc!=5)
            {
            
                if(opc==1)
                {
                    limpar();
                    opc=menu2();
                    while(opc!=9)
                    {
                        if(opc==1)
                        {
                            if(flagPresidente==true)
                            {
                                limpar();
                                System.out.println("Ja existe um presidente cadastrado!, digite alguma tecla para voltar!");
                                lixo=input.next();
                            }
                            else
                            {
                                limpar();
                                flagPresidente=true;
                                System.out.println("insira o nome do presidente");
                                presidenteNome=input.next();
                                System.out.println("insira o email do presidente");
                                presidenteEmail=input.next();
                                System.out.println("insira o CPF do presidente");
                                presidenteCPF=input.next();
                                System.out.println("insira o telefone do presidente");
                                presidenteTelefone=input.next();
                                System.out.println("insira o salario do presidente");
                                presidenteSalario=input.nextFloat();
                                //System.out.format("%n%n%s%n%s%n%s%n%s%n%.2f%n", presidenteNome, presidenteEmail, presidenteCPF, presidenteTelefone, presidenteSalario);
                            }
                        }
                        else if(opc==2)
                        {
                            if(flagMedico==true)
                            {
                                limpar();
                                System.out.println("Ja existe um Medico cadastrado, digite alguma tecla para voltar!");
                                lixo=input.next();
                            }
                            else
                            {
                                limpar();
                                flagMedico=true;
                                System.out.println("insira o nome do medico");
                                medicoNome=input.next();
                                System.out.println("insira o email do medico");
                                medicoEmail=input.next();
                                System.out.println("insira o CPF do medico");
                                medicoCPF=input.next();
                                System.out.println("insira o telefone do medico");
                                medicoTelefone=input.next();
                                System.out.println("insira o salario do medico");
                                medicoSalario=input.nextFloat();
                            }
                        }
                        else if(opc==3)
                        {
                            if(flagTecnico==true)
                            {
                                limpar();
                                System.out.println("Ja existe um tecnico cadastrado, digite alguma tecla para voltar!");
                                lixo=input.next();
                            }
                            else
                            {
                                limpar();
                                flagTecnico=true;
                                System.out.println("insira o nome do tecnico");
                                tecnicoNome=input.next();
                                System.out.println("insira o email do tecnico");
                                tecnicoEmail=input.next();
                                System.out.println("insira o CPF do tecnico");
                                tecnicoCPF=input.next();
                                System.out.println("insira o telefone do tecnico");
                                tecnicoTelefone=input.next();
                                System.out.println("insira o salario do tecnico");
                                tecnicoSalario=input.nextFloat();
                            }
                        }
                        else if(opc==4)
                        {
                            adicionarPreparador();
                        }
                        else if(opc==5)
                        {
                            adicionarMotirista();
                        }
                        else if(opc==6)
                        {
                            adicionarCozinheiro();
                        }
                        else if(opc==7)
                        {
                            adicionarAdvogador();
                        }
                        else if(opc==8)
                        {
                            adicionarJogador();
                        }

                        limpar();
                        opc=menu2();
                        //System.out.format("%n%n%n%d%n%n%n", opc);
                    }
                    
    
                }
                else if(opc==2)
                {
                    if(valorJunior==0 || valorSenior==0 || valorElite==0)
                    {
                        System.out.println("Atualize os valores de niveis de socio");
                        System.out.println("insira o valor para ser socio Junior");
                        valorJunior=input.nextFloat();
                        System.out.println("insira o valor para ser socio Senior");
                        valorSenior=input.nextFloat();
                        System.out.println("insira o valor para ser socio Elite");
                        valorElite=input.nextFloat();
                        limpar();
                    }
                    opc=menu3();
                    if(opc==1)
                    {
                        adicionarSocio();
                    }
                    else if(opc==2)
                    {
                        mudaradplencia();
                    }
                    else if(opc==3)
                    {
                        mudarStatusSocio();
                    }

                }
                else if(opc==3)
                {
                    opc=menu4();
                    if(opc==1)
                    {
                        if(onibus==false)
                        {
                            System.out.println("Não a existe onibus disponivel para o time, se deseja adicionar um onibus digite (1), se nao tecle (2)");
                            opc=input.nextInt();
                            if(opc==1)
                            {
                                onibus=true;
                                System.out.println("onibus adicionado com sucesso!");
                            }  
                        }
                        else
                        {
                            System.out.println("Existe um onibus disponivel para o time");
                        }
                    }
                    else if(opc==2)
                    {
                        if(estadio==false)
                        {

                            System.out.println("Não a existe estadio disponivel para o time, se deseja adicionar um estadio digite (1), se nao tecle (2)");
                            opc=input.nextInt();
                            if(opc==1)
                            {
                                adicionarEstadio();
                                System.out.println("estadio adicionado com sucesso!");
                            }

                        }
                        else
                        {
                            System.out.format("o Estadio %s comporta %d torcedores, tem %d banheiros e %d lanchonetes%n", estadioNome, estadioCapacidade, estadioBanheiro, estadioLanchonete);
                            System.out.println("Deseja atualizar os dados do estadio? Se sim digite (1), se não digite (2)");
                            opc=input.nextInt();
                            if(opc==1)
                            {
                                System.out.println("Insira a capacidade do estadio:");
                                estadioCapacidade=input.nextInt();
                                System.out.println("Insira o numero de lanchonetes do estadio:");
                                estadioLanchonete=input.nextInt();
                                System.out.println("Insira o numero de banheiros do estadio:");
                                estadioBanheiro=input.nextInt();
                                System.out.println("Dados atualizados com sucesso!");
                            }
                        }
                    }
                    else if(opc==3)
                    {
                        if(centroDeTreinamento==false)
                        {
                            System.out.println("Não a existe centro de treinamento disponivel para o time, se deseja adicionar um centro de treinamento digite (1), se nao tecle (2)");
                            opc=input.nextInt();
                            if(opc==1)
                            {
                                centroDeTreinamento=true;
                                System.out.println("digite o numero de dormitorios no centro de treinamento");
                                Dormitorios=input.nextInt();
                                System.out.println("centro de treinamento adicionado com sucesso");
                            }
                        }
                    }
                    else
                    {
                        System.out.format("O centro de treinamento tem %d dormitorios%n", Dormitorios);
                        System.out.println("Deseja atualizar os dados do centro de treinamento? Se sim digite (1), se não digite (2)");
                        opc=input.nextInt();
                        if(opc==1)
                        {
                            System.out.println("digite o numero de dormitorios no centro de treinamento");
                            Dormitorios=input.nextInt(); 
                            System.out.println("Dados atualizados com sucesso!");
                        }

                    }

                }
                else if(opc==4)
                {
                    opc=menu5();
                    if(opc==1)
                    {
                        relatorioTime();
                    }
                    else if(opc==2)
                    {
                        relatorioFuncionarios();
                    }
                    else if(opc==3)
                    {
                        relatorioRecursos();
                    }
                    else if(opc==4)
                    {
                        relatorioTorcedor();
                    }
                    else if(opc==5)
                    {
                        relatorioTime();
                        System.out.println();
                        relatorioFuncionarios();
                        System.out.println();
                        relatorioRecursos();
                        System.out.println();
                        relatorioTorcedor();
                    }

                }
                limpar();
                opc=menu1();
            }
        }
        else
        {
            System.out.println("Login ou senha invalidos, tente novamente.");
        }

       input.close();
    }



    public static void limpar()
    {
        System.out.format("%n%n%n%n%n%n");
    }

    public static int menu1()
    {
            System.out.println("Escolha a opção");
            System.out.println("(1) adicionar funcionarios");
            System.out.println("(2) gerenciar socio-torcedor");
            System.out.println("(3) gerenciar recursos fisicos");
            System.out.println("(4) solicitar relatorio");
            System.out.println("(5) sair");
            int opc;
            opc=input.nextInt();
            return opc;
    }
    public static int menu2()
    {
            System.out.println("Escolha a opção");
            System.out.println("(1) adicionar presidente");
            System.out.println("(2) adicionar medico");
            System.out.println("(3) adicionar tecnico");
            System.out.println("(4) adicionar preparador fisico");
            System.out.println("(5) adicionar motorista");
            System.out.println("(6) adicionar cozinheiro");
            System.out.println("(7) adicionar advogado");
            System.out.println("(8) adicionar jogador");
            System.out.println("(9) voltar");
            int opc;
            opc=input.nextInt();
            return opc;
    }

    public static int menu3()
    {
            System.out.println("Escolha a opção");
            System.out.println("(1) adicionar socio");
            System.out.println("(2) Mudar status de pagamento de um socio");
            System.out.println("(3) Mudar os valores de cada nivel de socio");
            System.out.println("(4) Voltar");
            int opc;
            opc=input.nextInt();
            return opc;
    }

    public static int menu4()
    {
            System.out.println("Escolha a opção");
            System.out.println("(1) Adicionar ou verificar onibus");
            System.out.println("(2) Adicionar ou verificar estadio");
            System.out.println("(3) Adicionar ou verificar centro de treinamento");
            System.out.println("(4) Voltar");
            int opc;
            opc=input.nextInt();
            return opc;
    }

    public static int menu5()
    {
        System.out.println("Escolha a opção");
            System.out.println("(1) Emitir relatorio do time");
            System.out.println("(2) Emitir relatorio dos funcionarios");
            System.out.println("(3) Emitir relatorio dos recursos fisicos");
            System.out.println("(4) Emitir relatorio dos socios-torcedores");
            System.out.println("(5) Emitir todos os relatorios");
            System.out.println("(6) Voltar");

            int opc;
            opc=input.nextInt();
            return opc;
    }

    public static void relatorioTime()
    {
       int i;
       if(flagTecnico==true)
       {
        System.out.format("tecnico: %s%nemail: %s%ncpf: %s%ntelefone: %s%nsalario: %.2f%n", tecnicoNome, tecnicoEmail, tecnicoCPF, tecnicoTelefone, tecnicoSalario);
   
        System.out.println();
        System.out.println();
       }
        for(i=0; i<=22; i++)
        {
            if(jogador[i]==1)
            {
                System.out.format("jogador: %s%nposição: %s%nemail: %s%ncpf: %s%n telefone: %s%nsalario: %.2f%n", jogadorNome[i], jogadoresPosicao[i], jogadorEmail[i], jogadorCPF[i], jogadorTelefone[i], jogadorSalario[i]);
                if(apto[i]==true)
                {
                    System.out.println("jogador apto para jogar");
                    System.out.println();
                    System.out.println();
                }
                else
                {
                    System.out.println("jogador inapto para jogar");
                    System.out.println();
                    System.out.println();
                }
            }
        }

    }

    public static void relatorioFuncionarios()
    {
       int i;
       if(flagMedico==true)
       {
        System.out.format("medico: %s%nemail: %s%ncpf: %s%ntelefone: %s%nsalario: %.2f%n", medicoNome, medicoEmail, medicoCPF, medicoTelefone, medicoSalario);
   
        System.out.println();
        System.out.println();
       }

        for(i=0; i<=4; i++)
        {
            if(preparador[i]==1)
            {
                System.out.format("preparador: %s%nemail: %s%ncpf: %s%n telefone: %s%nsalario: %.2f%n", preparadorNome[i],preparadorEmail[i], preparadorCPF[i], preparadorTelefone[i], preparadorSalario[i]);
            }
        }
        for(i=0; i<=4; i++)
        {
            if(motorista[i]==1)
            {
                System.out.format("motorista: %s%nemail: %s%ncpf: %s%n telefone: %s%nsalario: %.2f%n", motoristaNome[i],motoristaEmail[i], motoristaCPF[i], motoristaTelefone[i], motoristaSalario[i]);
            }
        }
        for(i=0; i<=4; i++)
        {
            if(cozinheiro[i]==1)
            {
                System.out.format("cozinheiro: %s%nemail: %s%ncpf: %s%n telefone: %s%nsalario: %.2f%n", cozinheiroNome[i],cozinheiroEmail[i], cozinheiroCPF[i], cozinheiroTelefone[i], cozinheiroSalario[i]);
            }
        }
        for(i=0; i<=4; i++)
        {
            if(advogado[i]==1)
            {
                System.out.format("advogado: %s%nemail: %s%ncpf: %s%n telefone: %s%nsalario: %.2f%n", advogadoNome[i],advogadoEmail[i], advogadoCPF[i], advogadoTelefone[i], advogadoSalario[i]);
            }
        }

    }

    public static void relatorioRecursos()
    {
        if(onibus==true)
        {
            System.out.println("Onibus disponivel");
        }
        else
        {
            System.out.println("onibus indisponivel");
        }
        if(estadio==true)
        {
            System.out.format("o Estadio %s comporta %d torcedores, tem %d banheiros e %d lanchonetes%n", estadioNome, estadioCapacidade, estadioBanheiro, estadioLanchonete);

        }
        else
        {
            System.out.println("estadio indisponivel");
        }
        if(centroDeTreinamento==true)
        {
            System.out.format("O centro de treinamento tem %d dormitorios%n", Dormitorios);
        }
        else
        {
            System.out.println("centro de treinamento indisponivel");
        }
    }

    public static void relatorioTorcedor()
    {
        int quantidadeSocios=0, adiplentes=0, inadiplentes=0;
        int i;
        for(i=0; i<=90; i++)
        {
            if(socio[i]==1)
            {
                quantidadeSocios++;
                if(socioAdplencia[i]==true)
                {
                    adiplentes++;
                }
                else
                {
                    inadiplentes++;
                }

            }
        }
        System.out.format("No momento o clube possuiu %d socios-torcedores, %d adiplente, %d inadplentes%n", quantidadeSocios, adiplentes, inadiplentes);

        for(i=0; i<=90; i++)
        {
            if(socio[i]==1)
            {
                System.out.format("socio: %s%nemail: %s%ncpf: %s%n telefone: %s%ncontribuião: %.2f%nnivel:%s%n", socioNome[i],socioEmail[i], socioValor[i], socioStatus[i]);
                if(socioAdplencia[i]==true)
                {
                    System.out.println("socio adiplente");
                }
                else
                {
                    System.out.println("socio inadiplente");
                }

            }
        }
    }


    
    public static void adicionarPreparador()
    {
        int i;
        for(i=0; i<=4; i++)
        {
            if(preparador[i]==0)
            {
                preparador[i]=1;
                break;
            }
        }
        System.out.format("%n%n%d%n%n", i);
        if(i>=4)
        {
            System.out.println("Voce ja tem preparadores demais, tecle qualquer letra para voltar.");
            lixo=input.next();
            return;
        }
        System.out.println("insira o nome do preparador");
        preparadorNome[i]=input.next();
        System.out.println("insira o email do preparador");
        preparadorEmail[i]=input.next();
        System.out.println("insira o CPF do preparador");
        preparadorCPF[i]=input.next();
        System.out.println("insira o telefone do preparador");
        preparadorTelefone[i]=input.next();
        System.out.println("insira o salario do preparador");
        preparadorSalario[i]=input.nextFloat();

        //System.out.format("%n%n%s%n%s%n%s%n%s%n%.2f%n%n", preparadorNome[i], preparadorEmail[i], preparadorCPF[i], preparadorTelefone[i], preparadorSalario[i]);
        return;

    }
    public static void adicionarMotirista()
    {
        int i;
        for(i=0; i<=4; i++)
        {
            if(motorista[i]==0)
            {
                motorista[i]=1;
                break;
            }
        }
        if(i>=4)
        {
            System.out.println("Voce ja tem motoristas demais, tecle qualquer letra para voltar.");
            lixo=input.next();
            return;
        }
        System.out.println("insira o nome do motorista");
        motoristaNome[i]=input.next();
        System.out.println("insira o email do motorista");
        motoristaEmail[i]=input.next();
        System.out.println("insira o CPF do motorista");
        motoristaCPF[i]=input.next();
        System.out.println("insira o telefone do motorista");
        motoristaTelefone[i]=input.next();
        System.out.println("insira o salario do motorista");
        motoristaSalario[i]=input.nextFloat();
        return;

    }
    public static void adicionarCozinheiro()
    {
        int i;
        for(i=0; i<=4; i++)
        {
            if(cozinheiro[i]==0)
            {
                cozinheiro[i]=1;
                break;
            }
        }
        if(i>=4)
        {
            System.out.println("Voce ja tem cozinheiros demais, tecle qualquer letra para voltar.");
            lixo=input.next();
            return;
        }
        System.out.println("insira o nome do cozinheiro");
        cozinheiroNome[i]=input.next();
        System.out.println("insira o email do cozinheiro");
        cozinheiroEmail[i]=input.next();
        System.out.println("insira o CPF do cozinheiro");
        cozinheiroCPF[i]=input.next();
        System.out.println("insira o telefone do cozinheiro");
        cozinheiroTelefone[i]=input.next();
        System.out.println("insira o salario do cozinheiro");
        cozinheiroSalario[i]=input.nextFloat();

    }

    public static void adicionarAdvogador()
    {
        int i;
        for(i=0; i<=4; i++)
        {
            if(advogado[i]==0)
            {
                advogado[i]=1;
                break;
            }
        }
        if(i>=4)
        {
            System.out.println("Voce ja tem advogados demais, tecle qualquer letra para voltar.");
            lixo=input.next();
            return;
        }
        System.out.println("insira o nome do advogado");
        advogadoNome[i]=input.next();
        System.out.println("insira o email do advogado");
        advogadoEmail[i]=input.next();
        System.out.println("insira o CPF do advogado");
        advogadoCPF[i]=input.next();
        System.out.println("insira o telefone do advogado");
        advogadoTelefone[i]=input.next();
        System.out.println("insira o salario do advogado");
        advogadoSalario[i]=input.nextFloat();
        return;

    }

    public static void adicionarJogador()
    {
        int i;
        int aux;
        for(i=0; i<=22; i++)
        {
            if(jogador[i]==0)
            {
                jogador[i]=1;
                break;
            }
        }
        //System.out.format("%n%n%d%n%n", i);
        if(i>=22)
        {
            System.out.println("Voce ja tem jogadores demais, tecle qualquer letra para voltar.");
            lixo=input.next();
            return;
        }
        System.out.println("insira o nome do jogador");
        jogadorNome[i]=input.next();
        System.out.println("insira o email do jogador");
        jogadorEmail[i]=input.next();
        System.out.println("insira o CPF do jogador");
        jogadorCPF[i]=input.next();
        System.out.println("insira o telefone do jogador");
        jogadorTelefone[i]=input.next();
        System.out.println("insira o salario do jogador");
        jogadorSalario[i]=input.nextFloat();
        System.out.println("insira a posição do jogador (volante, zagueiro, meia, goleiro, atacante, lateral esquerdo, lateral direito)");
        jogadoresPosicao[i]=input.next();
        System.out.println("se o jogador estiver apto para jogar digite 1, se não, digite 0");
        aux=input.nextInt();
        if(aux==1)
        {
            apto[i]=true;
        }

        return;

    }

    public static void adicionarSocio()
    {
        int i;
        int aux;
        for(i=0; i<=90; i++)
        {
            if(socio[i]==0)
            {
                socio[i]=1;
                break;
            }
        }
     
        if(i>=90)
        {
            System.out.println("Voce ja tem Socios demais, tecle qualquer letra para voltar.");
            lixo=input.next();
            return;
        }
        System.out.println("insira o nome do socio");
        socioNome[i]=input.next();
        System.out.println("insira o email do socio");
        socioEmail[i]=input.next();
        System.out.println("insira o CPF do socio");
        socioCPF[i]=input.next();
        System.out.println("insira o telefone do socio");
        socioTelefone[i]=input.next();
        System.out.println("insira o endereço do socio");
        socioEndereco[i]=input.next();
        System.out.println("insira o valor de contribuiçao do socio");
        socioValor[i]=input.nextFloat();
        if(socioValor[i]>=valorElite)
        {
            System.out.println("Socio ELite adicionado");
            socioStatus[i]="Elite";

        }
        else if(socioValor[i]>=valorSenior)
        {
            System.out.println("Socio Senior adicionado");
            socioStatus[i]="Senior";
        }
        else if(socioValor[i]>=valorJunior)
        {
            System.out.println("Socio Junior adicionado");
            socioStatus[i]="Junior";
        }
        System.out.println("se o socio estiver adplente digite 1, se não, digite 0");
        aux=input.nextInt();
        if(aux==1)
        {
            socioAdplencia[i]=true;
        }

        return;
    }

    public static void mudarStatusSocio()
    {
        System.out.println("insira o valor para ser socio Junior");
        valorJunior=input.nextFloat();
        System.out.println("insira o valor para ser socio Senior");
        valorSenior=input.nextFloat();
        System.out.println("insira o valor para ser socio Elite");
        valorElite=input.nextFloat();
        int i;
        for(i=0; i<=90; i++)
        {
            if(socio[i]==1)
            {
                if(socioValor[i]>=valorElite)
                {
                    //System.out.println("Socio ELite adicionado");
                    socioStatus[i]="Elite";

                }
                else if(socioValor[i]>=valorSenior)
                {
                    //System.out.println("Socio Senior adicionado");
                    socioStatus[i]="Senior";
                }
                else if(socioValor[i]>=valorJunior)
                {
                    //System.out.println("Socio Junior adicionado");
                    socioStatus[i]="Junior";
                }
            }
        }

        System.out.println("Status dos socios atualizados.");
        return;
    }

    public static void mudaradplencia()
    {
        String cpfProcurado;
        System.out.println("digite o cpf do socio que voce deseja mudar o status de adplencia");
        cpfProcurado=input.next();
        int i;
        int flag=1;
        for(i=0; i<=90; i++)
        {
            if(cpfProcurado.equals(socioCPF[i]))
            {
                flag=0;
                if(socioAdplencia[i]==true)
                {
                    socioAdplencia[i]=false;
                    System.out.format("O status de pagamento do socio %s foi alterado para inadiplente", socioNome[i]);

                }
                else
                {
                    socioAdplencia[i]=true;
                    System.out.format("O status de pagamento do socio %s foi alterado para adiplente", socioNome[i]);   
                }
                break;
            }
        }
        if(flag==1){
            System.out.println("O CPF nao foi encontrado no nosso banco de dados.");

        }
    }

    public static void adicionarEstadio()
    {
        estadio=true;
        System.out.println("Escolha um nome para o estadio:");
        estadioNome=input.next();
        System.out.println("Insira a capacidade do estadio:");
        estadioCapacidade=input.nextInt();
        System.out.println("Insira o numero de lanchonetes do estadio:");
        estadioLanchonete=input.nextInt();
        System.out.println("Insira o numero de banheiros do estadio:");
        estadioBanheiro=input.nextInt();

    }



}