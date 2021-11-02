class ElementDemo{
	public static void main(String[] args){
		
		int a[]= new int[]{1,2,3,4,5,6};
		
		System.out.println("original array");
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ "\t");
		}

		System.out.println();
		System.out.println("Reverse array");
		
		for(int i=a.length-1; i>=0; i--){
			System.out.print(a[i]+"\t");
		}
	}
}
