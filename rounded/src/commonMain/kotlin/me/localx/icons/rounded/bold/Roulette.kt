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

public val Icons.Bold.Roulette: ImageVector
    get() {
        if (_roulette != null) {
            return _roulette!!
        }
        _roulette = Builder(name = "Roulette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(20.302f, 15.472f)
                lineToRelative(-1.449f, -0.606f)
                curveToRelative(-0.457f, -0.191f, -0.986f, -0.019f, -1.236f, 0.409f)
                curveToRelative(-0.14f, 0.241f, -0.296f, 0.472f, -0.467f, 0.693f)
                curveToRelative(-0.303f, 0.393f, -0.263f, 0.948f, 0.086f, 1.3f)
                lineToRelative(1.105f, 1.111f)
                curveToRelative(-0.83f, 0.825f, -1.82f, 1.487f, -2.918f, 1.941f)
                lineToRelative(-0.598f, -1.451f)
                curveToRelative(-0.189f, -0.458f, -0.685f, -0.709f, -1.164f, -0.582f)
                curveToRelative(-0.264f, 0.07f, -0.533f, 0.122f, -0.805f, 0.158f)
                curveToRelative(-0.492f, 0.064f, -0.857f, 0.486f, -0.857f, 0.983f)
                verticalLineToRelative(1.573f)
                curveToRelative(-1.224f, 0.0f, -2.391f, -0.248f, -3.455f, -0.692f)
                lineToRelative(0.604f, -1.448f)
                curveToRelative(0.191f, -0.458f, 0.018f, -0.987f, -0.411f, -1.236f)
                curveToRelative(-0.241f, -0.14f, -0.473f, -0.295f, -0.694f, -0.466f)
                curveToRelative(-0.393f, -0.302f, -0.949f, -0.262f, -1.3f, 0.089f)
                lineToRelative(-1.11f, 1.108f)
                curveToRelative(-0.827f, -0.829f, -1.492f, -1.818f, -1.947f, -2.916f)
                lineToRelative(1.481f, -0.612f)
                curveToRelative(0.451f, -0.186f, 0.696f, -0.668f, 0.592f, -1.145f)
                curveToRelative(-0.061f, -0.28f, -0.111f, -0.572f, -0.151f, -0.833f)
                curveToRelative(-0.074f, -0.49f, -0.493f, -0.85f, -0.988f, -0.85f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(0.0f, -1.242f, 0.253f, -2.426f, 0.71f, -3.503f)
                lineToRelative(1.447f, 0.612f)
                curveToRelative(0.456f, 0.193f, 0.986f, 0.023f, 1.238f, -0.404f)
                curveToRelative(0.141f, -0.24f, 0.298f, -0.47f, 0.469f, -0.691f)
                curveToRelative(0.305f, -0.391f, 0.268f, -0.947f, -0.081f, -1.3f)
                lineToRelative(-1.1f, -1.115f)
                curveToRelative(0.833f, -0.822f, 1.826f, -1.481f, 2.926f, -1.93f)
                lineToRelative(0.591f, 1.452f)
                curveToRelative(0.187f, 0.459f, 0.681f, 0.712f, 1.161f, 0.588f)
                curveToRelative(0.262f, -0.068f, 0.528f, -0.119f, 0.801f, -0.154f)
                curveToRelative(0.498f, -0.064f, 0.867f, -0.493f, 0.861f, -0.995f)
                lineToRelative(-0.018f, -1.559f)
                curveToRelative(1.234f, 0.0f, 2.411f, 0.252f, 3.482f, 0.704f)
                lineToRelative(-0.609f, 1.448f)
                curveToRelative(-0.192f, 0.457f, -0.021f, 0.986f, 0.407f, 1.237f)
                curveToRelative(0.24f, 0.141f, 0.471f, 0.297f, 0.692f, 0.468f)
                curveToRelative(0.392f, 0.304f, 0.947f, 0.266f, 1.3f, -0.083f)
                lineToRelative(1.113f, -1.102f)
                curveToRelative(0.823f, 0.831f, 1.484f, 1.822f, 1.935f, 2.921f)
                lineToRelative(-1.451f, 0.595f)
                curveToRelative(-0.459f, 0.188f, -0.71f, 0.684f, -0.584f, 1.164f)
                curveToRelative(0.068f, 0.26f, 0.12f, 0.524f, 0.155f, 0.791f)
                curveToRelative(0.065f, 0.492f, 0.486f, 0.857f, 0.983f, 0.857f)
                horizontalLineToRelative(1.573f)
                curveToRelative(0.0f, 1.23f, -0.249f, 2.403f, -0.698f, 3.472f)
                close()
                moveTo(15.561f, 10.561f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(1.439f, 1.439f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(-1.439f, 1.439f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(-1.439f, -1.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(1.439f, -1.439f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
            }
        }
        .build()
        return _roulette!!
    }

private var _roulette: ImageVector? = null
