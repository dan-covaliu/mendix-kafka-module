// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxmodelreflection.actions;

import mxmodelreflection.TokenReplacer;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Validates if all required tokens are present in the message. The action returns a list of all the tokens that are not optional and not present in the text
 */
public class ValidateTokensInMessage extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String Text;
	private java.util.List<IMendixObject> __TokenList;
	private java.util.List<mxmodelreflection.proxies.Token> TokenList;

	public ValidateTokensInMessage(IContext context, java.lang.String Text, java.util.List<IMendixObject> TokenList)
	{
		super(context);
		this.Text = Text;
		this.__TokenList = TokenList;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.TokenList = new java.util.ArrayList<mxmodelreflection.proxies.Token>();
		if (__TokenList != null)
			for (IMendixObject __TokenListElement : __TokenList)
				this.TokenList.add(mxmodelreflection.proxies.Token.initialize(getContext(), __TokenListElement));

		// BEGIN USER CODE
		
		return TokenReplacer.validateTokens(this.getContext(), this.Text, __TokenList);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ValidateTokensInMessage";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
