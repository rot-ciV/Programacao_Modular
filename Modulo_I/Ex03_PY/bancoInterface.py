from conta import Conta
from contaInterface import ContaInterface
from banco import Banco

class BancoInterface:

    def __init__(self, banco):
        self.banco = banco

    def menu(self):

        while True:

            print('---Menu---')
            print('Digite o número referente a ação:')
            print('01: Nova Conta')
            print('02: Selecionar Conta')
            print('03: Sair')

            acao = int(input())

            match acao:

                case 1:
                    
                    print('Digite o número da nova conta:')
                    num_conta = int(input())
                    nova_conta = Conta(num_conta)
                    self.banco.adiciona(nova_conta)
                    

                case 2:

                    print('Digite o número da conta:')
                    num_conta = int(input())
                    existe = False

                    for conta_atual in self.banco.contas:

                        if num_conta == conta_atual.numero:

                            existe = True
                            interface = ContaInterface()
                            interface.menu(conta_atual)
                            break

                    if existe == False:
                        print('Não há uma conta com esse número')

                case 3:
                    break

                case _:
                    print('Opção inválida')