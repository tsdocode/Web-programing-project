# Web-programing-project

## Usage 

- bootstrap 3.3.0
- font-awesome 4.7.0
- jquery 3.2.1
- jquery.validate 1.9

## Note

- Trong resources/js: 
  - validation.js: sử dụng validate input login và register
  - index.js: function invoke_error() -> raise text message trong phần register form
- Trong resources/css:
  - style.css: modify login và register form
  - main.css: modify layout và các views
- Trong tile.xml:
  - Nếu muốn cập nhật thêm js hoặc css, thêm các attribute chưa path của file đó
## Complete tasks
- Trong model:
  - Model User chứa đầy đủ các thuộc tính của table User trong DB
  - Có 2-3 contructor tuy nhiên chỉ phục vụ login
- Trong file DAO:
  - Đã tạo các sql statements liên quan đến user: 
    - Vấn đề: SelectUser: chỉ nhằm để xác nhận có user trong db -> login
    - Đã cập nhập updateUser nhưng chưa sử dụng
- Trong LoginServlet: 
  - Sau khi đăng nhập thành công, chỉ mới forward đến trang home-page(đây là trang loading) mà chưa có các trường hợp khác
  - Khi đăng ký hoàn tất sẽ tự động chuyển về login
- Hoàn tất views, validate bằng JQuery
- Edit profile, load data từ MySQL, Reset Button bằng Jquery

## Một số vấn đề liên quan
- Toàn bộ các href, path đều được gán chết(nghĩa là gán để chạy), chưa được tự động
- Reponsive chưa hoàn chỉnh
