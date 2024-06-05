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

public val Icons.Outline.FilterSlash: ImageVector
    get() {
        if (_filterSlash != null) {
            return _filterSlash!!
        }
        _filterSlash = Builder(name = "FilterSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.284f, 14.87f)
                lineToRelative(5.716f, -5.881f)
                verticalLineToRelative(-3.989f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-0.179f, 0.0f, -0.355f, 0.025f, -0.529f, 0.057f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-7.673f, -7.673f)
                close()
                moveTo(19.0f, 4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.177f)
                lineToRelative(-5.13f, 5.278f)
                lineTo(5.414f, 4.0f)
                horizontalLineToRelative(13.586f)
                close()
                moveTo(13.0f, 17.256f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(4.744f)
                lineToRelative(-6.0f, -4.5f)
                verticalLineToRelative(-3.309f)
                lineTo(2.0f, 8.989f)
                verticalLineToRelative(-2.813f)
                lineTo(11.0f, 15.379f)
                verticalLineToRelative(3.121f)
                lineToRelative(2.0f, 1.5f)
                verticalLineToRelative(-2.744f)
                close()
            }
        }
        .build()
        return _filterSlash!!
    }

private var _filterSlash: ImageVector? = null
