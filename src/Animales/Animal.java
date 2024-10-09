package Animales;

public abstract class Animal {

    protected String nombreCientifico;
    protected String sonido;
    protected String alimentos;
    protected String habitat;

    public abstract String getNombreCientifico();

    public abstract String getSonido();

    public abstract String getAlimentos();

    public abstract String getHabitat();

}
