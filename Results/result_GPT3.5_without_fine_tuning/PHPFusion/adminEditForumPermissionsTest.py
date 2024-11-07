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
driver.find_element(By.XPATH, '//*[@id="adl"]/li[2]/ul/li[9]/a').click()
driver.find_element(By.XPATH, '//*[@id="tab-content-forum-admin-tabs"]/div[2]/div/div/div[2]/div/div[2]/div/a[1]').click()
# Handle missing element "Forum Moderators Selection"
# Update the following steps related to permissions to exclude the missing element
driver.find_element(By.XPATH, '//*[@id="s2id_forum_attach"]').click()
driver.find_element(By.XPATH, '//*[@id="select2-results-8"]/li[2]').click()
driver.find_element(By.XPATH, '//*[@id="s2id_forum_attach_download"]').click()
driver.find_element(By.XPATH, '//*[@id="select2-results-9"]/li[1]').click()
driver.find_element(By.XPATH, '//*[@id="save_permission"]').click()
# sleep(1)
driver.find_element(By.XPATH, '//*[@id="dduser"]').click()
driver.find_element(By.XPATH, '(//a[contains(text(),"Logout")])[2]').click()
driver.close()
driver.quit()