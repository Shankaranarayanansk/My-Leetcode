/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const new1 = []; 
    for(let i=0;i<arr.length;i++)
    new1.push(fn(arr[i],i))
    return new1;
    // return arr.map(fn);
};