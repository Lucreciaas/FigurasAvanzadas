package FigurasAvanzadas;

public class Posicion implements Comparable<Posicion> {
    private Integer x;
    private Integer y;
    double posx;
    double posy;

    /**
     * Calcula la distancia entre la posicion y el origen (0,0).
     * @return La distancia al origen.
     */
    
    public static double hypot​(double catm, double catM, double getPosX, double getPosY){
       Math.hypot(catm, catM);
       catm=getPosX;
       catM=getPosY;
    }
    
    
    public Double distanciaAlOrigen (double catm, double catM, double x, double y) {
      return (Math.hypot (catm, catM))-(Math.hypot (x, y) );
    }
    
            
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * Devuelve la posicion como un par ordenado, sin espacios en blanco.
     * @return El par ordenado.
     */
    public double getPosX() {
        return posx;
    }
    
    public double setPosX() {
        this.posx=posx;
    }
    public double getPosY() {
        return posy;
    }
    
    public double setPosY() {
        this.posy=posy;
    }
    
    public String toString() {
        // TODO - Implementar el metodo
        return "Figura " + id + " " + posicion.toString();
        //return "hola";
    }

    /**
     * Compara la posicion con cualquier otra posicion
     * devolviendo -1, 0 o 1 segun sea menor, igual o mayor la distancia al origen.0
     * @return El entero indicando la comparacion.
     */
    @Override
    public int compareTo(Posicion otro) {
        // TODO - Implementar el metodo
        return 0;
    }
}
