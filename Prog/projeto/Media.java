public class Media {

    public float MediaPonderada(float[] valores, float[] pesos) {

        float somaProdutos = 0;
        float somaPesos = 0;

        for (int i = 0; i < valores.length; i++) {
            somaProdutos += valores[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return somaProdutos / somaPesos;
    }
}
