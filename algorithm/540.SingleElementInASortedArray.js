/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function(nums) {
    var check ={}
    
    for (var i = 0; i < nums.length; i ++){
        if(check[nums[i]] == undefined){
            check[nums[i]] = 1
        }else {
            check[nums[i]] ++
        }
    }
    
    for (var o in dict) {
        if (check[o] === 1){
            return new Number(o)
        }
    }
};
