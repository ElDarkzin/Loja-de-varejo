class Vendedor {
    var nomeVendedor: String
    var idadeVendedor: Byte
    var telefone: String
    var endereco: String
    var cadastroVendedor: String

    constructor(
        nomeVendedor: String,
        idadeVendedor: Byte,
        telefone: String,
        endereco: String,
        cadastroVendedor: String
    ) {
        this.nomeVendedor = nomeVendedor
        this.idadeVendedor = idadeVendedor
        this.cadastroVendedor = cadastroVendedor
        this.telefone = telefone
        this.endereco = endereco
    }

}