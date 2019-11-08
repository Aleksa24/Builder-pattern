/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.IValue;
import components.fields.PanelInputTextField;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public class SimplePersonViewFactory extends PersonViewFactory{

    public SimplePersonViewFactory() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
    }
  
    @Override
    public void buildFirstNamePanel() {
        PanelInputTextField panel = new PanelInputTextField();
        panel.getLblFieldText().setText("First name:");
        panel.getLblError().setText("");
        
        inputFirstName = panel;
    }

    @Override
    public void buildLastNamePanel() {
        PanelInputTextField panel = new PanelInputTextField();
        panel.getLblFieldText().setText("Last name:");
        panel.getLblError().setText("");
        
        inputLastName = panel;
    }

    @Override
    public void buildDatePanel() {
        PanelInputTextField panel = new PanelInputTextField();
        panel.getLblFieldText().setText("Date:");
        panel.getLblError().setText("");
        
        inputDate = panel;
    }

    @Override
    public void buildGenderPanel() {
        PanelInputTextField panel = new PanelInputTextField();
        panel.getLblFieldText().setText("Gender:");
        panel.getLblError().setText("");
        
        inputGender = panel;
    }

    @Override
    public void buildPersonPanel() {       
        panel.add((Component) inputFirstName);
        panel.add((Component) inputLastName);
        panel.add((Component) inputDate);
        panel.add((Component) inputGender);
    }

    
}
