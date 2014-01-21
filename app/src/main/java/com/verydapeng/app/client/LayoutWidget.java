/*2
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verydapeng.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author kayick.chua
 */
public class LayoutWidget extends Composite {
    
    interface UI extends UiBinder<Widget, LayoutWidget> {
    }
    
    @UiField
    FlowPanel mainContainer;
    @UiField
    LeftMenuWidget leftMenuWidget;
    public LayoutWidget() {
        initWidget(GWT.<UI>create(UI.class).createAndBindUi(this));
        leftMenuWidget.setMainContainer(mainContainer);
        
        
        
        // skype: verydapeng
        // mail:  mail@liudapeng.com
        
    }
}
