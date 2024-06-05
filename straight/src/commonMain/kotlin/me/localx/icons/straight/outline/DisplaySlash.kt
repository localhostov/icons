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

public val Icons.Outline.DisplaySlash: ImageVector
    get() {
        if (_displaySlash != null) {
            return _displaySlash!!
        }
        _displaySlash = Builder(name = "DisplaySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.76f, 19.981f)
                lineToRelative(1.262f, 1.262f)
                verticalLineToRelative(0.738f)
                lineTo(7.021f, 21.981f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                lineTo(0.021f, 18.981f)
                lineTo(0.021f, 5.981f)
                curveToRelative(0.0f, -0.502f, 0.136f, -0.968f, 0.354f, -1.384f)
                lineToRelative(1.646f, 1.646f)
                verticalLineToRelative(10.738f)
                horizontalLineToRelative(10.738f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-1.738f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.738f)
                close()
                moveTo(24.022f, 19.0f)
                horizontalLineToRelative(-3.586f)
                lineToRelative(3.543f, 3.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.064f, 1.457f)
                lineTo(1.479f, 0.043f)
                lineToRelative(2.957f, 2.957f)
                horizontalLineToRelative(16.586f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(22.022f, 6.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(6.436f, 5.0f)
                lineToRelative(12.0f, 12.0f)
                horizontalLineToRelative(3.586f)
                lineTo(22.022f, 6.0f)
                close()
            }
        }
        .build()
        return _displaySlash!!
    }

private var _displaySlash: ImageVector? = null
