package jfml.term;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import jfml.membershipfunction.*;
import jfml.parameter.FourParamType;
import jfml.parameter.OneParamType;
import jfml.parameter.ThreeParamType;
import jfml.parameter.TwoParamType;


/**
 * <p>Java class for fuzzyTermType complex type.
 * 
 * <pre>
 * &lt;complexType name="fuzzyTermType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="rightLinearShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="leftLinearShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="piShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="triangularShape" type="{http://www.ieee1855.org}threeParamType"/>
 *         &lt;element name="gaussianShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="rightGaussianShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="leftGaussianShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="trapezoidShape" type="{http://www.ieee1855.org}fourParamType"/>
 *         &lt;element name="singletonShape" type="{http://www.ieee1855.org}oneParamType"/>
 *         &lt;element name="rectangularShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="zShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="sShape" type="{http://www.ieee1855.org}twoParamType"/>
 *         &lt;element name="pointSetShape" type="{http://www.ieee1855.org}pointSetShapeType"/>
 *         &lt;element name="circularDefinition" type="{http://www.ieee1855.org}circularDefinitionType"/>
 *         &lt;element name="customShape" type="{http://www.ieee1855.org}customShapeType"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="complement" default="false">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="true|false|TRUE|FALSE|True|False"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fuzzyTermType", propOrder = {
    "rightLinearShape",
    "leftLinearShape",
    "piShape",
    "triangularShape",
    "gaussianShape",
    "rightGaussianShape",
    "leftGaussianShape",
    "trapezoidShape",
    "singletonShape",
    "rectangularShape",
    "zShape",
    "sShape",
    "pointSetShape",
    "circularDefinition",
    "customShape"
})
public class FuzzyTermType extends FuzzyTerm{
	
    protected TwoParamType rightLinearShape;
    protected TwoParamType leftLinearShape;
    protected TwoParamType piShape;
    protected ThreeParamType triangularShape;
    protected TwoParamType gaussianShape;
    protected TwoParamType rightGaussianShape;
    protected TwoParamType leftGaussianShape;
    protected FourParamType trapezoidShape;
    protected OneParamType singletonShape;
    protected TwoParamType rectangularShape;
    protected TwoParamType zShape;
    protected TwoParamType sShape;
    protected PointSetShapeType pointSetShape;
    protected CircularDefinitionType circularDefinition;
    protected CustomShapeType customShape;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;
    @XmlAttribute(name = "complement")
    protected String complement;

    /**
     * Default constructor
     */
    public FuzzyTermType(){
    	super();
    }
    
    /**
     * Constructor using name property
     * @param name
     */
    /*public FuzzyTermType(String name){
    	super();
    	setName(name);
    }*/
    
    /**
     * 
     * @param name
     * @param type
     * @param param
     */
    public FuzzyTermType(String name, int type, float[] param) {
    	super();
    	this.setName(name);
    	this.setComplement("false");
    	this.type=type;
    	
    	int numParam=0;
    	if(param!=null)
    		numParam=param.length;
    	
    	switch (type) {
		case FuzzyTermType.TYPE_rightLinearShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setRightLinearShape(two);
			}
			break;
		case FuzzyTermType.TYPE_leftLinearShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setLeftLinearShape(two);
			}
			break;	
		case FuzzyTermType.TYPE_piShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setPiShape(two);
			}
			break;
		case FuzzyTermType.TYPE_triangularShape:
			if(numParam==3){
				ThreeParamType three = new ThreeParamType();
				three.setParam1(param[0]);
				three.setParam2(param[1]);
				three.setParam3(param[2]);
				setTriangularShape(three);
			}
			break;	
		case FuzzyTermType.TYPE_gaussianShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setGaussianShape(two);
			}
			break;
		case FuzzyTermType.TYPE_rightGaussianShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setRightGaussianShape(two);
			}
			break;	
		case FuzzyTermType.TYPE_leftGaussianShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setLeftGaussianShape(two);
			}
			break;
		case FuzzyTermType.TYPE_trapezoidShape:
			if(numParam==4){
				FourParamType four = new FourParamType();
				four.setParam1(param[0]);
				four.setParam2(param[1]);
				four.setParam3(param[2]);
				four.setParam4(param[3]);
				setTrapezoidShape(four);
			}
			break;
		case FuzzyTermType.TYPE_singletonShape:
			if(numParam==1){
				OneParamType one = new OneParamType();
				one.setParam1(param[0]);
				setSingletonShape(one);
			}
			break;	
		case FuzzyTermType.TYPE_rectangularShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setRectangularShape(two);
			}
			break;
		case FuzzyTermType.TYPE_zShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setZShape(two);
			}
			break;	
		case FuzzyTermType.TYPE_sShape:
			if(numParam==2){
				TwoParamType two = new TwoParamType();
				two.setParam1(param[0]);
				two.setParam2(param[1]);
				setSShape(two);
			}
			break;				
			
		default:
			break;
		}
	}
    
    /**
     * 
     * @param name
     * @param p
     */
    public FuzzyTermType(String name, PointSetShapeType p) {
    	super();
    	setName(name);
    	setComplement("false");
    	setPointSetShape(p);
    }
    
    /**
     * 
     * @param name
     * @param c
     */
    public FuzzyTermType(String name, CircularDefinitionType c) {
    	super();
    	setName(name);
    	setComplement("false");
    	setCircularDefinition(c);
    }
    
    /**
     * 
     * @param name
     * @param c
     */
    public FuzzyTermType(String name, CustomShapeType c) {
    	super();
    	setName(name);
    	setComplement("false");
    	setCustomShape(c);
    }

	/**
     * Gets the value of the property rightLinearShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getRightLinearShape() {
        return rightLinearShape;
    }

    /**
     * Sets the value of the property rightLinearShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setRightLinearShape(TwoParamType value) {
        this.rightLinearShape = value;
        this.type=FuzzyTermType.TYPE_rightLinearShape;
        this.mf = new RightLinearMembershipFunction(value);
    }

    /**
     * Gets the value of the property leftLinearShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getLeftLinearShape() {
        return leftLinearShape;
    }

    /**
     * Sets the value of the property leftLinearShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setLeftLinearShape(TwoParamType value) {
        this.leftLinearShape = value;
        this.type=FuzzyTermType.TYPE_leftLinearShape;
        this.mf = new LeftLinearMembershipFunction(value);
    }

    /**
     * Gets the value of the property piShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getPiShape() {
        return piShape;
    }

    /**
     * Sets the value of the property piShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setPiShape(TwoParamType value) {
        this.piShape = value;
        this.type=FuzzyTermType.TYPE_piShape;
        this.mf = new PiShapedMembershipFunction(value);
    }

    /**
     * Gets the value of the property triangularShape.
     * 
     * @return
     *     possible object is
     *     {@link ThreeParamType }
     *     
     */
    public ThreeParamType getTriangularShape() {
        return triangularShape;
    }

    /**
     * Sets the value of the property triangularShape.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeParamType }
     *     
     */
    public void setTriangularShape(ThreeParamType value) {
        this.triangularShape = value;
        this.type=FuzzyTermType.TYPE_triangularShape;
        this.mf = new TriangularMembershipFunction(value);
    }   

    /**
     * Gets the value of the property gaussianShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getGaussianShape() {
        return gaussianShape;
    }

    /**
     * Sets the value of the property gaussianShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setGaussianShape(TwoParamType value) {
        this.gaussianShape = value;
        this.type=FuzzyTermType.TYPE_gaussianShape;
        this.mf = new GaussianMembershipFunction(value);
    }

    /**
     * Gets the value of the property rightGaussianShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getRightGaussianShape() {
        return rightGaussianShape;
    }

    /**
     * Sets the value of the property rightGaussianShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setRightGaussianShape(TwoParamType value) {
        this.rightGaussianShape = value;
        this.type=FuzzyTermType.TYPE_rightGaussianShape;
        this.mf = new RightGaussianMembershipFunction(value);
    }

    /**
     * Gets the value of the property leftGaussianShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getLeftGaussianShape() {
        return leftGaussianShape;
    }

    /**
     * Sets the value of the property leftGaussianShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setLeftGaussianShape(TwoParamType value) {
        this.leftGaussianShape = value;
        this.type=FuzzyTermType.TYPE_leftGaussianShape;
        this.mf = new LeftGaussianMembershipFunction(value);
    }

    /**
     * Gets the value of the property trapezoidShape.
     * 
     * @return
     *     possible object is
     *     {@link FourParamType }
     *     
     */
    public FourParamType getTrapezoidShape() {
        return trapezoidShape;
    }

    /**
     * Sets the value of the property trapezoidShape.
     * 
     * @param value
     *     allowed object is
     *     {@link FourParamType }
     *     
     */
    public void setTrapezoidShape(FourParamType value) {
        this.trapezoidShape = value;
        this.type=FuzzyTermType.TYPE_trapezoidShape;
        this.mf = new TrapezoidMembershipFunction(value);
    }

    /**
     * Gets the value of the property singletonShape.
     * 
     * @return
     *     possible object is
     *     {@link OneParamType }
     *     
     */
    public OneParamType getSingletonShape() {
        return singletonShape;
    }

    /**
     * Sets the value of the property singletonShape.
     * 
     * @param value
     *     allowed object is
     *     {@link OneParamType }
     *     
     */
    public void setSingletonShape(OneParamType value) {
        this.singletonShape = value;
        this.type=FuzzyTermType.TYPE_singletonShape;
        this.mf = new SingletonMembershipFunction(value);
    }

    /**
     * Gets the value of the property rectangularShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getRectangularShape() {
        return rectangularShape;
    }

    /**
     * Sets the value of the property rectangularShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setRectangularShape(TwoParamType value) {
        this.rectangularShape = value;
        this.type=FuzzyTermType.TYPE_rectangularShape;
        this.mf = new RectangularMembershipFunction(value);
    }

    /**
     * Gets the value of the property zShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getZShape() {
        return zShape;
    }

    /**
     * Sets the value of the property zShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setZShape(TwoParamType value) {
        this.zShape = value;
        this.type=FuzzyTermType.TYPE_zShape;
        this.mf = new ZShapeMembershipFunction(value);
    }

    /**
     * Gets the value of the property sShape.
     * 
     * @return
     *     possible object is
     *     {@link TwoParamType }
     *     
     */
    public TwoParamType getSShape() {
        return sShape;
    }

    /**
     * Sets the value of the property sShape.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoParamType }
     *     
     */
    public void setSShape(TwoParamType value) {
        this.sShape = value;
        this.type=FuzzyTermType.TYPE_sShape;
        this.mf = new SShapeMembershipFunction(value);
    }

    /**
     * Gets the value of the property pointSetShape.
     * 
     * @return
     *     possible object is
     *     {@link PointSetShapeType }
     *     
     */
    public PointSetShapeType getPointSetShape() {
        return pointSetShape;
    }

    /**
     * Sets the value of the property pointSetShape.
     * 
     * @param value
     *     allowed object is
     *     {@link PointSetShapeType }
     *     
     */
    public void setPointSetShape(PointSetShapeType value) {
        this.pointSetShape = value;
        this.type=FuzzyTermType.TYPE_pointSetShape;
        this.mf = new PointSetShapeMembershipFunction(value);
    }

    /**
     * Gets the value of the property circularDefinition.
     * 
     * @return
     *     possible object is
     *     {@link CircularDefinitionType }
     *     
     */
    public CircularDefinitionType getCircularDefinition() {
        return circularDefinition;
    }

    /**
     * Sets the value of the property circularDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link CircularDefinitionType }
     *     
     */
    public void setCircularDefinition(CircularDefinitionType value) {
        this.circularDefinition = value;
        this.type=FuzzyTermType.TYPE_circularDefinition;
        this.mf = new CircularMembershipFunction(value);
    }

    /**
     * Gets the value of the property customShape.
     * 
     * @return
     *     possible object is
     *     {@link CustomShapeType }
     *     
     */
    public CustomShapeType getCustomShape() {
        return customShape;
    }

    /**
     * Sets the value of the property customShape.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomShapeType }
     *     
     */
    public void setCustomShape(CustomShapeType value) {
        this.customShape = value;
        this.type=FuzzyTermType.TYPE_customShape;
        this.mf = new CustomMembershipFunction(value);
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
     * Gets the value of the property complement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplement() {
        if (complement == null) {
            return "false";
        } else {
            return complement;
        }
    }

    /**
     * Sets the value of the property complement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplement(String value) {
        this.complement = value;
    }

    @Override
    public String toString(){
    	String b = name;
    	if(mf!=null)
    		b += " - "+ mf.toString();
		
    	return b;
    }
}