package me.localx.icons.straight.filled

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

public val Icons.Filled.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.281f)
                lineToRelative(-6.0f, 1.5f)
                lineTo(9.0f, 1.924f)
                lineToRelative(6.0f, -1.61f)
                close()
                moveTo(7.0f, 1.417f)
                lineTo(4.155f, 0.233f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 21.754f)
                lineToRelative(7.0f, 2.0f)
                close()
                moveTo(21.867f, 1.617f)
                lineTo(17.515f, 0.155f)
                arcTo(3.022f, 3.022f, 0.0f, false, false, 17.0f, 0.036f)
                lineTo(17.0f, 22.273f)
                lineToRelative(7.0f, 1.705f)
                lineTo(24.0f, 4.483f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.867f, 1.612f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
