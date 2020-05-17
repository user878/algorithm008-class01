DFS & BFS

1.每个节点都要访问一次
2.每个节点仅仅访问一次

DFS 代码模版

    递归

      visited = set() 

      def dfs(node, visited):
          if node in visited: # terminator
              # already visited 
              return 
        
          visited.add(node) 
        
          # process current node here. 
          ...
          for next_node in node.children(): 
              if next_node not in visited: 
                  dfs(next_node, visited)

    迭代 -- 栈

        def DFS(self, tree): 
            if tree.root is None: 
                return [] 
                
            visited, stack = [], [tree.root]
            
            while stack: 
                node = stack.pop() 
                visited.add(node)
                process (node) 
                nodes = generate_related_nodes(node) 
                stack.push(nodes) 
     
            # other processing work 
            ...

BFS 代码模版

    队列

    def BFS(graph, start, end):
        visited = set()
        queue = [] 
        queue.append([start]) 

        while queue: 
            node = queue.pop() 
            visited.add(node)

            process(node) 
            nodes = generate_related_nodes(node) 
            queue.push(nodes)

        # other processing work 
        ...

贪心算法

贪心算法是一种在每一步选择中都采取在当前状态下最优的选择，从而希望结果是全局最优的算法。

1.贪心: 当下局部最后判断，没有回退功能
3.动态规划: 最优判断，保存以前的运算结果，有回退功能

由于贪心算法的高效性以及其所得的答案比较接近最优结果，贪心算法可以作为辅助算法。 然而...对于工程中和生活中的问题，贪心算法一般不能得到我们所需要的答案。

在用贪心算法的时候，需要证明用其可以得到最优解

贪心算法的适用场景

简单的说，问题能够分解成子问题来解决。子问题的最优解能够递推到最终的问题的最优解。这种子问题最优解成为最优子问题。
贪心算法可以被证明是最优子问题的时候。

二分查找
代码模板

left, right = 0, len(array) - 1 
while left <= right: 
	  mid = (left + right) / 2 
	  if array[mid] == target: 
		    # find the target!! 
		    break or return result 
	  elif array[mid] < target: 
		    left = mid + 1 
	  else: 
		    right = mid - 1