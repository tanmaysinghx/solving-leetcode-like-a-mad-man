type Fn = (n: number, i: number) => any

function filter(arr: number[], fn: Fn): number[] {
    const resultArray: number[] = [];
    for (let i = 0; i < arr.length; i++) {
        if (fn(arr[i], i)) {
            resultArray.push(arr[i]);
        }
    }
    return resultArray;
};