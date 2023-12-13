<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="xml" indent="yes"/>

  <xsl:template match="/">
    <registros>
      <Nombre>
        <xsl:value-of select="substring-before(substring-after(., '|'), '|')"/>
      </Nombre>
      <Apellido>
        <xsl:value-of select="substring-before(substring-after(substring-after(., '|'), '|'), '|')"/>
      </Apellido>
      <Cel>
        <xsl:value-of select="substring-before(substring-after(substring-after(substring-after(., '|'), '|'), '|'), '|')"/>
      </Cel>
      <Edad>
        <xsl:value-of select="substring-after(substring-after(substring-after(substring-after(., '|'), '|'), '|'), '|')"/>
      </Edad>
    </registros>
  </xsl:template>
</xsl:stylesheet>