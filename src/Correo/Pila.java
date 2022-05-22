package Correo;

public class Pila implements java.io.Serializable
{
    private Nodo tope = null;

    /**
     * @return the tope
     */
    public Nodo getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(Nodo tope)
    {
        this.tope = tope;
    }
    
    public void inserta (Nodo n)
    {
        if (n != null)
        {
            n.setSig(tope);
            tope = n;
            
        }
        else
        {
            System.out.println("No se puede insertar");
        }
    }
    
    public Nodo elimina()
    {
        if (tope != null)
        {
            Nodo ne = tope;
            tope = ne.getSig();
            ne.setSig(null);
            return ne;
        }
        else
        {
            System.out.println("No hay datos en la pila");
            return null;
        }
    }
}
