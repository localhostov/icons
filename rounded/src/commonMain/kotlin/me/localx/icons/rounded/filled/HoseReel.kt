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

public val Icons.Filled.HoseReel: ImageVector
    get() {
        if (_hoseReel != null) {
            return _hoseReel!!
        }
        _hoseReel = Builder(name = "HoseReel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 4.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(13.0f, 11.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(23.969f, 17.209f)
                lineToRelative(-1.299f, 6.003f)
                curveToRelative(-0.1f, 0.46f, -0.507f, 0.789f, -0.977f, 0.789f)
                horizontalLineToRelative(-1.387f)
                curveToRelative(-0.471f, 0.0f, -0.878f, -0.328f, -0.977f, -0.788f)
                lineToRelative(-1.296f, -5.986f)
                curveToRelative(-0.22f, -1.155f, 0.665f, -2.225f, 1.841f, -2.225f)
                horizontalLineToRelative(0.125f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(2.0f, 6.037f, 2.0f, 11.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                curveToRelative(1.252f, 0.0f, 2.463f, -0.252f, 3.6f, -0.748f)
                curveToRelative(0.505f, -0.225f, 1.096f, 0.01f, 1.317f, 0.516f)
                curveToRelative(0.221f, 0.506f, -0.01f, 1.096f, -0.516f, 1.316f)
                curveToRelative(-1.391f, 0.608f, -2.872f, 0.916f, -4.401f, 0.916f)
                curveTo(4.935f, 22.0f, 0.0f, 17.065f, 0.0f, 11.0f)
                reflectiveCurveTo(4.935f, 0.0f, 11.0f, 0.0f)
                reflectiveCurveToRelative(11.0f, 4.935f, 11.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(0.125f)
                curveToRelative(1.169f, 0.0f, 2.053f, 1.058f, 1.844f, 2.209f)
                close()
            }
        }
        .build()
        return _hoseReel!!
    }

private var _hoseReel: ImageVector? = null
