package me.localx.icons.straight.outline

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

public val Icons.Outline.PrintSlash: ImageVector
    get() {
        if (_printSlash != null) {
            return _printSlash!!
        }
        _printSlash = Builder(name = "PrintSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.758f, 22.0f)
                lineToRelative(1.242f, 1.242f)
                verticalLineToRelative(0.758f)
                lineTo(5.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -1.287f, 0.81f, -2.384f, 1.948f, -2.81f)
                lineToRelative(1.81f, 1.81f)
                horizontalLineToRelative(-0.758f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.758f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-4.758f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(10.758f)
                close()
                moveTo(24.0f, 21.0f)
                horizontalLineToRelative(-1.586f)
                lineToRelative(1.543f, 1.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.543f, 3.543f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(7.0f, 5.586f)
                lineToRelative(0.414f, 0.414f)
                horizontalLineToRelative(9.586f)
                lineTo(17.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                verticalLineToRelative(3.586f)
                close()
                moveTo(20.414f, 19.0f)
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-11.586f)
                lineToRelative(11.0f, 11.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _printSlash!!
    }

private var _printSlash: ImageVector? = null
