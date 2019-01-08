.\EditData.java:36: error: '(' or '[' expected
		present.presentTable()
		^
.\EditData.java:36: error: illegal start of expression
		present.presentTable()
		       ^
.\EditData.java:36: error: ';' expected
		present.presentTable()
		                    ^
C:\Users\goten\OneDrive\Desktop\Java-2-master\Menu.java:29: error: cannot find symbol
			case 4:		Mylist = new ArrayList<ArrayList<String>>(del.DeleteData(Mylist));
			       		                                             ^
  symbol:   method DeleteData(ArrayList<ArrayList<String>>)
  location: variable del of type Delete
C:\Users\goten\OneDrive\Desktop\Java-2-master\Menu.java:31: error: method doIt in class EditData cannot be applied to given types;
			case 5:		Mylist = new ArrayList<ArrayList<String>>(change.doIt(Mylist));
			       		                                                ^
  required: no arguments
  found: ArrayList<ArrayList<String>>
  reason: actual and formal argument lists differ in length
C:\Users\goten\OneDrive\Desktop\Java-2-master\Menu.java:58: error: cannot find symbol
			if (ans == 1) {
			    ^
  symbol:   variable ans
  location: class Menu
C:\Users\goten\OneDrive\Desktop\Java-2-master\Menu.java:59: error: cannot find symbol
				File file = new File("data.txt");
				^
  symbol:   class File
  location: class Menu
C:\Users\goten\OneDrive\Desktop\Java-2-master\Menu.java:59: error: cannot find symbol
				File file = new File("data.txt");
				                ^
  symbol:   class File
  location: class Menu
C:\Users\goten\OneDrive\Desktop\Java-2-master\Menu.java:60: error: cannot find symbol
				text.createFile(file, Mylist);
				                      ^
  symbol:   variable Mylist
  location: class Menu
.\Delete.java:12: error: cannot find symbol
			String choice = removeD.menu();
			                ^
  symbol:   variable removeD
  location: class Delete
.\Delete.java:14: error: incompatible types: char cannot be converted to String
				case '1' :
				     ^
.\Delete.java:16: error: cannot find symbol
					Line = s.nextInt();
					^
  symbol:   variable Line
  location: class Delete
.\Delete.java:17: error: cannot find symbol
					removeD.removeLine();
					^
  symbol:   variable removeD
  location: class Delete
.\Delete.java:19: error: incompatible types: char cannot be converted to String
				case '2' :
				     ^
.\Delete.java:21: error: cannot find symbol
					Column = s.nextInt();
					^
  symbol:   variable Column
  location: class Delete
.\Delete.java:22: error: cannot find symbol
					removeD.removeColumn();
					^
  symbol:   variable removeD
  location: class Delete
.\Delete.java:24: error: incompatible types: char cannot be converted to String
				case '3' :
				     ^
.\Delete.java:26: error: cannot find symbol
					Line = s.nextInt();
					^
  symbol:   variable Line
  location: class Delete
.\Delete.java:28: error: cannot find symbol
					Column = s.nextInt();
					^
  symbol:   variable Column
  location: class Delete
.\Delete.java:29: error: cannot find symbol
					removeD.removeItem();
					^
  symbol:   variable removeD
  location: class Delete
.\Delete.java:50: error: cannot find symbol
				if (Line < inner.size()) {
				    ^
  symbol:   variable Line
  location: class Delete
.\Delete.java:51: error: cannot find symbol
					inner.remove(Line);
					             ^
  symbol:   variable Line
  location: class Delete
.\Delete.java:60: error: cannot find symbol
			outer.get(Column).clear();
			          ^
  symbol:   variable Column
  location: class Delete
.\Delete.java:61: error: cannot find symbol
			ArrayList<String> inner = new ArrayList<String>(outer.get(Column));
			                                                          ^
  symbol:   variable Column
  location: class Delete
.\Delete.java:63: error: cannot find symbol
				inner.remove(Column);
				             ^
  symbol:   variable Column
  location: class Delete
.\Delete.java:65: error: cannot find symbol
			outer.remove(Column, inner);
			             ^
  symbol:   variable Column
  location: class Delete
.\Delete.java:72: error: cannot find symbol
			ArrayList<String> inner = new ArrayList<String>(outer.get(Column));
			                                                          ^
  symbol:   variable Column
  location: class Delete
.\Delete.java:74: error: cannot find symbol
		    inner.remove(Line,data);
		                 ^
  symbol:   variable Line
  location: class Delete
.\Delete.java:75: error: cannot find symbol
		    outer.remove(Column,inner);
		                 ^
  symbol:   variable Column
  location: class Delete
.\EditData.java:37: error: cannot find symbol
		String choice = editD.menuOfChoices;
		                ^
  symbol:   variable editD
  location: class EditData
.\EditData.java:39: error: incompatible types: char cannot be converted to String
			case '1' :
			     ^
.\EditData.java:42: error: cannot find symbol
				editD.changeLine();
				^
  symbol:   variable editD
  location: class EditData
.\EditData.java:44: error: incompatible types: char cannot be converted to String
			case '2' :
			     ^
.\EditData.java:47: error: cannot find symbol
				editD.changeColumn();
				^
  symbol:   variable editD
  location: class EditData
.\EditData.java:49: error: incompatible types: char cannot be converted to String
			case '3' :
			     ^
.\EditData.java:53: error: cannot find symbol
				Coloumn = s.nextInt();
				^
  symbol:   variable Coloumn
  location: class EditData
.\EditData.java:54: error: cannot find symbol
				editD.changeItem();
				^
  symbol:   variable editD
  location: class EditData
.\EditData.java:121: error: cannot find symbol
	    outer.set(Coloumn,inner);
	              ^
  symbol:   variable Coloumn
  location: class EditData
38 errors

Tool completed with exit code 1
