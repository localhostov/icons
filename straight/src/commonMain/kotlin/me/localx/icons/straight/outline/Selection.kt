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

public val Icons.Outline.Selection: ImageVector
    get() {
        if (_selection != null) {
            return _selection!!
        }
        _selection = Builder(name = "Selection", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(3.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveTo(4.105f, 0.0f, 3.0f, 0.0f)
                reflectiveCurveTo(1.0f, 0.895f, 1.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(22.5f, 5.0f)
                horizontalLineToRelative(-2.569f)
                curveToRelative(0.041f, 0.328f, 0.069f, 0.661f, 0.069f, 1.0f)
                curveToRelative(0.0f, 0.692f, -0.097f, 1.36f, -0.262f, 2.0f)
                horizontalLineToRelative(4.262f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(0.0f, -0.339f, 0.028f, -0.672f, 0.069f, -1.0f)
                lineTo(1.5f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.262f)
                curveToRelative(-0.165f, -0.64f, -0.262f, -1.308f, -0.262f, -2.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(14.949f, 17.39f)
                lineToRelative(7.0f, 2.615f)
                verticalLineToRelative(3.995f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.607f)
                lineToRelative(-7.0f, -2.615f)
                verticalLineToRelative(-5.67f)
                curveToRelative(0.0f, -0.537f, -0.362f, -1.017f, -0.825f, -1.093f)
                curveToRelative(-0.304f, -0.049f, -0.596f, 0.03f, -0.823f, 0.224f)
                curveToRelative(-0.224f, 0.19f, -0.353f, 0.468f, -0.353f, 0.762f)
                verticalLineToRelative(10.712f)
                reflectiveCurveToRelative(-4.3f, -3.425f, -4.32f, -3.443f)
                curveToRelative(-0.402f, -0.373f, -1.034f, -0.354f, -1.41f, 0.048f)
                curveToRelative(-0.377f, 0.403f, -0.356f, 1.038f, 0.046f, 1.416f)
                lineToRelative(2.352f, 2.268f)
                horizontalLineToRelative(-2.881f)
                lineToRelative(-0.849f, -0.818f)
                curveToRelative(-1.196f, -1.12f, -1.26f, -3.022f, -0.13f, -4.23f)
                curveToRelative(1.114f, -1.193f, 2.98f, -1.269f, 4.19f, -0.185f)
                lineToRelative(1.001f, 0.797f)
                verticalLineToRelative(-6.563f)
                curveToRelative(0.0f, -0.569f, 0.161f, -1.118f, 0.455f, -1.589f)
                curveToRelative(-2.062f, -0.987f, -3.404f, -3.08f, -3.404f, -5.411f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 2.386f, -1.383f, 4.497f, -3.509f, 5.461f)
                curveToRelative(0.29f, 0.482f, 0.458f, 1.048f, 0.458f, 1.646f)
                verticalLineToRelative(4.283f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(0.0f, 1.0f, 0.37f, 1.934f, 1.0f, 2.648f)
                verticalLineToRelative(-0.148f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.153f)
                curveToRelative(0.63f, -0.713f, 1.0f, -1.646f, 1.0f, -2.653f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _selection!!
    }

private var _selection: ImageVector? = null
