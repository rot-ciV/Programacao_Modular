from conta import Conta

class ContaInterface:

    def menu(self, conta_cliente):

        while True:

            print('---Menu---')
            print('Digite o número referente a ação:')
            print('01: Saldo')
            print('02: Depositar')
            print('03: Sacar')
            print('04: Sair')

            acao = int(input())

            match acao:

                case 1:
                    print('R$', conta_cliente.conferir())

                case 2:
                    print('Digite a quantidade de dinheiro que gostaria de depositar:')
                    dinheiro = float(input())
                    conta_cliente.depositar(dinheiro)

                case 3:
                    print('Digite a quantidade de dinheiro que gostaria de sacar:')
                    dinheiro = float(input())
                    conta_cliente.sacar(dinheiro)

                case 4:
                    break

                case _:
                    print('Não há ações referente a esse número')