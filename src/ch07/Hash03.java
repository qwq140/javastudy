package ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {

	public static void main(String[] args) {
		// �������� ���ڸ� �������ִ� Ŭ����
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();

		// �ǽ� : ���������� ���� ���� ������ �ߺ��� ������ ���� �ʱ�
		while (true) {
			boolean isSame = false;
			int num = r.nextInt(45) + 1; // 0���� ����
			System.out.println(num);

			// ���� ������ ���� ���� �������� add�ϱ� , HashSet�� ����ϱ� ����
			for (int i = 0; i < lotto.size(); i++) {
				if (lotto.get(i) == num) {
					isSame = true;
				}
			}

			if (isSame == false) {
				lotto.add(num);
			}

			if (lotto.size() == 6) {
				break;
			}
		}

		Iterator<Integer> it = lotto.iterator(); // �÷��� ���� �˻�

		// 9, 10, 20, 30, 40, 41
		while (it.hasNext()) { // ���� ������ true, ������ false
			System.out.print(it.next() + " ");// ���� �ε����� ���� ���� + �ε��� ����
		}

	}

}
