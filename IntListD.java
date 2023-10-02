public class IntListD {
    public IntNodeD head;

	/**
	 * A new list has head pointing nowhere.
	 */
	public IntListD()
	{
		head = null;
	}


	/**
	 * Displays contents of the list.
	 */
	public void display()
	{
		IntNodeD p = new IntNodeD();
		p = head;
		while(p != null){
			System.out.println(p.data);
			p = p.next;
		}
		
	} 


	/**
	 * In an unordered list we can just add to the front.
	 *
	 * @param newdata The new element to be inserted into the list.
	 */
	public void insert(int newData)
	{
		IntNodeD p = new IntNodeD();
        p.data = newData;
        p.prev = null;
        if(head!=null) { 
            head.prev = p;
        }
		p.next = head;
		head = p;
		

	}
	
	/* 
	public void oInsert(int val) {
		IntNode n = new IntNode();
		IntNode z,q;
		n.data = val;
		if(head == null || val <= head.data) {
			n.next = head;
			head = n;
		}else {
			z = head.next;
			q = head;
			while(z!=null && z.data < val) {
				q = z;
				z = z.next;
			}
			n.next = z;
			q.next = n;
		}
		
	} 

	/**
	 * Search the list for the value val.
	 *
	 * @param val the value to be searched for
	 * @return reference to the found node (null if not found)
	 *
	public IntNode search(int val)
	{	
		while(head!=null && head.data == val){
			return head;
		}
		if(head!=null){
			IntNode p = head;
		
			while(p!=null & p.next!=null){
				if(p.next.data == val){
					return p.next;
				}else{
					p = head.next;
				}
			}
		}
		return null;
	}


	/**
	 * Find first occurrence of val (if it exists) and remove it from the list.
	 *
	 * @param val the value to be removed
	 *
	public void remove(int val)
	{
		// this takes care of the first element if its data value is equivalent to val
		if(head!=null && head.data == val){
			head = head.next;
		}

		
		
		IntNode presentNode = head;
		while(presentNode != null && presentNode.next != null){
			if(presentNode.next.data == val){
				presentNode.next = presentNode.next.next;
				return;
			}else {
				presentNode = presentNode.next;
			}

		} 
    } */


}