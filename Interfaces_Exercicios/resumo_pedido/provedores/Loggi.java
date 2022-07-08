package provedores;

public class Loggi implements ProvedorFrete{

    public Loggi() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if(peso > 5000.00){
            double newValor = valor * 0.12;
            return new Frete(newValor, TipoProvedorFrete.LOGGI);
        }else{
            double newValor = valor * 0.04;
            return new Frete(newValor, TipoProvedorFrete.LOGGI);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}