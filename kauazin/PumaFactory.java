public class PumaFactory implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaBotafogo();
    }
}
