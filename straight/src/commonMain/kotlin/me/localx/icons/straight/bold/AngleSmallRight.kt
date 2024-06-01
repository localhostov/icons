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

public val Icons.Bold.AngleSmallRight: ImageVector
    get() {
        if (_angleSmallRight != null) {
            return _angleSmallRight!!
        }
        _angleSmallRight = Builder(name = "AngleSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1638f, 19.061f)
                lineTo(9.0428f, 16.939f)
                lineTo(13.9818f, 12.0f)
                lineTo(9.0428f, 7.061f)
                lineTo(11.1638f, 4.939f)
                lineTo(16.4568f, 10.232f)
                curveTo(16.6891f, 10.4641f, 16.8733f, 10.7397f, 16.9989f, 11.0431f)
                curveTo(17.1246f, 11.3465f, 17.1893f, 11.6716f, 17.1893f, 12.0f)
                curveTo(17.1893f, 12.3283f, 17.1246f, 12.6535f, 16.9989f, 12.9568f)
                curveTo(16.8733f, 13.2602f, 16.6891f, 13.5358f, 16.4568f, 13.768f)
                lineTo(11.1638f, 19.061f)
                close()
            }
        }
        .build()
        return _angleSmallRight!!
    }

private var _angleSmallRight: ImageVector? = null
