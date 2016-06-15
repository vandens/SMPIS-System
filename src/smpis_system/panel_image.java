/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smpis_system;
import javax.swing.ImageIcon;

/**
 *
 * @author vandens
 */
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

@SuppressWarnings("serial")
public class panel_image extends JPanel {

    /**
     *
     * @param graph
     */
    @Override
    protected void paintComponent(Graphics graph)
	{
		Graphics2D g2D = (Graphics2D) graph.create();
		
		Image img = new ImageIcon(getClass().getResource("background.jpg")).getImage();
		
		g2D.drawImage(img, 0, 0, getWidth(), getHeight(), null);
		g2D.dispose();
	}
}

