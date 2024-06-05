package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9f, 16.776f)
                arcTo(10.539f, 10.539f, 0.0f, true, false, 16.776f, 18.9f)
                lineToRelative(5.1f, 5.1f)
                lineTo(24.0f, 21.88f)
                close()
                moveTo(10.5f, 18.0f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 18.0f, 10.5f)
                arcTo(7.507f, 7.507f, 0.0f, false, true, 10.5f, 18.0f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
