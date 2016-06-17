package client.actions;

import client.util.ViewConstants;
import client.view.AboutView;
import client.view.GettingStartedView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Menu Action Class
 */
public class MenuAction {

    /**
     * Action that set all labels to empty string
     * @param labels the list of labels that should be set to empty string
     */
    public static void newAction(final ArrayList<JLabel> labels, final Component c) {
        for(JLabel label : labels) {
            label.setText(ViewConstants.EMPTY_STRING);
        }
        c.setSize(ViewConstants.FORM_WIDTH, ViewConstants.FORM_HEIGHT);
        MatchDataAction.getScrollPane().setVisible(false);
    }

    /**
     * Action that closes the entire application
     */
    public static void exitAction() {
        System.exit(0);
    }

    /**
     * Action that opens a new Getting Started Frame
     */
    public static void gettingStarted() {
        GettingStartedView gettingStartedView = new GettingStartedView();
        gettingStartedView.setVisible(true);
    }

    /**
     * Action that opens a new About Frame
     */
    public static void about() {
        AboutView aboutView = new AboutView();
        aboutView.setVisible(true);
    }
}
