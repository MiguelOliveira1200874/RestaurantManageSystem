document.getElementById("findTable").addEventListener("click", function() {
    fetch('/restaurant/tables/available')
        .then(response => response.json())
        .then(data => {
            document.getElementById("tableInfo").innerHTML = `Table ID: ${data.id}`;
            // Navigate to order page or enable order functionality
            window.location.href = "order.html?tableId=" + data.id;
        })
        .catch(error => console.error('Error:', error));
});
