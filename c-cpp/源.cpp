#include<stdio.h>
#include<stdlib.h>
#include<conio.h>  
#include<time.h>
#include<Windows.h>
void hide() //���ع��
{
	HANDLE hOut = GetStdHandle(STD_OUTPUT_HANDLE);
	CONSOLE_CURSOR_INFO cci;
	GetConsoleCursorInfo(hOut, &cci);//��ȡ�����Ϣ
	cci.bVisible = FALSE;//���ع��
	SetConsoleCursorInfo(hOut, &cci);//���ù����Ϣ
}
void gotoxy(int x, int y)
{
	HANDLE handle = GetStdHandle(STD_OUTPUT_HANDLE);
	COORD pos;
	pos.X = x;
	pos.Y = y;
	SetConsoleCursorPosition(handle, pos);
}
int main()
{
	hide();
	srand((int)time(NULL)); //��ʱ����Ϊ�����
	int i, j, k, x = 20, y = 20, attack = 0; //��������ѭ������i,j ȷ����ƽ��ķ�Χx y 20*20 attack������
	int a = rand() % 18 + 2, drone = 0;//drone�ǰл�����˼,���б�1��aΪ�ðл����������й̶���1
	int score = 0; //��ұȷ�
	char input; //����ļ��̷����
	do
	{
		gotoxy(0, 0);
		hide();
		//system("cls"); //����,Linux��ʹ��system("clear")
		if (drone)
		{
			a = rand() % 18 + 2; //�����λa�Ĵ�С,��ΧΪ2~20�ұ������������л��������
			score += 3;//������3
			drone = 0;//ˢ�»��б���ÿ���ƶ��ɻ������ƶ��л�
		}
		printf("w����s����a����d����,���߷��������,��p��ֹ��Ϸ\n����һ�μ�3��û���п�1�֣����0��\n����:%d\t\n", score);//����p����ֹͣ��Ϸ
		printf("----------------------------------------------------\n");//�ֽ���
		if (drone != 1)//����л������еĻ���ֵ��1����ˢ��
			for (j = 0; j < a; j++)
				printf(" ");//����л�ǰ��Ŀո�
		printf("@");//�л���@��ͼ��
		for (i = 0; i < 20 - j; i++)
			printf(" ");
		printf("\n");
		if (attack == 1) //�Ƿ������˹���(�ո�)��
		{//����о��������
			for (i = 0; i < x; i++)
			{
				for (j = 0; j < y; j++)
					printf(" ");//������ߵĿո���ɻ�ͬ��
				printf("  |");//��ɻ�ͷͬ��
				for (k = 0; k < 20; k++)
					printf(" ");
				printf("\n");
				if (y + 2 == a)//���ɻ�ͷ���ɻ����м���ал�ʱ
					drone = 1;//�趨���ал�
				attack = 0;//��������0���������������
			}
			if (y + 2 != a) //�۷�����п�1��
				score--;
			if (score < 0) //����������۵�С��0ʱ��Ϊ0
				score = 0;
			Sleep(100);
			continue; //�����ӵ����ֺ�����ʧ
		}
		else
			for (i = 0; i < x; i++)
			{
				for (j = 0; j < 25; j++)
					printf(" ");
				printf("\n");//û�о�����ɻ�����Ŀհ�����
			}
		for (j = 0; j < y; j++)//����ɻ���ͼ��
			printf(" "); //�����ƶ��������Ŀո���
		printf("  *"); //����ɻ���һ�е�ͼ������������
		for (k = 0; k < 20; k++)
			printf(" ");
		printf("\n");
		for (j = 0; j < y; j++)
			printf(" ");
		printf("*****");
		for (k = 0; k < 19; k++)
			printf(" ");
		printf("\n");
		for (j = 0; j < y; j++)
			printf(" ");
		printf(" * * ");
		for (k = 0; k < 19-y; k++)
			printf(" ");
		printf("\n");
		for (i = 0; i < 20-x; i++)
		{
			for (j = 0; j < 25; j++)
				printf(" ");
			printf("\n");
		}
		//�����ǿ��Ʒɻ����ƶ�
		input = _getch(); //_getch()��vs2017�汾Ҫ��Ŀ���ֲ�ԣ�getch�������벻��ʾ��������
		switch (input) //�жϼ������������
		{
			case 'a':y--; break;
			case 'd':y++; break;
			case 'w':x--; break;
			case 's':x++; break;
			case 72:x--; break;
			case 80:x++; break;
			case 75:y--; break;
			case 77:y++; break;
			case 32:attack = 1;
		}
		if (x < 1)
			x = 1;
		if (y < 0)
			y = 0;
		if (x > 20)
			x = 20;
		if (y > 20)
			y = 20;//��ֹ�����߽�
	} while (input != 'p');//��p����ֹ��Ϸ
	system("cls");//����
	printf("��Ϸ��������ĵ÷�Ϊ%d\n", score); //����������ձȷ�
	system("pause");//��ͣ����������˳�
	return 0;
}