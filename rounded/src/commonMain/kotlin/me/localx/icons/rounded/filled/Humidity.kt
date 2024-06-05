package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Humidity: ImageVector
    get() {
        if (_humidity != null) {
            return _humidity!!
        }
        _humidity = Builder(name = "Humidity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.213f, 1.177f)
                arcToRelative(4.947f, 4.947f, 0.0f, false, false, -6.426f, 0.0f)
                curveTo(2.706f, 6.231f, -2.63f, 13.491f, 4.222f, 20.778f)
                arcToRelative(11.052f, 11.052f, 0.0f, false, false, 15.556f, 0.0f)
                curveTo(26.636f, 13.442f, 21.3f, 6.257f, 15.213f, 1.177f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 10.0f)
                close()
                moveTo(10.832f, 16.555f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.664f, -1.11f)
                lineToRelative(4.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.664f, 1.11f)
                close()
                moveTo(15.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 17.0f)
                close()
            }
        }
        .build()
        return _humidity!!
    }

private var _humidity: ImageVector? = null
