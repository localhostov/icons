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

public val Icons.Outline.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.98f, 18.0f)
                horizontalLineToRelative(2.07f)
                lineToRelative(-1.54f, 5.67f)
                lineTo(0.17f, 18.69f)
                lineTo(3.0f, 8.28f)
                verticalLineToRelative(7.63f)
                lineToRelative(-0.37f, 1.37f)
                lineToRelative(14.48f, 3.93f)
                lineToRelative(0.87f, -3.21f)
                close()
                moveTo(10.5f, 7.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(13.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
                moveTo(7.0f, 3.0f)
                lineTo(7.0f, 13.67f)
                lineToRelative(7.74f, -7.74f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(3.96f, -3.96f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(8.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 14.0f)
                verticalLineToRelative(-5.9f)
                lineToRelative(-3.96f, 3.96f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-5.24f, 5.24f)
                horizontalLineToRelative(12.5f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
