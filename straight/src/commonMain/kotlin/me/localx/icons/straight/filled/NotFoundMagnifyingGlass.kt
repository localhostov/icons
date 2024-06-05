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

public val Icons.Filled.NotFoundMagnifyingGlass: ImageVector
    get() {
        if (_notFoundMagnifyingGlass != null) {
            return _notFoundMagnifyingGlass!!
        }
        _notFoundMagnifyingGlass = Builder(name = "NotFoundMagnifyingGlass", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.744f, 16.33f)
                curveToRelative(1.412f, -1.725f, 2.262f, -3.927f, 2.262f, -6.324f)
                curveTo(20.006f, 4.492f, 15.52f, 0.006f, 10.006f, 0.006f)
                reflectiveCurveTo(0.006f, 4.492f, 0.006f, 10.006f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.398f, 0.0f, 4.6f, -0.85f, 6.324f, -2.262f)
                lineToRelative(6.223f, 6.223f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-6.223f, -6.223f)
                close()
                moveTo(4.793f, 9.293f)
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
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(12.844f, 14.863f)
                curveToRelative(-1.961f, -1.145f, -3.727f, -1.145f, -5.688f, 0.0f)
                lineToRelative(-1.009f, -1.727f)
                curveToRelative(2.58f, -1.508f, 5.124f, -1.509f, 7.705f, 0.0f)
                lineToRelative(-1.008f, 1.727f)
                close()
                moveTo(15.207f, 9.293f)
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
                lineToRelative(0.98f, 0.98f)
                close()
            }
        }
        .build()
        return _notFoundMagnifyingGlass!!
    }

private var _notFoundMagnifyingGlass: ImageVector? = null
