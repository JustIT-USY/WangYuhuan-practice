package example2;
public class Trade {
	public static void main(String[] args) {
		//����һ�����У�����̬������ֵ������ֱ��ʹ���������ʣ�
		Bank.bankName = "��������";
		//���þ�̬���������д�ӡ��ӭ���
		Bank.welcome();
		//ͨ�����췽�����п�������
		Bank bank = new Bank("С��", "654321", 100.0);
		//���д�����
		bank.deposit(500.00);
		//ȡ��ʱ�����������ȡ��ʧ��
		bank.withdrawal("123456", 200.0);
		//ȡ��ʱ����ʱ��ȡ��ʧ��
		bank.withdrawal("654321", 1000.0);
		//ȡ��ʱ������ȷ�������㣬ȡ��ɹ�
		bank.withdrawal("654321", 200.0);
		//���þ�̬���������д�ӡ�������
		Bank.welcomeNext();
	}
}