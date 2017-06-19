<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:dat="http://ws.wso2.org/dataservice"
	xmlns:proxy="http://www.singhpora.com/DoctorsService"
	exclude-result-prefixes="dat" >
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<proxy:findDoctorsResponse>
			<proxy:Doctors>
				<xsl:for-each select="//dat:DOCTOR">
						<proxy:Doctor>
							<proxy:Name>
								<xsl:value-of select="dat:NAME" />
							</proxy:Name>
							<proxy:Address>
								<xsl:value-of select="dat:HOSPITAL" />
							</proxy:Address>
							<proxy:Specialism>
								<xsl:value-of select="dat:SPECIALITY" />
							</proxy:Specialism>
						</proxy:Doctor>				
				</xsl:for-each>	
		 	</proxy:Doctors>	  
		</proxy:findDoctorsResponse>
	</xsl:template>
</xsl:stylesheet>