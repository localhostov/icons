package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.SmartHomeAlt: ImageVector
    get() {
        if (_smartHomeAlt != null) {
            return _smartHomeAlt!!
        }
        _smartHomeAlt = Builder(name = "SmartHomeAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.812f, 7.635f)
                lineTo(13.908f, 0.658f)
                curveToRelative(-1.123f, -0.881f, -2.692f, -0.879f, -3.815f, 0.0f)
                lineTo(1.188f, 7.635f)
                curveToRelative(-0.755f, 0.591f, -1.188f, 1.479f, -1.188f, 2.439f)
                verticalLineToRelative(13.926f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.96f, -0.433f, -1.849f, -1.188f, -2.439f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.215f, 1.21f, -4.149f, 3.0f, -5.188f)
                verticalLineToRelative(2.57f)
                curveToRelative(-0.615f, 0.703f, -1.0f, 1.612f, -1.0f, 2.618f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.005f, -0.385f, -1.914f, -1.0f, -2.618f)
                verticalLineToRelative(-2.57f)
                curveToRelative(1.79f, 1.039f, 3.0f, 2.973f, 3.0f, 5.188f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _smartHomeAlt!!
    }

private var _smartHomeAlt: ImageVector? = null
