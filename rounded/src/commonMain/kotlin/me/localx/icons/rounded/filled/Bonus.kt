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

public val Icons.Filled.Bonus: ImageVector
    get() {
        if (_bonus != null) {
            return _bonus!!
        }
        _bonus = Builder(name = "Bonus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 12.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                close()
                moveTo(13.0f, 8.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                close()
                moveTo(23.925f, 20.128f)
                curveToRelative(-0.222f, 0.544f, -0.727f, 0.883f, -1.316f, 0.883f)
                horizontalLineToRelative(-1.562f)
                verticalLineToRelative(1.562f)
                curveToRelative(0.0f, 0.893f, -0.729f, 1.427f, -1.434f, 1.427f)
                curveToRelative(-0.376f, 0.0f, -0.72f, -0.145f, -0.995f, -0.418f)
                lineToRelative(-3.953f, -3.953f)
                curveToRelative(-0.85f, 0.235f, -1.74f, 0.371f, -2.664f, 0.371f)
                curveToRelative(-0.913f, 0.0f, -1.794f, -0.134f, -2.636f, -0.364f)
                lineToRelative(-3.944f, 3.944f)
                curveToRelative(-0.277f, 0.275f, -0.621f, 0.42f, -0.997f, 0.42f)
                curveToRelative(-0.705f, 0.0f, -1.434f, -0.534f, -1.434f, -1.427f)
                verticalLineToRelative(-1.562f)
                horizontalLineToRelative(-1.562f)
                curveToRelative(-0.59f, 0.0f, -1.095f, -0.339f, -1.317f, -0.884f)
                curveToRelative(-0.222f, -0.54f, -0.103f, -1.132f, 0.31f, -1.546f)
                lineToRelative(3.179f, -3.179f)
                curveToRelative(-1.007f, -1.56f, -1.598f, -3.412f, -1.598f, -5.403f)
                curveTo(2.0f, 4.486f, 6.486f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 1.981f, -0.586f, 3.825f, -1.585f, 5.381f)
                lineToRelative(3.2f, 3.199f)
                curveToRelative(0.413f, 0.415f, 0.532f, 1.007f, 0.31f, 1.548f)
                close()
                moveTo(15.989f, 12.263f)
                curveToRelative(0.1f, -1.168f, -0.474f, -2.214f, -1.375f, -2.792f)
                curveToRelative(0.286f, -0.506f, 0.43f, -1.102f, 0.375f, -1.735f)
                curveToRelative(-0.135f, -1.577f, -1.559f, -2.737f, -3.141f, -2.737f)
                horizontalLineToRelative(-1.348f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.34f)
                curveToRelative(1.584f, 0.0f, 3.013f, -1.158f, 3.149f, -2.736f)
                close()
            }
        }
        .build()
        return _bonus!!
    }

private var _bonus: ImageVector? = null
