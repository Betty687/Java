package testone;

import java.util.Scanner;  


public class UserDemo {  

    public static String[] name=new String[10];  

    public static String[] password=new String[10];  


    public UserDemo() {  

        this.name[0]="admin";  

        this.password[0]="admin";  

    }  

    //ע��  

    public  void Registered() {  
        Scanner input=new Scanner(System.in);  

        System.out.println("���������֣�");  

        String username=input.next();  

        System.out.println("���������룺");  

        String userpassword=input.next();  

      

        for (int i=0;i<name.length;i++) {  

            if(name[i]==null) {  

                name[i]=username;  

                password[i]=userpassword;  

                System.out.println("���û�ע��ɹ���");  

                break;  

            }  

        }  

    }  

      

    //��½  

    public  void Login() {  

        int flag=1;  

        Scanner input=new Scanner(System.in);  

        System.out.println("�������û�����");  

        String username=input.next();  

        System.out.println("���������룺");  

        String userpassword=input.next();  

  

        for (int i=0;i<name.length;i++) {  

            if(name[i]!=null&&password!=null&&name[i].equals(username)&&password[i].equals(userpassword)) {  

                System.out.println("�û���½�ɹ���");  

                flag=0;  

                break;  

            }         

        }  

        if(flag==1) {  

            System.out.println("�Ƿ��û�����");  

        }  

    }  

    }  


