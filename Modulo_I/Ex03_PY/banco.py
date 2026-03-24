from conta import Conta

class Banco:

    def __init__(self):
        
        self.contas = []

    def adiciona(self, conta_usuario):
        
        self.contas.append(conta_usuario) 