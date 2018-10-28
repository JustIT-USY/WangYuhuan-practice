#学习控制语句函数，结合IO编程完成管理系统（文件写入到txt，或csv），包括增删改查，排序等自行发挥想象。
import os
student_list = [ ]
flag = 1

while flag:
    os.system("cls")
    print('1.添加学员'+'\n'+'2.修改学员'+'\n'+'3.查询学员'+'\n'+'4.删除学员'+'\n'+'5.退出程序')
    sel_num = int(input('请输入您要进行的操作：'))
    
    while sel_num not in range(1, 6):
        sel_num = int(input('您的选择无效，请重新输入：'))
    if sel_num == 1:#增
        name = input('请输入姓名：')
        age = input('请输入年龄：')
        sex = input('请输入性别：')
        person_list = [name, age, sex]
        student_list.append(person_list)
        print('添加成功!')
        os.system("pause")
    elif sel_num == 2:#改
        if len(student_list) == 0:
            print('暂无任何学员信息！')
            os.system("pause")
        else:
            for x in range(0, len(student_list)):
                print('序号：%s  姓名：%s  年龄：%s  性别：%s  '%(x+1, student_list[x][0], student_list[x][1], student_list[x][2]))
            index = int(input('请输入要修改的序号：')) - 1
            while index not in range(0, len(student_list)):
                index = int(input('您选择的序号无效，请重新选择：')) - 1 
            sc = int(input('1.姓名'+'\n'+'2.年龄'+'\n'+'3.性别'+'\n'+'请输入要修改的项目：')) - 1
            student_list[index][sc] = input('请输入新的数据：')
            print('修改成功')
            os.system("pause")
    elif sel_num == 3:#查
         if len(student_list) == 0:
            print('暂无任何学员信息！')
            os.system("pause")
         else:
            for x in range(0, len(student_list)):
                print('序号：%s  姓名：%s  年龄：%s  性别：%s  '%(x+1, student_list[x][0], student_list[x][1], student_list[x][2]))
                os.system("pause")
    elif sel_num == 4:#删
         if len(student_list) == 0:
            print('暂无任何学员信息！')
            os.system("pause")
         else:
            for x in range(0, len(student_list)):
                print('序号：%s  姓名：%s  年龄：%s  性别：%s  '%(x+1, student_list[x][0], student_list[x][1], student_list[x][2]))
                print('1.删除所有学员'+'\n'+'2.删除选择的学员')
                num = int(input('请输入您的选择：'))
                if num == 1:
                    student_list.clear()
                else:
                    index = int(input('请输入要删除的学员的序号：')) - 1
                    while index not in range(0, len(student_list)):
                        index = int(input('您选择的序号无效，请重新选择：')) - 1
                    del student_list[index]
                print('删除成功！')
                os.system("pause")
    elif sel_num == 5:#退出
        flag = 0
    else:
        break



    