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

public val Icons.Filled.FloppyDiskPen: ImageVector
    get() {
        if (_floppyDiskPen != null) {
            return _floppyDiskPen!!
        }
        _floppyDiskPen = Builder(name = "FloppyDiskPen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.256f, 12.742f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-7.668f, 7.667f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.667f, -7.667f)
                curveToRelative(0.479f, -0.48f, 0.744f, -1.117f, 0.744f, -1.795f)
                reflectiveCurveToRelative(-0.264f, -1.316f, -0.744f, -1.795f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.011f, -0.0f)
                horizontalLineToRelative(-0.011f)
                verticalLineToRelative(7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(9.999f)
                verticalLineToRelative(-1.419f)
                lineToRelative(8.253f, -8.252f)
                curveToRelative(0.747f, -0.747f, 1.709f, -1.202f, 2.748f, -1.306f)
                verticalLineToRelative(-5.034f)
                lineTo(16.011f, 0.0f)
                close()
                moveTo(10.5f, 17.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _floppyDiskPen!!
    }

private var _floppyDiskPen: ImageVector? = null
