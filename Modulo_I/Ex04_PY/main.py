from aluno import Aluno
from disciplina import Disciplina
from matricula import Matricula

class Main:

    def __init__(self):

        self.alunos = []
        self.disciplinas = []
        self.matriculas = []

    
    def cadastrarAluno(self, registro, nome):

        novo_aluno = Aluno(registro, nome)
        self.alunos.append(novo_aluno)

    def cadastrarDiciplina(self, codigo, nome, valor):

        nova_diciplina = Disciplina(codigo, nome, valor)
        self.disciplinas.append(nova_diciplina)

    def cadastrarMatricula(self, numero, data, aluno):

        nova_matricula = Matricula(numero, data, aluno)
        self.matriculas.append(nova_matricula)

    def procuraAluno(self, numero):

        for aluno_atual in self.alunos:

            if aluno_atual.registro == numero:
                
                return aluno_atual

        return None
    
    def procuraDisciplina(self, numero):

        for disciplina_atual in self.disciplinas:

            if disciplina_atual.codigo == numero:
                
                return disciplina_atual

        return None
    
    def procuraMatricula(self, numero):

        for matricula_atual in self.matriculas:

            if matricula_atual.numero == numero:
                
                return matricula_atual

        return None
    
    def main(self):

        while True:

            print('-----Menu-----')
            print('01: Cadastrar Aluno')
            print('02: Buscar Aluno')
            print('03: Cadastrar Disciplina')
            print('04: Buscar Disciplina')
            print('05 Cadastrar Matricula')
            print('06: Buscar Matricula')
            print('07: Adicionar disciplina na matrícula')
            print('08: Sair')

            acao = int(input())

            match acao:

                case 1:
                    nome = input('Nome do novo aluno: ')
                    registro = int((input('Registro do novo aluno: ')))
                    self.cadastrarAluno(registro, nome)
                    print('Aluno cadastradado com sucesso')

                case 2:
                    print('Registro do aluno: ')
                    registro = int(input())
                    acha_aluno = self.procuraAluno(registro)
                    print(acha_aluno)

                case 3:
                    nome = input('Nome da nova disciplina: ')
                    codigo = int((input('Codigo da nova disciplina: ')))
                    valor = float((input('Valor da nova disciplina: ')))
                    self.cadastrarDiciplina(codigo, nome, valor)
                    print('Disciplina registrada com sucesso')

                case 4:
                    print('Código da disciplina: ')
                    codigo = int(input())
                    acha_disciplina = self.procuraDisciplina(codigo)
                    print(acha_disciplina)

                case 5:
                    print('Registro do aluno: ')
                    registro = int(input())
                    aluno = self.procuraAluno(registro)
                    
                    if aluno == None:

                        print('Aluno não encontrado')

                    else:

                        print('Data da matrícula: ')
                        data = input()
                        print('Número da matrícula: ')
                        numero = int(input())
                        self.cadastrarMatricula(numero, data, aluno)

                case 6:
                    print('Número da matrícula: ')
                    numero = int(input())
                    acha_matricula = self.procuraMatricula(numero)
                    print(acha_matricula)

                case 7:
                    print('Número da matricula: ')
                    num_matricula = int(input())
                    matricula = self.procuraMatricula(num_matricula)

                    if matricula == None:

                        print('Matricula não existe')

                    else:

                        print('Código da disciplina: ')
                        cod_disciplina = int(input())
                        disciplina = self.procuraDisciplina(cod_disciplina)

                        if disciplina == None:

                            print('Disciplina não existe')

                        else:

                            matricula.disciplinas.append(disciplina)
                case 8:
                    break

                case _:
                    print('Opção inválida')


programa = Main()
programa.main()




