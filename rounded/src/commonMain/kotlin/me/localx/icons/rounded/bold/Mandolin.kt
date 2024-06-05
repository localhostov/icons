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

public val Icons.Bold.Mandolin: ImageVector
    get() {
        if (_mandolin != null) {
            return _mandolin!!
        }
        _mandolin = Builder(name = "Mandolin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.487f, 1.602f)
                lineToRelative(-1.088f, -1.088f)
                curveToRelative(-0.604f, -0.604f, -1.557f, -0.685f, -2.254f, -0.19f)
                lineToRelative(-1.15f, 0.899f)
                curveToRelative(-0.636f, 0.497f, -1.045f, 1.23f, -1.134f, 2.032f)
                lineToRelative(-0.095f, 0.859f)
                lineToRelative(-1.886f, 1.886f)
                horizontalLineToRelative(-6.879f)
                curveTo(4.038f, 6.0f, 0.0f, 10.037f, 0.0f, 15.0f)
                curveToRelative(0.0f, 2.404f, 0.936f, 4.664f, 2.637f, 6.365f)
                curveToRelative(1.7f, 1.699f, 3.96f, 2.635f, 6.363f, 2.635f)
                curveToRelative(4.962f, 0.0f, 9.0f, -4.037f, 9.0f, -9.0f)
                verticalLineToRelative(-6.879f)
                lineToRelative(1.886f, -1.886f)
                lineToRelative(0.859f, -0.095f)
                curveToRelative(0.802f, -0.089f, 1.535f, -0.498f, 2.032f, -1.134f)
                lineToRelative(0.899f, -1.15f)
                curveToRelative(0.495f, -0.697f, 0.414f, -1.649f, -0.19f, -2.254f)
                close()
                moveTo(15.0f, 15.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                curveToRelative(-1.602f, 0.0f, -3.109f, -0.624f, -4.243f, -1.757f)
                curveToRelative(-1.133f, -1.134f, -1.757f, -2.641f, -1.757f, -4.243f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(3.879f)
                lineToRelative(-3.102f, 3.102f)
                curveToRelative(-0.248f, -0.066f, -0.508f, -0.102f, -0.777f, -0.102f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.269f, -0.036f, -0.529f, -0.102f, -0.777f)
                lineToRelative(3.102f, -3.102f)
                verticalLineToRelative(3.879f)
                close()
            }
        }
        .build()
        return _mandolin!!
    }

private var _mandolin: ImageVector? = null
