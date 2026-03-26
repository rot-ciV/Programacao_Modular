class NumeroComplexo :

    def __init__(self, a, b):
        self.a = a
        self.b = b

    def soma(self, numero_somado):

        resultado = NumeroComplexo(self.a + numero_somado.a, self.b + numero_somado.b)
        return resultado
    
    def produto(self, numero_multiplicado):
        
        novoA = (self.a * numero_multiplicado.a) - (self.b * numero_multiplicado.b)
        novoB = (self.b * numero_multiplicado.a) + (self.a * numero_multiplicado.b) 
        resultado = NumeroComplexo(novoA, novoB)
        return resultado    
    
    def conjugado(self):

        resultado = NumeroComplexo(self.a, self.b * -1)
        return resultado
    
    def toString(self):

        if self.b >= 0:

            return f"{self.a} + {self.b}i"

        else:

             return f"{self.a} {self.b}i"