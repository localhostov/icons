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

public val Icons.Filled.AnatomicalHeart: ImageVector
    get() {
        if (_anatomicalHeart != null) {
            return _anatomicalHeart!!
        }
        _anatomicalHeart = Builder(name = "AnatomicalHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.221f, 8.919f)
                curveToRelative(-0.047f, 0.069f, -0.188f, 0.281f, 0.066f, 0.881f)
                curveToRelative(0.086f, 0.203f, 0.173f, 0.395f, 0.258f, 0.583f)
                curveToRelative(0.469f, 1.038f, 0.954f, 2.11f, 0.955f, 4.116f)
                curveToRelative(0.0f, 3.658f, -1.626f, 7.993f, -4.738f, 9.198f)
                curveToRelative(-0.523f, 0.202f, -1.084f, 0.303f, -1.693f, 0.303f)
                curveToRelative(-0.48f, 0.0f, -0.99f, -0.062f, -1.535f, -0.188f)
                curveToRelative(-6.277f, -1.443f, -10.498f, -5.797f, -10.53f, -10.846f)
                curveToRelative(0.013f, -2.144f, 1.251f, -3.955f, 2.969f, -4.65f)
                curveTo(4.687f, 3.253f, 1.325f, 1.999f, 1.177f, 1.946f)
                lineTo(1.816f, 0.051f)
                curveToRelative(0.202f, 0.067f, 4.713f, 1.66f, 5.141f, 7.982f)
                curveToRelative(1.895f, 0.163f, 3.063f, 1.279f, 3.554f, 1.88f)
                curveToRelative(-0.014f, 0.968f, -0.352f, 3.91f, -3.85f, 5.436f)
                curveToRelative(0.312f, 0.576f, 0.729f, 1.125f, 1.234f, 1.635f)
                curveToRelative(3.431f, -1.695f, 4.543f, -4.81f, 4.661f, -6.796f)
                curveToRelative(0.079f, -0.171f, 2.024f, -4.188f, 9.395f, -4.188f)
                horizontalLineToRelative(2.044f)
                lineToRelative(0.005f, 0.005f)
                verticalLineToRelative(2.0f)
                curveToRelative(-3.513f, -0.024f, -4.586f, 0.625f, -4.779f, 0.915f)
                close()
                moveTo(7.408f, 6.056f)
                curveToRelative(1.957f, 0.241f, 3.326f, 1.225f, 4.149f, 2.042f)
                curveToRelative(0.947f, -1.166f, 3.016f, -2.855f, 6.351f, -3.657f)
                lineToRelative(1.925f, -2.887f)
                lineToRelative(-1.664f, -1.109f)
                lineToRelative(-1.475f, 2.212f)
                curveToRelative(-0.498f, -0.281f, -1.058f, -0.481f, -1.693f, -0.576f)
                lineTo(15.001f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.087f)
                curveToRelative(-0.711f, 0.104f, -1.353f, 0.313f, -1.938f, 0.593f)
                lineToRelative(-1.447f, -2.294f)
                lineToRelative(-1.691f, 1.066f)
                lineToRelative(1.462f, 2.319f)
                curveToRelative(-0.86f, 0.734f, -1.522f, 1.572f, -1.978f, 2.286f)
                close()
            }
        }
        .build()
        return _anatomicalHeart!!
    }

private var _anatomicalHeart: ImageVector? = null
