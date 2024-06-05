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

public val Icons.Bold.Pool8Ball: ImageVector
    get() {
        if (_pool8Ball != null) {
            return _pool8Ball!!
        }
        _pool8Ball = Builder(name = "Pool8Ball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.0f, 6.0f)
                curveToRelative(0.0f, 0.72f, -0.266f, 1.373f, -0.69f, 1.891f)
                curveToRelative(0.724f, 0.642f, 1.19f, 1.568f, 1.19f, 2.609f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.041f, 0.466f, -1.967f, 1.19f, -2.609f)
                curveToRelative(-0.425f, -0.518f, -0.69f, -1.171f, -0.69f, -1.891f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                curveToRelative(0.0f, -2.724f, 1.216f, -5.168f, 3.134f, -6.82f)
                curveToRelative(-0.717f, 1.098f, -1.134f, 2.41f, -1.134f, 3.82f)
                curveToRelative(0.0f, 3.866f, 3.134f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.134f, 7.0f, -7.0f)
                curveToRelative(0.0f, -1.409f, -0.417f, -2.721f, -1.134f, -3.82f)
                curveToRelative(1.917f, 1.652f, 3.134f, 4.096f, 3.134f, 6.82f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(11.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(10.5f, 10.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _pool8Ball!!
    }

private var _pool8Ball: ImageVector? = null
