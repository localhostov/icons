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

public val Icons.Filled.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(name = "Sparkles", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.236f)
                lineTo(6.755f, 14.745f)
                lineTo(0.264f, 11.5f)
                lineTo(6.755f, 8.255f)
                lineTo(10.0f, 1.764f)
                lineToRelative(3.245f, 6.491f)
                lineTo(19.736f, 11.5f)
                lineToRelative(-6.491f, 3.245f)
                close()
                moveTo(18.0f, 21.0f)
                lineToRelative(1.5f, 3.0f)
                lineTo(21.0f, 21.0f)
                lineToRelative(3.0f, -1.5f)
                lineTo(21.0f, 18.0f)
                lineToRelative(-1.5f, -3.0f)
                lineTo(18.0f, 18.0f)
                lineToRelative(-3.0f, 1.5f)
                close()
                moveTo(19.333f, 4.667f)
                lineTo(20.5f, 7.0f)
                lineToRelative(1.167f, -2.333f)
                lineTo(24.0f, 3.5f)
                lineTo(21.667f, 2.333f)
                lineTo(20.5f, 0.0f)
                lineTo(19.333f, 2.333f)
                lineTo(17.0f, 3.5f)
                close()
            }
        }
        .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
