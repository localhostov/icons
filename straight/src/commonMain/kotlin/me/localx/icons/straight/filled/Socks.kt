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

public val Icons.Filled.Socks: ImageVector
    get() {
        if (_socks != null) {
            return _socks!!
        }
        _socks = Builder(name = "Socks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.998f, 4.0f)
                lineToRelative(-0.002f, -4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                reflectiveCurveToRelative(-11.999f, 0.0f, -11.999f, 0.0f)
                close()
                moveTo(11.998f, 6.0f)
                lineToRelative(0.002f, 4.113f)
                lineToRelative(-3.606f, 3.953f)
                curveToRelative(-2.109f, 2.636f, -1.796f, 6.469f, 0.696f, 8.544f)
                curveToRelative(1.077f, 0.896f, 2.439f, 1.39f, 3.837f, 1.39f)
                curveToRelative(1.835f, 0.0f, 3.544f, -0.821f, 4.663f, -2.222f)
                lineToRelative(4.212f, -4.861f)
                curveToRelative(1.418f, -1.637f, 2.198f, -3.731f, 2.197f, -5.897f)
                verticalLineToRelative(-5.021f)
                horizontalLineToRelative(-12.001f)
                close()
                moveTo(6.832f, 12.816f)
                lineToRelative(0.084f, -0.099f)
                lineToRelative(3.083f, -3.38f)
                lineToRelative(-0.002f, -3.338f)
                horizontalLineToRelative(-4.997f)
                lineToRelative(0.002f, 4.113f)
                lineToRelative(-3.606f, 3.953f)
                curveToRelative(-2.109f, 2.636f, -1.796f, 6.469f, 0.696f, 8.544f)
                curveToRelative(1.077f, 0.896f, 2.439f, 1.39f, 3.837f, 1.39f)
                curveToRelative(0.507f, 0.0f, 1.006f, -0.084f, 1.495f, -0.209f)
                curveToRelative(-2.961f, -2.83f, -3.263f, -7.636f, -0.592f, -10.974f)
                close()
                moveTo(9.997f, 4.0f)
                lineTo(9.997f, 0.0f)
                horizontalLineToRelative(-4.999f)
                lineToRelative(0.002f, 4.0f)
                horizontalLineToRelative(4.997f)
                close()
            }
        }
        .build()
        return _socks!!
    }

private var _socks: ImageVector? = null
