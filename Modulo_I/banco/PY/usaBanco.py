from contaInterface import ContaInterface
from banco import Banco
from bancoInterface import BancoInterface

class UsaBanco:

    def __init__(self):
        pass

    def main(self, banco):

        interface = BancoInterface(banco)
        interface.menu()

banco = Banco()
programa = UsaBanco()
programa.main(banco)
