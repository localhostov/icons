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

public val Icons.Bold.Omega: ImageVector
    get() {
        if (_omega != null) {
            return _omega!!
        }
        _omega = Builder(name = "Omega", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 24.0f)
                horizontalLineToRelative(-4.193f)
                curveToRelative(-1.823f, 0.0f, -3.307f, -1.483f, -3.307f, -3.307f)
                curveToRelative(0.0f, -1.207f, 0.649f, -2.311f, 1.695f, -2.881f)
                curveToRelative(2.695f, -1.472f, 4.305f, -4.019f, 4.305f, -6.812f)
                curveToRelative(0.0f, -4.411f, -4.037f, -8.0f, -9.0f, -8.0f)
                reflectiveCurveTo(3.0f, 6.589f, 3.0f, 11.0f)
                curveToRelative(0.0f, 2.794f, 1.609f, 5.341f, 4.305f, 6.812f)
                curveToRelative(1.045f, 0.57f, 1.695f, 1.675f, 1.695f, 2.881f)
                curveToRelative(0.0f, 1.823f, -1.483f, 3.307f, -3.307f, 3.307f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.193f)
                curveToRelative(0.169f, 0.0f, 0.307f, -0.138f, 0.307f, -0.307f)
                curveToRelative(0.0f, -0.106f, -0.052f, -0.204f, -0.132f, -0.248f)
                curveTo(2.193f, 18.44f, 0.0f, 14.909f, 0.0f, 11.0f)
                curveTo(0.0f, 4.935f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 4.935f, 12.0f, 11.0f)
                curveToRelative(0.0f, 3.909f, -2.193f, 7.44f, -5.867f, 9.445f)
                curveToRelative(-0.081f, 0.044f, -0.133f, 0.142f, -0.133f, 0.248f)
                curveToRelative(0.0f, 0.169f, 0.138f, 0.307f, 0.307f, 0.307f)
                horizontalLineToRelative(4.193f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _omega!!
    }

private var _omega: ImageVector? = null
