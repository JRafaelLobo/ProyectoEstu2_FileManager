<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <registros>
      <xsl:apply-templates select="Nombre"/>
      <xsl:apply-templates select="Edad"/>
      <xsl:apply-templates select="Telefono"/>
      <xsl:apply-templates select="SaldoCuenta"/>
    </registros>
  </xsl:template>
  <xsl:template match="Nombre">
    <Nombre>
      <xsl:value-of select="."/>
    </Nombre>
  </xsl:template>
  <xsl:template match="Edad">
    <Edad>
      <xsl:value-of select="."/>
    </Edad>
  </xsl:template>
  <xsl:template match="Telefono">
    <Telefono>
      <xsl:value-of select="."/>
    </Telefono>
  </xsl:template>
  <xsl:template match="SaldoCuenta">
    <SaldoCuenta>
      <xsl:value-of select="."/>
    </SaldoCuenta>
  </xsl:template>
</xsl:stylesheet>
