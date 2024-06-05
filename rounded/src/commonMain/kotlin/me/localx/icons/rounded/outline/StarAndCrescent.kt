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

public val Icons.Outline.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.028f, 20.443f)
                curveToRelative(-2.914f, -1.67f, -6.028f, -4.765f, -6.028f, -8.443f)
                reflectiveCurveToRelative(3.112f, -6.771f, 6.025f, -8.441f)
                curveToRelative(0.732f, -0.42f, 1.124f, -1.244f, 0.929f, -2.042f)
                curveTo(15.62f, 0.152f, 14.14f, 0.047f, 14.14f, 0.047f)
                curveTo(7.615f, -0.467f, 1.833f, 3.33f, 0.372f, 9.076f)
                curveToRelative(-0.902f, 3.547f, -0.166f, 7.087f, 2.073f, 9.966f)
                curveToRelative(2.414f, 3.105f, 6.308f, 4.958f, 10.415f, 4.958f)
                curveToRelative(0.462f, 0.0f, 0.907f, -0.015f, 1.344f, -0.051f)
                curveToRelative(0.868f, -0.073f, 1.572f, -0.668f, 1.752f, -1.481f)
                curveToRelative(0.179f, -0.805f, -0.186f, -1.6f, -0.928f, -2.025f)
                close()
                moveTo(12.86f, 22.001f)
                curveToRelative(-3.495f, 0.0f, -6.798f, -1.565f, -8.836f, -4.187f)
                curveToRelative(-1.852f, -2.381f, -2.461f, -5.31f, -1.715f, -8.245f)
                curveTo(3.455f, 5.065f, 7.846f, 2.0f, 12.961f, 2.0f)
                curveToRelative(0.243f, 0.0f, 0.488f, 0.007f, 0.734f, 0.021f)
                curveToRelative(-3.298f, 1.995f, -6.695f, 5.597f, -6.695f, 9.979f)
                reflectiveCurveToRelative(3.392f, 7.978f, 6.696f, 9.98f)
                curveToRelative(-0.272f, 0.015f, -0.551f, 0.021f, -0.836f, 0.021f)
                close()
                moveTo(23.703f, 11.497f)
                lineToRelative(-1.971f, 1.606f)
                lineToRelative(0.815f, 2.484f)
                curveToRelative(0.112f, 0.336f, -0.002f, 0.706f, -0.282f, 0.922f)
                curveToRelative(-0.281f, 0.216f, -0.667f, 0.231f, -0.964f, 0.038f)
                lineToRelative(-2.295f, -1.495f)
                lineToRelative(-2.257f, 1.51f)
                curveToRelative(-0.14f, 0.094f, -0.302f, 0.141f, -0.463f, 0.141f)
                curveToRelative(-0.176f, 0.0f, -0.352f, -0.056f, -0.5f, -0.166f)
                curveToRelative(-0.283f, -0.212f, -0.401f, -0.58f, -0.295f, -0.917f)
                lineToRelative(0.784f, -2.513f)
                lineToRelative(-1.981f, -1.612f)
                curveToRelative(-0.267f, -0.226f, -0.364f, -0.594f, -0.243f, -0.922f)
                curveToRelative(0.12f, -0.328f, 0.433f, -0.546f, 0.782f, -0.546f)
                horizontalLineToRelative(2.501f)
                lineToRelative(0.885f, -2.483f)
                curveToRelative(0.121f, -0.326f, 0.433f, -0.542f, 0.781f, -0.542f)
                reflectiveCurveToRelative(0.66f, 0.216f, 0.781f, 0.542f)
                lineToRelative(0.885f, 2.483f)
                horizontalLineToRelative(2.501f)
                curveToRelative(0.35f, 0.0f, 0.663f, 0.219f, 0.783f, 0.548f)
                curveToRelative(0.12f, 0.329f, 0.022f, 0.698f, -0.246f, 0.923f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
