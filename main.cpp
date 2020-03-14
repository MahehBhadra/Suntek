#include <iostream>
#include <conio.h>
#include <windows.h>
using namespace std;
const int width=100,height=25;
int x,y,fx,fy;
bool gameover=false;
int tailX[100],tailY[100];
void move(int nTail)
{
    int prevX = tailX[0];
    int prevY = tailY[0];
    int prev2X, prev2Y;
    tailX[0] = x;
    tailY[0] = y;
    for (int i = 1; i < nTail; i++)
    {
        prev2X = tailX[i];
        prev2Y = tailY[i];
        tailX[i] = prevX;
        tailY[i] = prevY;
        prevX = prev2X;
        prevY = prev2Y;
    }
    int dir;
    if(_kbhit())
    {
        switch(_getch())
        {
        case 'a':
            dir=1;break;
        case 's':
            dir=2;break;
         case 'd':
            dir=3;break;
        case 'w':
            dir=4;break;
        case 'x':
            dir=5;break;
        }
    }
    switch(dir)
    {

    case 1:
        x--;break;
    case 3:
        x++;break;
    case 4:
        y--;break;
    case 2:
        y++;break;
    case 5:
        gameover=true;
    }
}


int main()
{
    int j,l=0; x=width/2;
  y=height/2;
   fx=rand()%width;
   fy=rand()%height;

while(!gameover){

system("cls");


    for(int i=0;i<height;i++)
    {
        for(int j=0;j<width;j++)
        {


                        if(j==x&&i==y)
                        {
                            cout<<"0";


                        }
                         if(j==fx&&i==fy)
                        {
                            cout<<"F";
                        }
                         if(x==fx&&y==fy)
                        {
                                l++;



                            fx=rand()%width;
                            fy=rand()%height;






                        }
                        else{
                bool print = false;
                for (int k = 0; k < l; k++)
                {
                    if (tailX[k] == j && tailY[k] == i)
                    {
                        cout << "o";
                        print = true;
                    }
                }
                if (!print){

                        cout<<" ";}}
                }




        cout<<endl;
    }
    move(l);
}


    return 0;

}
