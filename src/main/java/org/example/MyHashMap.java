package org.example;

import java.util.Optional;

public class MyHashMap<K, V> {
    private Node<K, V>[] bucketArray = new Node[50000]; // should be auto-increasing

    public void put(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value, null);
        Optional<Node<K, V>> nodeOptional = Optional.ofNullable(bucketArray[getIndex(key)]);
        if (nodeOptional.isEmpty()) {
            bucketArray[getIndex(key)] = newNode;
        } else {
            Node<K, V> lastNode = getLastNode(nodeOptional.get());
            lastNode.setNext(newNode);
        }
    }

    private Node<K, V> getLastNode(Node<K, V> currentNode) {
        if (currentNode.getNext() == null) {
            return currentNode;
        }
        return getLastNode(currentNode.getNext());
    }

    public V get(K key) {
        int index = getIndex(key);
        Optional<Node<K, V>> nodeOptional = Optional.ofNullable(bucketArray[index]);
        if (nodeOptional.isPresent()) {
            Node<K, V> node = nodeOptional.get();
            Optional<Node<K, V>> properNode = Optional.ofNullable(findProperNode(key, node));
            if (properNode.isPresent()) {
                return properNode.get().getValue();
            }
        }
        return null;
    }

    private Node<K, V> findProperNode(K key, Node<K, V> node) {

        if (key.hashCode() == node.getKey().hashCode()) {
            if (key.equals(node.getKey())) {
                return node;
            }
        } else {
            findProperNode(key, node.next);
        }

        if (node.getNext() == null) {
            return null;
        }

        return findProperNode(key, node.getNext());
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % bucketArray.length);
    }

    public static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }
}
