public static int fractionalKnapsack(int[] values, int[] weight, int totalWeight){
   
    Map<Integer,Integer> mapOfValues=new HashMap<>();
    Map<Integer,Integer> mapOfWeights=new HashMap<>();
    
    int[] ratios = new int[values.length];
    int sum=0; 
    
    for(int Idx=0; Idx<values.length; Idx++){
      ratios[Idx] = values[Idx]/weight[Idx];
      mapOfValues.put(ratios[Idx],values[Idx]);
      mapOfWeights.put(ratios[Idx],weight[Idx]);
      sum += weight[Idx]; 
    }
    int n=ratios.length-1, k=0,profit=0;
    
    if(sum >= totalWeight){
    while(totalWeight != 0){
    if(totalWeight - mapOfWeights.get(ratios[k]) > 0){
      profit += mapOfValues.get(ratios[k]);
      totalWeight -= mapOfWeights.get(ratios[k]);
      k++;
    }else{
      profit += (mapOfValues.get(ratios[k])*totalWeight)/mapOfWeights.get(ratios[k]);
      totalWeight=0;
    }
    }
    }
    else{
    while(k <= n){
      profit += mapOfValues.get(ratios[k]);
      k++;
    }
    }
    return profit;
  }
