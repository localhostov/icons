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

public val Icons.Outline.FloppyDiskPen: ImageVector
    get() {
        if (_floppyDiskPen != null) {
            return _floppyDiskPen!!
        }
        _floppyDiskPen = Builder(name = "FloppyDiskPen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 11.879f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                lineToRelative(-7.879f, 7.878f)
                verticalLineToRelative(4.243f)
                horizontalLineToRelative(4.242f)
                lineToRelative(7.879f, -7.878f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.313f, -1.555f, -0.879f, -2.121f)
                close()
                moveTo(21.707f, 14.707f)
                lineToRelative(-7.293f, 7.293f)
                horizontalLineToRelative(-1.414f)
                verticalLineToRelative(-1.415f)
                lineToRelative(7.293f, -7.292f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                close()
                moveTo(2.0f, 19.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(11.0f)
                lineTo(16.0f, 2.817f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(3.613f)
                curveToRelative(0.637f, -0.278f, 1.317f, -0.428f, 2.0f, -0.428f)
                verticalLineToRelative(-4.013f)
                lineTo(16.011f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(8.947f)
                reflectiveCurveToRelative(0.213f, -1.298f, 0.053f, -2.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(14.0f, 13.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.164f, 0.0f, 0.32f, -0.026f, 0.477f, -0.048f)
                lineToRelative(2.974f, -2.974f)
                curveToRelative(0.022f, -0.158f, 0.048f, -0.314f, 0.048f, -0.477f)
                close()
                moveTo(10.5f, 15.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _floppyDiskPen!!
    }

private var _floppyDiskPen: ImageVector? = null
