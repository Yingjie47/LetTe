from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.10.30/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="main-menu_menu"]/ul[2]/li[3]/a').click()
driver.find_element(By.LINK_TEXT, 'test123').click()
driver.find_element(By.XPATH, '//*[@id="blog_comments-comment_message"]').send_keys("test")
driver.find_element(By.ID, 'blog_comments-post_comment').click()
# sleep(1)
driver.find_element(By.ID, 'user-menu').click()
driver.find_element(By.LINK_TEXT, 'Logout').click()
driver.close()
driver.quit()