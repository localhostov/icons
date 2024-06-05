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

public val Icons.Bold.PenSwirl: ImageVector
    get() {
        if (_penSwirl != null) {
            return _penSwirl!!
        }
        _penSwirl = Builder(name = "PenSwirl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.311f, 23.229f)
                curveToRelative(-0.274f, 0.493f, -0.785f, 0.771f, -1.312f, 0.771f)
                curveToRelative(-0.247f, 0.0f, -0.496f, -0.061f, -0.727f, -0.188f)
                curveTo(2.65f, 21.244f, 0.0f, 16.938f, 0.0f, 12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(0.574f, 0.0f, 1.151f, 0.041f, 1.713f, 0.122f)
                curveToRelative(0.82f, 0.117f, 1.389f, 0.878f, 1.271f, 1.697f)
                curveToRelative(-0.118f, 0.821f, -0.875f, 1.395f, -1.698f, 1.271f)
                curveToRelative(-0.421f, -0.061f, -0.854f, -0.091f, -1.287f, -0.091f)
                curveTo(7.038f, 3.0f, 3.0f, 7.037f, 3.0f, 12.0f)
                curveToRelative(0.0f, 3.817f, 2.088f, 7.166f, 5.729f, 9.188f)
                curveToRelative(0.724f, 0.402f, 0.985f, 1.315f, 0.583f, 2.04f)
                close()
                moveTo(22.181f, 9.016f)
                curveToRelative(-0.82f, 0.117f, -1.39f, 0.877f, -1.272f, 1.697f)
                curveToRelative(0.061f, 0.422f, 0.091f, 0.855f, 0.091f, 1.287f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                curveToRelative(-2.599f, 0.0f, -4.789f, -2.026f, -4.985f, -4.614f)
                curveToRelative(-0.063f, -0.825f, -0.789f, -1.445f, -1.609f, -1.382f)
                curveToRelative(-0.826f, 0.063f, -1.445f, 0.784f, -1.382f, 1.61f)
                curveToRelative(0.315f, 4.142f, 3.819f, 7.386f, 7.977f, 7.386f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -0.574f, -0.041f, -1.15f, -0.122f, -1.713f)
                curveToRelative(-0.118f, -0.82f, -0.875f, -1.395f, -1.698f, -1.271f)
                close()
                moveTo(13.026f, 9.545f)
                verticalLineToRelative(0.955f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.955f)
                curveToRelative(1.149f, 0.0f, 2.252f, -0.457f, 3.064f, -1.269f)
                lineToRelative(5.715f, -5.715f)
                curveToRelative(0.85f, -0.85f, 1.013f, -2.236f, 0.252f, -3.167f)
                curveToRelative(-0.875f, -1.07f, -2.456f, -1.129f, -3.409f, -0.176f)
                lineToRelative(-5.808f, 5.808f)
                curveToRelative(-0.813f, 0.813f, -1.269f, 1.915f, -1.269f, 3.064f)
                close()
            }
        }
        .build()
        return _penSwirl!!
    }

private var _penSwirl: ImageVector? = null
