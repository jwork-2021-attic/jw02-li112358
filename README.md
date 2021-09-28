## 任务一

### 1、example的类图和Scene中main方法执行过程的时序图

**类图**

![characters](http://m.qpic.cn/psc?/V52oXK4R3Wfdoc23ThPf0o9ZD71iqRbp/45NBuzDIW489QBoVep5mcdQraD1juLfF.XVSYvN0sCrJmovd6541XrEgTnUUBao63msjxXXKtGi3sIMEi.ybn*k1ab9EZVB9SWonnbWjFfY!/b&bo=iQMgBAAAAAADF5w!&rf=viewer_4)

**时序图**

![timeline](http://m.qpic.cn/psc?/V52oXK4R3Wfdoc23ThPf0o9ZD71iqRbp/45NBuzDIW489QBoVep5mcdQraD1juLfF.XVSYvN0sCqLcVx7fQXN17*hWpQOu4ZBdvqMCVJZXHonRS5F8a4fBD2dHRBBtTpC9hyKVWrkz20!/b&bo=5gFpAgAAAAADF74!&rf=viewer_4)

### 2、设计理念

充分贯彻了面向对象的设计理念

1、为各种排序方式创建了一个父类Sorter来统一调用，在设计排序方式上更加灵活，与主程序分隔开

2、根据葫芦娃所具有的类似于标签属性，把作为枚举类型的葫芦娃设置为标签，从而将其与类Position相互关联，简化了排序时swap操作时交换位置

将代码的操作与实际生活相联系，使代码更加形象化

1、老爷爷对葫芦娃的排序每次操作是拎起两个葫芦娃交换位置，贴近实际生活

2、类的设计符合场景设计，人物对象是老爷爷和葫芦娃，使用的方法对象是排序，main函数位于场景对象中，操控整体场景运作



## 任务二
**类图**
![characters](http://m.qpic.cn/psc?/V52oXK4R3Wfdoc23ThPf0o9ZD71iqRbp/45NBuzDIW489QBoVep5mcWnhppQ0NiDpbHHSG7EK4a2HaJnlb48SIBv2hSN0Knnxpgg0kH.qHF2YhOaMGJ3XgffcyeeNePdReILJxtV2j0U!/b&bo=IAURBAAAAAADJzI!&rf=viewer_4)

**使用冒泡排序法对64个妖怪排序，其结果录屏**
[![asciicast](https://asciinema.org/a/y4NqmmPKrMLjrnYvXXDaBYRt8.svg)](https://asciinema.org/a/y4NqmmPKrMLjrnYvXXDaBYRt8)

**使用快速排序法对64个妖怪排序，其结果录屏**
[![asciicast](https://asciinema.org/a/VDkIIJaYaqj2s6o2knbyxKImr.svg)](https://asciinema.org/a/VDkIIJaYaqj2s6o2knbyxKImr)



## 任务三

**仅在Line.java修改了方法toString，类图结构与任务二一致**
![characters](http://m.qpic.cn/psc?/V52oXK4R3Wfdoc23ThPf0o9ZD71iqRbp/45NBuzDIW489QBoVep5mcdQraD1juLfF.XVSYvN0sCom1avGdvy1HJoXMyUWEZR9treFKg*J6rTUlc0F*Sti1OuHB3ckZfDPEC52iP45RFk!/b&bo=*wQRBAAAAAADJ.w!&rf=viewer_4)

**使用冒泡排序法对64个妖怪排序，其结果录屏**
[![asciicast](https://asciinema.org/a/rdgqthdCy3q9kgYd3xQkc54zN.svg)](https://asciinema.org/a/rdgqthdCy3q9kgYd3xQkc54zN)

**使用快速排序法对64个妖怪排序，其结果录屏**
[![asciicast](https://asciinema.org/a/QefoMQOOlvycd3cEivHQfbppl.svg)](https://asciinema.org/a/QefoMQOOlvycd3cEivHQfbppl)



## 扩展

**可通过命令参数，修改排序方式、排序个数等**

![](http://m.qpic.cn/psc?/V52oXK4R3Wfdoc23ThPf0o9ZD71iqRbp/45NBuzDIW489QBoVep5mces.oOUPX4qQcImq4fCCys*K1LiEOi*muIAnO8Y3qOh0e0XnE.yFFJza842dhq6cbHxQCk9hKgvasPw22KvWokc!/b&bo=HQNzAAAAAAADF18!&rf=viewer_4)

**比如运行java example nums=1024，结果如下**

![](http://m.qpic.cn/psc?/V52oXK4R3Wfdoc23ThPf0o9ZD71iqRbp/45NBuzDIW489QBoVep5mcX4IAJXLV9o*l5mKpcz3RSoB4d3LIPmyz1msNrHuiWIkUVFwBYlfAg5wRqP.GuXuTKe67lRzBYL6y8aaDygW0Fs!/b&bo=xwZ4AgAAAAADN6k!&rf=viewer_4)

