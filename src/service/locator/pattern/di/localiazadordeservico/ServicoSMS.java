package service.locator.pattern.di.localiazadordeservico;
public class ServicoSMS implements ServicoMensagem{
   
    // Imlementaçõs da interface
    
    public String getCorpoMensagem(){
        return "Mensagem SMS";
    }
    
    public String getNomeServico(){
        return "Servico SMS";
    }

}
