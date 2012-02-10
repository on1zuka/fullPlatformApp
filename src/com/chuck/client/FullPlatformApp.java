package com.chuck.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.web.bindery.event.shared.EventBus;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FullPlatformApp implements EntryPoint {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network "
      + "connection and try again.";

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    ClientFactory clientFactory = GWT.create(ClientFactory.class);
    EventBus eventBus = clientFactory.getEventBus();
    PlaceController placeController = clientFactory.getPlaceController();

    // Start ActivityManager for the main widget with our ActivityMapper
//    ActivityMapper activityMapper = new ActivityMapper(clientFactory);
//    ActivityManager activityManager = new ActivityManager(activityMapper,
//        eventBus);
//    activityManager.setDisplay(appWidget);
//
//    // Start PlaceHistoryHandler with our PlaceHistoryMapper
//    AppPlaceHistoryMapper historyMapper = GWT
//        .create(AppPlaceHistoryMapper.class);
//    PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
//    historyHandler.register(placeController, eventBus, defaultPlace);
//
//    RootPanel.get().add(appWidget);
    // Goes to the place represented on URL else default place
//    historyHandler.handleCurrentHistory();
  }
}
