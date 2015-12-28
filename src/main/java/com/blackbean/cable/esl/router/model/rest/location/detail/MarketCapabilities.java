
package com.blackbean.cable.esl.router.model.rest.location.detail;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.ALWAYS)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "video",
        "hsi",
        "voice",
        "wireless",
        "homeSecurity"
})
public class MarketCapabilities {

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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public MarketCapabilities withVideo(String video) {
        this.video = video;
        return this;
    }

    /**
     *
     * @return
     *     The hsi
     */
    @JsonProperty("hsi")
    public String getHsi() {
        return hsi;
    }

    /**
     *
     * @param hsi
     *     The hsi
     */
    @JsonProperty("hsi")
    public void setHsi(String hsi) {
        this.hsi = hsi;
    }

    public MarketCapabilities withHsi(String hsi) {
        this.hsi = hsi;
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

    public MarketCapabilities withVoice(String voice) {
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

    public MarketCapabilities withWireless(String wireless) {
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

    public MarketCapabilities withHomeSecurity(String homeSecurity) {
        this.homeSecurity = homeSecurity;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public MarketCapabilities withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(video).append(hsi).append(voice).append(wireless).append(homeSecurity).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketCapabilities) == false) {
            return false;
        }
        MarketCapabilities rhs = ((MarketCapabilities) other);
        return new EqualsBuilder().append(video, rhs.video).append(hsi, rhs.hsi).append(voice, rhs.voice).append(wireless, rhs.wireless).append(homeSecurity, rhs.homeSecurity).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
