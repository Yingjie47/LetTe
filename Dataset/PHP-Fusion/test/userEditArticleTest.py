from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.03.90/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '/html/body/div[2]/div/div[1]/div/div[1]/div[2]/ul/li[2]/a').click()
driver.find_element(By.XPATH, '/html/body/div[2]/div/div[2]/div/div[2]/div/article/div/div[2]/a[5]').click()
driver.find_element(By.XPATH, '//*[@id="admin_password"]').send_keys("root1234")
driver.find_element(By.XPATH, '//*[@id="admin-login-form"]/div/div/button').click()
driver.find_element(By.XPATH, '//*[@id="article_snippet"]').send_keys("123")
driver.find_element(By.XPATH, '//*[@id="save_and_close-formstart"]').click()
driver.find_element(By.XPATH, '/html/body/div[1]/header/nav/div/ul/li[3]/a').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="user-menu"]').click()
driver.find_element(By.XPATH, '//*[@id="user-info"]/ul/li[7]/a').click()
driver.close()
driver.quit()