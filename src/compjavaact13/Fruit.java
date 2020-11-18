/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compjavaact13;

/**
 *
 * @author hgarz
 */
public class Fruit {
    public int id;
    public String name;
    
    public Fruit(int id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", Name=" + name+"]";
    }
}
