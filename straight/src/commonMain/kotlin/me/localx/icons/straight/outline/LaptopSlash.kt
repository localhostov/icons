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

public val Icons.Outline.LaptopSlash: ImageVector
    get() {
        if (_laptopSlash != null) {
            return _laptopSlash!!
        }
        _laptopSlash = Builder(name = "LaptopSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 3.0f)
                lineTo(4.414f, 3.0f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.783f, -1.783f)
                curveToRelative(1.072f, -0.458f, 1.826f, -1.523f, 1.826f, -2.76f)
                close()
                moveTo(6.414f, 5.0f)
                horizontalLineToRelative(13.586f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.586f)
                lineTo(6.414f, 5.0f)
                close()
                moveTo(22.0f, 18.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.586f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(14.758f, 19.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(2.0f, 6.242f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(6.758f)
                horizontalLineToRelative(4.914f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(1.844f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-4.672f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(11.758f)
                close()
            }
        }
        .build()
        return _laptopSlash!!
    }

private var _laptopSlash: ImageVector? = null
