class Transportadora {
    var nomeTransportadora:String
    var frete:String
    var cnpjTransportadora:String

    constructor(
        nomeTransportadora:String,
        frete:String,
        cnpjTransportadora:String
    ){
        this.cnpjTransportadora = cnpjTransportadora
        this.frete = frete
        this.nomeTransportadora = nomeTransportadora
    }
}