console.log("hello from webpack 2323");

fetch('/rest/1/greeting')
  .then(function(response) {
    return response.json()
  }).then(function(json) {
    console.log('parsed json', json);
    var e = document.createElement("h1");
    e.innerHTML = json.content;
    document.querySelector('body').appendChild(e);
  }).catch(function(ex) {
    console.log('parsing failed', ex)
  })