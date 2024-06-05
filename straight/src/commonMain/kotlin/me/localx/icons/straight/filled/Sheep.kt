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

public val Icons.Filled.Sheep: ImageVector
    get() {
        if (_sheep != null) {
            return _sheep!!
        }
        _sheep = Builder(name = "Sheep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 5.097f)
                verticalLineToRelative(4.587f)
                curveToRelative(0.0f, 2.046f, 1.533f, 3.316f, 4.0f, 3.316f)
                reflectiveCurveToRelative(4.0f, -1.271f, 4.0f, -3.316f)
                verticalLineToRelative(-4.478f)
                curveToRelative(0.824f, -0.36f, 1.768f, -1.265f, 2.0f, -2.206f)
                curveToRelative(0.0f, 0.0f, -1.263f, -0.359f, -3.025f, -0.647f)
                curveToRelative(-0.733f, -0.823f, -1.789f, -1.352f, -2.975f, -1.352f)
                reflectiveCurveToRelative(-2.242f, 0.529f, -2.975f, 1.352f)
                curveToRelative(-1.763f, 0.288f, -3.025f, 0.647f, -3.025f, 0.647f)
                curveToRelative(0.221f, 0.897f, 0.896f, 1.57f, 2.0f, 2.098f)
                close()
                moveTo(23.027f, 12.786f)
                curveToRelative(0.135f, 0.385f, 0.223f, 0.789f, 0.223f, 1.215f)
                curveToRelative(0.0f, 1.41f, -0.791f, 2.672f, -2.0f, 3.308f)
                curveToRelative(-0.023f, 1.509f, -0.944f, 2.8f, -2.25f, 3.373f)
                verticalLineToRelative(3.319f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.236f)
                curveToRelative(-0.398f, 0.144f, -0.817f, 0.236f, -1.25f, 0.236f)
                curveToRelative(-0.768f, 0.0f, -1.505f, -0.237f, -2.125f, -0.671f)
                curveToRelative(-0.62f, 0.434f, -1.357f, 0.671f, -2.125f, 0.671f)
                curveToRelative(-0.17f, 0.0f, -0.334f, -0.029f, -0.5f, -0.052f)
                verticalLineToRelative(2.052f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.076f)
                curveToRelative(-1.691f, -0.345f, -2.973f, -1.832f, -3.0f, -3.617f)
                curveToRelative(-1.21f, -0.636f, -2.0f, -1.897f, -2.0f, -3.308f)
                reflectiveCurveToRelative(0.791f, -2.671f, 2.0f, -3.308f)
                curveToRelative(0.031f, -2.041f, 1.701f, -3.692f, 3.75f, -3.692f)
                curveToRelative(0.355f, 0.0f, 0.711f, 0.054f, 1.056f, 0.158f)
                curveToRelative(0.699f, -0.729f, 1.671f, -1.158f, 2.694f, -1.158f)
                curveToRelative(0.768f, 0.0f, 1.505f, 0.237f, 2.125f, 0.671f)
                lineToRelative(0.375f, 0.329f)
                verticalLineToRelative(2.684f)
                curveToRelative(0.0f, 3.18f, 2.411f, 5.316f, 6.0f, 5.316f)
                curveToRelative(2.23f, 0.0f, 4.003f, -0.827f, 5.027f, -2.215f)
                close()
            }
        }
        .build()
        return _sheep!!
    }

private var _sheep: ImageVector? = null
