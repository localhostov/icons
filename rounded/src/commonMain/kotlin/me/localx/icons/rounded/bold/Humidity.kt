package me.localx.icons.rounded.bold

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

public val Icons.Bold.Humidity: ImageVector
    get() {
        if (_humidity != null) {
            return _humidity!!
        }
        _humidity = Builder(name = "Humidity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.738f, 5.106f)
                lineTo(16.0f, 1.64f)
                arcToRelative(5.738f, 5.738f, 0.0f, false, false, -7.976f, -0.03f)
                lineTo(4.22f, 5.147f)
                arcTo(11.022f, 11.022f, 0.0f, true, false, 19.781f, 20.762f)
                arcTo(11.1f, 11.1f, 0.0f, false, false, 19.738f, 5.106f)
                close()
                moveTo(17.654f, 18.646f)
                horizontalLineToRelative(0.0f)
                arcTo(8.023f, 8.023f, 0.0f, false, true, 6.3f, 7.3f)
                lineToRelative(3.8f, -3.525f)
                arcToRelative(2.719f, 2.719f, 0.0f, false, true, 3.833f, 0.03f)
                lineToRelative(3.722f, 3.454f)
                arcTo(8.084f, 8.084f, 0.0f, false, true, 17.654f, 18.646f)
                close()
                moveTo(15.721f, 10.372f)
                lineTo(10.721f, 17.372f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.442f, -1.744f)
                lineToRelative(5.0f, -7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.442f, 1.744f)
                close()
                moveTo(10.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 9.5f)
                close()
                moveTo(15.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 15.0f)
                close()
            }
        }
        .build()
        return _humidity!!
    }

private var _humidity: ImageVector? = null
