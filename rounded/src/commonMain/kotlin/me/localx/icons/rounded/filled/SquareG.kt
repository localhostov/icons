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

public val Icons.Filled.SquareG: ImageVector
    get() {
        if (_squareG != null) {
            return _squareG!!
        }
        _squareG = Builder(name = "SquareG", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(17.801f, 15.451f)
                curveToRelative(-0.955f, 2.198f, -3.345f, 3.603f, -5.798f, 3.603f)
                curveToRelative(-0.586f, 0.0f, -1.176f, -0.08f, -1.751f, -0.249f)
                curveToRelative(-2.503f, -0.734f, -4.251f, -3.123f, -4.251f, -5.808f)
                verticalLineToRelative(-1.857f)
                curveToRelative(0.0f, -1.66f, 0.691f, -3.281f, 1.896f, -4.447f)
                curveToRelative(1.18f, -1.142f, 2.727f, -1.732f, 4.317f, -1.689f)
                curveToRelative(1.938f, 0.063f, 3.741f, 1.056f, 4.824f, 2.655f)
                curveToRelative(0.31f, 0.458f, 0.19f, 1.079f, -0.267f, 1.389f)
                curveToRelative(-0.458f, 0.31f, -1.08f, 0.19f, -1.389f, -0.267f)
                curveToRelative(-0.725f, -1.071f, -1.934f, -1.735f, -3.233f, -1.778f)
                curveToRelative(-1.052f, -0.037f, -2.074f, 0.365f, -2.861f, 1.127f)
                curveToRelative(-0.817f, 0.792f, -1.287f, 1.889f, -1.287f, 3.01f)
                verticalLineToRelative(1.857f)
                curveToRelative(0.0f, 1.804f, 1.158f, 3.403f, 2.815f, 3.889f)
                curveToRelative(2.011f, 0.591f, 4.37f, -0.432f, 5.151f, -2.231f)
                curveToRelative(0.071f, -0.164f, 0.015f, -0.307f, -0.045f, -0.398f)
                curveToRelative(-0.105f, -0.16f, -0.279f, -0.255f, -0.465f, -0.255f)
                horizontalLineToRelative(-3.457f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.457f)
                curveToRelative(0.863f, 0.0f, 1.662f, 0.433f, 2.137f, 1.158f)
                curveToRelative(0.453f, 0.691f, 0.531f, 1.548f, 0.207f, 2.292f)
                close()
            }
        }
        .build()
        return _squareG!!
    }

private var _squareG: ImageVector? = null
