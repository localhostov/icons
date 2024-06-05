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

public val Icons.Filled.SquareZ: ImageVector
    get() {
        if (_squareZ != null) {
            return _squareZ!!
        }
        _squareZ = Builder(name = "SquareZ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(18.0f, 18.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.868f)
                curveToRelative(-0.871f, 0.0f, -1.645f, -0.517f, -1.973f, -1.316f)
                curveToRelative(-0.324f, -0.79f, -0.14f, -1.69f, 0.471f, -2.292f)
                lineToRelative(9.378f, -8.246f)
                curveToRelative(-0.023f, 0.02f, 0.007f, -0.011f, -0.017f, -0.07f)
                curveToRelative(-0.031f, -0.075f, -0.095f, -0.075f, -0.123f, -0.075f)
                lineTo(7.023f, 7.001f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.845f)
                curveToRelative(0.871f, 0.0f, 1.645f, 0.517f, 1.973f, 1.316f)
                curveToRelative(0.324f, 0.79f, 0.14f, 1.69f, -0.471f, 2.292f)
                lineToRelative(-9.372f, 8.241f)
                curveToRelative(0.009f, -0.006f, -0.01f, 0.023f, 0.011f, 0.075f)
                curveToRelative(0.031f, 0.075f, 0.095f, 0.075f, 0.123f, 0.075f)
                horizontalLineToRelative(8.868f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _squareZ!!
    }

private var _squareZ: ImageVector? = null
