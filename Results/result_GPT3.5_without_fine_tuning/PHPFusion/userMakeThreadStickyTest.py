from time import sleep
from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("http://localhost/PHPFusion-9.10.30/")
driver.find_element(By.XPATH, '(//*[@name="user_name"])[2]').send_keys("admin")
driver.find_element(By.XPATH, '(//*[@name="user_pass"])[2]').send_keys("admin123")
driver.find_element(By.XPATH, '//*[@id="login"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="nav_ddlink8"]').click()  # Updated xpath to navigate to Discussion Forum
driver.find_element(By.XPATH, '//*[@id="nav_menu-8"]/li[2]/a').click()  # Clicking on "Start a New Thread"
# Additional test steps related to creating a new thread could be added here
driver.close()
driver.quit()