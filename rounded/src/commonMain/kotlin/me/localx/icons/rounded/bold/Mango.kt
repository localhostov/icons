package me.localx.icons.rounded.bold

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

public val Icons.Bold.Mango: ImageVector
    get() {
        if (_mango != null) {
            return _mango!!
        }
        _mango = Builder(name = "Mango", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(14.5f, 15.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.487f, 6.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(3.501f, 0.0f, 6.327f, -2.826f)
                curveToRelative(1.132f, -1.131f, 1.535f, -2.738f, 1.676f, -3.872f)
                curveToRelative(0.093f, -0.749f, -0.544f, -1.386f, -1.293f, -1.293f)
                curveToRelative(-1.134f, 0.141f, -2.741f, 0.545f, -3.872f, 1.676f)
                curveToRelative(-0.636f, 0.636f, -1.159f, 1.539f, -1.577f, 2.465f)
                curveToRelative(-0.366f, -1.74f, -1.073f, -2.821f, -1.513f, -3.482f)
                curveToRelative(-0.459f, -0.69f, -1.392f, -0.875f, -2.08f, -0.417f)
                curveToRelative(-0.689f, 0.459f, -0.876f, 1.391f, -0.417f, 2.08f)
                curveToRelative(0.497f, 0.746f, 1.249f, 1.874f, 1.249f, 4.168f)
                close()
                moveTo(23.412f, 8.615f)
                curveToRelative(-0.28f, -0.78f, -1.14f, -1.183f, -1.919f, -0.904f)
                curveToRelative(-0.78f, 0.28f, -1.185f, 1.14f, -0.904f, 1.919f)
                curveToRelative(0.273f, 0.759f, 0.411f, 1.556f, 0.411f, 2.371f)
                curveToRelative(0.0f, 7.47f, -6.596f, 9.0f, -16.5f, 9.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.268f, 0.07f, -0.527f, 0.201f, -0.752f)
                curveToRelative(0.098f, -0.093f, 0.386f, -0.35f, 1.147f, -0.957f)
                curveToRelative(1.735f, -1.382f, 2.652f, -3.385f, 2.652f, -5.792f)
                curveToRelative(0.0f, -2.589f, 1.419f, -4.956f, 3.705f, -6.178f)
                curveToRelative(0.73f, -0.391f, 1.006f, -1.3f, 0.615f, -2.03f)
                curveToRelative(-0.39f, -0.73f, -1.298f, -1.007f, -2.03f, -0.615f)
                curveToRelative(-3.263f, 1.745f, -5.29f, 5.125f, -5.29f, 8.823f)
                curveToRelative(0.0f, 1.482f, -0.512f, 2.641f, -1.521f, 3.445f)
                curveToRelative(-1.354f, 1.078f, -1.569f, 1.328f, -1.729f, 1.567f)
                curveToRelative(-0.491f, 0.739f, -0.75f, 1.599f, -0.75f, 2.488f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                curveToRelative(5.835f, 0.0f, 19.5f, 0.0f, 19.5f, -12.0f)
                curveToRelative(0.0f, -1.162f, -0.198f, -2.3f, -0.588f, -3.385f)
                close()
            }
        }
        .build()
        return _mango!!
    }

private var _mango: ImageVector? = null
