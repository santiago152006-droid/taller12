public class SinDescuento implements EstrategiaDescuento{
    @Override 
    public double calcularTotal (double subtotal){
        return subtotal;
    }
}