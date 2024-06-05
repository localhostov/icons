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

public val Icons.Filled.PrintSlash: ImageVector
    get() {
        if (_printSlash != null) {
            return _printSlash!!
        }
        _printSlash = Builder(name = "PrintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.757f, 15.0f)
                lineToRelative(7.243f, 7.243f)
                verticalLineToRelative(1.757f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(4.757f)
                close()
                moveTo(2.767f, 7.01f)
                curveToRelative(-1.548f, 0.119f, -2.767f, 1.412f, -2.767f, 2.99f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.757f)
                lineTo(2.767f, 7.01f)
                close()
                moveTo(24.0f, 20.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(2.543f, 2.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.543f, 3.543f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(5.0f)
                lineTo(6.414f, 5.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(12.586f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(15.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 18.586f)
                verticalLineToRelative(-5.586f)
                horizontalLineToRelative(-5.586f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(1.586f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _printSlash!!
    }

private var _printSlash: ImageVector? = null
