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

public val Icons.Filled.ImageSlash: ImageVector
    get() {
        if (_imageSlash != null) {
            return _imageSlash!!
        }
        _imageSlash = Builder(name = "ImageSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 20.586f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-0.182f, 0.0f, -0.361f, 0.016f, -0.537f, 0.048f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.957f, -1.957f)
                close()
                moveTo(16.0f, 10.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(2.0f, 6.243f)
                lineToRelative(5.172f, 5.172f)
                lineToRelative(-5.172f, 5.172f)
                lineTo(2.0f, 6.243f)
                close()
                moveTo(17.758f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-2.586f)
                lineToRelative(6.586f, -6.586f)
                lineToRelative(9.172f, 9.172f)
                close()
            }
        }
        .build()
        return _imageSlash!!
    }

private var _imageSlash: ImageVector? = null
