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

public val Icons.Bold.ArrowFromBottom: ImageVector
    get() {
        if (_arrowFromBottom != null) {
            return _arrowFromBottom!!
        }
        _arrowFromBottom = Builder(name = "ArrowFromBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5001f, 4.5f)
                lineTo(16.9501f, 7.949f)
                lineTo(19.0711f, 5.828f)
                lineTo(14.1211f, 0.883f)
                curveTo(13.5586f, 0.3206f, 12.7956f, 0.0046f, 12.0001f, 0.0046f)
                curveTo(11.2046f, 0.0046f, 10.4417f, 0.3206f, 9.8791f, 0.883f)
                lineTo(4.9291f, 5.832f)
                lineTo(7.0501f, 7.953f)
                lineTo(10.5001f, 4.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0001f)
                verticalLineTo(24.0f)
                horizontalLineTo(19.0001f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.5001f)
                verticalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _arrowFromBottom!!
    }

private var _arrowFromBottom: ImageVector? = null
