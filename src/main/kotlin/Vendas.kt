class Vendas {
    var produtoVendido:String
    var metodoDePagamento:String
    var nomeVendedor:String
    var precoVenda:String

    constructor(
        produtoVendido:String,
        metodoDePagamento :String,
        nomeVendedor: String,
        precoVenda:String
    ){
        this.precoVenda = precoVenda
        this.nomeVendedor = nomeVendedor
        this.produtoVendido = produtoVendido
        this.metodoDePagamento = metodoDePagamento
    }
}