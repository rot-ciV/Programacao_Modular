from num_complexo import NumeroComplexo

a01 = int(input('Digite o termo "a" do primeiro número complexo: '))
b01 = int(input('Digite o termo "b" do primeiro número complexo: '))
a02 = int(input('Digite o termo "a" do segundo número complexo: '))
b02 = int(input('Digite o termo "b" do segundo número complexo: '))

num01 = NumeroComplexo(a01, b01)
num02 = NumeroComplexo(a02, b02)

print("Número 01: ", num01.toString())
print("Número 02: ", num02.toString())

print("Soma: ", num01.soma(num02).toString())

print("Conjugado do primeiro número complexo: ", num01.conjugado().toString())
print("Conjugado do segundo número complexo: ", num02.conjugado().toString())

print("Produto: ", num01.produto(num02).toString())