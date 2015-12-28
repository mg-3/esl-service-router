
package com.blackbean.cable.esl.router.model.rest.markets.detail;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "video",
        "hsi",
        "voice",
        "wireless",
        "homeSecurity"
})
public class Capabilities {

    @JsonProperty("video")
    private String video;
    @JsonProperty("hsi")
    private String hsi;
    @JsonProperty("voice")
    private String voice;
    @JsonProperty("wireless")
    private String wireless;
    @JsonProperty("homeSecurity")
    private String homeSecurity;

    /**
     * No args constructor for use in serialization
     */
    public Capabilities() {
    }

    /**
     * @param wireless
     * @param homeSecurity
     * @param voice
     * @param hsi
     * @param video
     */
    public Capabilities(String video, String hsi, String voice, String wireless, String homeSecurity) {
        this.video = video;
        this.hsi = hsi;
        this.voice = voice;
        this.wireless = wireless;
        this.homeSecurity = homeSecurity;
    }

    /**
     * @return The video
     */
    @JsonProperty("video")
    public String getVideo() {
        return video;
    }

    /**
     * @param video The video
     */
    @JsonProperty("video")
    public void setVideo(String video) {
        this.video = video;
    }

    public Capabilities withVideo(String video) {
        this.video = video;
        return this;
    }

    /**
     * @return The hsi
     */
    @JsonProperty("hsi")
    public String getHsi() {
        return hsi;
    }

    /**
     * @param hsi The hsi
     */
    @JsonProperty("hsi")
    public void setHsi(String hsi) {
        this.hsi = hsi;
    }

    public Capabilities withHsi(String hsi) {
        this.hsi = hsi;
        return this;
    }

    /**
     * @return The voice
     */
    @JsonProperty("voice")
    public String getVoice() {
        return voice;
    }

    /**
     * @param voice The voice
     */
    @JsonProperty("voice")
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Capabilities withVoice(String voice) {
        this.voice = voice;
        return this;
    }

    /**
     * @return The wireless
     */
    @JsonProperty("wireless")
    public String getWireless() {
        return wireless;
    }

    /**
     * @param wireless The wireless
     */
    @JsonProperty("wireless")
    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public Capabilities withWireless(String wireless) {
        this.wireless = wireless;
        return this;
    }

    /**
     * @return The homeSecurity
     */
    @JsonProperty("homeSecurity")
    public String getHomeSecurity() {
        return homeSecurity;
    }

    /**
     * @param homeSecurity The homeSecurity
     */
    @JsonProperty("homeSecurity")
    public void setHomeSecurity(String homeSecurity) {
        this.homeSecurity = homeSecurity;
    }

    public Capabilities withHomeSecurity(String homeSecurity) {
        this.homeSecurity = homeSecurity;
        return this;
    }

}
