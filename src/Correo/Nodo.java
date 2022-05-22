/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Correo;


public class Nodo <T> implements java.io.Serializable
{
    private String d;
    private T obj;
    private Nodo sig, ant, abj;
    int cve, edad;
    String pass, usuario;
    Pila pB; //pila bandeja de entrada
    Pila pE; //pila enviados
    Pila pL; //pila eliminados
    Pila pS; //pila spam

    public Nodo(String d, T obj, int cve, int e) //Cuando se crea persona
    {
        this.d=d;
        this.cve=cve;
        this.edad=e;
        sig=null;
        ant=null;
        abj=null; // raiz del siguiente nivel
        this.obj= obj;
    }
    public Nodo(String d, T obj, String p, int e, String u) //Cuando se crea una cuenta
    {
        this.d=d;
        this.pass=p;
        this.edad=e;
        this.usuario=u;
        sig=null;
        ant=null;
        abj=null; // raiz del siguiente nivel
        this.obj= obj;
    }
    public Nodo(String d, T obj, int e, String u) //Cuando se crea un nodo para ver correos
    {
        this.d=d;
        this.edad=e;
        this.usuario=u;
        sig=null;
        ant=null;
        abj=null; // raiz del siguiente nivel
        this.obj= obj;
        this.pB = new Pila();
        this.pE = new Pila();
        this.pL = new Pila();
        this.pS = new Pila();
    }
    public Nodo(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the d
     */
    public String getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(String d) {
        this.d = d;
    }

    /**
     * @return the sig
     */
    public Nodo getSig() {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
    public Nodo getAnt()
    {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(Nodo ant)
    {
        this.ant = ant;
    }

    /**
     * @return the abj
     */
    public Nodo getAbj()
    {
        return abj;
    }

    /**
     * @param abj the abj to set
     */
    public void setAbj(Nodo abj)
    {
        this.abj = abj;
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    
    
}