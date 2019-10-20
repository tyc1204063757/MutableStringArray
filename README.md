#                 MutableStringArray Class
##-------------------------------------------------------

 >##A liver-hurt assignment which seniors who are pretty as a fairy and charming gave.(just for JAVA)
 >###-----Maintainers:唐云灿(Yuncan Tang)

###Yes,the _MutableStringArray_ is a mutable character array.
###As we all know,an array once has been built,we can not change it's length.But a lot of times,we need change it's length.That's why the _MutableStringArray_ born.
#These has ten functions(the following object's name is mutableStringArray).
## —— add(String s)
###Use it to add a character in the end of array.
###Such as the following.
######the array is{"A","B","C"}
######mutableStringArray.add("D");------now it's{"A","B","C","D"}

## —— add(String[] s)
###Use it to add a character array(s) in the end of array.
######the array is{"A","B","C","D"}
######mutableStringArray.add({"E","F"});------now it's{"A","B","C","D","E","F"}
## —— addAt(String s, int index)
###Use it to add a character in the place whose subscript is index.
######the array is{"A","B","C","D"}
######mutableStringArray.addAt("E",0);------now it's {"E","A","B","C","D"}
## —— deleteLast()
###To delete a character which is in the end of array.
######the array is {"E","A","B","C","D"}
######mutableStringArray.deleteLast();------now it's {"E","A","B","C"}
## ——deleteAt(int index)
###To delete a character whose subscript is index.
######the array is {"E","A","B","C"}
######mutableStringArray.deleteAt(2);------now it's {"E","A","C"}
## ——changeAt(String s, int index) 
###To change the character whose subscript is index into s
######the array is {"E","A","C"}
######mutableStringArray.changeAt(2, "F");------now it's {"E","A","F"}
## ——get(int index)
###To get a character whose subscript is index.
######the array is {"E","A","F"}
######System.out.println(mutableStringArray.get(2));------"F"
## ——contains(String s)
###To check the character s if it's in the array.
######the array is {"E","A","F"}
######System.out.println(mutableStringArray.contains("C"));------false
## ——getLength()
###To get the array's length.(just as it's name)
######the array is {"E","A","F"}
######System.out.println(mutableStringArray.getLength());------3(there are 3 characters in the array)
## ——clear()
###To clear the character(s) in the array.
######the array is {"E","A","F"}
######mutableStringArray.clear();------now the array is null,but the object mutableStringArray is still exist.
