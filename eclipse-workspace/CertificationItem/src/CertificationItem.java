import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class CertifiedItems {
	private String certificationNo;
	private String certificationTypeName;
	private String certificationFarm;
	private String certificationItemName;
	private String cultivationArea;
	private String productionPlannedAmount;
	private String certificationStartDate;
	private String certificationEndDate;
	private String rawMaterialCertificationClassification;

	public String getCertificationNo() {
		return certificationNo;
	}

	public void setCertificationNo(String certificationNo) {
		this.certificationNo = certificationNo;
	}

	public String getCertificationTypeName() {
		return certificationTypeName;
	}

	public void setCertificationTypeName(String certificationTypeName) {
		this.certificationTypeName = certificationTypeName;
	}

	public String getCertificationFarm() {
		return certificationFarm;
	}

	public void setCertificationFarm(String certificationFarm) {
		this.certificationFarm = certificationFarm;
	}

	public String getCertificationItemName() {
		return certificationItemName;
	}

	public void setCertificationItemName(String certificationItemName) {
		this.certificationItemName = certificationItemName;
	}

	public String getCultivationArea() {
		return cultivationArea;
	}

	public void setCultivationArea(String cultivationArea) {
		this.cultivationArea = cultivationArea;
	}

	public String getProductionPlannedAmount() {
		return productionPlannedAmount;
	}

	public void setProductionPlannedAmount(String productionPlannedAmount) {
		this.productionPlannedAmount = productionPlannedAmount;
	}

	public String getCertificationStartDate() {
		return certificationStartDate;
	}

	public void setCertificationStartDate(String certificationStartDate) {
		this.certificationStartDate = certificationStartDate;
	}

	public String getCertificationEndDate() {
		return certificationEndDate;
	}

	public void setCertificationEndDate(String certificationEndDate) {
		this.certificationEndDate = certificationEndDate;
	}

	public String getRawMaterialCertificationClassification() {
		return rawMaterialCertificationClassification;
	}

	public void setRawMaterialCertificationClassification(String rawMaterialCertificationClassification) {
		this.rawMaterialCertificationClassification = rawMaterialCertificationClassification;
	}

	public void certificationInfo() {
		
		private String certificationNo;
		private String certificationTypeName;
		private String certificationFarm;
		private String certificationItemName;
		private String cultivationArea;
		private String productionPlannedAmount;
		private String certificationStartDate;
		private String certificationEndDate;
		private String rawMaterialCertificationClassification;
	}

}

public class CertificationItem {

	public static void main(String[] args) throws IOException {
		getTxt();
		for (CertifiedItems s : list) {
			System.out.println(s);
		}
	}

	static ArrayList<CertifiedItems> list = new ArrayList<>();

	public static void getTxt() throws IOException {

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("data3.txt")));
			String str = "";
			String[] element;

			int count = 0;
			while ((str = br.readLine()) != null) {
				count++;
				if (count == 1) {
					continue;
				}
				CertifiedItems certifiedItems = new CertifiedItems();
				element = str.split("\t");
				certifiedItems.setCertificationNo(element[0]);
				certifiedItems.setCertificationTypeName(element[1]);
				certifiedItems.setCertificationFarm(element[2]);
				certifiedItems.setCertificationItemName(element[3]);
				certifiedItems.setCultivationArea(element[4]);
				certifiedItems.setProductionPlannedAmount(element[5]);
				certifiedItems.setCertificationStartDate(element[6]);
				certifiedItems.setCertificationEndDate(element[7]);
				if (element.length == 9) {
					certifiedItems.setRawMaterialCertificationClassification(element[8]);
				}

				list.add(certifiedItems);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("Err : " + e);
		}
	}

}
