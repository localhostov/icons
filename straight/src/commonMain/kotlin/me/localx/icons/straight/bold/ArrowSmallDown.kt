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

public val Icons.Bold.ArrowSmallDown: ImageVector
    get() {
        if (_arrowSmallDown != null) {
            return _arrowSmallDown!!
        }
        _arrowSmallDown = Builder(name = "ArrowSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.939f, 12.354f)
                lineTo(13.5f, 14.793f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.793f)
                lineTo(8.061f, 12.354f)
                lineTo(5.939f, 14.475f)
                lineTo(10.232f, 18.768f)
                curveTo(10.4642f, 19.0002f, 10.7398f, 19.1844f, 11.0432f, 19.3101f)
                curveTo(11.3465f, 19.4358f, 11.6717f, 19.5005f, 12.0f, 19.5005f)
                curveTo(12.3284f, 19.5005f, 12.6535f, 19.4358f, 12.9569f, 19.3101f)
                curveTo(13.2602f, 19.1844f, 13.5359f, 19.0002f, 13.768f, 18.768f)
                lineTo(18.061f, 14.475f)
                lineTo(15.939f, 12.354f)
                close()
            }
        }
        .build()
        return _arrowSmallDown!!
    }

private var _arrowSmallDown: ImageVector? = null
