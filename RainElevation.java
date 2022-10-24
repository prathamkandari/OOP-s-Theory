class RainElevation
	{ 
	    static int getWater(int a[], int n)
	    {
	    	int res = 0;
	        for(int i = 1; i < n - 1; i++)
	    	{
	    		int lMax = a[i];
	        	for(int j = 0; j < i; j++)
	    			lMax = Math.max(lMax, a[j]);
	    		int rMax = a[i];
                for(int j = i + 1; j < n; j++)
	    			rMax = Math.max(rMax, a[j]);
	    		res = res + (Math.min(lMax, rMax) - a[i]);
	    	}
	    	return res;
	    }
	    public static void main(String args[]) 
	    { 
	       int height[] = {0,1,0,2,1,0,1,3,2,1,2,1}; 
           int n = 12;
	       System.out.println(getWater(height, n));
	    } 
	}
