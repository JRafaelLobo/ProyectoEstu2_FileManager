<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <registros>
      <xsl:apply-templates select="int"/>
      <xsl:apply-templates select="char"/>
      <xsl:apply-templates select="int"/>
      <xsl:apply-templates select="int"/>
    </registros>
  </xsl:template>
  <xsl:template match="int">
    <int>
      <xsl:value-of select="."/>
    </int>
  </xsl:template>
  <xsl:template match="char">
    <char>
      <xsl:value-of select="."/>
    </char>
  </xsl:template>
  <xsl:template match="int">
    <int>
      <xsl:value-of select="."/>
    </int>
  </xsl:template>
  <xsl:template match="int">
    <int>
      <xsl:value-of select="."/>
    </int>
  </xsl:template>
</xsl:stylesheet>
