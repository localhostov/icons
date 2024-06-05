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

public val Icons.Bold.Rent: ImageVector
    get() {
        if (_rent != null) {
            return _rent!!
        }
        _rent = Builder(name = "Rent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.682f, 10.061f)
                lineToRelative(-3.286f, -3.286f)
                curveToRelative(-0.593f, -3.83f, -3.903f, -6.775f, -7.896f, -6.775f)
                curveToRelative(-3.654f, 0.0f, -6.84f, 2.469f, -7.749f, 6.005f)
                curveToRelative(-0.013f, 0.05f, -0.015f, 0.1f, -0.023f, 0.15f)
                curveToRelative(-1.861f, 0.473f, -3.324f, 2.041f, -3.652f, 3.942f)
                curveToRelative(-0.416f, 2.419f, 0.907f, 4.591f, 2.923f, 5.472f)
                curveToRelative(0.0f, 0.79f, 0.166f, 1.082f, 0.467f, 1.431f)
                lineToRelative(0.591f, 0.591f)
                curveToRelative(0.244f, 0.244f, 0.244f, 0.64f, 0.0f, 0.885f)
                lineToRelative(-0.615f, 0.615f)
                curveToRelative(-0.244f, 0.244f, -0.244f, 0.64f, 0.0f, 0.885f)
                lineToRelative(0.615f, 0.615f)
                curveToRelative(0.244f, 0.244f, 0.244f, 0.64f, 0.0f, 0.885f)
                lineToRelative(-0.481f, 0.481f)
                curveToRelative(-0.319f, 0.319f, -0.319f, 0.835f, 0.0f, 1.154f)
                lineToRelative(0.513f, 0.513f)
                curveToRelative(0.503f, 0.503f, 1.318f, 0.503f, 1.821f, 0.0f)
                lineToRelative(0.706f, -0.707f)
                curveToRelative(0.245f, -0.245f, 0.383f, -0.578f, 0.383f, -0.924f)
                verticalLineToRelative(-6.423f)
                curveToRelative(1.766f, -0.772f, 3.0f, -2.533f, 3.0f, -4.584f)
                curveToRelative(0.0f, -2.124f, -1.326f, -3.937f, -3.194f, -4.661f)
                curveToRelative(0.703f, -1.973f, 2.563f, -3.324f, 4.694f, -3.324f)
                curveToRelative(2.409f, 0.0f, 4.424f, 1.713f, 4.895f, 3.984f)
                lineToRelative(-3.077f, 3.077f)
                curveToRelative(-0.838f, 0.838f, -1.318f, 1.997f, -1.318f, 3.182f)
                verticalLineToRelative(6.258f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-6.258f)
                curveToRelative(0.0f, -1.185f, -0.48f, -2.344f, -1.318f, -3.182f)
                close()
                moveTo(5.0f, 10.986f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.0f, 19.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-6.258f)
                curveToRelative(0.0f, -0.395f, 0.16f, -0.781f, 0.439f, -1.061f)
                lineToRelative(2.561f, -2.561f)
                lineToRelative(2.561f, 2.561f)
                curveToRelative(0.279f, 0.279f, 0.439f, 0.666f, 0.439f, 1.061f)
                verticalLineToRelative(6.258f)
                close()
            }
        }
        .build()
        return _rent!!
    }

private var _rent: ImageVector? = null
