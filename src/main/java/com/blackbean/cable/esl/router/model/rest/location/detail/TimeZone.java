
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
        "name",
        "utcOffset",
        "dst"
})
public class TimeZone {

    @JsonProperty("name")
    private String name;
    @JsonProperty("utcOffset")
    private String utcOffset;
    @JsonProperty("dst")
    private String dst;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TimeZone withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The utcOffset
     */
    @JsonProperty("utcOffset")
    public String getUtcOffset() {
        return utcOffset;
    }

    /**
     *
     * @param utcOffset
     *     The utcOffset
     */
    @JsonProperty("utcOffset")
    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public TimeZone withUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    /**
     *
     * @return
     *     The dst
     */
    @JsonProperty("dst")
    public String getDst() {
        return dst;
    }

    /**
     *
     * @param dst
     *     The dst
     */
    @JsonProperty("dst")
    public void setDst(String dst) {
        this.dst = dst;
    }

    public TimeZone withDst(String dst) {
        this.dst = dst;
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

    public TimeZone withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(utcOffset).append(dst).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeZone) == false) {
            return false;
        }
        TimeZone rhs = ((TimeZone) other);
        return new EqualsBuilder().append(name, rhs.name).append(utcOffset, rhs.utcOffset).append(dst, rhs.dst).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
