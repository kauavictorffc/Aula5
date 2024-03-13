public class AdidasFactory implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
}
