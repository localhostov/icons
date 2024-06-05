package me.localx.icons.straight.bold

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

public val Icons.Bold.ImageSlash: ImageVector
    get() {
        if (_imageSlash != null) {
            return _imageSlash!!
        }
        _imageSlash = Builder(name = "ImageSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 8.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(23.96f, 21.84f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.04f, 2.16f)
                lineTo(2.161f, 0.039f)
                lineToRelative(1.165f, 1.165f)
                curveToRelative(0.374f, -0.133f, 0.77f, -0.204f, 1.175f, -0.204f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(16.379f)
                lineToRelative(0.96f, 0.961f)
                close()
                moveTo(6.121f, 4.0f)
                lineToRelative(13.879f, 13.879f)
                lineTo(20.0f, 4.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(6.121f, 4.0f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineToRelative(-7.051f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(17.051f)
                horizontalLineToRelative(17.051f)
                lineTo(7.525f, 12.475f)
                lineToRelative(-3.525f, 3.525f)
                close()
            }
        }
        .build()
        return _imageSlash!!
    }

private var _imageSlash: ImageVector? = null
