package com.basicsstrong.functional.section14;

public class MapFun<K,V> {

	private Entry[] entries;
	private int size;
	
	public MapFun(int size) {
		this.size = size;
		this.entries = new Entry[size];
		
		for(int i = 0 ; i < size ; i++) {
			this.entries[i] = new Entry();
		}
		
	}
	
	private MapFun(Entry[] entries, int size) {
		this.size = size;
		this.entries = entries;
	}
	
	public Integer getHash(K key) {
		return key.hashCode() % size ;
	}
	
	
	public MapFun<K, V> put(K key, V value){
		int hash = getHash(key);
		Entry existingEntry = entries[hash];
		if(isDuplicate(key)) {
			existingEntry.value = value;
		}
		Entry newEntry = new Entry(key, value);
		entries[hash] = newEntry;
		newEntry.next = existingEntry;
		
		return  new MapFun<K, V>(entries, size);
	}
	
	private boolean isDuplicate(K key) {
		boolean result = false;
		Entry entry = entries[getHash(key)];
		while(entry != null) {
			if(key.equals(entry.key)) 
				result = true;
			entry = entry.next;
		}
		return result;
	}
	
	public V getValue(K key) {
		V val = null;
		int hash = getHash(key);
		Entry entry = entries[hash];
		
		while(entry.next != null) {
			if(key.equals(entry.getKey())) {
				val = (V) entry.getValue();
				break;
			}
			
			entry = entry.next;
		}
		
		return val;
	}
	
	public void display() {
		for(int i = 0 ; i < this.entries.length ; i++) {
			System.out.println(this.entries[i]);
		}
	}
}
