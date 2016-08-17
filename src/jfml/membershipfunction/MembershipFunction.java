package jfml.membershipfunction;

import jfml.parameter.Parameter;

/**
 * Membership function
 */
public abstract class MembershipFunction {

	boolean discrete;
	/** Function's parameters */
	Parameter parameter;
	/** Domain right (range max) */
	float domainRight;
	/** Domain left (range min) */
	float domainLeft;

	/** Default Constructor */
	protected MembershipFunction() {
		domainLeft = domainRight = Float.NaN;
	}
	
	protected MembershipFunction(Parameter p){
		super();
		this.parameter=p;
	}
	
	protected MembershipFunction(Parameter p, float domainLeft, float domainRight){
		super();
		this.parameter=p;
		this.domainLeft = domainLeft;
		this.domainRight = domainRight;
	}

	/** 
	 * Get membership degree value.
	 * @param x : Variable's 'x' value
	 * Note: Output mu be in range [0,1] 
	 */
	public abstract float getMembershipDegree(float x);

	public abstract boolean checkParamters(StringBuffer errors);

	/** Try to guess the universe (if not setted) */
	public abstract void estimateUniverse();

	/** Short name */
	public String getName() {
		String str = this.getClass().getName();
		String mfStr = "MembershipFunction";
		int ind = str.lastIndexOf('.');
		if (ind >= 0) {
			str = str.substring(ind + 1);
			if (str.startsWith(mfStr)) str = str.substring(mfStr.length());
		}
		return str;
	}

	public Parameter getParameter() {
		return parameter;
	}

	public double getDomainRight() {
		return domainRight;
	}

	public double getDomainLeft() {
		return domainLeft;
	}

	/*public boolean isDiscrete() {
		return discrete;
	}

	public void setDiscrete(boolean discrete) {
		this.discrete = discrete;
	}*/

	public void setParameter(Parameter p) {
		parameter = p;
	}

	public void setDomainRight(float domainRight) {
		this.domainRight = domainRight;
	}

	public void setDomainLeft(float domainLeft) {
		this.domainLeft = domainLeft;
	}

	@Override
	public abstract String toString();
}