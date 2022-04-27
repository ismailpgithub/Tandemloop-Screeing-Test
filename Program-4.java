public class MultipleOf {
	public static void main(String[] args) {
		int []a=new int[]{1,2,3,4,5,6,7,8,9};
		int []b=new int[]{1,2,8,9,12,46,76,82,15,20,30};
		for(int i=0;i<a.length;i++){
			int count=0;
			for(int j=0;j<b.length;j++){
				if(b[j]%a[i]==0){
					count++;
				}
			}
			if(i<a.length-1)
			System.out.print(a[i]+":"+count+",");
			else
			System.out.print(a[i]+":"+count);
		}
	}
}
