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

public val Icons.Filled.Republican: ImageVector
    get() {
        if (_republican != null) {
            return _republican!!
        }
        _republican = Builder(name = "Republican", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.01f, 12.0f)
                lineToRelative(0.004f, -3.994f)
                curveToRelative(0.001f, -1.604f, -0.622f, -3.111f, -1.755f, -4.246f)
                reflectiveCurveToRelative(-2.641f, -1.76f, -4.245f, -1.76f)
                lineTo(6.0f, 2.0f)
                curveTo(2.691f, 2.0f, 0.0f, 4.691f, 0.0f, 8.0f)
                verticalLineToRelative(4.0f)
                lineTo(20.01f, 12.0f)
                close()
                moveTo(14.0f, 6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(6.0f, 6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(2.001f)
                curveToRelative(0.0f, 1.653f, -1.345f, 2.999f, -2.999f, 2.999f)
                curveToRelative(-0.802f, 0.0f, -1.555f, -0.312f, -2.122f, -0.88f)
                curveToRelative(-0.566f, -0.566f, -0.877f, -1.319f, -0.877f, -2.12f)
                horizontalLineToRelative(-1.983f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.003f)
                lineToRelative(0.009f, -3.0f)
                lineTo(6.006f, 19.0f)
                lineToRelative(-0.01f, 3.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 14.0f)
                lineTo(20.008f, 14.0f)
                lineToRelative(-0.005f, 5.0f)
                curveToRelative(0.0f, 0.268f, 0.104f, 0.518f, 0.292f, 0.707f)
                curveToRelative(0.189f, 0.188f, 0.439f, 0.293f, 0.707f, 0.293f)
                curveToRelative(0.551f, 0.0f, 0.999f, -0.448f, 0.999f, -0.999f)
                verticalLineToRelative(-2.001f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _republican!!
    }

private var _republican: ImageVector? = null
