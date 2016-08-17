package jfml.rule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import jfml.knowledgebase.variable.KnowledgeBaseVariable;
import jfml.term.FuzzyTerm;


/**
 * <p>Java class for consequentType complex type.
 * 
 * <pre>
 * &lt;complexType name="consequentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="then" type="{http://www.ieee1855.org}consequentClausesType"/>
 *         &lt;element name="else" type="{http://www.ieee1855.org}consequentClausesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consequentType", propOrder = {
    "then",
    "_else"
})
public class ConsequentType {

    @XmlElement(required = true)
    protected ConsequentClausesType then;
    @XmlElement(name = "else")
    protected ConsequentClausesType _else;

    public ConsequentType(){
    	super();
    }
    
    public ConsequentType(ConsequentClausesType then, ConsequentClausesType _else){
    	super();
    	this.setThen(then);
    	this.setElse(_else);
    }
    
    public void addThenClause(KnowledgeBaseVariable variable, FuzzyTerm term){
    	if(then==null)
    		then = new ConsequentClausesType();
    	
    	then.addClause(variable, term);
    }
    
    public void addThenClause(ClauseType c){
    	if(then==null)
    		then = new ConsequentClausesType();
    	
    	then.addClause(c);
    }
   
    
    /**
     * Gets the value of the property then.
     * 
     * @return
     *     possible object is
     *     {@link ConsequentClausesType }
     *     
     */
    public ConsequentClausesType getThen() {
        return then;
    }

    /**
     * Sets the value of the property then.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsequentClausesType }
     *     
     */
    public void setThen(ConsequentClausesType value) {
        this.then = value;
    }

    /**
     * Gets the value of the property else.
     * 
     * @return
     *     possible object is
     *     {@link ConsequentClausesType }
     *     
     */
    public ConsequentClausesType getElse() {
        return _else;
    }

    /**
     * Sets the value of the property else.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsequentClausesType }
     *     
     */
    public void setElse(ConsequentClausesType value) {
        this._else = value;
    }

}