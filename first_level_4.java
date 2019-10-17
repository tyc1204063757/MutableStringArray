public class first_level_4 {
    static class MutableStringArray{
        private String[] mutableStringArray;

        public void tellArray(){
            for (int i = 0; i < mutableStringArray.length; i++) {
                System.out.print(mutableStringArray[i]+"\t");
            }
            System.out.println();
        }

        public boolean add(String s){
            if(mutableStringArray == null){
                this.mutableStringArray = new String[1];
                mutableStringArray[0] = s;
            }else{
                String[] save = new String[mutableStringArray.length];
                for (int i = 0; i < mutableStringArray.length; i++) {
                    save[i]=mutableStringArray[i];
                }//保存原元素

                int x = mutableStringArray.length;
                mutableStringArray = new String[x+1];
                mutableStringArray[x] = s;//扩容添加新元素

                for (int i = 0; i < save.length; i++) {
                    mutableStringArray[i]=save[i];
                }//返还原元素
            }
            return  true;
        }

        public boolean add(String[] s){
            if(mutableStringArray == null) {
                this.mutableStringArray = new String[s.length];
                for (int i = 0; i < s.length; i++) {
                    mutableStringArray[i]=s[i];
                }
            }else {
                String[] save = new String[mutableStringArray.length];
                for (int i = 0; i < mutableStringArray.length; i++) {
                    save[i]=mutableStringArray[i];
                }//保存原元素

                int x = mutableStringArray.length;
                mutableStringArray = new String[x+s.length];
                for (int i = 0; i < s.length; i++) {
                    mutableStringArray[x + i] = s[i];
                }//扩容添加新元素

                for (int i = 0; i < save.length; i++) {
                    mutableStringArray[i]=save[i];
                }//返还原元素
            }
            return true;
        }

        public boolean addAt(String s,int index){
            String[] before = new String[index];
            String[] after  = new String[mutableStringArray.length-index];
            for (int i = 0; i < before.length; i++) {
                before[i] = mutableStringArray[i];
            }//保存index处之前的元素
            for (int i = 0; i < after.length; i++) {
                after[i] = mutableStringArray[i+index];
            }//保存index处及之后的元素

            int x = mutableStringArray.length;
            mutableStringArray = new String[x+1];
            mutableStringArray[index] = s;//扩容添加新元素

            for (int i = 0; i < before.length; i++) {
                mutableStringArray[i] = before[i];
            }
            for (int i = 0; i < after.length; i++) {
                mutableStringArray[i+1+index] = after[i];
            }//返还前后元素
            return true;
        }

        public boolean deleteLast(){
            String[] save = new String[mutableStringArray.length-1];
            for (int i = 0; i < save.length; i++) {
                save[i] = mutableStringArray[i];
            }//保存前面的元素

            int x = mutableStringArray.length;
            mutableStringArray = new String[x-1];//缩容

            for (int i = 0; i < mutableStringArray.length; i++) {
                mutableStringArray[i] = save[i];
            }//返还原元素
            return true;
        }

        public boolean deleteAt(int index){
            String[] before = new String[index];
            String[] after  = new String[mutableStringArray.length-index-1];
            for (int i = 0; i < before.length; i++) {
                before[i] = mutableStringArray[i];
            }//保存index处之前的元素
            for (int i = 0; i < after.length; i++) {
                after[i] = mutableStringArray[i+index+1];
            }//保存index处之后的元素

            int x = mutableStringArray.length;
            mutableStringArray = new String[x-1];//缩容

            for (int i = 0; i < before.length; i++) {
                mutableStringArray[i] = before[i];
            }
            for (int i = 0; i < after.length; i++) {
                mutableStringArray[i+index] = after[i];
            }//返还前后元素
            return true;

        }

        public boolean clear(){
            mutableStringArray = new String[0];
            return true;
        }

        public boolean changeAt(int index,String s){
            mutableStringArray[index] = s;//更换index处元素
            return true;
        }

        public String get(int index){
            return mutableStringArray[index];
        }

        public boolean contains(String s){
            for (int i = 0; i < mutableStringArray.length; i++) {
                if(mutableStringArray[i].equals(s)){
                    return true;
                }
            }
            return  false;
        }

        public int getLength(){
            return mutableStringArray.length;
        }

    }



    public static void main(String[] args) {
        MutableStringArray mutableStringArray = new MutableStringArray();
        String[] stringArray = {"A","B","C"};

        mutableStringArray.add(stringArray);
        mutableStringArray.tellArray();

        mutableStringArray.add("D");
        mutableStringArray.tellArray();

        mutableStringArray.addAt("E",0);
        mutableStringArray.tellArray();

        mutableStringArray.deleteLast();
        mutableStringArray.tellArray();

        mutableStringArray.deleteAt(2);
        mutableStringArray.tellArray();

        mutableStringArray.changeAt(2,"F");
        mutableStringArray.tellArray();

        System.out.println(mutableStringArray.get(2)+"\n");

        System.out.println(mutableStringArray.contains("C")+"\n");

        System.out.println(mutableStringArray.getLength()+"\n");

        mutableStringArray.clear();
        mutableStringArray.tellArray();


    }
}