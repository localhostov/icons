package me.localx.icons.rounded.bold

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

public val Icons.Bold.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 9.439f)
                lineTo(14.561f, 0.439f)
                curveToRelative(-0.281f, -0.281f, -0.663f, -0.439f, -1.061f, -0.439f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.398f, 0.0f, -0.78f, 0.158f, -1.061f, 0.44f)
                lineToRelative(-0.363f, 0.363f)
                curveToRelative(-1.983f, 1.982f, -3.076f, 4.619f, -3.076f, 7.424f)
                verticalLineToRelative(0.373f)
                lineToRelative(-7.74f, 7.938f)
                curveToRelative(-1.683f, 1.71f, -1.672f, 4.48f, 0.025f, 6.177f)
                curveToRelative(0.829f, 0.829f, 1.929f, 1.284f, 3.1f, 1.284f)
                horizontalLineToRelative(0.018f)
                curveToRelative(1.178f, -0.005f, 2.282f, -0.47f, 3.113f, -1.314f)
                lineToRelative(4.118f, -4.224f)
                curveToRelative(0.062f, -0.045f, 0.121f, -0.096f, 0.177f, -0.151f)
                curveToRelative(0.065f, -0.065f, 0.122f, -0.134f, 0.172f, -0.206f)
                lineToRelative(3.026f, -3.104f)
                horizontalLineToRelative(0.763f)
                curveToRelative(2.805f, 0.0f, 5.441f, -1.092f, 7.426f, -3.076f)
                lineToRelative(0.364f, -0.364f)
                curveToRelative(0.585f, -0.586f, 0.584f, -1.535f, 0.0f, -2.12f)
                close()
                moveTo(10.722f, 15.1f)
                lineToRelative(-1.959f, -1.959f)
                lineToRelative(1.608f, -1.65f)
                lineToRelative(1.959f, 1.959f)
                lineToRelative(-1.608f, 1.65f)
                close()
                moveTo(5.374f, 20.586f)
                curveToRelative(-0.261f, 0.266f, -0.61f, 0.412f, -0.982f, 0.414f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-0.37f, 0.0f, -0.717f, -0.144f, -0.979f, -0.405f)
                curveToRelative(-0.536f, -0.536f, -0.54f, -1.411f, -0.003f, -1.956f)
                lineToRelative(3.266f, -3.349f)
                lineToRelative(1.959f, 1.959f)
                lineToRelative(-3.254f, 3.338f)
                close()
                moveTo(15.773f, 12.0f)
                horizontalLineToRelative(-0.651f)
                lineToRelative(-3.121f, -3.121f)
                verticalLineToRelative(-0.651f)
                curveToRelative(0.0f, -1.671f, 0.543f, -3.258f, 1.545f, -4.561f)
                lineToRelative(6.789f, 6.788f)
                curveToRelative(-1.303f, 1.002f, -2.891f, 1.545f, -4.562f, 1.545f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
