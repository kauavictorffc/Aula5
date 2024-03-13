public class UmbroFactory implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaFluminense();
    }
}
