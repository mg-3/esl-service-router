
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocationCommentsType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="LocationCommentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commentNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="commentAuthor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="commentText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCommentsType", propOrder = {
        "commentNumber",
        "commentAuthor",
        "commentDate",
        "commentText"
})
public class LocationCommentsType {

    protected int commentNumber;
    @XmlElement(required = true)
    protected String commentAuthor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentDate;
    @XmlElement(required = true)
    protected String commentText;

    /**
     * Gets the value of the commentNumber property.
     */
    public int getCommentNumber() {
        return commentNumber;
    }

    /**
     * Sets the value of the commentNumber property.
     */
    public void setCommentNumber(int value) {
        this.commentNumber = value;
    }

    /**
     * Gets the value of the commentAuthor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCommentAuthor() {
        return commentAuthor;
    }

    /**
     * Sets the value of the commentAuthor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCommentAuthor(String value) {
        this.commentAuthor = value;
    }

    /**
     * Gets the value of the commentDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCommentDate() {
        return commentDate;
    }

    /**
     * Sets the value of the commentDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCommentDate(XMLGregorianCalendar value) {
        this.commentDate = value;
    }

    /**
     * Gets the value of the commentText property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

}
