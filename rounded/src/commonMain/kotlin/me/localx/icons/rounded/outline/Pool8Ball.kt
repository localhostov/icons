package me.localx.icons.rounded.outline

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

public val Icons.Outline.Pool8Ball: ImageVector
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
                moveTo(19.0f, 9.0f)
                curveToRelative(0.0f, 3.859f, -3.14f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                curveToRelative(0.0f, -3.618f, 2.76f, -6.604f, 6.285f, -6.964f)
                curveToRelative(0.237f, -0.017f, 0.474f, -0.036f, 0.715f, -0.036f)
                reflectiveCurveToRelative(0.478f, 0.019f, 0.715f, 0.036f)
                curveToRelative(3.525f, 0.359f, 6.285f, 3.346f, 6.285f, 6.964f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                curveToRelative(0.0f, -1.683f, 0.422f, -3.269f, 1.16f, -4.662f)
                curveToRelative(-0.101f, 0.539f, -0.16f, 1.094f, -0.16f, 1.662f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -0.568f, -0.059f, -1.123f, -0.16f, -1.662f)
                curveToRelative(0.738f, 1.393f, 1.16f, 2.979f, 1.16f, 4.662f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveToRelative(0.0f, 0.72f, 0.266f, 1.373f, 0.69f, 1.891f)
                curveToRelative(-0.724f, 0.642f, -1.19f, 1.568f, -1.19f, 2.609f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.041f, -0.466f, -1.967f, -1.19f, -2.609f)
                curveToRelative(0.425f, -0.518f, 0.69f, -1.171f, 0.69f, -1.891f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.0f, 6.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _pool8Ball!!
    }

private var _pool8Ball: ImageVector? = null
