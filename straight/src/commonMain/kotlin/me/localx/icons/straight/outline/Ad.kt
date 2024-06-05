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

public val Icons.Outline.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.346f, 2.0f, 0.0f, 3.346f, 0.0f, 5.0f)
                lineTo(0.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(18.0f, 11.338f)
                curveToRelative(-0.455f, -0.217f, -0.964f, -0.338f, -1.5f, -0.338f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.536f, 0.0f, 1.045f, -0.122f, 1.5f, -0.338f)
                verticalLineToRelative(0.338f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.338f)
                close()
                moveTo(16.5f, 16.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.652f, 6.0f)
                lineTo(3.367f, 18.0f)
                horizontalLineToRelative(2.124f)
                lineToRelative(0.714f, -2.0f)
                horizontalLineToRelative(3.591f)
                lineToRelative(0.714f, 2.0f)
                horizontalLineToRelative(2.124f)
                lineTo(8.348f, 6.0f)
                horizontalLineToRelative(-0.695f)
                close()
                moveTo(6.918f, 14.0f)
                lineToRelative(1.081f, -3.027f)
                lineToRelative(1.081f, 3.027f)
                horizontalLineToRelative(-2.162f)
                close()
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
