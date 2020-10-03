# String2Int

String2Int มี 3 class
- String2Int ( main )
- Input
- DetectNumber

# String2Int ( main )
เรียกใช่้งาน class อื่นๆและแสดงผลลัพธ์ที่ได้จากการแปลงค่าที่รับเข้ามาเป็น Integer

# Input class
รับค่าทางคีบอร์ดและส่งค่าไปยัง main 

มี 2 mthod 
- Input()

เป็น constructure method รับค่าทางคีย์บอร์ดเข้ามา
- inputText()
ส่งค่าที่รับค่ามาทางคีบอร์ดกลับไปยัง main class


# DetectNumber class

มี 5 method
- DetectNumber( )
  
  เป็น constructure method ที่รับค่า input มาใช้ใน class และเรียกใช้งานmedtod อื่นๆภายใน class
- dispart( )

  ทำหน้าที่แยกข้อความเป็นตัวอักษรแต่ละตัวโดยการใช้ for วนลูปตามขนาดข้อความและส่งค่าของตัวอักษรแต่ละตัวไปยัง detectNumber( )
- detectNumber( )

  ทำหน้าที่ตรวจจับตัวอักษรที่เป็นตัวเลขและไปเก็บไว้ในตัวแปร number โดยการเปรียบเทียบตัวอักษรแต่ละตัวกับตัวเลข
- toInt( )

  ทำหน้าที่แปลง String เป็น Integer โดยการวนลูปโดยตามขนาดของตัวแปร number โดยเริ่มจากค่าที่มากที่สุดและใช้ charAt( i ) ระบุตัวที่มีค่าอยู่หลังสุด ซึ่งจะคิดเป็น หลักหน่วย โดยการนำมาูคูณกับตัวแปร digit ที่มีค่าเท่ากับ 1 และจะ *10 เรื่อยเมื่อวนลูปซึ่งจะเป็นการเปลี่ยนเป็นหลักสิบหรือหลักที่เพิ่มขึ้น
- getInteger( )

  เป็น get method ใช้ส่งค่ากลับไปยัง main
  
