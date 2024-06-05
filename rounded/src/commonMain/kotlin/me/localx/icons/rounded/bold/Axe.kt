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

public val Icons.Bold.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.383f, 6.326f)
                curveToRelative(-0.42f, -0.493f, -1.031f, -0.795f, -1.676f, -0.829f)
                curveToRelative(-0.674f, -0.035f, -1.281f, -0.145f, -1.77f, -0.313f)
                lineToRelative(0.624f, -0.624f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-0.827f, 0.827f)
                lineToRelative(-1.232f, -1.237f)
                curveToRelative(-0.661f, -0.663f, -1.54f, -1.029f, -2.476f, -1.03f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.935f, 0.0f, -1.814f, 0.364f, -2.475f, 1.025f)
                lineToRelative(-1.401f, 1.401f)
                curveToRelative(-1.362f, 1.362f, -1.364f, 3.581f, -0.005f, 4.945f)
                lineToRelative(1.241f, 1.246f)
                lineTo(0.439f, 20.439f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(10.612f, -10.612f)
                curveToRelative(0.168f, 0.489f, 0.28f, 1.098f, 0.319f, 1.774f)
                curveToRelative(0.038f, 0.642f, 0.341f, 1.249f, 0.833f, 1.665f)
                curveToRelative(0.432f, 0.366f, 0.985f, 0.566f, 1.549f, 0.566f)
                curveToRelative(4.285f, -0.458f, 7.604f, -3.536f, 8.067f, -7.822f)
                curveToRelative(0.069f, -0.651f, -0.134f, -1.31f, -0.558f, -1.807f)
                close()
                moveTo(16.426f, 12.863f)
                curveToRelative(-0.155f, -1.324f, -0.583f, -2.901f, -1.661f, -3.979f)
                lineToRelative(-2.62f, -2.63f)
                curveToRelative(-0.194f, -0.195f, -0.193f, -0.512f, 0.0f, -0.707f)
                lineToRelative(1.401f, -1.401f)
                curveToRelative(0.127f, -0.127f, 0.276f, -0.146f, 0.354f, -0.146f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.078f, 0.0f, 0.227f, 0.019f, 0.354f, 0.147f)
                lineToRelative(2.616f, 2.626f)
                curveToRelative(1.089f, 1.089f, 2.667f, 1.513f, 3.99f, 1.663f)
                curveToRelative(-0.471f, 2.325f, -2.108f, 3.959f, -4.435f, 4.426f)
                close()
                moveTo(15.873f, 15.954f)
                curveToRelative(0.084f, 0.0f, -0.084f, 0.009f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
