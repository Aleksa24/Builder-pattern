/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory;

import components.IValue;
import java.awt.PopupMenu;
import javax.swing.JPanel;

/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public abstract class PersonViewFactory {

    //delovi proizvoda
    protected IValue inputFirstName;
    protected IValue inputLastName;
    protected IValue inputDate;
    protected IValue inputGender;
    //ponuda ili izlazni proizvod
    protected JPanel panel;

    public abstract void buildFirstNamePanel();
    public abstract void buildLastNamePanel();
    public abstract void buildDatePanel();
    public abstract void buildGenderPanel();
    public abstract void buildPersonPanel();
    public JPanel getPanelPerson(){
     return panel;   
    }
}
