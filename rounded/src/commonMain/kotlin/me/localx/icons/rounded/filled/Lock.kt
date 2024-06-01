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

public val Icons.Filled.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.424f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 3.134f, 15.866f, 0.0f, 12.0f, 0.0f)
                curveTo(8.134f, 0.0f, 5.0f, 3.134f, 5.0f, 7.0f)
                verticalLineTo(8.424f)
                curveTo(3.18f, 9.2183f, 2.0026f, 11.0143f, 2.0f, 13.0f)
                verticalLineTo(19.0f)
                curveTo(2.0033f, 21.76f, 4.2399f, 23.9967f, 7.0f, 24.0f)
                horizontalLineTo(17.0f)
                curveTo(19.76f, 23.9967f, 21.9966f, 21.76f, 22.0f, 19.0f)
                verticalLineTo(13.0f)
                curveTo(21.9974f, 11.0143f, 20.8199f, 9.2183f, 19.0f, 8.424f)
                close()
                moveTo(13.0f, 17.0f)
                curveTo(13.0f, 17.5523f, 12.5523f, 18.0f, 12.0f, 18.0f)
                curveTo(11.4477f, 18.0f, 11.0f, 17.5523f, 11.0f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 14.4477f, 11.4477f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5523f, 14.0f, 13.0f, 14.4477f, 13.0f, 15.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                curveTo(7.0f, 4.2386f, 9.2385f, 2.0f, 12.0f, 2.0f)
                curveTo(14.7614f, 2.0f, 17.0f, 4.2386f, 17.0f, 7.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
