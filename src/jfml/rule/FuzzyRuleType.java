package jfml.rule;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import jfml.knowledgebase.variable.FuzzyVariableType;
import jfml.term.FuzzyTermType;

/**
 * <p>Java class for fuzzyRuleType complex type.
 * 
 * 
 * <pre>
 * &lt;complexType name="fuzzyRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="antecedent" type="{http://www.ieee1855.org}antecedentType"/>
 *         &lt;element name="consequent" type="{http://www.ieee1855.org}consequentType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="andMethod" type="{http://www.ieee1855.org}andMethodType" default="MIN" />
 *       &lt;attribute name="orMethod" type="{http://www.ieee1855.org}orMethodType" default="MAX" />
 *       &lt;attribute name="connector" type="{http://www.ieee1855.org}connectorType" default="and" />
 *       &lt;attribute name="weight" type="{http://www.ieee1855.org}weightType" default="1.0" />
 *       &lt;attribute name="networkAddress" type="{http://www.ieee1855.org}networkAddressType" default="127.0.0.1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fuzzyRuleType", propOrder = {
    "antecedent",
    "consequent"
})
public class FuzzyRuleType extends Rule{

    @XmlElement(required = true)
    protected AntecedentType antecedent;
    @XmlElement(required = true)
    protected ConsequentType consequent;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;
    @XmlAttribute(name = "andMethod")
    protected String andMethod;
    @XmlAttribute(name = "orMethod")
    protected String orMethod;
    @XmlAttribute(name = "connector")
    protected String connector;
    @XmlAttribute(name = "weight")
    protected Float weight;
    @XmlAttribute(name = "networkAddress")
    protected String networkAddress;

    /**
     * Constructor by default
     */
    public FuzzyRuleType(){
    	
    }
    
    /**
     * Constructor with parameters by default
     * @param name
     */
    public FuzzyRuleType(String name){
    	super();
    	setName(name);
    	setConnector(getConnector());
    	setAndMethod(getAndMethod());
    	setOrMethod(getOrMethod());
    	setWeight(getWeight());
    }
    
    /**
     * Constructor with parameters by default
     * @param name
     */
    public FuzzyRuleType(String name, AntecedentType ant, ConsequentType con){
    	super();
    	setName(name);
    	setConnector(getConnector());
    	setAndMethod(getAndMethod());
    	setOrMethod(getOrMethod());
    	setWeight(getWeight());
    	setAntecedent(ant);
    	setConsequent(con);
    }
    
    /**
	 * @param name
	 * @param connector
	 * @param andMethod
	 * @param orMethod
	 * @param weight
	 * @param networkAddress
	 */
	public FuzzyRuleType(String name, String connector, String andMethod, String orMethod, Float weight) {
		super();
		this.name = name;
		this.connector = connector;
		this.andMethod = andMethod;
		this.orMethod = orMethod;
		this.weight = weight;
	}

	/**
	 * 
	 * @param name
	 * @param weight
	 */
	public FuzzyRuleType(String name, Float weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
    
    /**
     * Gets the value of the property antecedent.
     * 
     * @return
     *     possible object is
     *     {@link AntecedentType }
     *     
     */
    public AntecedentType getAntecedent() {
        return antecedent;
    }

    /**
     * Sets the value of the property antecedent.
     * 
     * @param value
     *     allowed object is
     *     {@link AntecedentType }
     *     
     */
    public void setAntecedent(AntecedentType value) {
        this.antecedent = value;
    }

    /**
     * Gets the value of the property consequent.
     * 
     * @return
     *     possible object is
     *     {@link ConsequentType }
     *     
     */
    public ConsequentType getConsequent() {
        return consequent;
    }

    /**
     * Sets the value of the property consequent.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsequentType }
     *     
     */
    public void setConsequent(ConsequentType value) {
        this.consequent = value;
    }

    /**
     * Gets the value of the property name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the property name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the property andMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAndMethod() {
        if (andMethod == null) {
            return "MIN";
        } else {
            return andMethod;
        }
    }

    /**
     * Sets the value of the property andMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndMethod(String value) {
        this.andMethod = value;
    }

    /**
     * Gets the value of the property orMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrMethod() {
        if (orMethod == null) {
            return "MAX";
        } else {
            return orMethod;
        }
    }

    /**
     * Sets the value of the property orMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrMethod(String value) {
        this.orMethod = value;
    }

    /**
     * Gets the value of the property connector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnector() {
        if (connector == null) {
            return "and";
        } else {
            return connector;
        }
    }

    /**
     * Sets the value of the property connector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnector(String value) {
        this.connector = value;
    }

    /**
     * Gets the value of the property weight.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getWeight() {
        if (weight == null) {
            return  1.0F;
        } else {
            return weight;
        }
    }

    /**
     * Sets the value of the property weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the property networkAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkAddress() {
        if (networkAddress == null) {
            return "127.0.0.1";
        } else {
            return networkAddress;
        }
    }

    /**
     * Sets the value of the property networkAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAddress(String value) {
        this.networkAddress = value;
    }

	@Override
	public float aggregation(float[] degrees) {
		if(getConnector().equals("AND") || getConnector().equals("and"))
			return and(getAndMethod(),degrees);
		else
			return or(getOrMethod(),degrees);
	}

	@Override
	public String toString() {
		String b = getName() +" - ("+getEvaluation()+") IF ";
		
		//ANTECEDENTS
		List<ClauseType> clauses = getAntecedent().getClauses();
		for(int i=0;i<clauses.size();i++){
			ClauseType c= clauses.get(i);
			FuzzyTermType t=null;
			FuzzyVariableType v=null;
			if(c!=null && c.getTerm() instanceof FuzzyTermType)
				t = (FuzzyTermType) c.getTerm();
			if(c.getVariable() instanceof FuzzyVariableType)
				v = (FuzzyVariableType) c.getVariable();
			
			String modifier = c.getModifier();
			if(modifier!=null)
				modifier += " ";
			else
				modifier="";
			
			b += v.getName() +" IS "+ modifier + t.getName();
			if(i<clauses.size()-1)
				b += " "+getConnector().toUpperCase() + " ";
		}
		
		//CONSEQUENTS
		ConsequentClausesType then = getConsequent().getThen();
		ConsequentClausesType _else = getConsequent().getElse();
		if(then!=null){
			ClauseType c = then.getClause().get(0);
			FuzzyTermType t=null;
			FuzzyVariableType v=null;
			if(c!=null && c.getTerm() instanceof FuzzyTermType)
				t = (FuzzyTermType) c.getTerm();
			if(c.getVariable() instanceof FuzzyVariableType)
				v = (FuzzyVariableType) c.getVariable();

			String modifier = c.getModifier();
			if(modifier!=null)
				modifier += " ";
			else
				modifier="";
			
			b += " THEN "+v.getName() +" IS "+ modifier + t.getName();
			
			if(_else!=null){
				c = _else.getClause().get(0);
				if(c!=null && c.getTerm() instanceof FuzzyTermType)
					t = (FuzzyTermType) c.getTerm();
				if(c.getVariable() instanceof FuzzyVariableType)
					v = (FuzzyVariableType) c.getVariable();
				
				modifier = c.getModifier();
				if(modifier!=null)
					modifier += " ";
				b += " ELSE "+v.getName() +" IS "+ modifier + t.getName();
			}	
			
			b += " [weight="+getWeight()+"]";
		}
		return b;
	}

}