# JFML: A Java Library for the IEEE Standard for Fuzzy Markup Language (IEEE Std 1855-2016)

JFML is an open source Java library which is aimed at facilitating interoperability and usability of fuzzy systems. 
Notice that JFML implements the new IEEE Std 1855 published and sponsored by the Standards Committee of the IEEE Computational Intelligence Society.

JFML has a web page associated with a complete documentation, a good variety of examples for both users and developers, etc., The web page is hosted at:
http://www.uco.es/JFML

To build, just run the ant file buildJFML.xml from the project's folder. We recommend following the next steps:
<ul>
<li>
Download and unzip <a href="https://github.com/sotillo19/JFML/archive/master.zip" target="_blank">JFML-master.zip</a> in a local folder.
</li>
<li>
Create a <i>New Java Project</i> with <a href="https://eclipse.org/" target="_blank">Eclipse</a>. Please, remind to select as <i>Location</i> the folder created in the previous step.
</li>
<li>
Run <code>buildJFML.xml</code> as <i>Ant Build</i> with the aim of creating the project dependencies. To do so, just click the right mouse button on the xml file and then select the proper option.
Notice that <a href="http://ant.apache.org/" target="_blank">ant</a> is freely available and it is usually integrated with Eclipse.
</li>
<li>
In case of changing the source files, then run <code>buildJAR.xml</code> as <i>Ant Build</i> with the aim of compiling source files and creating the jar library.
</li>
<p>
Notice that <i>JFML-master.zip</i> already includes a compiled jar library ready to use in the <code>Examples</code> folder.
It will be overwritten after running <code>buildJAR.xml</code>.
</p>

</ul>

