fun main(){
    // @Marcelo Luiz Fontana
    val vendas = Vendas( "Computadores", "Cartão ou Dinheiro","Vendedor Daniel","R$5000")
    vendas.produtoVendido
    vendas.metodoDePagamento
    vendas.nomeVendedor
    vendas.precoVenda
    println(" produto: ${vendas.produtoVendido}\n metodo de pagamento: ${vendas.metodoDePagamento}\n nome do vendedor: ${vendas.nomeVendedor}\n preco da venda: ${vendas.precoVenda} ")

    val vendedor = Vendedor("Daniel",25,"(51) 967148255","Av. tiradentes 300","94731564729")
    vendedor.nomeVendedor
    vendedor.idadeVendedor
    vendedor.endereco
    vendedor.telefone
    vendedor.cadastroVendedor
    println(" nome do vendedor: ${vendedor.nomeVendedor} \n idade do vendedor: ${vendedor.idadeVendedor}\n endereco do vendedor: ${vendedor.endereco}\n Número do vendedor: ${vendedor.telefone}\n cadastro do vendedor: ${vendedor.cadastroVendedor}")

    val cliente = Cliente("Gabriel",18,"(51)984614177","Rua itu 34","548.789.741-77")
    cliente.nomeCliente
    cliente.idadeCliente
    cliente.telefone
    cliente.cpfCliente
    cliente.endereco
    println(" Nome do cliente: ${cliente.nomeCliente}\n Idade do CLiente: ${cliente.idadeCliente}\n telefone cliente: ${cliente.telefone}\n Cpf do cliente: ${cliente.cpfCliente}\n Endereço do Cliente: ${cliente.endereco}" )

    val produto = Produto("5 unidades","Computadores", "R$ 5000", "4 anos")
    produto.nomeDoProduto
    produto.preco
    produto.estoque
    produto.validade
    println(" Nome do produto: ${produto.nomeDoProduto}\n Preço do produto: ${produto.preco}\n Estoque do Produto: ${produto.estoque}\n Validade do produto: ${produto.validade}")

    val  fornecedor = Fornecedor("Anderson","Computador","R$2500","12345678910")
    fornecedor.nomeFornecedor
    fornecedor.produtoFornecedor
    fornecedor.precoFornecedor
    fornecedor.cnpjFornecedor
    println(" Nome do Fornecedor: ${fornecedor.nomeFornecedor}\n Produto: ${fornecedor.produtoFornecedor}\n Preço: ${fornecedor.precoFornecedor}\n cnpj fornecedor: ${fornecedor.cnpjFornecedor}")

    val transportadora = Transportadora("Correios","R$105","12345678912")
    transportadora.nomeTransportadora
    transportadora.frete
    transportadora.cnpjTransportadora
    println(" Nome transportadora; ${transportadora.nomeTransportadora}\n Frete: ${transportadora.frete}\n cnpj Transportadora: ${transportadora.cnpjTransportadora}")
}