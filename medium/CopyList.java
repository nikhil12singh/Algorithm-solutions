import java.util.HashMap;

class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  }

public class CopyList {

	public RandomListNode copyRandomList(RandomListNode head) {
        
		HashMap<RandomListNode, RandomListNode> hm = new HashMap<>();
        RandomListNode node = head, copy = null, copyhead = null;
		int count = 0;
        
		while(node!=null)
        {
			copy = new RandomListNode(node.label);
			
			if(count==0)
			{
				copyhead = copy;
				count++;
			}
			
        		hm.put(node, copy);
        		node = node.next;
        }
        
        node = head;
        
        while(node!=null)
        {
        		copy = hm.get(node);
        		copy.next = hm.get(node.next);
        		copy.random = hm.get(node.random);
        		node = node.next;
        }
        
        return copyhead;
    }
}
