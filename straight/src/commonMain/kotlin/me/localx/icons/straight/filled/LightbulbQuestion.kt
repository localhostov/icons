package me.localx.icons.straight.filled

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

public val Icons.Filled.LightbulbQuestion: ImageVector
    get() {
        if (_lightbulbQuestion != null) {
            return _lightbulbQuestion!!
        }
        _lightbulbQuestion = Builder(name = "LightbulbQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.868f, 15.583f)
                curveToRelative(0.77f, 0.715f, 1.345f, 1.539f, 1.703f, 2.417f)
                horizontalLineToRelative(8.839f)
                curveToRelative(0.328f, -0.875f, 0.845f, -1.644f, 1.521f, -2.236f)
                curveToRelative(1.95f, -1.71f, 3.068f, -4.175f, 3.068f, -6.764f)
                curveToRelative(0.0f, -2.56f, -1.096f, -5.007f, -3.006f, -6.713f)
                curveTo(16.086f, 0.582f, 13.517f, -0.227f, 10.956f, 0.059f)
                curveTo(6.904f, 0.517f, 3.59f, 3.781f, 3.075f, 7.821f)
                curveToRelative(-0.374f, 2.933f, 0.644f, 5.761f, 2.793f, 7.762f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.072f, 4.701f)
                curveToRelative(0.681f, -0.572f, 1.578f, -0.814f, 2.464f, -0.653f)
                curveToRelative(1.21f, 0.211f, 2.205f, 1.206f, 2.417f, 2.418f)
                curveToRelative(0.224f, 1.271f, -0.381f, 2.542f, -1.506f, 3.163f)
                curveToRelative(-0.188f, 0.103f, -0.447f, 0.563f, -0.447f, 0.876f)
                verticalLineToRelative(0.495f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.495f)
                curveToRelative(0.0f, -1.033f, 0.637f, -2.163f, 1.481f, -2.628f)
                curveToRelative(0.289f, -0.16f, 0.595f, -0.535f, 0.502f, -1.065f)
                curveToRelative(-0.069f, -0.393f, -0.402f, -0.726f, -0.793f, -0.794f)
                curveToRelative(-0.31f, -0.058f, -0.603f, 0.021f, -0.832f, 0.216f)
                curveToRelative(-0.228f, 0.19f, -0.358f, 0.47f, -0.358f, 0.767f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.889f, 0.391f, -1.727f, 1.072f, -2.299f)
                close()
                moveTo(16.007f, 20.0f)
                curveToRelative(-0.005f, 0.105f, -0.007f, 0.21f, -0.007f, 0.315f)
                verticalLineToRelative(3.685f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.851f)
                curveToRelative(0.0f, -0.05f, 0.0f, -0.1f, -0.002f, -0.149f)
                horizontalLineToRelative(8.009f)
                close()
            }
        }
        .build()
        return _lightbulbQuestion!!
    }

private var _lightbulbQuestion: ImageVector? = null
