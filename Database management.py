#本周任务就是安装好MySQL(群里有)，然后用自己学的语言通过IDE完成对数据的增删改查操作(用代码实现)。
#且数据字段不少于五个，条数不少于十条。
#(加分项就是用MySQL＋自己学的语言写一个管理系统)。
import os
import csv
import pymysql

def read():#读取
    f = open('D:\\Python\\马蜂窝用户.csv','r')
    csv_reader = csv.reader(f)
    userlist = list(csv_reader)
    del userlist[0]
    return userlist

def create(cursor):#创建
    '''
    cursor.execute('drop database if exists user')
    cursor.execute('create database user')
    '''
    cursor.execute('use user')
    cursor.execute('drop table if exists userdata')
    sql = """create table userdata (
                user_id char(20),
                user_grade char(20),
                address char(20),
                answer char(20),
                good_answer char(20),
                adoption_rate char(20),
                attract_number char(20),
                follower char(20),
                honey char(20))
                """
    cursor.execute(sql)

def add_data(db, cursor):#增 初始
    for i in range(0, len(userlist)):
        sql = """insert into userdata (user_id, user_grade, address, answer, \
                    good_answer, adoption_rate, attract_number, follower, \
                    honey) values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s') \
                """%(userlist[i][0], userlist[i][1], userlist[i][2], userlist[i][3], userlist[i][4], userlist[i][5], userlist[i][6], userlist[i][7], userlist[i][8])
        try:
            cursor.execute(sql)
            db.commit()
        except:
            db.rollback()

def add(db, cursor, user_id, user_grade, address, answer, good_answer, adoption_rate, attract_number, follower, honey):#增
    sql = """insert into userdata (user_id, user_grade, address, answer, \
                good_answer, adoption_rate, attract_number, follower, \
                honey) values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s') \
            """%(user_id, user_grade, address, answer, good_answer, \
                adoption_rate, attract_number, follower, honey)
    cursor.execute(sql)
    db.commit()
    print('增加成功！')
    os.system('pause')

def delete(db, cursor, key, value):#删
    sql = "delete from userdata where " + key + "=" + value
    try:
        cursor.execute(sql)
        db.commit()
        print('删除成功！')
    except:
        db.rollback()
    os.system('pause')

def alter(db, cursor, key1, value1, key2, value2):#改
    sql = "update userdata set " + key2 + "=" + value2 + " where " + key1 + "=" + value1
    try:
        cursor.execute(sql)
        db.commit()
        print('修改成功！')
    except:
        db.rollback() 
    os.system('pause')

def find_all(cursor):#查 所有 
    cursor.execute("select * from userdata")
    results = cursor.fetchall()
    print('user_id\tuser_grade\taddress\tanswer\tgood_answer\tadoption_rate\tattract_number\tfollower\thoney')
    for row in results:
        #print(row)
        print('%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s'%(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8]))
    os.system('pause')

def find(cursor, key, value):
    sql = "select * from userdata where " + key + "=" + value
    cursor.execute(sql)
    result = cursor.fetchall()
    print('user_id =%s user_grade =%s address = %s answer = %s good_answer =%s adoption_rate =%s attract_number =%s follower =%s honey =%s'
          %(result[0][0], result[0][1], result[0][2], result[0][3], result[0][4], result[0][5], result[0][6], result[0][7], result[0][8]))
    os.system('pause')

userlist =[ ]
userlist = read()
db = pymysql.connect('localhost')
cursor = db.cursor()
create(cursor)
add_data(db, cursor)

while True:
    os.system('cls')
    print('   数据管理系统     \n==================\n    1.增加数据    \n    2.删除数据    \n    3.修改数据    \n    4.查询数据    \n    5.退出系统    \n==================')
    choice = input('请输入您需要的操作：\n')
    while str.isdigit(choice) == 0 or int(choice) not in range(1, 6):
        choice = input('您的输入有误！请重新输入：\n')
    choice = int(choice)
    if choice == 1:#增
        user_id = input('请输入user_id：')
        user_grade = input('请输入user_grade：')
        while str.isdigit(user_grade) == 0 or int(user_grade) < 0:
            user_grade = input('您的输入有误！请重新输入：')
        address = input('请输入address：')
        answer = input('请输入answer：')
        while str.isdigit(answer) == 0 or int(answer) < 0:
            answer = input('您的输入有误！请重新输入：')
        good_answer = input('请输入good_answer：')
        while str.isdigit(good_answer) == 0 or int(good_answer) < 0:
            good_answer = input('您的输入有误！请重新输入：\n')
        while True:
            try:
                adoption_rate = float(input('请输入adoption_rate：'))
                break
            except ValueError:
                adoption_rate = input('您的输入有误！请重新输入：')
        attract_number = input('请输入attract_number：')
        while str.isdigit(attract_number) == 0 or int(attract_number) < 0:
            attract_number = input('您的输入有误！请重新输入：')
        follower = input('请输入follower：')
        while str.isdigit(follower) == 0 or int(follower) < 0:
            follower = input('您的输入有误！请重新输入：')
        honey = input('请输入honey：')
        while str.isdigit(honey) == 0 or int(honey) < 0:
            honey = input('您的输入有误！请重新输入：')
        add(db, cursor, user_id, user_grade, address, answer, good_answer, adoption_rate, attract_number, follower, honey)
    elif choice == 2:#删
        key = input('请输入删除对象的某个key：')
        value = input('请输入相应的value：')
        delete(db, cursor, key, value) 
    elif choice == 3:#改
        key1 = input('请输入修改对象的某个key：')
        while key1 not in ['user_id', 'user_grade', 'address', 'answer', 'good_answer', 'adoption_rate', 'attract_number', 'follower', 'honey']:
            print('输入有误！')
            key1 = input('请输入修改对象的某个key：')
        value1 = input('请输入相应的value：')
        key2 = input('请输入修改项目的key：')
        while key2 not in ['user_id', 'user_grade', 'address', 'answer', 'good_answer', 'adoption_rate', 'attract_number', 'follower', 'honey']:
            print('输入有误！')
            key2 = input('请输入修改对象的某个key：')
        value2 = input('请输入相应的value：')
        alter(db, cursor, key1, value1, key2, value2)
    elif choice == 4:#查
        num = input('1.查询所有数据信息\n2.查询某个数据信息\n请输入您的选择：\n')
        while str.isdigit(num) == 0 or int(num) not in range(1, 3):
            num = input('您的输入有误！请重新输入：')
        num = int(num)
        if num == 1:
            find_all(cursor)
        else:
            key = input('请输入查询对象的某个key：')
            value = input('请输入相应的value：')
            find(cursor, key, value) 
    else:#退出
        break

cursor.close()
db.close()
    