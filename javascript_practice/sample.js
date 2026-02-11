function getDigits(num) {
    while(num != 0) {
        let x = num % 10;
        num = Math.floor(num / 10);
        console.log(x);
    }
}

// getDigits(38573);

function iterateWithForOf(arrOrStr) {
    for(const e of arrOrStr) {
        console.log(e);
    }
}

// iterateWithForOf("javascript");
// iterateWithForOf([10, 20, 40, 80, 160]);

function iterateWithForIn(arrOrObjOrStr) {
    for(const key in arrOrObjOrStr) {
        console.log("key or index: " + key + "=" + "value: " + arrOrObjOrStr[key]);
    }
}

// iterateWithForIn({id: 10, name: "Fareen", ["Salary in Rs."]: 10000});
// iterateWithForIn([40,80,160,90,80]);
// iterateWithForIn("Javascript");


// check if x is vowel or not
function skipVowels(str) {
    const vowels = ['a','e','i','o','u'];
    for(const c of str) {
        if(vowels.includes(c.toLowerCase())) {
            continue;
        }
        console.log(c);
    }
}

skipVowels("I love javascript from bottom of my heart");