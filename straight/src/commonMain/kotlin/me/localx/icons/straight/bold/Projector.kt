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

public val Icons.Bold.Projector: ImageVector
    get() {
        if (_projector != null) {
            return _projector!!
        }
        _projector = Builder(name = "Projector", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-0.708f)
                curveToRelative(-0.655f, -2.306f, -2.78f, -4.0f, -5.292f, -4.0f)
                reflectiveCurveToRelative(-4.637f, 1.694f, -5.292f, 4.0f)
                lineTo(3.5f, 10.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 13.5f)
                close()
                moveTo(14.5f, 9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.708f)
                curveToRelative(0.655f, 2.306f, 2.779f, 4.0f, 5.292f, 4.0f)
                reflectiveCurveToRelative(4.637f, -1.694f, 5.292f, -4.0f)
                horizontalLineToRelative(0.708f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(7.0f, 15.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(16.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 4.0f)
                close()
                moveTo(19.799f, 5.822f)
                lineToRelative(-2.598f, -1.5f)
                lineToRelative(2.0f, -3.465f)
                lineToRelative(2.598f, 1.5f)
                lineToRelative(-2.0f, 3.465f)
                close()
                moveTo(9.201f, 5.822f)
                lineToRelative(-2.0f, -3.465f)
                lineToRelative(2.599f, -1.5f)
                lineToRelative(2.0f, 3.465f)
                lineToRelative(-2.599f, 1.5f)
                close()
            }
        }
        .build()
        return _projector!!
    }

private var _projector: ImageVector? = null
