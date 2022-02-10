import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SetArrayList {

	static ArrayList<CertificationItem> list = new ArrayList<>();

	public static void getTxt() throws IOException {

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("data3.txt")));
			String str = "";
			String[] element;

			int i = 0;
			while ((str = br.readLine()) != null) {
				i++;
				if (i == 1) {
					continue;
				}
				CertificationItem certificationItem = new CertificationItem();
				element = str.split("\t");
				certificationItem.setCertificationNo(element[0]);
				certificationItem.setCertificationTypeName(element[1]);
				certificationItem.setCertificationFarm(element[2]);
				certificationItem.setCertificationItemName(element[3]);
				certificationItem.setCultivationArea(element[4]);
				certificationItem.setProductionPlannedAmount(element[5]);
				certificationItem.setCertificationStartDate(element[6]);
				certificationItem.setCertificationEndDate(element[7]);
				if (element.length == 9) {
					certificationItem.setRawMaterialCertificationClassification(element[8]);
				}

				list.add(certificationItem);

			}
			int count = 1;
			for (CertificationItem ci : list) {
				System.out.print(count + "\t");
				ci.certificationInfo();
				count++;
			}

			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("Err : " + e);
		}
	}

}
