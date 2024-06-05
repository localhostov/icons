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

public val Icons.Outline.NotFound: ImageVector
    get() {
        if (_notFound != null) {
            return _notFound!!
        }
        _notFound = Builder(name = "NotFound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.207f, 12.553f)
                lineToRelative(-0.98f, 0.98f)
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
                close()
                moveTo(8.207f, 15.928f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(0.98f, 0.98f)
                lineToRelative(-0.98f, 0.98f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(8.147f, 18.136f)
                lineToRelative(1.009f, 1.727f)
                curveToRelative(1.961f, -1.146f, 3.727f, -1.146f, 5.688f, 0.0f)
                lineToRelative(1.009f, -1.727f)
                curveToRelative(-2.58f, -1.509f, -5.125f, -1.509f, -7.705f, 0.0f)
                close()
                moveTo(4.5f, 6.999f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 6.999f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 3.999f)
                verticalLineToRelative(19.0f)
                lineTo(0.0f, 22.999f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(2.0f, 3.999f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.999f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 20.999f)
                verticalLineToRelative(-11.0f)
                lineTo(2.0f, 9.999f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return _notFound!!
    }

private var _notFound: ImageVector? = null
