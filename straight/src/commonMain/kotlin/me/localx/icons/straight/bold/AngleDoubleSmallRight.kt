package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.AngleDoubleSmallRight: ImageVector
    get() {
        if (_angleDoubleSmallRight != null) {
            return _angleDoubleSmallRight!!
        }
        _angleDoubleSmallRight = Builder(name = "AngleDoubleSmallRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4571f, 10.232f)
                lineTo(14.1641f, 4.939f)
                lineTo(12.0431f, 7.061f)
                lineTo(16.9821f, 12.0f)
                lineTo(12.0431f, 16.939f)
                lineTo(14.1641f, 19.061f)
                lineTo(19.4571f, 13.768f)
                curveTo(19.6893f, 13.5358f, 19.8735f, 13.2602f, 19.9992f, 12.9568f)
                curveTo(20.1249f, 12.6535f, 20.1896f, 12.3283f, 20.1896f, 12.0f)
                curveTo(20.1896f, 11.6716f, 20.1249f, 11.3465f, 19.9992f, 11.0431f)
                curveTo(19.8735f, 10.7397f, 19.6893f, 10.4641f, 19.4571f, 10.232f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.164f, 10.939f)
                lineTo(7.164f, 4.939f)
                lineTo(5.043f, 7.061f)
                lineTo(9.982f, 12.0f)
                lineTo(5.043f, 16.939f)
                lineTo(7.164f, 19.061f)
                lineTo(13.164f, 13.061f)
                curveTo(13.3034f, 12.9217f, 13.414f, 12.7563f, 13.4894f, 12.5742f)
                curveTo(13.5649f, 12.3922f, 13.6037f, 12.197f, 13.6037f, 12.0f)
                curveTo(13.6037f, 11.8029f, 13.5649f, 11.6078f, 13.4894f, 11.4257f)
                curveTo(13.414f, 11.2437f, 13.3034f, 11.0783f, 13.164f, 10.939f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallRight!!
    }

private var _angleDoubleSmallRight: ImageVector? = null
