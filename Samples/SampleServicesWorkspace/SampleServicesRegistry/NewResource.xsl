<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:doc="http://www.singhpora.com/DoctorsService/">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<dat:_get_getdoctors xmlns:dat="http://ws.wso2.org/dataservice1">
         <dat:SPECIALITY>
         	<xsl:value-of select="//Specialism[1]" />
         </dat:SPECIALITY>
   	   </dat:_get_getdoctors>	
	</xsl:template>
</xsl:stylesheet>