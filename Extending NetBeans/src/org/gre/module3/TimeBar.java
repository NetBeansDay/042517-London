/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gre.module3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;
import org.openide.windows.TopComponent;

@ActionID(
        category = "Tools",
        id = "org.gre.module3.TimeBar"
)

@ActionReference(path = "Toolbars", position = 0)
@Messages("CTL_TimeBar=Times")
public final class TimeBar extends AbstractAction implements ActionListener, Presenter.Toolbar{

    @Override
    public void actionPerformed(ActionEvent e) {
        TopComponent top = new TimeGreTopComponent();
        top.open();
    }

    @Override
    public Component getToolbarPresenter() {
        return new TimeGreTopComponent();
    }
}
