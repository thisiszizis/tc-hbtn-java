package provedores;

public class Sedex implements ProvedorFrete{

    public Sedex() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if(peso > 1000.00 ){
            double newvalor = valor * 0.10;
            return new Frete(newvalor, TipoProvedorFrete.SEDEX);
        }else{
            double newvalor = valor * 0.05;
            return new Frete(newvalor, TipoProvedorFrete.SEDEX);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}