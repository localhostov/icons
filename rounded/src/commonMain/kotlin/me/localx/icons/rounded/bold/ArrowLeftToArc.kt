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

public val Icons.Bold.ArrowLeftToArc: ImageVector
    get() {
        if (_arrowLeftToArc != null) {
            return _arrowLeftToArc!!
        }
        _arrowLeftToArc = Builder(name = "ArrowLeftToArc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11.374f)
                lineToRelative(3.409f, 3.247f)
                curveToRelative(0.6f, 0.571f, 0.623f, 1.521f, 0.051f, 2.12f)
                curveToRelative(-0.294f, 0.31f, -0.69f, 0.466f, -1.086f, 0.466f)
                curveToRelative(-0.372f, 0.0f, -0.744f, -0.138f, -1.035f, -0.414f)
                lineToRelative(-4.268f, -4.065f)
                curveToRelative(-0.782f, -0.781f, -1.198f, -1.785f, -1.198f, -2.854f)
                reflectiveCurveToRelative(0.416f, -2.072f, 1.172f, -2.828f)
                lineToRelative(4.293f, -4.091f)
                curveToRelative(0.6f, -0.57f, 1.549f, -0.549f, 2.121f, 0.052f)
                curveToRelative(0.572f, 0.6f, 0.548f, 1.549f, -0.051f, 2.12f)
                lineToRelative(-3.409f, 3.247f)
                horizontalLineToRelative(11.374f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.57f, 20.99f)
                curveToRelative(-4.806f, -0.226f, -8.57f, -4.174f, -8.57f, -8.99f)
                reflectiveCurveTo(6.765f, 3.235f, 11.57f, 3.01f)
                curveToRelative(0.827f, -0.038f, 1.467f, -0.74f, 1.428f, -1.568f)
                curveToRelative(-0.039f, -0.827f, -0.73f, -1.46f, -1.569f, -1.428f)
                curveTo(5.021f, 0.313f, 0.0f, 5.579f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.021f, 11.687f, 11.43f, 11.986f)
                curveToRelative(0.024f, 0.0f, 0.048f, 0.002f, 0.071f, 0.002f)
                curveToRelative(0.796f, 0.0f, 1.46f, -0.626f, 1.498f, -1.43f)
                curveToRelative(0.039f, -0.828f, -0.601f, -1.53f, -1.428f, -1.568f)
                close()
            }
        }
        .build()
        return _arrowLeftToArc!!
    }

private var _arrowLeftToArc: ImageVector? = null
