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

public val Icons.Filled.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.987f, 0.0f)
                horizontalLineTo(341.561f)
                curveToRelative(-11.755f, 0.0f, -21.285f, 9.53f, -21.285f, 21.285f)
                reflectiveCurveToRelative(9.53f, 21.285f, 21.285f, 21.285f)
                horizontalLineToRelative(97.614f)
                lineTo(293.754f, 187.991f)
                curveToRelative(-78.702f, -62.08f, -192.828f, -48.605f, -254.908f, 30.097f)
                reflectiveCurveTo(-9.758f, 410.916f, 68.944f, 472.996f)
                reflectiveCurveToRelative(192.828f, 48.605f, 254.908f, -30.097f)
                curveToRelative(51.995f, -65.917f, 51.995f, -158.893f, 0.0f, -224.81f)
                lineTo(469.272f, 72.668f)
                verticalLineToRelative(97.614f)
                curveToRelative(0.0f, 11.756f, 9.53f, 21.285f, 21.285f, 21.285f)
                curveToRelative(11.755f, 0.0f, 21.285f, -9.53f, 21.285f, -21.285f)
                verticalLineTo(63.856f)
                curveTo(511.842f, 28.589f, 483.253f, 0.0f, 447.987f, 0.0f)
                close()
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
