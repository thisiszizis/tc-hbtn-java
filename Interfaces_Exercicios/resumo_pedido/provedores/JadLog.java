package provedores;

public class JadLog implements ProvedorFrete{

    public JadLog() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if(peso > 2000.00){
            double newVaor = valor * 0.07;
            return new Frete(newVaor, TipoProvedorFrete.JADLOG);
        }else{
            double newValor = valor * 0.045;
            return new Frete(newValor, TipoProvedorFrete.JADLOG);
        }
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}