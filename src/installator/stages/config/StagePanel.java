/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package installator.stages.config;

import javax.swing.JPanel;

/**
 * 
 * @author agalkin
 */
public class StagePanel<T> extends JPanel{
    
    protected PanelNextListener<T> nextListener;

    public StagePanel() {
        super();
    }   
    
   public void setNextListener(PanelNextListener<T> nextListner) {
       this.nextListener = nextListner;
   }
    
}
