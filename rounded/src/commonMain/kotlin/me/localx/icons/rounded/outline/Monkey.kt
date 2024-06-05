package me.localx.icons.rounded.outline

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
                curveToRelative(-0.124f, 0.0f, -0.246f, 0.012f, -0.364f, 0.034f)
                curveToRelative(-0.793f, -2.064f, -2.796f, -3.534f, -5.136f, -3.534f)
                reflectiveCurveToRelative(-4.343f, 1.469f, -5.136f, 3.534f)
                curveToRelative(-0.118f, -0.022f, -0.239f, -0.034f, -0.364f, -0.034f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.124f, 0.0f, 0.246f, -0.012f, 0.364f, -0.034f)
                curveToRelative(0.272f, 0.707f, 0.685f, 1.344f, 1.206f, 1.877f)
                curveToRelative(-5.968f, 1.488f, -8.105f, 7.498f, -8.499f, 11.706f)
                curveToRelative(-1.254f, -0.909f, -2.071f, -2.386f, -2.071f, -4.049f)
                lineTo(2.0f, 6.0f)
                curveToRelative(0.0f, -2.467f, 1.533f, -4.0f, 4.0f, -4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveTo(2.411f, 0.0f, 0.0f, 2.411f, 0.0f, 6.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -0.082f, -0.01f, -0.161f, -0.029f, -0.237f)
                curveToRelative(0.738f, -0.602f, 1.318f, -1.392f, 1.665f, -2.296f)
                curveToRelative(0.118f, 0.022f, 0.239f, 0.034f, 0.364f, 0.034f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 22.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(3.338f)
                curveToRelative(-0.455f, -0.217f, -0.964f, -0.338f, -1.5f, -0.338f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.334f, 0.0f, -0.661f, -0.033f, -0.978f, -0.096f)
                curveToRelative(0.146f, -2.383f, 1.247f, -10.904f, 9.478f, -10.904f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(16.5f, 9.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _monkey!!
    }

private var _monkey: ImageVector? = null
