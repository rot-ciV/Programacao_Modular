import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    private List<Aluno> alunos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();

    public void cadastraAluno(int registro, String nome){
        
        Aluno novoAluno = new Aluno(registro, nome);
        alunos.add(novoAluno);
    }

    public void cadastraDisciplina(int codigo, String nome, double valor){

        Disciplina novaDisciplina = new Disciplina(codigo, nome, valor);
        disciplinas.add(novaDisciplina);
    }

    public void cadastraMatricula(int numero, String data, Aluno aluno){

        Matricula novaMatricula = new Matricula(numero, data, aluno);
        matriculas.add(novaMatricula);
    }

    public Aluno procuraAluno(int cadastro){

        Aluno aluno_encontrado = null;

        for(Aluno aluno_atual : alunos){

            if(aluno_atual.getRegistro() == cadastro){

                aluno_encontrado = aluno_atual;
                break;
            }
        }

        return aluno_encontrado;
    }

    public Disciplina procuraDisciplina(int codigo){

        Disciplina disciplina_encontrada = null;

        for(Disciplina disciplina_atual : disciplinas){

            if(disciplina_atual.getCodigo() == codigo){

                disciplina_encontrada = disciplina_atual;
                break;
            }
        }

        return disciplina_encontrada;
    }

    public Matricula procuraMatricula(int numero){

        Matricula matricula_encontrada = null;

        for(Matricula matricula_atual : matriculas){

            if(matricula_atual.getNumero() == numero){

                matricula_encontrada = matricula_atual;
                break;
            }
        }

        return matricula_encontrada;
    }

    public void menu(){

        Scanner teclado = new Scanner(System.in);

        while(true){

            System.out.println("-----MENU-----");
            System.out.println("01: Cadastrar Aluno");
            System.out.println("02: Buscar Aluno");
            System.out.println("03: Cadastrar Disciplina");
            System.out.println("04: Procurar Disciplina");
            System.out.println("05: Cadastrar Matrícula");
            System.out.println("06: Buscar Matŕicula");
            System.out.println("07: Adicionar Disciplina na Matrícula");
            System.out.println("08: Sair");

            int acao = teclado.nextInt();

            switch (acao) {

                case 1 -> {

                    System.out.println("Digite o registro do novo aluno:");
                    int registro = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Digite o nome do novo aluno");
                    String nome = teclado.nextLine();
                    cadastraAluno(registro, nome);
                    System.out.println("Cadastro feito com sucesso");
                }

                case 2 -> {

                    System.out.println("Digite o registo do aluno:");
                    int registro = teclado.nextInt();
                    System.out.println(procuraAluno(registro));
                }

                case 3 -> {

                    System.out.println("Digite o código da nova disciplina:");
                    int codigo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Digite o nome da nova disciplina:");
                    String nome = teclado.nextLine();
                    System.out.println("Digite o valor da nova disciplina:");
                    double valor = teclado.nextDouble();
                    cadastraDisciplina(codigo, nome, valor);
                    System.out.println("Cadastro feito com sucesso");
                }

                case 4 -> {

                    System.out.println("Digite o código da disciplina:");
                    int codigo = teclado.nextInt();
                    System.out.println(procuraDisciplina(codigo));
                }

                case 5 -> {

                    System.out.println("Digite o número da nova matrícula:");
                    int numero = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Digite a data da nova matrícula:");
                    String data = teclado.nextLine();
                    System.out.println("Digite o registro do aluno que fará a matrícula:");
                    int registro  = teclado.nextInt();
                    Aluno aluno = procuraAluno(registro);
                    cadastraMatricula(numero, data, aluno);
                    System.out.println("Cadastro feito com sucesso");
                }

                case 6 -> {

                    System.out.println("Digite o número da matrícula");
                    int numero = teclado.nextInt();
                    System.out.println(procuraMatricula(numero));
                }
                case 7 -> {

                    System.out.println("Digite o número da matrícula:");
                    int numero = teclado.nextInt();
                    Matricula matricula = procuraMatricula(numero);
                    System.out.println("Digite o código da disciplina a ser adicionado na matricula:");
                    int codigo = teclado.nextInt();
                    Disciplina d = procuraDisciplina(codigo);

                    if(d != null){

                        matricula.addDisciplina(d);
                        System.out.println("Disciplina adicionada com sucesso");
                    
                    } else {

                        System.out.println("Não existe disciplina com o código informado");
                    }
                    
                }

                case 8 -> {

                    return;
                }

                default -> System.out.println("Opcão Inválida");
            }
        }
    }

    public static void main(String[] args) {
        
        Main programa = new Main();
        programa.menu();
    }
}