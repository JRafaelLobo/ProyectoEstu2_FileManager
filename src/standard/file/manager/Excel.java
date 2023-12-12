package standard.file.manager;

import java.util.ArrayList;
import EasyXLS.*;
import EasyXLS.Constants.*;

public class Excel {

    ArrayList campos;
    ExcelDocument WB;

    public Excel() {
        WB = new ExcelDocument(1);
        WB.easy_getSheetAt(0).setSheetName("Base");
        
        WB.getLicenseSetup().setLicenseFromXMLString(
                "<?xml version=\"1.0\"?><LICENSE><LIBRARY><NAME>EasyXLS Professional Excel Library</NAME><VERSION>9.0</VERSION><PLATFORM>Java</PLATFORM></LIBRARY><LICENSE_KEY><SERIAL_NUMBER>BFV63-GS2O7-6G80W-?57?X-OG63A-87R?8-0AP</SERIAL_NUMBER><TYPE>Server License</TYPE></LICENSE_KEY><VALIDITY_TIME><FROM>2023-12-12</FROM><UNTIL>2024-01-11</UNTIL></VALIDITY_TIME><COMPANY><NAME>RAF</NAME><MACHINE_NAME>Trial Machine</MACHINE_NAME></COMPANY><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\" /><SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\" /><Reference URI=\"\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\" /><Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\" /></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\" /><DigestValue>Ks44BQgRVNh5vD2pfxAQccE77SFD3Hr2fG0BfUNoheU=</DigestValue></Reference></SignedInfo><SignatureValue>ltm6ibf4MXwJMIfaoMprlRlDkULk5AcUrusohxhHQE4YFzWJjMiSUOoRTNMYBa8wLJPakXYZzmuGyYKcg9iT5eEgZ6Vyoe3IvK739I3QS7/VadTL5GbnFcTxctPRkpi6UcG7cyJOvaPAFTDNBXE21GzanCEyWrehUP33uu5/2KB7WhpYp2Ba9RimPNBaV6co6CMKaJ4V2TvyIEJxBrrk4NbcRbq5uuklYbdcW/DteFsvkysRcl57yPSWXnEQUAoopyhSMhleTDYmYpV+pgAYKLjZhsyuS/8DzDHWFKUjmwcLVlv70B/e2y2JQxnpn17Er61CRc3Ulh4akijjsYjPbw==</SignatureValue></Signature></LICENSE>"
        );
    }

    public Excel(ArrayList campos) {
        this.campos = campos;
        WB = new ExcelDocument(1);
        WB.easy_getSheetAt(0).setSheetName("Base");
        WB.getLicenseSetup().setLicenseFromXMLString(
                "<?xml version=\"1.0\"?><LICENSE><LIBRARY><NAME>EasyXLS Professional Excel Library</NAME><VERSION>9.0</VERSION><PLATFORM>Java</PLATFORM></LIBRARY><LICENSE_KEY><SERIAL_NUMBER>BFV63-GS2O7-6G80W-?57?X-OG63A-87R?8-0AP</SERIAL_NUMBER><TYPE>Server License</TYPE></LICENSE_KEY><VALIDITY_TIME><FROM>2023-12-12</FROM><UNTIL>2024-01-11</UNTIL></VALIDITY_TIME><COMPANY><NAME>RAF</NAME><MACHINE_NAME>Trial Machine</MACHINE_NAME></COMPANY><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\" /><SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\" /><Reference URI=\"\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\" /><Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\" /></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\" /><DigestValue>Ks44BQgRVNh5vD2pfxAQccE77SFD3Hr2fG0BfUNoheU=</DigestValue></Reference></SignedInfo><SignatureValue>ltm6ibf4MXwJMIfaoMprlRlDkULk5AcUrusohxhHQE4YFzWJjMiSUOoRTNMYBa8wLJPakXYZzmuGyYKcg9iT5eEgZ6Vyoe3IvK739I3QS7/VadTL5GbnFcTxctPRkpi6UcG7cyJOvaPAFTDNBXE21GzanCEyWrehUP33uu5/2KB7WhpYp2Ba9RimPNBaV6co6CMKaJ4V2TvyIEJxBrrk4NbcRbq5uuklYbdcW/DteFsvkysRcl57yPSWXnEQUAoopyhSMhleTDYmYpV+pgAYKLjZhsyuS/8DzDHWFKUjmwcLVlv70B/e2y2JQxnpn17Er61CRc3Ulh4akijjsYjPbw==</SignatureValue></Signature></LICENSE>"
        );
    }

    public ArrayList getCampos() {
        return campos;
    }

    public void setCampos(ArrayList campos) {
        this.campos = campos;
    }

    public void llenarTabla(ArrayList<Campo> campos) {
        ExcelTable xlsFirstTable = ((ExcelWorksheet) WB.easy_getSheetAt(0)).easy_getExcelTable();
//        xlsFirstTable.easy_getCell(0, 0).setValue("a");
//        xlsFirstTable.easy_getCell(0, 0).setDataType(DataType.STRING);
        for (int i = 0; i < campos.size(); i++) {
            xlsFirstTable.easy_getCell(0, i).setValue(campos.get(i).getNombre());
            xlsFirstTable.easy_getCell(0, i).setDataType(DataType.STRING);
        }

    }

    public boolean exportar() {
        llenarTabla(campos);
        WB.easy_WriteXLSXFile("./sinnada.xlsx");

        // Confirm export of Excel file
        if (WB.easy_getError().equals("")) {
            System.out.println("File successfully created.");
            return true;
        } else {
            System.out.println("Error encountered: " + WB.easy_getError());
            return false;
        }
    }

}
