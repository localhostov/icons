package me.localx.icons.straight.outline

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

public val Icons.Outline.Monkey: ImageVector
    get() {
        if (_monkey != null) {
            return _monkey!!
        }
        _monkey = Builder(name = "Monkey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 3.5f)
                curveToRelative(-0.126f, 0.0f, -0.249f, 0.015f, -0.369f, 0.037f)
                curveToRelative(-0.793f, -2.065f, -2.791f, -3.537f, -5.131f, -3.537f)
                reflectiveCurveToRelative(-4.339f, 1.472f, -5.131f, 3.537f)
                curveToRelative(-0.12f, -0.022f, -0.242f, -0.037f, -0.369f, -0.037f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.126f, 0.0f, 0.249f, -0.015f, 0.368f, -0.037f)
                curveToRelative(0.273f, 0.712f, 0.687f, 1.355f, 1.213f, 1.889f)
                curveToRelative(-5.969f, 1.487f, -8.107f, 7.479f, -8.502f, 11.687f)
                curveToRelative(-1.254f, -0.909f, -2.079f, -2.376f, -2.079f, -4.039f)
                lineTo(2.0f, 6.0f)
                curveToRelative(0.0f, -2.467f, 1.533f, -4.0f, 4.0f, -4.0f)
                lineTo(6.0f, 0.0f)
                curveTo(2.411f, 0.0f, 0.0f, 2.411f, 0.0f, 6.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-12.261f)
                curveToRelative(0.725f, -0.6f, 1.289f, -1.384f, 1.632f, -2.276f)
                curveToRelative(0.12f, 0.022f, 0.242f, 0.037f, 0.368f, 0.037f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(18.0f, 14.351f)
                curveToRelative(-0.456f, -0.219f, -0.961f, -0.351f, -1.5f, -0.351f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.335f, 0.0f, -0.661f, -0.036f, -0.977f, -0.099f)
                curveToRelative(0.147f, -2.383f, 1.247f, -10.901f, 9.477f, -10.901f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.351f)
                close()
                moveTo(16.5f, 9.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _monkey!!
    }

private var _monkey: ImageVector? = null
