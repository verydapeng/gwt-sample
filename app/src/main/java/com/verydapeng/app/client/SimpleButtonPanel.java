package com.verydapeng.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author dapeng
 */
public class SimpleButtonPanel extends Composite {

    interface UI extends UiBinder<Widget, SimpleButtonPanel> {
    }

    interface MyCssStyle extends CssResource {

        String bold();

        String red();
    }
    @UiField
    MyCssStyle css2;

    @UiField
    Button world;
    
    public SimpleButtonPanel() {
        initWidget(GWT.<UI>create(UI.class).createAndBindUi(this));
    }

    @UiHandler("hello")
    void onHello(ClickEvent e) {
        
        world.addStyleName(css2.red());
        world.addStyleName(css2.bold());
        
    }
}
