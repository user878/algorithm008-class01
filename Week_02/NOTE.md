学习笔记
哈希表（Hash table）：也称作散列表，时根据关键码值（Key value）而直接进行访问的数据结构。
它通过把关键码值映射到表中的一个位置来访问记录，以加快查找的速度。
关键码值映射表中位置的实现通过映射函数（又叫散列函数，Hash Function），存放记录的数组则称作哈希表（或散列表）。
不同的key，通过哈希可能得到同一个位置，这种情况叫做“哈希碰撞（哈希冲突）”。解决方法：在发生冲突的位置拉出一个链表
映射（Map）：key-value，键值对，其中key不重复：
// java
-map = new HashMap()/new TreeMap()
-map.set(key, value)
-map.get(key)
-map.has(key)
-map.size()
-map.clear()
# python
map_x = {'jack':100,'selina':90,'laowang':80}
map_x['key'] = value
get_value = map_x['key']
集合（set）：不重复元素的集合
// java
-set = new HashSet()/new TreeSet()
-set.add(value)
-set.delete(value)
-set.hash(value)   
# python
set_x = {'jack','selina','laowang'}
set_x.add(value)
set_x.pop()
set_remove(value)
树（Tree）：当链表不止一个next指针时，就会变成一棵树，树的几个性质：
树节点的度：子节点的个数
树的度：最大的节点的度
深度：树的最大层次
二叉树：度为2的树
二叉树（Binary Tree）：除叶子节点外，每一个节点有且仅有两个子节点
完全二叉树：高度为h，除第h二层，其他层满度
满二叉树：所有叶子节点都在第h层的完全二叉树
平衡二叉树：当且仅当任何节点的两棵子树高度差不大于1的二叉树
第i层至多有2^(i-1)个节点
一棵深度为k的二叉树，至多有2^k - 1 个节点
任意二叉树，叶子节点数量为N0，度为2的节点数为N1，则N0 = N1 + 1
有n个节点的完全二叉树的深度为log2(n+1)
除根节点外，完全二叉树编号为i的节点，左子节点为2i，右子节点为2i+1
二叉树的遍历：
前序（Pre-order）：根-->左-->右
中序（In-order）：左-->根-->右
后序（Post-order）：左-->右-->根
class Node:
    def __init__(self,val):
        self.val = val
        self.left = None
        self.right = None    
 
 class Tree:
     def preorder(self, root:Node):
         if root:
             print(root.val)
             self.preorder(root.left)
             self.preorder(root.right)

     def inorder(self,root):
         if root:
             self.inorder(root.left)
             print(root.val)
             self.inorder(root.right)

     def postorder(self,root):
         if root:
             self.postorder(root.left)
             self.postorder(root.right)
             print(root.val)
二叉搜索树（Binary Search Tree）： 又叫二叉排序树，有序二叉树（Ordered Binary Tree），排序二叉树（Sorted Binary Tree），具有以下性质
左子树上所有节点值均小于根节点的值
右子树上所有节点 值均大于根节点的值
以此类推：左、右子树也分别为二叉搜索树。（这就是重复性）
中序遍历：就是升序排序
插入与查询操作时间复杂度：O(logN)
Linked List是特殊化的Tree，Tree是特殊化的Graph
二叉搜索树 Demo

堆（Heap）：可以快速找到最大值（大根堆/大顶堆）或最小值（小根堆/小顶堆）的数据结构。假设是大顶堆，常见操作（API）：
find-max:O(1)
delete-max:O(logN)
insert(node):O(logN) or O(1)（斐波拉契堆）
堆的实现，常见的有二叉堆/斐波拉契堆等
二叉堆（Binary Heap）:假设是大顶堆，其满足以下性质：
是一颗完全二叉树
树的任意节点的值总是>=其子节点的值
二叉堆的实现细节：
二叉堆一般通过“数组”来实现
假设“第一个元素”在数组中的索引为0的话，则父节点和子节点的位置关系如下：
索引为i的左子节点的索引是（2*i+1)
索引为i的右子节点的索引是（2*i+2)
索引为i的父节点的索引是floor((i-1)/2)
插入操作：新元素一律插入到树的末尾，然后向上调整（HeapifyUp,O(logN)）
删除操作：将堆尾元素替换到根，然后向下调整（HeapifyDown,O(logN)）
二叉堆是堆（优先队列，Priority Queue）的一种常见且简单的实现，但并不是最优的实现
图（Graph）：有点有边的数据结构，Graph(V, E)
V-vertex：点
度 - 入度和出度
点与点直接：连通与否
E-edge：边
有向和无向
权重（边长）
无向无权图、有向无权图、无向有权图、有向有权图