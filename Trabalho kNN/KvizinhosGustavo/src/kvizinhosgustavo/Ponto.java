package kvizinhosgustavo;

/**
 * @author Gustavo
 */
class Ponto {
    private int x;
    private int y;
    
    public Ponto(int a, int b){
        x = a;
        y = b;
    }
    
    public String toString(){
        return "[" + this.x + "," + this.y + "]";
    } 
    
    public double distancia(int px, int py) {
        return Math.sqrt(Math.pow(px - this.x, 2) + Math.pow(py - this.y, 2));
    }
    
}
