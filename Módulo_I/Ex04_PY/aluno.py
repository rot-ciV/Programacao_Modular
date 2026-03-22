class Aluno:

    def __init__(self, registro, nome):
        
        self.registro = registro
        self.nome = nome

    def __str__(self):
        
        return f'Registro: {self.registro} Nome: {self.nome}'