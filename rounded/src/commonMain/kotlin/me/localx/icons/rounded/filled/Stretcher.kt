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

public val Icons.Filled.Stretcher: ImageVector
    get() {
        if (_stretcher != null) {
            return _stretcher!!
        }
        _stretcher = Builder(name = "Stretcher", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 18.0f)
                curveToRelative(-0.556f, 0.0f, -1.071f, 0.162f, -1.518f, 0.427f)
                lineToRelative(-3.017f, -2.82f)
                lineToRelative(4.93f, -4.607f)
                horizontalLineToRelative(1.606f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-13.324f)
                curveToRelative(-1.34f, 0.0f, -2.584f, -0.666f, -3.328f, -1.781f)
                lineTo(1.832f, 0.445f)
                curveTo(1.526f, -0.015f, 0.906f, -0.138f, 0.445f, 0.168f)
                curveTo(-0.015f, 0.475f, -0.139f, 1.095f, 0.168f, 1.555f)
                lineToRelative(4.516f, 6.773f)
                curveToRelative(0.887f, 1.329f, 2.25f, 2.223f, 3.779f, 2.538f)
                lineToRelative(5.073f, 4.741f)
                lineToRelative(-3.017f, 2.82f)
                curveToRelative(-0.447f, -0.265f, -0.962f, -0.427f, -1.518f, -0.427f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.366f, -0.075f, -0.713f, -0.196f, -1.037f)
                lineToRelative(3.196f, -2.987f)
                lineToRelative(3.196f, 2.987f)
                curveToRelative(-0.121f, 0.325f, -0.196f, 0.672f, -0.196f, 1.038f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(11.534f, 11.0f)
                horizontalLineToRelative(6.931f)
                lineToRelative(-3.466f, 3.239f)
                lineToRelative(-3.466f, -3.239f)
                close()
            }
        }
        .build()
        return _stretcher!!
    }

private var _stretcher: ImageVector? = null
