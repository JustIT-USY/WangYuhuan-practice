import random
number = random.randint(1,100)
print('------猜数字游戏！-----')
guess = 0
count = 0
while guess != number:
    temp = input('猜数字游戏开始，请输入数字：')
    guess = int(temp)
    count+=1
    if guess == number:
        print('恭喜，您猜对了！')
        print('您总共用了',count,'次')
        if count < 4:
            print('你太聪明了！')
            break
        if count < 11:
            print('还不错哦')
            break
        if count > 10:
            print('不太行啊')
            break
    if guess > number:
        print('您输入的数字大了！')
    if guess < number:
        print('您输入的数字小了！')
    
    
