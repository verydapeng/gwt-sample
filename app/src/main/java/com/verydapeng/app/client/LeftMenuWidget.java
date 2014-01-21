/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.verydapeng.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.Date;

/**
 *
 * @author kayick.chua
 */
public class LeftMenuWidget extends Composite {

    interface UI extends UiBinder<Widget, LeftMenuWidget> {
    }
    private FlowPanel mainContainer;

    public void setMainContainer(FlowPanel mainContainer) {
        this.mainContainer = mainContainer;
    }

    public LeftMenuWidget() {
        initWidget(GWT.<UI>create(UI.class).createAndBindUi(this));
    }

    @UiHandler("clickMe")
    void onClickMe(ClickEvent e) {
        mainContainer.add(new Button("Time: " + new Date()));
    }
}
