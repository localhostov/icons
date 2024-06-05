package me.localx.icons.rounded.outline

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

public val Icons.Outline.BedBunk: ImageVector
    get() {
        if (_bedBunk != null) {
            return _bedBunk!!
        }
        _bedBunk = Builder(name = "BedBunk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 0.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.796f, 0.0f, -3.338f, 1.065f, -4.059f, 2.591f)
                curveToRelative(-0.556f, -0.372f, -1.223f, -0.591f, -1.941f, -0.591f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.539f, 0.133f, 1.044f, 0.351f, 1.5f)
                horizontalLineToRelative(-2.351f)
                lineTo(2.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(0.0f, 0.448f, 0.0f, 1.0f)
                verticalLineToRelative(22.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(11.0f, 4.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(6.0f, 5.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(2.0f, 9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-1.796f, 0.0f, -3.338f, 1.065f, -4.059f, 2.591f)
                curveToRelative(-0.556f, -0.372f, -1.223f, -0.591f, -1.941f, -0.591f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.539f, 0.133f, 1.044f, 0.351f, 1.5f)
                horizontalLineToRelative(-2.351f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(6.0f, 17.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(11.0f, 19.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
        }
        .build()
        return _bedBunk!!
    }

private var _bedBunk: ImageVector? = null
