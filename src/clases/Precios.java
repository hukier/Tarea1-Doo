package clases;

public enum Precios {

    CocaCola(700),
    Fanta(300),
    Sprite(200),
    Snickers(400),
    Super8(500);

    private final int precio;

    Precios(int precio) {

        this.precio = precio;

    }

    public int getPrecio() {
        return precio;
    }

}
