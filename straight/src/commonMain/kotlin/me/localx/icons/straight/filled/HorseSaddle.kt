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

public val Icons.Filled.HorseSaddle: ImageVector
    get() {
        if (_horseSaddle != null) {
            return _horseSaddle!!
        }
        _horseSaddle = Builder(name = "HorseSaddle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 19.0f)
                horizontalLineToRelative(-0.383f)
                lineToRelative(-0.617f, 5.0f)
                horizontalLineToRelative(-4.148f)
                lineToRelative(0.681f, -4.92f)
                curveToRelative(-0.112f, -0.36f, -0.251f, -0.755f, -0.396f, -1.172f)
                curveToRelative(-0.489f, -1.4f, -1.087f, -3.127f, -1.133f, -4.72f)
                curveToRelative(-1.323f, 1.083f, -2.003f, 3.02f, -2.003f, 5.812f)
                lineTo(0.0f, 19.0f)
                curveToRelative(0.0f, -5.683f, 2.546f, -7.73f, 4.682f, -8.448f)
                lineToRelative(0.155f, -0.052f)
                horizontalLineToRelative(0.062f)
                curveToRelative(0.734f, -0.907f, 1.842f, -1.5f, 3.096f, -1.5f)
                horizontalLineToRelative(0.006f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.302f, 0.839f, 2.402f, 2.0f, 2.816f)
                verticalLineToRelative(3.184f)
                close()
                moveTo(22.587f, 6.664f)
                curveToRelative(-1.788f, -0.857f, -2.965f, -2.171f, -3.398f, -3.906f)
                lineToRelative(-0.188f, -0.758f)
                lineTo(19.001f, 0.0f)
                curveToRelative(-1.429f, 0.0f, -2.619f, 1.001f, -2.921f, 2.338f)
                curveToRelative(-3.163f, 1.041f, -4.079f, 4.291f, -4.079f, 6.162f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.302f, -0.839f, 2.402f, -2.0f, 2.816f)
                verticalLineToRelative(3.184f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.395f)
                lineToRelative(0.385f, -1.811f)
                curveToRelative(0.417f, -1.46f, 0.615f, -2.416f, 0.615f, -3.896f)
                verticalLineToRelative(-2.899f)
                lineToRelative(5.0f, -0.5f)
                verticalLineToRelative(-0.584f)
                curveToRelative(0.0f, -0.956f, -0.555f, -1.839f, -1.413f, -2.252f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _horseSaddle!!
    }

private var _horseSaddle: ImageVector? = null
