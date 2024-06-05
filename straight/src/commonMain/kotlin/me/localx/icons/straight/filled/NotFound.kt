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

public val Icons.Filled.NotFound: ImageVector
    get() {
        if (_notFound != null) {
            return _notFound!!
        }
        _notFound = Builder(name = "NotFound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(7.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(0.0f, 10.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(6.793f, 13.553f)
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
                lineToRelative(0.98f, -0.98f)
                lineToRelative(-0.98f, -0.98f)
                close()
                moveTo(14.844f, 20.863f)
                curveToRelative(-1.961f, -1.146f, -3.727f, -1.146f, -5.688f, 0.0f)
                lineToRelative(-1.009f, -1.727f)
                curveToRelative(2.58f, -1.509f, 5.125f, -1.509f, 7.705f, 0.0f)
                lineToRelative(-1.009f, 1.727f)
                close()
                moveTo(17.207f, 15.514f)
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
        return _notFound!!
    }

private var _notFound: ImageVector? = null
