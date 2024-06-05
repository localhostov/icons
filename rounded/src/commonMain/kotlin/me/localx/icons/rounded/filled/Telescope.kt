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

public val Icons.Filled.Telescope: ImageVector
    get() {
        if (_telescope != null) {
            return _telescope!!
        }
        _telescope = Builder(name = "Telescope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.905f, 9.074f)
                lineTo(19.905f, 0.574f)
                curveToRelative(-0.236f, -0.5f, -0.83f, -0.713f, -1.331f, -0.479f)
                curveToRelative(-0.5f, 0.235f, -0.714f, 0.831f, -0.479f, 1.331f)
                lineToRelative(0.362f, 0.769f)
                lineTo(5.269f, 7.815f)
                curveToRelative(-1.652f, 0.708f, -2.536f, 2.481f, -2.194f, 4.181f)
                lineToRelative(-2.477f, 1.087f)
                curveToRelative(-0.506f, 0.223f, -0.736f, 0.812f, -0.514f, 1.318f)
                curveToRelative(0.165f, 0.375f, 0.531f, 0.598f, 0.916f, 0.598f)
                curveToRelative(0.134f, 0.0f, 0.271f, -0.027f, 0.401f, -0.084f)
                lineToRelative(2.579f, -1.132f)
                curveToRelative(0.373f, 0.408f, 0.836f, 0.731f, 1.364f, 0.944f)
                curveToRelative(0.453f, 0.183f, 0.928f, 0.274f, 1.401f, 0.274f)
                curveToRelative(0.5f, 0.0f, 0.999f, -0.102f, 1.472f, -0.305f)
                lineToRelative(3.322f, -1.415f)
                lineToRelative(-4.441f, 9.287f)
                curveToRelative(-0.238f, 0.498f, -0.027f, 1.096f, 0.471f, 1.334f)
                curveToRelative(0.498f, 0.237f, 1.095f, 0.027f, 1.334f, -0.471f)
                lineToRelative(4.598f, -9.614f)
                lineToRelative(4.598f, 9.614f)
                curveToRelative(0.172f, 0.358f, 0.53f, 0.568f, 0.903f, 0.568f)
                curveToRelative(0.145f, 0.0f, 0.292f, -0.031f, 0.431f, -0.098f)
                curveToRelative(0.498f, -0.238f, 0.709f, -0.836f, 0.471f, -1.334f)
                lineToRelative(-5.105f, -10.675f)
                lineToRelative(6.851f, -2.919f)
                lineToRelative(0.448f, 0.951f)
                curveToRelative(0.17f, 0.362f, 0.53f, 0.574f, 0.905f, 0.574f)
                curveToRelative(0.143f, 0.0f, 0.288f, -0.03f, 0.425f, -0.095f)
                curveToRelative(0.5f, -0.235f, 0.714f, -0.831f, 0.479f, -1.331f)
                close()
            }
        }
        .build()
        return _telescope!!
    }

private var _telescope: ImageVector? = null
