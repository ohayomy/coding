import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class SetSearch {

	public static void search() {

		String input = JOptionPane.showInputDialog("분야별 검색입니다. [인증번호, 이름, 재배품목명] 으로 검색하실 수 있습니다. 원하시는 분야를 입력해주세요",
				"인증번호");

		switch (input) {
			case "인증번호":
				String code = JOptionPane.showInputDialog("인증번호를 입력해주세요");
				System.out.println("검색결과입니다.");
				Stream<CertificationItem> codeStream = SetArrayList.list.stream();
				codeStream.filter(i -> i.getCertificationNo().equals(code)).forEach(CertificationItem::certificationInfo);
				Stream<CertificationItem> codeStream2 = SetArrayList.list.stream();
				if (codeStream2.noneMatch(i -> i.getCertificationNo().equals(code)))
					System.out.println("검색결과가 없습니다");
				break;
			case "이름":
				String name = JOptionPane.showInputDialog("이름을 입력해주세요");
				System.out.println("검색결과입니다.");
				Stream<CertificationItem> nameStream = SetArrayList.list.stream();
				nameStream.filter(i -> i.getCertificationFarm().equals(name)).forEach(CertificationItem::certificationInfo);
				Stream<CertificationItem> nameStream2 = SetArrayList.list.stream();
				if (nameStream2.noneMatch(i -> i.getCertificationFarm().equals(name)))
					System.out.println("검색결과가 없습니다");
				break;
			case "재배품목명":
				String item = JOptionPane.showInputDialog("품목명을 입력해주세요");
				System.out.println("검색결과입니다.");
				Stream<CertificationItem> itemStream = SetArrayList.list.stream();
				itemStream.filter(i -> i.getCertificationItemName().equals(item)).forEach(CertificationItem::certificationInfo);
				Stream<CertificationItem> itemStream2 = SetArrayList.list.stream();
				if (itemStream2.noneMatch(i -> i.getCertificationItemName().equals(item)))
					System.out.println("검색결과가 없습니다");
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다");
				search();
				break;
			// 잘못된 입력일 떄, 다시 돌아가서 팝업창을 띄울 수는 없을까? 성공.

		}

	}
}
