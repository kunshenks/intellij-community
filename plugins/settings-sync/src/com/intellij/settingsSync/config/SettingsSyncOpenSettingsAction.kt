package com.intellij.settingsSync.config

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.options.ShowSettingsUtil
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.settingsSync.SettingsSyncBundle.message

internal open class SettingsSyncOpenSettingsAction : DumbAwareAction() {
  override fun actionPerformed(e: AnActionEvent) {
    ShowSettingsUtil.getInstance().showSettingsDialog(e.project, message("title.settings.sync"))
  }

  class Simple : SettingsSyncOpenSettingsAction()
}