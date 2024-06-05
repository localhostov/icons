package me.localx.icons.straight.outline

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

public val Icons.Outline.Socks: ImageVector
    get() {
        if (_socks != null) {
            return _socks!!
        }
        _socks = Builder(name = "Socks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                lineToRelative(0.004f, 10.113f)
                lineToRelative(-3.606f, 3.953f)
                curveToRelative(-2.109f, 2.636f, -1.796f, 6.469f, 0.696f, 8.544f)
                curveToRelative(1.077f, 0.896f, 2.439f, 1.39f, 3.837f, 1.39f)
                curveToRelative(1.253f, 0.0f, 2.492f, -0.399f, 3.505f, -1.126f)
                curveToRelative(1.016f, 0.729f, 2.241f, 1.126f, 3.495f, 1.126f)
                curveToRelative(1.835f, 0.0f, 3.544f, -0.821f, 4.663f, -2.222f)
                lineToRelative(4.212f, -4.861f)
                curveToRelative(1.418f, -1.637f, 2.198f, -3.731f, 2.197f, -5.897f)
                lineToRelative(-0.003f, -11.021f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-7.999f, 0.0f, -7.999f, 0.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(7.999f, 0.0f, 7.999f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-4.999f, 0.0f, -4.999f, 0.0f)
                verticalLineToRelative(-2.0f)
                reflectiveCurveToRelative(4.999f, 0.0f, 4.999f, 0.0f)
                close()
                moveTo(3.373f, 21.073f)
                curveToRelative(-1.661f, -1.383f, -1.847f, -3.966f, -0.456f, -5.708f)
                lineToRelative(4.086f, -4.478f)
                lineToRelative(-0.002f, -4.888f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.002f, 4.113f)
                lineToRelative(-3.606f, 3.953f)
                curveToRelative(-1.751f, 2.188f, -1.833f, 5.202f, -0.384f, 7.349f)
                curveToRelative(-1.412f, 0.844f, -3.356f, 0.727f, -4.641f, -0.343f)
                close()
                moveTo(20.294f, 15.608f)
                lineToRelative(-4.237f, 4.891f)
                curveToRelative(-0.763f, 0.954f, -1.902f, 1.501f, -3.126f, 1.501f)
                curveToRelative(-0.931f, 0.0f, -1.839f, -0.329f, -2.558f, -0.927f)
                curveToRelative(-1.661f, -1.383f, -1.847f, -3.966f, -0.456f, -5.708f)
                lineToRelative(4.087f, -4.478f)
                lineToRelative(-0.002f, -4.888f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.002f, 5.021f)
                curveToRelative(0.0f, 1.685f, -0.606f, 3.313f, -1.709f, 4.586f)
                close()
            }
        }
        .build()
        return _socks!!
    }

private var _socks: ImageVector? = null
