public class KappaFactory implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaVasco();
    }
}
