from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.10.30/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="navigation-user"]/ul/li[5]/a').click()
driver.find_element(By.XPATH, '//*[@id="admin_password"]').send_keys("root1234")
driver.find_element(By.XPATH, '//*[@id="admin-login-form"]/div/div/button').click()
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/a').click()
sleep(1)
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[6]/a').click()
driver.find_element(By.XPATH, '//*[@id="blog"]/li[2]/a').click()
driver.find_element(By.XPATH, '//*[@id="blog_subject"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="blog_blog"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="s2id_autogen2"]').click()
driver.find_element(By.XPATH, '//*[@id="select2-drop"]/ul/li[2]').click()
driver.find_element(By.XPATH, '//*[@id="blog_extended"]').send_keys("test")
driver.find_element(By.XPATH, '//*[@id="save_bottombtn"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="dduser"]').click()
driver.find_element(By.XPATH, '(//a[contains(text(),"Logout")])[2]').click()
driver.close()
driver.quit()