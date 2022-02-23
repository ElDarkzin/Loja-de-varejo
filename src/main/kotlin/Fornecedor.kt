class Fornecedor {
    var nomeFornecedor:String
    var produtoFornecedor:String
    var precoFornecedor:String
    var cnpjFornecedor:String

    constructor(
        nomeFornecedor:String,
        produtoFornecedor:String,
        precoFornecedor: String,
        cnpjFornecedor:String
    ){
        this.nomeFornecedor =nomeFornecedor
        this.produtoFornecedor = produtoFornecedor
        this.precoFornecedor = precoFornecedor
        this.cnpjFornecedor = cnpjFornecedor
    }
}