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

public val Icons.Outline.Elephant: ImageVector
    get() {
        if (_elephant != null) {
            return _elephant!!
        }
        _elephant = Builder(name = "Elephant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.995f, 17.0f)
                verticalLineToRelative(2.899f)
                curveToRelative(0.0f, 1.523f, -1.084f, 2.84f, -2.522f, 3.063f)
                curveToRelative(-0.157f, 0.024f, -0.314f, 0.036f, -0.471f, 0.036f)
                curveToRelative(-0.711f, 0.0f, -1.399f, -0.249f, -1.941f, -0.713f)
                curveToRelative(-0.665f, -0.57f, -1.047f, -1.404f, -1.046f, -2.288f)
                verticalLineToRelative(-0.998f)
                horizontalLineToRelative(-1.995f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-6.002f)
                lineToRelative(0.009f, -4.0f)
                horizontalLineToRelative(-4.019f)
                lineToRelative(-0.01f, 4.0f)
                lineTo(0.0f, 22.999f)
                verticalLineToRelative(-14.0f)
                curveTo(0.0f, 5.691f, 2.691f, 3.0f, 6.0f, 3.0f)
                horizontalLineToRelative(1.532f)
                curveToRelative(1.099f, -1.227f, 2.695f, -2.0f, 4.468f, -2.0f)
                curveToRelative(2.508f, 0.0f, 4.764f, 1.609f, 5.618f, 3.958f)
                curveToRelative(1.488f, 1.012f, 2.397f, 2.7f, 2.396f, 4.494f)
                verticalLineToRelative(10.547f)
                curveToRelative(0.0f, 0.299f, 0.127f, 0.579f, 0.348f, 0.768f)
                curveToRelative(0.22f, 0.188f, 0.507f, 0.264f, 0.804f, 0.219f)
                curveToRelative(0.465f, -0.072f, 0.829f, -0.55f, 0.829f, -1.087f)
                verticalLineToRelative(-2.899f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.015f, 17.0f)
                verticalLineToRelative(-7.498f)
                curveToRelative(0.0f, -1.284f, -0.648f, -2.396f, -1.735f, -3.025f)
                lineToRelative(-0.348f, -0.201f)
                lineToRelative(-0.111f, -0.386f)
                curveToRelative(-0.495f, -1.702f, -2.065f, -2.891f, -3.82f, -2.891f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -0.701f, 0.121f, -1.374f, 0.343f, -2.0f)
                horizontalLineToRelative(-0.343f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.002f)
                lineToRelative(0.01f, -4.0f)
                horizontalLineToRelative(8.021f)
                lineToRelative(-0.01f, 4.0f)
                horizontalLineToRelative(1.997f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.995f)
                close()
            }
        }
        .build()
        return _elephant!!
    }

private var _elephant: ImageVector? = null
