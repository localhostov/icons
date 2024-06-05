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

public val Icons.Outline.Script: ImageVector
    get() {
        if (_script != null) {
            return _script!!
        }
        _script = Builder(name = "Script", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                horizontalLineToRelative(4.242f)
                lineToRelative(6.879f, -6.879f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.0f, -4.242f)
                reflectiveCurveToRelative(-3.072f, -1.17f, -4.242f, 0.0f)
                lineToRelative(-6.879f, 6.879f)
                verticalLineToRelative(4.242f)
                close()
                moveTo(14.0f, 8.586f)
                lineToRelative(6.293f, -6.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.39f, 1.024f, 0.0f, 1.414f)
                lineToRelative(-6.293f, 6.293f)
                horizontalLineToRelative(-1.414f)
                verticalLineToRelative(-1.414f)
                close()
                moveTo(20.0f, 17.0f)
                verticalLineToRelative(-5.93f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineToRelative(3.93f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                lineTo(7.0f, 3.5f)
                curveToRelative(0.0f, -0.539f, -0.133f, -1.044f, -0.351f, -1.5f)
                horizontalLineToRelative(8.281f)
                lineTo(16.89f, 0.039f)
                curveToRelative(-0.13f, -0.015f, -0.257f, -0.039f, -0.39f, -0.039f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(22.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-8.838f)
                curveToRelative(0.217f, -0.455f, 0.338f, -0.964f, 0.338f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _script!!
    }

private var _script: ImageVector? = null
