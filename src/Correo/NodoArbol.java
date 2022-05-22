/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correo;

/**
 *
 * @author Mauro
 */
public class NodoArbol
{
    private String et;
    private Object obj;
    private NodoArbol izq;
    private NodoArbol der;

    public NodoArbol(String et, Object obj)
    {
        this.et = et;
        this.obj = obj;
        izq=der=null;
    }

    /**
     * @return the et
     */
    public String getEt()
    {
        return et;
    }

    /**
     * @param et the et to set
     */
    public void setEt(String et)
    {
        this.et = et;
    }

    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the izq
     */
    public NodoArbol getIzq()
    {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(NodoArbol izq)
    {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public NodoArbol getDer()
    {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(NodoArbol der)
    {
        this.der = der;
    }
    
    public String desp()
    {
        return "Etiqueta árbol = " +et + "\n";
    }
    
}
