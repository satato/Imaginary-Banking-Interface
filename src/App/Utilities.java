package App;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Utilities {

	public static GridBagConstraints defaultConstraints() {
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.NORTH;
		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = 3;
		c.gridheight = 2;
		c.gridx = 0;
		c.gridy = 0;
		c.ipadx = 20;
		c.insets = new Insets(10,5,3,5);
		c.ipadx = 5;
		c.ipady = 5;
		c.gridwidth = 1;
		c.gridheight = 1;
		
		return c;
	}
	
}
