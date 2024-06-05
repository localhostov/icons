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

public val Icons.Filled.Equality: ImageVector
    get() {
        if (_equality != null) {
            return _equality!!
        }
        _equality = Builder(name = "Equality", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.944f, 12.669f)
                lineToRelative(-3.031f, -8.66f)
                curveToRelative(-0.42f, -1.202f, -1.559f, -2.01f, -2.832f, -2.01f)
                horizontalLineToRelative(-5.081f)
                lineTo(13.0f, 1.0f)
                curveToRelative(-0.006f, -1.308f, -1.995f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.919f, 2.0f)
                curveToRelative(-1.273f, 0.0f, -2.412f, 0.808f, -2.832f, 2.009f)
                lineTo(0.056f, 12.669f)
                curveToRelative(-0.037f, 0.106f, -0.056f, 0.632f, -0.056f, 0.632f)
                curveToRelative(0.0f, 2.506f, 1.871f, 4.567f, 4.26f, 4.692f)
                curveToRelative(1.241f, 0.069f, 2.434f, -0.371f, 3.338f, -1.229f)
                curveToRelative(0.892f, -0.846f, 1.402f, -2.036f, 1.402f, -3.264f)
                curveToRelative(0.0f, 0.0f, -0.021f, -0.732f, -0.061f, -0.842f)
                lineTo(5.794f, 4.008f)
                curveToRelative(0.041f, -0.005f, 0.083f, -0.008f, 0.125f, -0.008f)
                horizontalLineToRelative(5.081f)
                lineTo(11.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.308f, 0.006f, -1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(5.081f)
                curveToRelative(0.042f, 0.0f, 0.084f, 0.002f, 0.125f, 0.008f)
                lineToRelative(-3.146f, 8.65f)
                curveToRelative(-0.04f, 0.109f, -0.061f, 0.842f, -0.061f, 0.842f)
                curveToRelative(0.0f, 1.229f, 0.511f, 2.418f, 1.402f, 3.264f)
                curveToRelative(2.809f, 2.701f, 7.648f, 0.752f, 7.598f, -3.462f)
                curveToRelative(0.0f, 0.0f, -0.019f, -0.526f, -0.056f, -0.632f)
                close()
                moveTo(6.572f, 12.0f)
                lineTo(2.409f, 12.0f)
                lineToRelative(2.042f, -5.833f)
                lineToRelative(2.121f, 5.833f)
                close()
                moveTo(19.549f, 6.167f)
                lineToRelative(2.042f, 5.833f)
                horizontalLineToRelative(-4.163f)
                lineToRelative(2.121f, -5.833f)
                close()
            }
        }
        .build()
        return _equality!!
    }

private var _equality: ImageVector? = null
