package me.localx.icons.straight.bold

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

public val Icons.Bold.BoxTissue: ImageVector
    get() {
        if (_boxTissue != null) {
            return _boxTissue!!
        }
        _boxTissue = Builder(name = "BoxTissue", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 8.0f)
                horizontalLineToRelative(-0.434f)
                lineTo(21.232f, 0.017f)
                lineToRelative(-1.745f, -0.017f)
                curveToRelative(-1.227f, 0.0f, -2.168f, 0.788f, -2.793f, 1.312f)
                curveToRelative(-0.232f, 0.194f, -0.74f, 0.62f, -0.944f, 0.683f)
                curveToRelative(-0.204f, -0.062f, -0.712f, -0.488f, -0.944f, -0.683f)
                curveToRelative(-0.625f, -0.523f, -1.621f, -1.312f, -2.818f, -1.312f)
                curveToRelative(-1.227f, 0.0f, -2.168f, 0.788f, -2.793f, 1.312f)
                curveToRelative(-0.244f, 0.205f, -0.785f, 0.658f, -0.914f, 0.689f)
                curveToRelative(-0.189f, -0.031f, -0.73f, -0.484f, -0.975f, -0.689f)
                curveToRelative(-0.625f, -0.523f, -1.566f, -1.312f, -2.793f, -1.312f)
                lineToRelative(-1.745f, 0.017f)
                lineToRelative(1.166f, 7.983f)
                horizontalLineToRelative(-0.434f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(12.5f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 11.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8.265f, 5.0f)
                curveToRelative(1.213f, -0.012f, 2.114f, -0.767f, 2.771f, -1.318f)
                curveToRelative(0.243f, -0.204f, 0.779f, -0.652f, 0.962f, -0.683f)
                curveToRelative(0.187f, 0.03f, 0.723f, 0.479f, 0.966f, 0.683f)
                curveToRelative(0.657f, 0.552f, 1.559f, 1.307f, 2.771f, 1.318f)
                horizontalLineToRelative(0.029f)
                curveToRelative(0.695f, -0.007f, 1.289f, -0.258f, 1.792f, -0.575f)
                lineToRelative(-0.961f, 6.575f)
                horizontalLineToRelative(-3.886f)
                lineToRelative(-0.727f, -4.729f)
                lineToRelative(-2.965f, 0.457f)
                lineToRelative(0.657f, 4.271f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-0.961f, -6.577f)
                curveToRelative(0.507f, 0.318f, 1.107f, 0.57f, 1.821f, 0.577f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0.872f)
                lineToRelative(0.438f, 3.0f)
                horizontalLineToRelative(14.379f)
                lineToRelative(0.438f, -3.0f)
                horizontalLineToRelative(0.872f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
            }
        }
        .build()
        return _boxTissue!!
    }

private var _boxTissue: ImageVector? = null
