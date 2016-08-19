# XmlToJson
A simple java function that converts xml to json using the available open source libraries


### How to use

* Clone the repository. 
* cd XmlToJson
* mvn clean package
* cd target

This will now contain the jar XmlToJson-0.0.1-SNAPSHOT.jar. This jar can be copied to any java/scala project. This function expects the xml content to be a String. To use the function 

```
import com.xml.converter.ToJsonFromString;
........................................
ToJsonFromString obj = new ToJsonFromString();
String json = obj.xmlToJson(xml); // xml is the xml string
........................................
```

