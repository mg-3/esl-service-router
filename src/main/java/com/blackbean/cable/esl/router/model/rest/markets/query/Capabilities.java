
package com.blackbean.cable.esl.router.model.rest.markets.query;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "video",
        "highSpeedInternet",
        "voice",
        "wireless",
        "homeSecurity"
})
public class Capabilities {

    @JsonProperty("video")
    private String video;
    @JsonProperty("hsi")
    private String highSpeedInternet;
    @JsonProperty("voice")
    private String voice;
    @JsonProperty("wireless")
    private String wireless;
    @JsonProperty("homeSecurity")
    private String homeSecurity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Capabilities() {
    }

    /**
     * 
     * @param wireless
     * @param homeSecurity
     * @param voice
     * @param hsi
     * @param video
     */
    public Capabilities(String video, String hsi, String voice, String wireless, String homeSecurity) {
        this.video = video;
        this.highSpeedInternet = hsi;
        this.voice = voice;
        this.wireless = wireless;
        this.homeSecurity = homeSecurity;
    }

    /**
     *
     * @return
     *     The video
     */
    @JsonProperty("video")
    public String getVideo() {
        return video;
    }

    /**
     *
     * @param video
     *     The video
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
     *
     * @return
     *     The highSpeedInternet
     */
    @JsonProperty("hsi")
    public String getHighSpeedInternet() {
        return highSpeedInternet;
    }

    /**
     *
     * @param highSpeedInternet
     *     The highSpeedInternet
     */
    @JsonProperty("highSpeedInternet")
    public void setHighSpeedInternet(String highSpeedInternet) {
        this.highSpeedInternet = highSpeedInternet;
    }

    public Capabilities withHsi(String hsi) {
        this.highSpeedInternet = hsi;
        return this;
    }

    /**
     *
     * @return
     *     The voice
     */
    @JsonProperty("voice")
    public String getVoice() {
        return voice;
    }

    /**
     *
     * @param voice
     *     The voice
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
     *
     * @return
     *     The wireless
     */
    @JsonProperty("wireless")
    public String getWireless() {
        return wireless;
    }

    /**
     *
     * @param wireless
     *     The wireless
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
     *
     * @return
     *     The homeSecurity
     */
    @JsonProperty("homeSecurity")
    public String getHomeSecurity() {
        return homeSecurity;
    }

    /**
     *
     * @param homeSecurity
     *     The homeSecurity
     */
    @JsonProperty("homeSecurity")
    public void setHomeSecurity(String homeSecurity) {
        this.homeSecurity = homeSecurity;
    }

    public Capabilities withHomeSecurity(String homeSecurity) {
        this.homeSecurity = homeSecurity;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Capabilities withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
