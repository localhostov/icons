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

public val Icons.Bold.NotFoundMagnifyingGlass: ImageVector
    get() {
        if (_notFoundMagnifyingGlass != null) {
            return _notFoundMagnifyingGlass!!
        }
        _notFoundMagnifyingGlass = Builder(name = "NotFoundMagnifyingGlass", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(14.227f, 8.313f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-0.98f, 0.98f)
                close()
                moveTo(6.207f, 10.708f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(-0.98f, 0.98f)
                close()
                moveTo(13.853f, 13.138f)
                lineToRelative(-1.008f, 1.727f)
                curveToRelative(-1.961f, -1.146f, -3.727f, -1.145f, -5.688f, 0.0f)
                lineToRelative(-1.009f, -1.727f)
                curveToRelative(2.58f, -1.508f, 5.124f, -1.509f, 7.705f, 0.0f)
                close()
            }
        }
        .build()
        return _notFoundMagnifyingGlass!!
    }

private var _notFoundMagnifyingGlass: ImageVector? = null
