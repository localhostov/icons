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

public val Icons.Filled.StarSharpHalfStroke: ImageVector
    get() {
        if (_starSharpHalfStroke != null) {
            return _starSharpHalfStroke!!
        }
        _starSharpHalfStroke = Builder(name = "StarSharpHalfStroke", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.836f, 8.599f)
                curveToRelative(-0.338f, -1.025f, -1.344f, -2.222f, -3.067f, -2.222f)
                horizontalLineToRelative(-4.368f)
                lineToRelative(-1.327f, -4.138f)
                curveToRelative(-0.531f, -1.653f, -1.987f, -2.239f, -3.073f, -2.239f)
                reflectiveCurveToRelative(-2.542f, 0.587f, -3.072f, 2.24f)
                lineToRelative(-1.327f, 4.137f)
                lineTo(3.231f, 6.377f)
                curveToRelative(-1.733f, 0.0f, -2.735f, 1.199f, -3.064f, 2.219f)
                curveToRelative(-0.34f, 1.028f, -0.24f, 2.591f, 1.16f, 3.612f)
                lineToRelative(3.561f, 2.603f)
                lineToRelative(-1.352f, 4.184f)
                curveToRelative(-0.535f, 1.652f, 0.302f, 2.978f, 1.18f, 3.608f)
                curveToRelative(0.487f, 0.352f, 1.17f, 0.625f, 1.919f, 0.625f)
                curveToRelative(0.607f, 0.0f, 1.258f, -0.179f, 1.882f, -0.641f)
                lineToRelative(3.483f, -2.56f)
                lineToRelative(3.481f, 2.559f)
                curveToRelative(1.14f, 0.837f, 2.714f, 0.81f, 3.792f, 0.024f)
                curveToRelative(0.885f, -0.632f, 1.727f, -1.958f, 1.19f, -3.615f)
                lineToRelative(-1.352f, -4.184f)
                lineToRelative(3.56f, -2.602f)
                curveToRelative(1.395f, -1.017f, 1.499f, -2.578f, 1.164f, -3.61f)
                close()
                moveTo(21.493f, 10.594f)
                lineToRelative(-4.145f, 3.029f)
                curveToRelative(-0.349f, 0.254f, -0.494f, 0.704f, -0.361f, 1.115f)
                lineToRelative(1.574f, 4.873f)
                curveToRelative(0.263f, 0.812f, -0.329f, 1.285f, -0.458f, 1.377f)
                curveToRelative(-0.406f, 0.296f, -0.98f, 0.322f, -1.438f, -0.013f)
                lineToRelative(-4.074f, -2.995f)
                curveToRelative(-0.176f, -0.129f, -0.384f, -0.194f, -0.592f, -0.194f)
                lineTo(11.999f, 2.0f)
                curveToRelative(0.27f, 0.0f, 0.922f, 0.083f, 1.169f, 0.851f)
                lineToRelative(1.55f, 4.832f)
                curveToRelative(0.133f, 0.414f, 0.518f, 0.694f, 0.952f, 0.694f)
                horizontalLineToRelative(5.098f)
                curveToRelative(0.802f, 0.0f, 1.083f, 0.593f, 1.166f, 0.844f)
                curveToRelative(0.083f, 0.255f, 0.206f, 0.9f, -0.441f, 1.373f)
                close()
            }
        }
        .build()
        return _starSharpHalfStroke!!
    }

private var _starSharpHalfStroke: ImageVector? = null
