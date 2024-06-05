package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.FloorLayer: ImageVector
    get() {
        if (_floorLayer != null) {
            return _floorLayer!!
        }
        _floorLayer = Builder(name = "FloorLayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.014f, 5.156f)
                lineToRelative(-7.419f, -3.558f)
                curveToRelative(-1.65f, -0.79f, -3.541f, -0.79f, -5.189f, 0.0f)
                lineTo(1.986f, 5.156f)
                curveToRelative(-1.207f, 0.579f, -1.986f, 1.818f, -1.986f, 3.156f)
                verticalLineToRelative(1.162f)
                curveToRelative(0.0f, 1.338f, 0.779f, 2.577f, 1.986f, 3.156f)
                lineToRelative(7.412f, 3.554f)
                curveToRelative(0.515f, 0.247f, 1.054f, 0.407f, 1.602f, 0.5f)
                verticalLineToRelative(-4.041f)
                lineToRelative(-7.997f, -3.839f)
                curveToRelative(-0.498f, -0.239f, -0.708f, -0.836f, -0.469f, -1.334f)
                curveToRelative(0.238f, -0.498f, 0.833f, -0.708f, 1.334f, -0.469f)
                lineToRelative(8.131f, 3.904f)
                lineToRelative(8.106f, -3.904f)
                curveToRelative(0.5f, -0.24f, 1.095f, -0.028f, 1.334f, 0.469f)
                curveToRelative(0.239f, 0.498f, 0.029f, 1.096f, -0.469f, 1.334f)
                lineToRelative(-7.971f, 3.839f)
                verticalLineToRelative(4.038f)
                curveToRelative(0.547f, -0.094f, 1.087f, -0.256f, 1.602f, -0.505f)
                lineToRelative(7.42f, -3.583f)
                curveToRelative(1.202f, -0.581f, 1.979f, -1.817f, 1.979f, -3.152f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0.0f, -1.338f, -0.779f, -2.577f, -1.986f, -3.156f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 23.173f)
                curveToRelative(-0.547f, -0.093f, -1.087f, -0.253f, -1.602f, -0.501f)
                lineToRelative(-8.263f, -3.962f)
                curveToRelative(-0.694f, -0.333f, -1.135f, -1.034f, -1.135f, -1.803f)
                verticalLineToRelative(-1.313f)
                curveToRelative(0.0f, -0.344f, 0.177f, -0.663f, 0.467f, -0.846f)
                curveToRelative(0.291f, -0.183f, 0.655f, -0.204f, 0.966f, -0.056f)
                lineToRelative(8.831f, 4.234f)
                curveToRelative(0.238f, 0.114f, 0.486f, 0.192f, 0.736f, 0.257f)
                verticalLineToRelative(3.989f)
                close()
                moveTo(23.531f, 14.71f)
                curveToRelative(-0.291f, -0.184f, -0.656f, -0.204f, -0.966f, -0.053f)
                lineToRelative(-8.833f, 4.266f)
                curveToRelative(-0.237f, 0.114f, -0.484f, 0.192f, -0.732f, 0.257f)
                verticalLineToRelative(3.99f)
                curveToRelative(0.547f, -0.094f, 1.087f, -0.256f, 1.602f, -0.505f)
                lineToRelative(8.268f, -3.992f)
                curveToRelative(0.691f, -0.334f, 1.13f, -1.034f, 1.13f, -1.801f)
                verticalLineToRelative(-1.315f)
                curveToRelative(0.0f, -0.344f, -0.177f, -0.664f, -0.469f, -0.847f)
                close()
            }
        }
        .build()
        return _floorLayer!!
    }

private var _floorLayer: ImageVector? = null
