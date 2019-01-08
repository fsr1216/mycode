#include<stdio.h>
#include<stdlib.h>
#include<conio.h>  
#include<time.h>
#include<Windows.h>
void hide() //隐藏光标
{
	HANDLE hOut = GetStdHandle(STD_OUTPUT_HANDLE);
	CONSOLE_CURSOR_INFO cci;
	GetConsoleCursorInfo(hOut, &cci);//获取光标信息
	cci.bVisible = FALSE;//隐藏光标
	SetConsoleCursorInfo(hOut, &cci);//设置光标信息
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
	srand((int)time(NULL)); //以时间作为随机数
	int i, j, k, x = 20, y = 20, attack = 0; //定义两个循环变量i,j 确定好平面的范围x y 20*20 attack代表攻击
	int a = rand() % 18 + 2, drone = 0;//drone是靶机的意思,击中变1，a为该靶机的列数，行固定在1
	int score = 0; //玩家比分
	char input; //输入的键盘方向键
	do
	{
		gotoxy(0, 0);
		hide();
		//system("cls"); //清屏,Linux下使用system("clear")
		if (drone)
		{
			a = rand() % 18 + 2; //随机定位a的大小,范围为2~20且避免左区间避免靶机在射程外
			score += 3;//分数加3
			drone = 0;//刷新击中避免每次移动飞机都会移动靶机
		}
		printf("w向上s向下a向左d向右,或者方向键操作,按p终止游戏\n打中一次加3分没打中扣1分，最低0分\n分数:%d\t\n", score);//输入p可以停止游戏
		printf("----------------------------------------------------\n");//分界线
		if (drone != 1)//输出靶机，击中的话数值变1重新刷新
			for (j = 0; j < a; j++)
				printf(" ");//输出靶机前面的空格
		printf("@");//靶机以@作图像
		for (i = 0; i < 20 - j; i++)
			printf(" ");
		printf("\n");
		if (attack == 1) //是否输入了攻击(空格)键
		{//如果有就输出激光
			for (i = 0; i < x; i++)
			{
				for (j = 0; j < y; j++)
					printf(" ");//激光左边的空格，与飞机同步
				printf("  |");//与飞机头同步
				for (k = 0; k < 20; k++)
					printf(" ");
				printf("\n");
				if (y + 2 == a)//当飞机头即飞机正中间击中靶机时
					drone = 1;//设定击中靶机
				attack = 0;//攻击键回0避免无限输出激光
			}
			if (y + 2 != a) //扣分项，打不中扣1分
				score--;
			if (score < 0) //如果分数被扣到小于0时变为0
				score = 0;
			Sleep(100);
			continue; //激光子弹出现后秒消失
		}
		else
			for (i = 0; i < x; i++)
			{
				for (j = 0; j < 25; j++)
					printf(" ");
				printf("\n");//没有就输出飞机上面的空白区域
			}
		for (j = 0; j < y; j++)//输出飞机的图案
			printf(" "); //代表移动所产生的空格数
		printf("  *"); //输出飞机第一行的图案，输出完后换行
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
		//下面是控制飞机的移动
		input = _getch(); //_getch()是vs2017版本要求的可移植性，getch代表输入不显示输入内容
		switch (input) //判断键盘输入的内容
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
			y = 20;//防止超出边界
	} while (input != 'p');//按p后终止游戏
	system("cls");//清屏
	printf("游戏结束，你的得分为%d\n", score); //告诉玩家最终比分
	system("pause");//暂停，按任意键退出
	return 0;
}
