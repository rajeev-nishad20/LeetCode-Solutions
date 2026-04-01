class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {

        int n = positions.length;
        Integer[] indices = new Integer[n];

        for(int i = 0; i < n; i++){
            indices[i] = i;
        }

        Stack<Integer> stack = new Stack<>();
        Arrays.sort(indices, (i, j) -> Integer.compare(positions[i], positions[j]));

        List<Integer> result = new ArrayList<>();

        for(int currIdx : indices){

            if(directions.charAt(currIdx) == 'R'){
                stack.push(currIdx);
            } else{

                while(!stack.isEmpty() && healths[currIdx] > 0){

                    int topIdx = stack.pop();

                    if(healths[topIdx] > healths[currIdx]){
                        healths[topIdx] -= 1;
                        healths[currIdx] = 0;
                        stack.push(topIdx);
                    } else if(healths[topIdx] < healths[currIdx]){
                        healths[currIdx] -= 1;
                        healths[topIdx] = 0;
                    } else{
                        healths[currIdx] = 0;
                        healths[topIdx] = 0;
                    }

                }
            }
        }

        for(int i = 0; i < n; i++){
            if(healths[i] != 0){
                result.add(healths[i]);
            }
        }
        

        return result;
    }
}