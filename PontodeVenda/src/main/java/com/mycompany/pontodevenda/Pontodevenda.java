/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pontodevenda;

import javax.swing.JFrame;
import view.ViewPrincipal;

/**
 *
 * @author uelberti
 */
public class Pontodevenda {

    public static void main(String[] args) {
        ViewPrincipal view = new ViewPrincipal();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
    }
}
