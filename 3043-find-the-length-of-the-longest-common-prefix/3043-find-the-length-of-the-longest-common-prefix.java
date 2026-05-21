class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        Trie trie = new Trie();
        for (int integer : arr1) {
            trie.insert(integer);
        }
        int answer = 0;
        for (int element : arr2) {
            answer = Math.max(trie.search(element), answer);
        }
        return answer;
    }
}

class TrieNode {
    TrieNode[] children;
    boolean endOfNumber = false;
    public TrieNode() {
        children = new TrieNode[10];
    }
}

class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public void insert(int word) {
        TrieNode currentNode = root;
        String integer = String.valueOf(word);
        for (char character : integer.toCharArray()) {
            int index = character - '0';
            if (currentNode.children[index] == null) {
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.endOfNumber = true;
    }

    public int search(int word) {
        TrieNode currentNode = root;
        String integer = String.valueOf(word);
        int currentPrefixSize = 0;
        for (char character : integer.toCharArray()) {
            int index = character - '0';
            if (currentNode.children[index] == null) return currentPrefixSize;
            currentPrefixSize++;
            currentNode = currentNode.children[index];
        }
        return currentPrefixSize;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna