package Filtros;

public class FiltroKernel {
	private static final int[][] blurKernel3x3 = {
    		{1, 1, 1},
    		{1, 1, 1},
    		{1, 1, 1}
    };
	
	private static final int[][] blurKernel5x5 = {
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}
    };
	
	private static final int[][] blurKernel9x9 = {
    		{1, 1, 1, 1, 1, 1, 1, 1, 1},
    		{1, 1, 1, 1, 1, 1, 1, 1, 1},
    		{1, 1, 1, 1, 1, 1, 1, 1, 1},
    		{1, 1, 1, 1, 1, 1, 1, 1, 1},
    		{1, 1, 1, 1, 1, 1, 1, 1, 1},
    		{1, 1, 1, 1, 1, 1, 1, 1, 1},
    		{1, 1, 1, 1, 1, 1, 1, 1, 1},
    		{1, 1, 1, 1, 1, 1, 1, 1, 1},
    		{1, 1, 1, 1, 1, 1, 1, 1, 1}
    };
	
	private static final int[][] embossKernel3x3 = {
            {-2, -1, 0},
            {-1, 1, 1},
            {0, 1, 2}
    };
	
	private static final int[][] embossKernel5x5 = {
    	    {-2, -1,  0,  1,  2},
    	    {-1, -1,  0,  1,  1},
    	    { 0,  0,  1,  0,  0},
    	    { 1,  1,  0, -1, -1},
    	    { 2,  1,  0, -1, -2}
    	};
	
	private static final int[][] embossKernel9x9 = {
    	    {-4, -3, -2, -1,  0,  1,  2,  3,  4},
    	    {-3, -3, -2, -1,  0,  1,  2,  3,  3},
    	    {-2, -2, -2, -1,  0,  1,  2,  2,  2},
    	    {-1, -1, -1, -1,  0,  1,  1,  1,  1},
    	    { 0,  0,  0,  0,  1,  0,  0,  0,  0},
    	    { 1,  1,  1,  1,  0, -1, -1, -1, -1},
    	    { 2,  2,  2,  1,  0, -1, -2, -2, -2},
    	    { 3,  3,  2,  1,  0, -1, -2, -3, -3},
    	    { 4,  3,  2,  1,  0, -1, -2, -3, -4}
    	};
	
	private static final int[][] laplacianKernel3x3 = {
            {0, 1, 0},
            {1, -4, 1},
            {0, 1, 0}
    };
	
	private static final int[][] prewittVerticalKernel5x5 = {
    		{-2, -2, -4,-2, -2},
            {-1, -1, -2, -1, -1},
            {0, 0, 0, 0, 0},
            {1, 1, 2, 1, 1},
            {2, 2, 4, 2, 2}
    };
	
	private static final int[][] prewittHorizontalKernel3x3 = {
    		{-1, 0, 1},
            {-1, 0, 1},
            {-1, 0, 1}
    };
	
	private static final int[][] sobelVerticalKernel3x3 = {
            {-1, -2, -1},
            {0, 0, 0},
            {1, 2, 1}
    };
	
	private static final  int[][] sobelHorizontalKernel3x3 = {
    		{-1, 0, 1},
            {-2, 0, 2},
            {-1, 0, 1}
    };
	
	public static int[][] getBlurKernel3x3(){
		return blurKernel3x3;
	}
	
	public static int[][] getBlurKernel5x5(){
		return blurKernel5x5;
	}
	
	public static int[][] getBlurKernel9x9(){
		return blurKernel9x9;
	}
	
	public static int[][] getEmbossKernel3x3(){
		return embossKernel3x3;
	}
	
	public static int[][] getEmbossKernel5x5(){
		return embossKernel5x5;
	}
	
	public static int[][] getEmbossKernel9x9(){
		return embossKernel9x9;
	}
	
	public static int[][] getLaplacianKernel3x3(){
		return laplacianKernel3x3;
	}
	
	public static int[][] getPrewittVerticalKernel5x5(){
		return prewittVerticalKernel5x5;
	}
	
	public static int[][] getPrewittHorizontalKernel3x3(){
		return prewittHorizontalKernel3x3;
	}
	
	public static int[][] getSobelVerticalKernel3x3(){
		return sobelVerticalKernel3x3;
	}
	
	public static int[][] getSobelHorizontalKernel3x3(){
		return sobelHorizontalKernel3x3;
	}
}
