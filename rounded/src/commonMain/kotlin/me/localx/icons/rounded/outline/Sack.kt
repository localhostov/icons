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

public val Icons.Outline.Sack: ImageVector
    get() {
        if (_sack != null) {
            return _sack!!
        }
        _sack = Builder(name = "Sack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.648f, 5.493f)
                curveToRelative(0.872f, -0.701f, 1.772f, -1.643f, 2.227f, -2.788f)
                curveToRelative(0.238f, -0.598f, 0.163f, -1.276f, -0.203f, -1.816f)
                curveToRelative(-0.377f, -0.557f, -1.002f, -0.889f, -1.672f, -0.889f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.67f, 0.0f, -1.295f, 0.333f, -1.672f, 0.889f)
                curveToRelative(-0.366f, 0.54f, -0.441f, 1.218f, -0.204f, 1.814f)
                curveToRelative(0.456f, 1.146f, 1.355f, 2.089f, 2.228f, 2.789f)
                curveTo(4.695f, 7.221f, 1.0f, 13.159f, 1.0f, 18.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                curveToRelative(0.0f, -4.841f, -3.695f, -10.779f, -8.352f, -12.507f)
                close()
                moveTo(15.016f, 1.965f)
                curveToRelative(-0.515f, 1.296f, -2.094f, 2.393f, -3.018f, 2.91f)
                curveToRelative(-0.923f, -0.513f, -2.495f, -1.6f, -2.999f, -2.875f)
                lineToRelative(6.017f, -0.035f)
                close()
                moveTo(16.999f, 22.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -5.243f, 4.71f, -11.0f, 9.0f, -11.0f)
                reflectiveCurveToRelative(9.0f, 5.757f, 9.0f, 11.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _sack!!
    }

private var _sack: ImageVector? = null
