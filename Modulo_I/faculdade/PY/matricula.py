from aluno import Aluno
from disciplina import Disciplina

class Matricula:

    def __init__(self, numero, data, aluno):

        self.numero = numero
        self.data = data
        self.aluno = aluno
        self.disciplinas = []

    def __str__(self):

        return f'Número: {self.numero} Data: {self.data} Aluno: {self.aluno} Valor total: {self.calculaTotal()}'
    
    def calculaTotal(self):

        soma = 0

        for disciplina_atual in self.disciplinas:

            soma = soma + disciplina_atual.valor

        return soma
