from conta import Conta
from contaInterface import ContaInterface

class UsaConta:

    def __init__(self):
        pass
        
    def Main(self):
        conta_cliente = Conta(123456)
        interface = ContaInterface()
        interface.Menu(conta_cliente)


programa = UsaConta()
programa.Main()