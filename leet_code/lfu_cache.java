import java.util.*;

class LFUCache {
    Node head = new Node(0, 0, 0), tail = new Node(0, 0, 0);
    Map<Integer, Node> keyToNode = new HashMap<>();
    Map<Integer, LinkedHashSet<Node>> freqMap = new HashMap<>();
    int capacity, minFreq;

    public LFUCache(int _capacity) {
        capacity = _capacity;
        // head.next = tail;
        // tail.prev = head;
        minFreq = 0;
    }

    public int get(int key) {
        if (!keyToNode.containsKey(key)) return -1;

        Node node = keyToNode.get(key);
        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyToNode.containsKey(key)) {
            Node node = keyToNode.get(key);
            node.value = value;
            updateFrequency(node);
        } else {
            if (keyToNode.size() == capacity) {
                removeLFU();
            }
            Node newNode = new Node(key, value, 1);
            keyToNode.put(key, newNode);
            freqMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(newNode);
            minFreq = 1;
            // insert(newNode);
        }
    }

    private void updateFrequency(Node node) {
        int oldFreq = node.freq;
        freqMap.get(oldFreq).remove(node);
        if (freqMap.get(oldFreq).isEmpty() && oldFreq == minFreq) {
            minFreq++;
        }
        node.freq++;
        freqMap.computeIfAbsent(node.freq, k -> new LinkedHashSet<>()).add(node);
        // remove(node);
        // insert(node);
    }

    private void removeLFU() {
        LinkedHashSet<Node> nodes = freqMap.get(minFreq);
        Node toRemove = nodes.iterator().next(); // Get the least recently used node
        nodes.remove(toRemove);
        if (nodes.isEmpty()) {
            freqMap.remove(minFreq);
        }
        keyToNode.remove(toRemove.key);
        // remove(toRemove);
    }

    // private void remove(Node node) {
    //     node.prev.next = node.next;
    //     node.next.prev = node.prev;
    // }

    // private void insert(Node node) {
    //     node.next = head.next;
    //     node.next.prev = node;
    //     head.next = node;
    //     node.prev = head;
    // }

    class Node {
        int key, value, freq;
        Node prev, next;

        Node(int _key, int _value, int _freq) {
            key = _key;
            value = _value;
            freq = _freq;
        }
    }
}
