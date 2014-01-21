package com.verydapeng.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

/**
 *
 * @author dapeng
 */
public class Entry implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new LayoutWidget());
    }
}
