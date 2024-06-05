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

public val Icons.Bold.Om: ImageVector
    get() {
        if (_om != null) {
            return _om!!
        }
        _om = Builder(name = "Om", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 2.0f)
                curveToRelative(1.299f, 1.831f, 3.09f, 2.0f, 4.167f, 2.0f)
                curveToRelative(1.872f, 0.0f, 3.333f, -1.5f, 3.333f, -1.5f)
                lineToRelative(2.0f, 2.5f)
                curveToRelative(-1.306f, 1.279f, -2.756f, 1.82f, -4.256f, 1.82f)
                curveToRelative(-3.0f, 0.0f, -4.417f, -2.253f, -5.244f, -4.82f)
                close()
                moveTo(14.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(18.75f, 8.0f)
                curveToRelative(-1.972f, 0.0f, -3.054f, 1.082f, -3.923f, 1.951f)
                curveToRelative(-0.471f, 0.471f, -0.916f, 0.916f, -1.498f, 1.207f)
                curveToRelative(-0.261f, 0.131f, -1.011f, 0.226f, -1.951f, 0.207f)
                curveToRelative(0.384f, -0.708f, 0.622f, -1.505f, 0.622f, -2.365f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-2.469f, 0.0f, -4.787f, 2.174f, -5.043f, 2.422f)
                lineToRelative(2.083f, 2.158f)
                curveToRelative(0.538f, -0.516f, 1.97f, -1.58f, 2.959f, -1.58f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-4.0f, 0.0f, -6.5f, -5.532f, -6.5f, -7.462f)
                verticalLineToRelative(3.962f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                curveToRelative(3.552f, -0.038f, 6.5f, -2.939f, 6.5f, -6.5f)
                curveToRelative(0.0f, -1.141f, -0.298f, -2.213f, -0.816f, -3.146f)
                curveToRelative(0.966f, -0.043f, 1.857f, -0.197f, 2.487f, -0.512f)
                curveToRelative(1.018f, -0.509f, 1.717f, -1.208f, 2.277f, -1.77f)
                curveToRelative(0.764f, -0.763f, 1.101f, -1.072f, 1.802f, -1.072f)
                curveToRelative(1.062f, 0.0f, 2.25f, 1.711f, 2.25f, 4.0f)
                curveToRelative(0.0f, 2.626f, -1.258f, 4.0f, -2.5f, 4.0f)
                curveToRelative(-2.25f, 0.0f, -3.61f, -1.939f, -4.0f, -3.0f)
                curveToRelative(-0.365f, 2.554f, 0.75f, 6.0f, 4.0f, 6.0f)
                curveToRelative(2.716f, -0.031f, 5.5f, -2.435f, 5.5f, -7.0f)
                curveToRelative(0.0f, -3.925f, -2.306f, -7.0f, -5.25f, -7.0f)
                close()
            }
        }
        .build()
        return _om!!
    }

private var _om: ImageVector? = null
