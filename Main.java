class Substancia {
    public void entrarPontoDeEbulicao(double temperatura) {
        System.out.println("Ponto de ebulição genérico: " + temperatura + " ºC.");
    }
    public void entrarPontoDeFusao(double temperatura) {
        System.out.println("Ponto de fusão genérico: " + temperatura + " ºC.");
    }
}
class Agua extends Substancia {
    @Override
    public void entrarPontoDeEbulicao(double temperatura) {
        System.out.println("Água - Ponto de ebulição: " + temperatura + " ºC.");
    }
    @Override
    public void entrarPontoDeFusao(double temperatura) {
        System.out.println("Água - Ponto de fusão: " + temperatura + " ºC.");
    }
}
class Amonia extends Substancia {
    @Override
    public void entrarPontoDeEbulicao(double temperatura) {
        System.out.println("Amônia - Ponto de ebulição: " + temperatura + " ºC.");
    }
    @Override
    public void entrarPontoDeFusao(double temperatura) {
        System.out.println("Amônia - Ponto de fusão: " + temperatura + " ºC.");
    }
}
class Alcool extends Substancia {
    @Override
    public void entrarPontoDeEbulicao(double temperatura) {
        System.out.println("Álcool - Ponto de ebulição: " + temperatura + " ºC.");
    }
    @Override
    public void entrarPontoDeFusao(double temperatura) {
        System.out.println("Álcool - Ponto de fusão: " + temperatura + " ºC.");
    }
}
public class Main {
    public static void main(String[] args) {
        Substancia agua = new Agua();
        Substancia amonia = new Amonia();
        Substancia alcool = new Alcool();
        agua.entrarPontoDeEbulicao(100);
        agua.entrarPontoDeFusao(0);
        amonia.entrarPontoDeEbulicao(-33.34);
        amonia.entrarPontoDeFusao(-77.73);
        alcool.entrarPontoDeEbulicao(78.4);
        alcool.entrarPontoDeFusao(0);
    }
}
