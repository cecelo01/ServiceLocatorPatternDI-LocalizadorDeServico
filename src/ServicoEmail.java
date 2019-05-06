package service.locator.pattern.di.localiazadordeservico;
public class ServicoEmail implements ServicoMensagem{

    // Imlementaçõs da interface
    
    public String getCorpoMensagem(){
        return "Mensagem de Email";
    }
    
    public String getNomeServico(){
        return "Servico Email";
    }
    
}
