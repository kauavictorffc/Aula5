public class NikeFactory implements FabricaEsportiva {
    public CamisaEsportiva criarCamisa() {
        return new CamisaBrasil();
    }
}
