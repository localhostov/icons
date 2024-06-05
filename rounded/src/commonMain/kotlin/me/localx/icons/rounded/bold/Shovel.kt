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

public val Icons.Bold.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 5.439f)
                lineTo(18.561f, 0.439f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(-8.129f, 8.129f)
                lineToRelative(-1.374f, -1.374f)
                curveToRelative(-0.997f, -0.998f, -2.62f, -0.998f, -3.617f, 0.0f)
                lineToRelative(-2.27f, 2.27f)
                curveToRelative(-1.605f, 1.605f, -2.49f, 3.74f, -2.49f, 6.011f)
                verticalLineToRelative(1.464f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.464f)
                curveToRelative(2.271f, 0.0f, 4.406f, -0.884f, 6.01f, -2.49f)
                lineToRelative(2.27f, -2.27f)
                curveToRelative(0.998f, -0.997f, 0.998f, -2.62f, 0.0f, -3.617f)
                lineToRelative(-1.374f, -1.374f)
                lineToRelative(8.129f, -8.129f)
                lineToRelative(1.439f, 1.439f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                close()
                moveTo(8.853f, 19.389f)
                curveToRelative(-1.038f, 1.039f, -2.419f, 1.611f, -3.889f, 1.611f)
                horizontalLineToRelative(-1.464f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-1.464f)
                curveToRelative(0.0f, -1.469f, 0.572f, -2.851f, 1.611f, -3.889f)
                lineToRelative(1.957f, -1.957f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-1.958f, 1.957f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
