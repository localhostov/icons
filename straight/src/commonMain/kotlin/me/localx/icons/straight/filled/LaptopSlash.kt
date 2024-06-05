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

public val Icons.Filled.LaptopSlash: ImageVector
    get() {
        if (_laptopSlash != null) {
            return _laptopSlash!!
        }
        _laptopSlash = Builder(name = "LaptopSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.082f, 15.0f)
                lineTo(2.0f, 15.0f)
                lineTo(2.0f, 6.38f)
                lineToRelative(9.62f, 9.62f)
                horizontalLineToRelative(-1.691f)
                lineToRelative(-0.846f, -1.0f)
                close()
                moveTo(8.99f, 18.0f)
                lineToRelative(-0.846f, -1.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(13.62f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(-4.629f)
                close()
                moveTo(23.999f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.586f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(5.586f)
                lineTo(21.999f, 3.0f)
                lineTo(4.414f, 3.0f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.782f, -1.782f)
                curveToRelative(1.073f, -0.457f, 1.825f, -1.521f, 1.825f, -2.761f)
                close()
            }
        }
        .build()
        return _laptopSlash!!
    }

private var _laptopSlash: ImageVector? = null
