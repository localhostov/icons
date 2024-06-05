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

public val Icons.Bold.ArrowDownFromArc: ImageVector
    get() {
        if (_arrowDownFromArc != null) {
            return _arrowDownFromArc!!
        }
        _arrowDownFromArc = Builder(name = "ArrowDownFromArc", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.867f, 16.414f)
                curveToRelative(0.601f, 0.571f, 0.623f, 1.521f, 0.052f, 2.12f)
                lineToRelative(-4.065f, 4.268f)
                curveToRelative(-0.781f, 0.782f, -1.785f, 1.198f, -2.854f, 1.198f)
                reflectiveCurveToRelative(-2.072f, -0.416f, -2.828f, -1.172f)
                lineToRelative(-4.091f, -4.294f)
                curveToRelative(-0.571f, -0.6f, -0.549f, -1.549f, 0.052f, -2.12f)
                curveToRelative(0.599f, -0.57f, 1.547f, -0.55f, 2.12f, 0.052f)
                lineToRelative(3.247f, 3.409f)
                verticalLineToRelative(-11.374f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(11.375f)
                lineToRelative(3.247f, -3.409f)
                curveToRelative(0.573f, -0.601f, 1.521f, -0.622f, 2.12f, -0.052f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.579f, 0.0f, 0.313f, 5.021f, 0.014f, 11.43f)
                curveToRelative(-0.039f, 0.828f, 0.601f, 1.53f, 1.428f, 1.569f)
                curveToRelative(0.858f, 0.033f, 1.53f, -0.601f, 1.568f, -1.428f)
                curveToRelative(0.226f, -4.806f, 4.174f, -8.57f, 8.99f, -8.57f)
                reflectiveCurveToRelative(8.765f, 3.765f, 8.99f, 8.57f)
                curveToRelative(0.037f, 0.804f, 0.701f, 1.43f, 1.497f, 1.43f)
                curveToRelative(0.023f, 0.0f, 0.047f, 0.0f, 0.071f, -0.001f)
                curveToRelative(0.827f, -0.039f, 1.467f, -0.741f, 1.428f, -1.569f)
                curveToRelative(-0.3f, -6.409f, -5.565f, -11.43f, -11.986f, -11.43f)
                close()
            }
        }
        .build()
        return _arrowDownFromArc!!
    }

private var _arrowDownFromArc: ImageVector? = null
