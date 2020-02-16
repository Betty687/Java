package testone;

import java.util.Scanner;  


public class UserDemo {  

    public static String[] name=new String[10];  

    public static String[] password=new String[10];  


    public UserDemo() {  

        this.name[0]="admin";  

        this.password[0]="admin";  

    }  

    //注册  

    public  void Registered() {  
        Scanner input=new Scanner(System.in);  

        System.out.println("请输入名字：");  

        String username=input.next();  

        System.out.println("请输入密码：");  

        String userpassword=input.next();  

      

        for (int i=0;i<name.length;i++) {  

            if(name[i]==null) {  

                name[i]=username;  

                password[i]=userpassword;  

                System.out.println("新用户注册成功！");  

                break;  

            }  

        }  

    }  

      

    //登陆  

    public  void Login() {  

        int flag=1;  

        Scanner input=new Scanner(System.in);  

        System.out.println("请输入用户名：");  

        String username=input.next();  

        System.out.println("请输入密码：");  

        String userpassword=input.next();  

  

        for (int i=0;i<name.length;i++) {  

            if(name[i]!=null&&password!=null&&name[i].equals(username)&&password[i].equals(userpassword)) {  

                System.out.println("用户登陆成功！");  

                flag=0;  

                break;  

            }         

        }  

        if(flag==1) {  

            System.out.println("非法用户名！");  

        }  

    }  

    }  


