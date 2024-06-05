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

public val Icons.Filled.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.05f, 18.0f)
                lineToRelative(-1.54f, 5.67f)
                lineTo(0.17f, 18.69f)
                lineTo(3.0f, 8.28f)
                verticalLineToRelative(9.72f)
                lineTo(20.05f, 18.0f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(13.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(8.0f, 4.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(22.0f, 2.77f)
                lineToRelative(-6.11f, 6.11f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-5.59f, 5.59f)
                verticalLineToRelative(2.83f)
                lineToRelative(5.59f, -5.59f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(6.11f, -6.11f)
                lineTo(22.0f, 2.77f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
