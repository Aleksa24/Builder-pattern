/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory.impl;

import components.fields.PanelInputComboBox;
import components.fields.PanelInputDate;
import components.fields.PanelInputTextField;
import domain.Gender;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import view.factory.PersonViewFactory;

/**
 *
 * @author Aleksa Ivanovic 226/15
 */
public class AdvancedPersonViewFactory extends PersonViewFactory{

    public AdvancedPersonViewFactory() {
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
        PanelInputDate panel = new PanelInputDate();
        panel.getLblFieldText().setText("Date:");
        panel.getLblError().setText("");
        panel.initialize("2000");
        
        inputDate = panel;
    }

    @Override
    public void buildGenderPanel() {
        PanelInputComboBox panel = new PanelInputComboBox();
        panel.getLblFieldText().setText("Gender:");
        panel.getLblError().setText("");
        List<Gender> genders = new ArrayList<Gender>();
        genders.add(Gender.MALE);
        genders.add(Gender.FEMALE);
        panel.initialize(genders);
        
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
