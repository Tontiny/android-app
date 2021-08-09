/*
 * Copyright (c) 2018 Proton Technologies AG
 *
 * This file is part of ProtonVPN.
 *
 * ProtonVPN is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ProtonVPN is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ProtonVPN.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.protonvpn.android.di;

import android.app.Activity;

import com.protonvpn.android.ui.settings.SettingsAlwaysOnActivity;
import com.protonvpn.android.ui.settings.SettingsActivity;
import com.protonvpn.android.ui.settings.SettingsDefaultProfileActivity;
import com.protonvpn.android.ui.settings.SettingsExcludeAppsActivity;
import com.protonvpn.android.ui.settings.SettingsExcludeIpsActivity;
import com.protonvpn.android.ui.settings.SettingsMtuActivity;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class SettingsModule {

    @Binds
    abstract Activity provideActivity(SettingsActivity activity);

    abstract Activity provideDefaultProfileActivity(SettingsDefaultProfileActivity activity);

    @Binds
    abstract Activity provideSettingsExcludeAppsActivity(SettingsExcludeAppsActivity activity);

    @Binds
    abstract Activity provideSettingsExcludeIpsActivity(SettingsExcludeIpsActivity activity);

    @Binds
    abstract Activity provideAlwaysOnSettingsActivity(SettingsAlwaysOnActivity activity);

    @Binds
    abstract Activity provideSettingsMtuActivity(SettingsMtuActivity activity);
}
