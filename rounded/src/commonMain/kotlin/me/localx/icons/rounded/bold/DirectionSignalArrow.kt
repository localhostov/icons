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

public val Icons.Bold.DirectionSignalArrow: ImageVector
    get() {
        if (_directionSignalArrow != null) {
            return _directionSignalArrow!!
        }
        _directionSignalArrow = Builder(name = "DirectionSignalArrow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.019f, 10.114f)
                curveToRelative(0.589f, 0.587f, 0.95f, 1.498f, 0.981f, 2.386f)
                curveToRelative(0.0f, 0.935f, -0.364f, 1.857f, -1.025f, 2.518f)
                lineToRelative(-2.387f, 2.515f)
                curveToRelative(-0.295f, 0.311f, -0.691f, 0.467f, -1.088f, 0.467f)
                curveToRelative(-0.371f, 0.0f, -0.742f, -0.137f, -1.033f, -0.412f)
                curveToRelative(-0.601f, -0.57f, -0.625f, -1.52f, -0.055f, -2.121f)
                lineToRelative(1.393f, -1.467f)
                horizontalLineToRelative(-3.805f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.782f)
                lineToRelative(1.379f, 1.477f)
                curveToRelative(0.565f, 0.605f, 0.533f, 1.555f, -0.073f, 2.12f)
                curveToRelative(-0.289f, 0.27f, -0.656f, 0.403f, -1.023f, 0.403f)
                curveToRelative(-0.401f, 0.0f, -0.802f, -0.16f, -1.097f, -0.477f)
                lineToRelative(-2.414f, -2.586f)
                curveToRelative(-0.625f, -0.624f, -0.989f, -1.502f, -0.989f, -2.438f)
                reflectiveCurveToRelative(0.364f, -1.814f, 1.025f, -2.475f)
                lineToRelative(2.378f, -2.548f)
                curveToRelative(0.565f, -0.605f, 1.515f, -0.638f, 2.12f, -0.073f)
                curveToRelative(0.606f, 0.565f, 0.638f, 1.515f, 0.073f, 2.12f)
                lineToRelative(-1.378f, 1.477f)
                horizontalLineToRelative(3.782f)
                curveToRelative(0.9f, 0.0f, 1.75f, 0.217f, 2.5f, 0.602f)
                lineTo(10.501f, 4.218f)
                lineToRelative(-1.477f, 1.379f)
                curveToRelative(-0.605f, 0.565f, -1.555f, 0.532f, -2.12f, -0.073f)
                reflectiveCurveToRelative(-0.533f, -1.555f, 0.073f, -2.12f)
                lineToRelative(2.586f, -2.414f)
                curveToRelative(0.624f, -0.625f, 1.502f, -0.989f, 2.438f, -0.989f)
                reflectiveCurveToRelative(1.814f, 0.364f, 2.475f, 1.025f)
                lineToRelative(2.549f, 2.378f)
                curveToRelative(0.605f, 0.565f, 0.639f, 1.515f, 0.073f, 2.12f)
                curveToRelative(-0.296f, 0.316f, -0.696f, 0.477f, -1.097f, 0.477f)
                curveToRelative(-0.367f, 0.0f, -0.734f, -0.134f, -1.023f, -0.403f)
                lineToRelative(-1.477f, -1.378f)
                verticalLineToRelative(7.383f)
                curveToRelative(0.75f, -0.385f, 1.6f, -0.602f, 2.5f, -0.602f)
                horizontalLineToRelative(3.76f)
                lineToRelative(-1.365f, -1.485f)
                curveToRelative(-0.561f, -0.61f, -0.521f, -1.559f, 0.09f, -2.12f)
                curveToRelative(0.608f, -0.56f, 1.558f, -0.521f, 2.119f, 0.09f)
                lineToRelative(2.414f, 2.629f)
                close()
                moveTo(24.0f, 12.5f)
                curveToRelative(0.0f, 0.011f, 0.0f, -0.01f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _directionSignalArrow!!
    }

private var _directionSignalArrow: ImageVector? = null
