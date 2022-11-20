package com.bridgelabz.hashtables;

public class Node <K,V>{
	K key;
	V value;
	Node<K, V> next;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Node<K, V> getNext() {
		return next;
	}

	public void setNext(Node<K, V> next) {
		this.next = next;
	}

	  public Node(K key, V value) {

	        this.key = key;
	        this.value = value;
	        next = null;
	    }

	@Override
	   public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Node{" + "Key = ").append(key).append(" Value = ").append(value).append("}\n");
        if (next != null)
            nodeString.append(" -> ").append(next);
        return nodeString.toString();
    }

}

