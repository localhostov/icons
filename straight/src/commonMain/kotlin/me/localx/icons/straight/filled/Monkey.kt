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
                moveToRelative(20.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 5.5f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.126f, 0.0f, -0.249f, -0.015f, -0.368f, -0.037f)
                curveToRelative(-0.343f, 0.893f, -0.907f, 1.677f, -1.632f, 2.276f)
                verticalLineToRelative(4.817f)
                curveToRelative(-0.591f, -0.344f, -1.268f, -0.556f, -2.0f, -0.556f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                lineTo(0.0f, 6.0f)
                curveTo(0.0f, 2.411f, 2.411f, 0.0f, 6.0f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-2.467f, 0.0f, -4.0f, 1.533f, -4.0f, 4.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.664f, 0.825f, 3.13f, 2.079f, 4.039f)
                curveToRelative(0.395f, -4.209f, 2.533f, -10.201f, 8.502f, -11.687f)
                curveToRelative(-0.526f, -0.535f, -0.939f, -1.177f, -1.212f, -1.889f)
                curveToRelative(-0.12f, 0.022f, -0.242f, 0.037f, -0.368f, 0.037f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.126f, 0.0f, 0.249f, 0.015f, 0.368f, 0.037f)
                curveToRelative(0.793f, -2.065f, 2.791f, -3.537f, 5.132f, -3.537f)
                reflectiveCurveToRelative(4.339f, 1.472f, 5.132f, 3.537f)
                curveToRelative(0.12f, -0.022f, 0.242f, -0.037f, 0.368f, -0.037f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _monkey!!
    }

private var _monkey: ImageVector? = null
