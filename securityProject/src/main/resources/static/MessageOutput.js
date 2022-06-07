

document.getElementById("submitButton").onclick = function(){
    var password = document.getElementById("password").value;
    var name = document.getElementById("name").value;

    var obj = new Object();
    obj.name = name;
    obj.password = password;
    var jsonString = JSON.stringify(obj);
    console.log(jsonString);

    console.log(name + ".json");
    var fullname = name + ".json";

    var myBlob = new Blob([jsonString], {type : 'application/json'});
    var url = window.URL.createObjectURL(myBlob);
    var anchor = document.createElement("a");

    anchor.href = url;
    anchor.download = name + "Read.json";

    anchor.click();

    window.URL.revokeObjectURL(url);
    document.removeChild(anchor);
    
}