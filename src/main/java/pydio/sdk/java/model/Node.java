package pydio.sdk.java.model;

import org.json.JSONObject;

import java.io.File;
import java.io.Serializable;
import java.util.Properties;


public interface Node extends Serializable {
	
	public final static int TYPE_TREE = 1;
	public final static int TYPE_WORKSPACE = 2;
	public final static int TYPE_SERVER = 3;
	public final static int TYPE_VIRTUAL = 4;
	public final static int TYPE_SEARCH = 5;

	public int type();

	public String label();
	/**
	 * 
	 * @return 
	 */	
	public String path();
	/**
	 * initalizes the calling Node using an XML object
	 * @param xml is an XMl represation of a Node
	 */
	public void initFromXml(org.w3c.dom.Node xml);
	/**
	 * initializes the calling Node properties using a json object
	 * @param json representation of a Node
	 * 
	 */
	public void initFromJson(JSONObject json);
	/**
	 * initializes the calling Node properties using a Property object
	 * @param prop Property object containing all Node properties
	 */
	public void initFromProperties(Properties prop);

    public void initFromFile(File file);

    public String getProperty(String key);

	public boolean equals(Object o);
}
