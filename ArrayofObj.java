
public class ArrayofObj {
    String name=" ";
    int rolno=0;
    int marks=0;
    public static void main(String [] args){
        ArrayofObj obj1=new ArrayofObj();
        obj1.name="Vimi";
        obj1.rolno=1;
        obj1.marks=87;

        ArrayofObj obj2=new ArrayofObj();
        obj2.name="Sham";
        obj2.rolno=2;
        obj2.marks=90;
        ArrayofObj obj3=new ArrayofObj();
        obj3.name="Rohan";
        obj3.rolno=3;
        obj3.marks=77;

        ArrayofObj arr[]=new ArrayofObj[3];
        arr[0]=obj1;
        arr[1]=obj2;
        arr[2]=obj3;

        for(int i =0;i<arr.length;i++){
        System.out.println(arr[i].name  + ":" + arr[i].marks );
        }
    }
}
       
