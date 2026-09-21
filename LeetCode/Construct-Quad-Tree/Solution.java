1/*
2// Definition for a QuadTree node.
3class Node {
4    public boolean val;
5    public boolean isLeaf;
6    public Node topLeft;
7    public Node topRight;
8    public Node bottomLeft;
9    public Node bottomRight;
10
11    
12    public Node() {
13        this.val = false;
14        this.isLeaf = false;
15        this.topLeft = null;
16        this.topRight = null;
17        this.bottomLeft = null;
18        this.bottomRight = null;
19    }
20    
21    public Node(boolean val, boolean isLeaf) {
22        this.val = val;
23        this.isLeaf = isLeaf;
24        this.topLeft = null;
25        this.topRight = null;
26        this.bottomLeft = null;
27        this.bottomRight = null;
28    }
29    
30    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
31        this.val = val;
32        this.isLeaf = isLeaf;
33        this.topLeft = topLeft;
34        this.topRight = topRight;
35        this.bottomLeft = bottomLeft;
36        this.bottomRight = bottomRight;
37    }
38}
39*/
40
41class Solution {
42    public Node construct(int[][] grid) {
43        return build(grid,0,0,grid.length);
44    }
45    private Node build(int [][] grid,int row, int col, int size)
46    {
47        boolean same=true;
48        int fv=grid[row][col];
49        for(int i=row;i<row+size;i++)
50        {
51            for(int j=col;j<col+size;j++)
52            {
53                if(grid[i][j]!=fv)
54                {
55
56                
57                same=false;
58                break;
59            }
60            }
61            if(!same)
62            {
63                break;
64            }
65        }
66        if(same)
67        {
68            return new Node(fv==1, true);
69        }
70    
71    int half=size/2;
72    Node topLeft=build(grid,row,col,half);
73    Node topRight=build(grid,row,col+half,half);
74    Node bottomLeft=build(grid,row+half,col,half);
75    Node bottomRight=build(grid,row+half,col+half,half);
76    return new Node(true,false,topLeft,topRight,bottomLeft,bottomRight);
77    }
78}