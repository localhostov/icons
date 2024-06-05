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

public val Icons.Outline.AlignSlash: ImageVector
    get() {
        if (_alignSlash != null) {
            return _alignSlash!!
        }
        _alignSlash = Builder(name = "AlignSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.757f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.757f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(9.757f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.757f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(0.0f, 4.243f)
                verticalLineToRelative(1.757f)
                horizontalLineToRelative(1.757f)
                lineToRelative(-1.757f, -1.757f)
                close()
                moveTo(0.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.757f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(0.0f, 19.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.414f, 4.0f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.543f, -1.543f)
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.586f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(6.586f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.586f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(11.586f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-13.586f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(16.586f)
                close()
            }
        }
        .build()
        return _alignSlash!!
    }

private var _alignSlash: ImageVector? = null
