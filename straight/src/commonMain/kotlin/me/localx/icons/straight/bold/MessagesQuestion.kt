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

public val Icons.Bold.MessagesQuestion: ImageVector
    get() {
        if (_messagesQuestion != null) {
            return _messagesQuestion!!
        }
        _messagesQuestion = Builder(name = "MessagesQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 5.003f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.502f)
                curveTo(18.0f, 1.571f, 16.43f, 0.0f, 14.498f, 0.0f)
                lineTo(3.499f, 0.005f)
                curveTo(1.569f, 0.007f, 0.0f, 1.578f, 0.0f, 3.508f)
                lineToRelative(0.005f, 13.621f)
                curveToRelative(0.0f, 1.032f, 0.838f, 1.872f, 1.868f, 1.872f)
                curveToRelative(0.184f, 0.0f, 0.366f, -0.027f, 0.542f, -0.081f)
                lineToRelative(3.585f, -1.497f)
                verticalLineToRelative(4.58f)
                horizontalLineToRelative(11.0f)
                lineToRelative(4.443f, 1.863f)
                lineToRelative(0.179f, 0.062f)
                curveToRelative(0.168f, 0.047f, 0.338f, 0.07f, 0.505f, 0.07f)
                curveToRelative(1.029f, 0.0f, 1.867f, -0.84f, 1.867f, -1.871f)
                lineToRelative(0.006f, -13.626f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.499f, -3.5f, -3.499f)
                close()
                moveTo(3.0f, 3.506f)
                curveToRelative(0.0f, -0.271f, 0.229f, -0.501f, 0.5f, -0.501f)
                lineToRelative(10.999f, -0.004f)
                curveToRelative(0.276f, 0.0f, 0.501f, 0.225f, 0.501f, 0.5f)
                verticalLineToRelative(10.504f)
                lineTo(6.396f, 14.005f)
                lineToRelative(-3.392f, 1.423f)
                lineToRelative(-0.005f, -11.922f)
                close()
                moveTo(20.995f, 20.426f)
                lineToRelative(-3.392f, -1.423f)
                horizontalLineToRelative(-8.604f)
                verticalLineToRelative(-1.998f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.002f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.498f)
                lineToRelative(-0.005f, 11.925f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                curveToRelative(0.681f, -0.572f, 1.577f, -0.814f, 2.463f, -0.653f)
                curveToRelative(1.209f, 0.211f, 2.204f, 1.205f, 2.417f, 2.417f)
                curveToRelative(0.223f, 1.272f, -0.382f, 2.543f, -1.506f, 3.164f)
                curveToRelative(-0.447f, 0.246f, -0.447f, 0.318f, -0.447f, 0.371f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.308f, 1.038f, -1.879f, 1.481f, -2.123f)
                curveToRelative(0.29f, -0.159f, 0.595f, -0.535f, 0.502f, -1.066f)
                curveToRelative(-0.069f, -0.392f, -0.402f, -0.725f, -0.793f, -0.793f)
                curveToRelative(-0.306f, -0.056f, -0.602f, 0.022f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _messagesQuestion!!
    }

private var _messagesQuestion: ImageVector? = null
