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

public val Icons.Bold.ArrowLeftFromArc: ImageVector
    get() {
        if (_arrowLeftFromArc != null) {
            return _arrowLeftFromArc!!
        }
        _arrowLeftFromArc = Builder(name = "ArrowLeftFromArc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.535f, 16.747f)
                curveToRelative(0.6f, 0.571f, 0.623f, 1.521f, 0.051f, 2.12f)
                curveToRelative(-0.294f, 0.31f, -0.69f, 0.466f, -1.086f, 0.466f)
                curveToRelative(-0.372f, 0.0f, -0.744f, -0.138f, -1.035f, -0.414f)
                lineTo(1.198f, 14.854f)
                curveToRelative(-0.782f, -0.781f, -1.198f, -1.785f, -1.198f, -2.854f)
                reflectiveCurveToRelative(0.416f, -2.072f, 1.172f, -2.828f)
                lineToRelative(4.293f, -4.091f)
                curveToRelative(0.6f, -0.57f, 1.549f, -0.549f, 2.121f, 0.052f)
                curveToRelative(0.572f, 0.6f, 0.548f, 1.549f, -0.051f, 2.12f)
                lineToRelative(-3.409f, 3.247f)
                horizontalLineToRelative(11.374f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(4.126f)
                lineToRelative(3.409f, 3.247f)
                close()
                moveTo(12.57f, 0.014f)
                curveToRelative(-0.837f, -0.031f, -1.53f, 0.601f, -1.569f, 1.428f)
                curveToRelative(-0.039f, 0.828f, 0.601f, 1.53f, 1.428f, 1.568f)
                curveToRelative(4.806f, 0.226f, 8.57f, 4.174f, 8.57f, 8.99f)
                reflectiveCurveToRelative(-3.765f, 8.765f, -8.57f, 8.99f)
                curveToRelative(-0.827f, 0.038f, -1.467f, 0.74f, -1.428f, 1.568f)
                curveToRelative(0.038f, 0.804f, 0.701f, 1.43f, 1.498f, 1.43f)
                curveToRelative(0.023f, 0.0f, 0.047f, 0.0f, 0.071f, -0.002f)
                curveToRelative(6.409f, -0.3f, 11.43f, -5.565f, 11.43f, -11.986f)
                reflectiveCurveTo(18.979f, 0.313f, 12.57f, 0.014f)
                close()
            }
        }
        .build()
        return _arrowLeftFromArc!!
    }

private var _arrowLeftFromArc: ImageVector? = null
