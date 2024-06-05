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

public val Icons.Bold.NotFoundAlt: ImageVector
    get() {
        if (_notFoundAlt != null) {
            return _notFoundAlt!!
        }
        _notFoundAlt = Builder(name = "NotFoundAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.994f, 21.873f)
                lineToRelative(-5.947f, -5.947f)
                curveToRelative(1.225f, -1.66f, 1.959f, -3.703f, 1.959f, -5.92f)
                curveTo(20.006f, 4.492f, 15.52f, 0.006f, 10.006f, 0.006f)
                reflectiveCurveTo(0.006f, 4.492f, 0.006f, 10.006f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.217f, 0.0f, 4.26f, -0.734f, 5.92f, -1.959f)
                lineToRelative(5.947f, 5.947f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(10.006f, 17.006f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(14.311f, 7.811f)
                lineToRelative(-2.189f, 2.189f)
                lineToRelative(2.189f, 2.189f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.189f, -2.189f)
                lineToRelative(-2.189f, 2.189f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.189f, -2.189f)
                lineToRelative(-2.189f, -2.189f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.189f, 2.189f)
                lineToRelative(2.189f, -2.189f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _notFoundAlt!!
    }

private var _notFoundAlt: ImageVector? = null
