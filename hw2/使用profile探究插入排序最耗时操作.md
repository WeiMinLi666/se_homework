#使用profile探究插入排序中什么操作最耗时

##1、插入排序代码
	public class InsertionSort {
    //交换元素    
    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    //寻找合适的插入位置
    private static int seek(int[] arr,int i){
        int proper = i;                             
        for( int j = i ; j > 0 ; j -- ) {
            if (arr[i] < arr[j - 1]) {
                proper = j - 1;
            }
            else{
                break;
            }
        }
        return proper;
    }
    //将数值交换到合适的位置
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 寻找元素 arr[i] 合适的插入位置
            int proper = seek(arr, i);
            for (int j = i;j>proper;j--){
                swap(arr, j, j-1);
            }
        }
    }

##2、插入排序代码介绍
**插入排序类似于我们玩扑克牌时在起牌的过程中插牌的操作。也就是将后面的元素插入到前面已经有序的序列中**。为了方便看出插入排序中什么操作最耗时，我将插入排序的交换操作和寻找合适的插入位置分别写了单独的方法，然后在排序的方法中只需在每轮循环中分别调用两种方法即可。
##3、实验过程
1.创建大小为10000的由0到20之间的随机数构成的数组

2.调用insertsort对数组排序

3.在运行中选到“Windows Async Profile”生成程序运行的profile图

##4、实验结论

sort方法占据了main方法的83%，在sort方法中，jvm.dll占据了sort方法运行时间的76%,交换数组数据的swap方法占据了8.4%，寻找数组插入的合适位置的seek方法占据了6.7%。说明插入排序中耗时最多的是交换数组元素位置的操作。