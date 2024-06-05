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

public val Icons.Filled.DisplaySlash: ImageVector
    get() {
        if (_displaySlash != null) {
            return _displaySlash!!
        }
        _displaySlash = Builder(name = "DisplaySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.769f, 20.0f)
                lineToRelative(1.231f, 1.231f)
                verticalLineToRelative(0.769f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -0.511f, 0.139f, -0.984f, 0.364f, -1.405f)
                lineToRelative(14.405f, 14.405f)
                horizontalLineToRelative(-1.769f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.769f)
                close()
                moveTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                lineTo(4.414f, 3.0f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.543f, -3.543f)
                horizontalLineToRelative(3.586f)
                lineTo(24.0f, 6.0f)
                close()
            }
        }
        .build()
        return _displaySlash!!
    }

private var _displaySlash: ImageVector? = null
