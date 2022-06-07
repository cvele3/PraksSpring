

document.getElementById("submitButton").onclick = function(){
    var message = document.getElementById("message").value;
    var password = document.getElementById("password").value;
    var name = document.getElementById("name").value;

    var obj = new Object();
    obj.name = name;
    obj.password = password;
    obj.message = message;
    var jsonString = JSON.stringify(obj);

    console.log(jsonString);
    var fullname = name + ".json";

    var myBlob = new Blob([jsonString], {type : 'application/json'});
    var url = window.URL.createObjectURL(myBlob);
    var anchor = document.createElement("a");

    anchor.href = url;
    anchor.download = name + "Entry.json";

    anchor.click();

    window.URL.revokeObjectURL(url);
    document.removeChild(anchor);
}