import os
bookstore = [ ]

def add():
    bookOrder = str(len(bookstore) + 1)
    print('自动生成序号：%s'%bookOrder)
    bookName = input('请输入书名：')
    for i in range(0, len(bookstore)):
        if bookstore[i][1] == bookName:
            print('此书已存在！')
            bookName = input('请输入新的书名：')
    bookNumber = input('请输入书号：')
    while str.isdigit(bookNumber) == 0 or len(bookNumber) != 13:
        bookNumber = input('请输入正确的书号：')
    bookAuthor = input('请输入作者：')
    bookPress = input('请输入出版社：')
    while bookPress.rfind('出版社',len(bookPress) - 3) == -1:
        bookPress = input('请输入正确的出版社：')
    while True:
        try:
            bookPrice = float(input('请输入价格：'))
            break
        except ValueError:
            bookPrice = input('请输入正确的价格：')
    bookPrice = str(bookPrice)
    bookCount = input('请输入数量：')
    while str.isdigit(bookCount) == 0:
        bookCount = input('请输入正确的数量：')
    books = [bookOrder, bookName, bookNumber, bookAuthor, bookPress, bookPrice, bookCount]
    bookstore.append(books)
    print('添加成功！')
    save()
    os.system('pause')

def delete():
    if len(bookstore) == 0:
        print('暂无任何书籍！')
    else:
        num = input('1.删除所有书籍信息\n2.删除单本书籍信息\n请输入您的选择：\n')
        while str.isdigit(num) == 0 or int(num) not in range(1, 3):
            num = input('您的输入有误！请重新输入：\n')
        num = int(num)
        if num == 1:
            sure = input('是否删除所有书籍？请输入Y(y)或者N(n):\n')
            while sure not in ['y', 'Y', 'n', 'N']:
                sure = input('您的输入有误！请输入Y(y)或者N(n):\n')
            if sure == 'Y' or sure == 'y':
                bookstore.clear()
                print('删除成功！')
            else:
                print('您取消了删除操作！')
        else:
            order = input('请输入您要删除的书籍的序号：\n')
            while str.isdigit(order) == 0 or int(order) - 1 not in range(0, len(bookstore)):
                order = input('您的输入有误！请重新输入：\n')
            order = int(order) - 1
            print('序号：%s    书名：%s    书号：%s    作者：%s    出版社：%s     价格：%s    数量：%s'
                  %(bookstore[order][0], bookstore[order][1], bookstore[order][2], bookstore[order][3], bookstore[order][4], bookstore[order][5], bookstore[order][6]))
            sure = input('是否删除？请输入Y(y)或者N(n):\n')
            while sure not in ['y', 'Y', 'n', 'N']:
                sure = input('您的输入有误！请输入Y(y)或者N(n):\n')
            if sure == 'Y' or sure == 'y':
                del bookstore[order]
                for i in range(0, len(bookstore)):
                    bookstore[i][0] = i + 1
                print('删除成功！')
            else:
                print('您取消了删除操作！')
    save()
    os.system('pause')

def alter():
    if len(bookstore) == 0:
        print('暂无任何书籍！')
    else:
        order = input('请输入您要修改的书籍的序号：\n')
        while str.isdigit(order) == 0 or int(order)-1 not in range(0, len(bookstore)):
            order = input('您的输入有误！请重新输入：\n')
        order = int(order) - 1
        print('%d 序号：%s    %d 书名：%s    %d 书号：%s    %d 作者：%s    %d 出版社：%s     %d 价格：%s    %d 数量：%s'
              %(1, bookstore[order][0], 2, bookstore[order][1], 3, bookstore[order][2], 4, bookstore[order][3], 5, bookstore[order][4], 6, bookstore[order][5], 7, bookstore[order][6]))
        type = input('请输入您要修改的项目的序号：\n')
        while str.isdigit(type) == 0 or int(type)-1 not in range(0, 7):
            type = input('您的输入有误！请输入您要修改的项目的序号：\n')
        type = int(type) - 1
        newNum = input('请输入新的数据：\n')
        if type == 0:
            while str.isdigit(newNum) == 0 or int(newNum)-1 not in range(0, len(bookstore)):
                newNum = input('您的输入有误！请重新输入：\n')
            newNum = int(newNum) - 1
        elif type == 2:
            while str.isdigit(newNum) == 0 or len(newNum) != 13:
                newNum = input('您的输入有误！请重新输入：\n')
        elif type == 4:
            while newNum.rfind('出版社',len(newNum)-3) == -1:
                newNum = input('您的输入有误！请重新输入：\n')
        elif type == 5: 
            while True:
                try:
                    newNum = float(newNum)
                    break
                except ValueError:
                    newNum = input('您的输入有误！请重新输入：\n')
            newNum = str(newNum)
        elif type == 6:
            while str.isdigit(newNum) == 0:
                newNum = input('您的输入有误！请重新输入：\n')
        sure = input('是否修改？请输入Y(y)或者N(n):\n')
        while sure not in ['y', 'Y', 'n', 'N']:
            sure = input('您的输入有误！请输入Y(y)或者N(n):\n')
        if sure == 'Y' or sure == 'y':
            if type == 0:
                medium = bookstore[order][:]
                del bookstore[order]
                bookstore.insert(newNum, medium)
                for i in range(0, len(bookstore)):
                    bookstore[i][0] = str(i + 1)
            else:
                bookstore[order][type] = newNum
            print('修改成功！')
        else:
            print('您取消了修改操作！')
    save()
    os.system('pause')

def find():
    if len(bookstore) == 0:
        print('暂无任何书籍！')
    else:
        num = input('1.查询所有书籍信息\n2.查询单本书籍信息\n请输入您的选择：\n')
        while str.isdigit(num) == 0 or int(num) not in range(1, 3):
            num = input('您的输入有误！请重新输入：\n')
        num = int(num)
        if num == 1:
            for i in range(0, len(bookstore)):
                print('序号：%s    书名：%s    书号：%s    作者：%s    出版社：%s     价格：%s    数量：%s'
                      %(bookstore[i][0], bookstore[i][1], bookstore[i][2], bookstore[i][3], bookstore[i][4], bookstore[i][5], bookstore[i][6]))
        else:
            medium = input('请输入查询的依据：1.序号  2.书名  3.书号  4.作者  5.出版社  6.价格  7.数量\n')
            while str.isdigit(medium) == 0 or int(medium) - 1 not in range(0, 7):
                medium = input('您的输入有误！请重新输入：\n')
            medium = int(medium) - 1
            nature = input('请输入查询的内容：')
            flag = 0
            for i in range(0, len(bookstore)):
                if bookstore[i][medium] == nature:
                    print('序号：%s    书名：%s    书号：%s    作者：%s    出版社：%s     价格：%s    数量：%s'
                          %(bookstore[i][0], bookstore[i][1], bookstore[i][2], bookstore[i][3], bookstore[i][4], bookstore[i][5], bookstore[i][6]))
                    flag = 1
                if i == len(bookstore) - 1 and flag == 0:
                    print('无任何相关书籍信息！')
    os.system('pause')

def save():
    f = open('D:\\book.txt','w')
    for i in bookstore:
        sc = ' '.join(i)
        f.write(sc)
        f.write('\n')
    f.close()

def read():
    rs = os.path.exists('D:\\book.txt')
    if rs == True:
        f = open('D:\\book.txt','r')
        bookifm = f.readlines()
        for ifm in bookifm:
            ifm = ifm.strip('\n')
            list = ifm.split(' ')
            bookstore.append(list)
        f.close()

read()

while True:
    os.system('cls')
    print('   图书管理系统     \n==================\n    1.增加书籍    \n    2.删除书籍    \n    3.修改数据    \n    4.查询书籍    \n    5.退出系统    \n==================')
    choice = input('请输入您需要的操作：\n')
    while str.isdigit(choice) == 0 or int(choice) not in range(1, 6):
        choice = input('您的输入有误！请重新输入：\n')
    choice = int(choice)
    if choice == 1:#增
        add()
    elif choice == 2:#删
        delete() 
    elif choice == 3:#改
        alter() 
    elif choice == 4:#查
        find()    
    else:#退出
        break
