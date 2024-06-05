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

public val Icons.Bold.ClockTen: ImageVector
    get() {
        if (_clockTen != null) {
            return _clockTen!!
        }
        _clockTen = Builder(name = "ClockTen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveTo(16.962f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(13.25f, 13.799f)
                curveToRelative(0.464f, -0.268f, 0.75f, -0.763f, 0.75f, -1.299f)
                lineTo(14.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(3.401f)
                lineToRelative(-1.214f, -0.7f)
                curveToRelative(-0.717f, -0.414f, -1.634f, -0.168f, -2.049f, 0.549f)
                curveToRelative(-0.415f, 0.718f, -0.168f, 1.635f, 0.549f, 2.049f)
                lineToRelative(3.464f, 2.0f)
                curveToRelative(0.232f, 0.134f, 0.491f, 0.201f, 0.75f, 0.201f)
                reflectiveCurveToRelative(0.518f, -0.067f, 0.75f, -0.201f)
                close()
            }
        }
        .build()
        return _clockTen!!
    }

private var _clockTen: ImageVector? = null
