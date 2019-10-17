/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package org.example.app.units

import dev.icerock.moko.resources.desc.StringDesc
import dev.icerock.moko.units.UnitItem
import org.example.app.TileNews
import org.example.library.feature.news.presentation.NewsListViewModel

class NewsListUnitsFactory : NewsListViewModel.UnitsFactory {
    override fun createNewsTile(
        id: Long,
        title: String,
        description: StringDesc
    ): UnitItem {
        return TileNews().apply {
            itemId = id
            this.title = title
            this.description = description
        }
    }
}
