class Conta:
    
    def __init__(self, numero):
        
        self.numero = numero
        self.saldo = 0

    def depositar(self, dinheiro):
        
        self.saldo = self.saldo + dinheiro

    def sacar(self, dinheiro):

        if self.saldo < dinheiro:

            print('Não há saldo suficiente')
            return
        
        else:

            self.saldo = self.saldo - dinheiro

    
    def conferir(self):

        return self.saldo
