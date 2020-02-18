package com.java21days;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SurveyWizard extends JPanel implements ActionListener {
	int currentCard = 0;
	CardLayout cards = new CardLayout();
	SurveryPanel[] ask = new SurveyPanel[3];
	
	public SurveyWizard() {
		super();
		setSize(240,140);
	}

}
