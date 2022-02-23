open class Cliente {
    var nomeCliente:String
    var idadeCliente:Byte
    var telefone:String
    var endereco:String
    var cpfCliente:String

    constructor(
        nomeCliente: String,
        idadeCliente: Byte,
        telefone:String,
        endereco:String,
        cpfCliente:String
    ){
        this.nomeCliente = nomeCliente
        this.idadeCliente = idadeCliente
        this.endereco = endereco
        this.telefone = telefone
        this.cpfCliente = cpfCliente
    }



}
