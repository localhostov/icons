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

public val Icons.Outline.ImageSlash: ImageVector
    get() {
        if (_imageSlash != null) {
            return _imageSlash!!
        }
        _imageSlash = Builder(name = "ImageSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.957f, 22.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(1.25f, 1.25f)
                curveToRelative(0.4f, -0.191f, 0.841f, -0.293f, 1.293f, -0.293f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(17.586f)
                lineToRelative(0.957f, 0.957f)
                close()
                moveTo(4.414f, 3.0f)
                lineToRelative(16.586f, 16.586f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(4.414f, 3.0f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(5.586f, -5.586f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-4.172f, 4.172f)
                lineTo(3.0f, 7.243f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(17.757f)
                horizontalLineToRelative(17.758f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(18.0f, 8.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _imageSlash!!
    }

private var _imageSlash: ImageVector? = null
