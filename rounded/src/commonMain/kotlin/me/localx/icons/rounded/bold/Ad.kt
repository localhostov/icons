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

public val Icons.Bold.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                curveToRelative(-0.007f, 1.307f, -1.993f, 1.307f, -2.0f, 0.0f)
                curveToRelative(0.007f, -1.307f, 1.993f, -1.307f, 2.0f, 0.0f)
                close()
                moveTo(6.688f, 14.0f)
                horizontalLineToRelative(1.625f)
                lineToRelative(-0.812f, -2.553f)
                lineToRelative(-0.812f, 2.553f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                lineTo(0.0f, 7.0f)
                curveTo(0.0f, 4.239f, 2.239f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(12.429f, 17.045f)
                lineToRelative(-3.5f, -11.0f)
                curveToRelative(-0.386f, -1.368f, -2.473f, -1.368f, -2.858f, 0.0f)
                lineToRelative(-3.5f, 11.0f)
                curveToRelative(-0.251f, 0.789f, 0.185f, 1.633f, 0.975f, 1.884f)
                curveToRelative(0.786f, 0.252f, 1.633f, -0.185f, 1.884f, -0.975f)
                lineToRelative(0.304f, -0.955f)
                horizontalLineToRelative(3.534f)
                lineToRelative(0.304f, 0.955f)
                curveToRelative(0.249f, 0.796f, 1.116f, 1.226f, 1.884f, 0.975f)
                curveToRelative(0.79f, -0.251f, 1.226f, -1.095f, 0.975f, -1.884f)
                close()
                moveTo(21.0f, 6.5f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                verticalLineToRelative(4.642f)
                curveToRelative(-2.614f, -0.747f, -5.286f, 1.509f, -4.98f, 4.258f)
                curveToRelative(0.203f, 2.078f, 2.071f, 3.6f, 4.159f, 3.6f)
                horizontalLineToRelative(2.322f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(21.001f, 6.5f)
                close()
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
