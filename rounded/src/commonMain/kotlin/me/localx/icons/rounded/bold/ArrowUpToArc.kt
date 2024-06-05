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

public val Icons.Bold.ArrowUpToArc: ImageVector
    get() {
        if (_arrowUpToArc != null) {
            return _arrowUpToArc!!
        }
        _arrowUpToArc = Builder(name = "ArrowUpToArc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.919f, 12.466f)
                curveToRelative(0.571f, 0.6f, 0.549f, 1.549f, -0.052f, 2.12f)
                curveToRelative(-0.29f, 0.276f, -0.662f, 0.414f, -1.034f, 0.414f)
                curveToRelative(-0.396f, 0.0f, -0.791f, -0.156f, -1.086f, -0.466f)
                lineToRelative(-3.247f, -3.409f)
                verticalLineToRelative(11.374f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-11.374f)
                lineToRelative(-3.248f, 3.409f)
                curveToRelative(-0.572f, 0.598f, -1.521f, 0.621f, -2.121f, 0.051f)
                curveToRelative(-0.6f, -0.571f, -0.623f, -1.521f, -0.051f, -2.121f)
                lineToRelative(4.066f, -4.268f)
                curveToRelative(1.559f, -1.562f, 4.17f, -1.538f, 5.682f, -0.025f)
                lineToRelative(4.091f, 4.294f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.579f, 0.0f, 0.313f, 5.021f, 0.013f, 11.43f)
                curveToRelative(-0.039f, 0.828f, 0.601f, 1.53f, 1.428f, 1.568f)
                curveToRelative(0.841f, 0.05f, 1.53f, -0.6f, 1.569f, -1.428f)
                curveToRelative(0.225f, -4.806f, 4.174f, -8.57f, 8.99f, -8.57f)
                reflectiveCurveToRelative(8.765f, 3.765f, 8.99f, 8.57f)
                curveToRelative(0.037f, 0.804f, 0.701f, 1.43f, 1.497f, 1.43f)
                curveToRelative(0.827f, -0.038f, 1.538f, -0.742f, 1.499f, -1.57f)
                curveToRelative(-0.3f, -6.409f, -5.565f, -11.43f, -11.986f, -11.43f)
                close()
            }
        }
        .build()
        return _arrowUpToArc!!
    }

private var _arrowUpToArc: ImageVector? = null
