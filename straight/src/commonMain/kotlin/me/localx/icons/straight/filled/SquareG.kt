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
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(15.725f, 17.768f)
                curveToRelative(-1.081f, 0.841f, -2.408f, 1.283f, -3.753f, 1.283f)
                curveToRelative(-0.576f, 0.0f, -1.155f, -0.082f, -1.72f, -0.247f)
                curveToRelative(-2.503f, -0.734f, -4.251f, -3.123f, -4.251f, -5.808f)
                verticalLineToRelative(-1.857f)
                curveToRelative(0.0f, -1.66f, 0.691f, -3.281f, 1.896f, -4.447f)
                curveToRelative(1.18f, -1.142f, 2.727f, -1.732f, 4.317f, -1.689f)
                curveToRelative(1.938f, 0.063f, 3.741f, 1.056f, 4.824f, 2.655f)
                lineToRelative(-1.656f, 1.122f)
                curveToRelative(-0.725f, -1.071f, -1.934f, -1.735f, -3.233f, -1.778f)
                curveToRelative(-1.052f, -0.037f, -2.074f, 0.365f, -2.861f, 1.127f)
                curveToRelative(-0.817f, 0.792f, -1.287f, 1.889f, -1.287f, 3.01f)
                verticalLineToRelative(1.857f)
                curveToRelative(0.0f, 1.804f, 1.158f, 3.403f, 2.815f, 3.889f)
                curveToRelative(1.287f, 0.378f, 2.628f, 0.123f, 3.682f, -0.696f)
                curveToRelative(0.732f, -0.57f, 1.223f, -1.338f, 1.415f, -2.189f)
                horizontalLineToRelative(-3.912f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.964f)
                lineToRelative(0.036f, 0.963f)
                curveToRelative(0.069f, 1.875f, -0.76f, 3.626f, -2.275f, 4.805f)
                close()
            }
        }
        .build()
        return _squareG!!
    }

private var _squareG: ImageVector? = null
