package com.technologx.blaze.player.lastfmapi.models;

import com.google.gson.annotations.SerializedName;
import com.technologx.blaze.player.lastfmapi.LastFmClient;

/**
 * Created by christoph on 17.07.16.
 */
public class UserLoginInfo {
    private static final String SESSION = "session";

    @SerializedName(SESSION)
    public LastfmUserSession mSession;


}
