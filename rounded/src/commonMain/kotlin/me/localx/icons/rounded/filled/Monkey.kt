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

public val Icons.Filled.Monkey: ImageVector
    get() {
        if (_monkey != null) {
            return _monkey!!
        }
        _monkey = Builder(name = "Monkey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.887f)
                curveToRelative(0.0f, -0.996f, 0.678f, -1.922f, 1.661f, -2.085f)
                curveToRelative(1.251f, -0.207f, 2.339f, 0.758f, 2.339f, 1.972f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 3.5f)
                curveToRelative(-0.126f, 0.0f, -0.249f, 0.015f, -0.368f, 0.037f)
                curveToRelative(-0.793f, -2.065f, -2.791f, -3.537f, -5.132f, -3.537f)
                reflectiveCurveToRelative(-4.339f, 1.472f, -5.132f, 3.537f)
                curveToRelative(-0.12f, -0.022f, -0.242f, -0.037f, -0.368f, -0.037f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.126f, 0.0f, 0.249f, -0.015f, 0.368f, -0.037f)
                curveToRelative(0.273f, 0.712f, 0.687f, 1.355f, 1.212f, 1.889f)
                curveToRelative(-5.969f, 1.487f, -8.107f, 7.479f, -8.502f, 11.687f)
                curveToRelative(-1.254f, -0.909f, -2.079f, -2.376f, -2.079f, -4.039f)
                lineTo(1.999f, 6.0f)
                curveToRelative(0.0f, -2.467f, 1.533f, -4.0f, 4.0f, -4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveTo(2.411f, 0.0f, 0.0f, 2.411f, 0.0f, 6.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(0.732f, 0.0f, 1.409f, 0.212f, 2.0f, 0.556f)
                verticalLineToRelative(-4.817f)
                curveToRelative(0.725f, -0.599f, 1.289f, -1.384f, 1.632f, -2.276f)
                curveToRelative(0.12f, 0.022f, 0.242f, 0.037f, 0.368f, 0.037f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _monkey!!
    }

private var _monkey: ImageVector? = null
