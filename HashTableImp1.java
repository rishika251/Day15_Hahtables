package com.bridgelabz.hashtables;

public class HashTableImp1<K, V> {
	Node head;
	Node tail;

	public void add(K key, V value) {
		Node<K, V> myNode = (Node<K, V>) searchNode(key);
		if (myNode == null) {
			myNode = new Node(key, value);
			this.append(myNode);
		} else
			myNode.setValue(value);
	}

	private void append(Node<K, V> myNode) {
		if (this.head == null)
			this.head = myNode;
		if (this.tail == null)
			this.tail = myNode;
		else
			this.tail.setNext(myNode);
		this.tail = myNode;

	}

	private Node<K, V> searchNode(K key) {
		Node currentNode = head;
		int position = 0;
		while (currentNode != null) {
			position++;
			if (currentNode.getKey().equals(key)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	public V get(K word) {
		Node<K, V> myMapNode = searchNode(word);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	@Override
	public String toString() {
		return "MyLinkedListNodes{" + head + "}";
	}

	public void printNodes() {
		System.out.println("My nodes: " + head);
	}

}


