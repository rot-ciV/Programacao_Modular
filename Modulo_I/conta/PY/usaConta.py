from conta import Conta
from contaInterface import ContaInterface

class UsaConta:
        
    def main(self):
        conta_cliente = Conta(123456)
        interface = ContaInterface()
        interface.menu(conta_cliente)

if __name__ == "__main__":
    programa = UsaConta()
    programa.main()