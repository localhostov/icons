package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Washer: ImageVector
    get() {
        if (_washer != null) {
            return _washer!!
        }
        _washer = Builder(name = "Washer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.511f, 13.084f)
                curveToRelative(0.681f, -1.235f, 1.981f, -2.084f, 3.489f, -2.084f)
                curveToRelative(2.06f, 0.0f, 3.741f, 1.571f, 3.957f, 3.574f)
                curveToRelative(-0.274f, 0.193f, -0.708f, 0.426f, -1.229f, 0.426f)
                curveToRelative(-0.839f, 0.0f, -1.828f, -0.583f, -2.136f, -0.807f)
                curveToRelative(-0.167f, -0.122f, -1.675f, -1.193f, -3.319f, -1.193f)
                curveToRelative(-0.271f, 0.0f, -0.522f, 0.035f, -0.762f, 0.084f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.243f, 4.243f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(10.0f, 4.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(6.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(14.728f, 17.0f)
                curveToRelative(-1.645f, 0.0f, -3.152f, -1.071f, -3.319f, -1.193f)
                curveToRelative(-0.308f, -0.224f, -1.297f, -0.807f, -2.136f, -0.807f)
                curveToRelative(-0.521f, 0.0f, -0.956f, 0.232f, -1.229f, 0.426f)
                curveToRelative(0.216f, 2.004f, 1.897f, 3.574f, 3.957f, 3.574f)
                curveToRelative(1.508f, 0.0f, 2.808f, -0.848f, 3.489f, -2.084f)
                curveToRelative(-0.24f, 0.049f, -0.491f, 0.084f, -0.762f, 0.084f)
                close()
            }
        }
        .build()
        return _washer!!
    }

private var _washer: ImageVector? = null
