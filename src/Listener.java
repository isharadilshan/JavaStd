
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bunty
 */
class Listener implements ItemListener {
    
    JCheckBox[] checkList;
    private final int MAX_SELECTIONS ;
    private int selectionCounter = 0;
    
    public Listener(JCheckBox[] checkList,int max) {
        this.MAX_SELECTIONS=max;
        this.checkList=checkList;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox source = (JCheckBox) e.getSource();

        if (source.isSelected()) {
            selectionCounter++;
            // check for max selections:
            if (selectionCounter == MAX_SELECTIONS)
                for (JCheckBox box: checkList)
                    if (!box.isSelected())
                        box.setEnabled(false);
        }
        else {
            selectionCounter--;
            // check for less than max selections:
            if (selectionCounter < MAX_SELECTIONS)
                for (JCheckBox box: checkList)
                    box.setEnabled(true);
        }
    }
}
