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

public val Icons.Filled.Ad: ImageVector
    get() {
        if (_ad != null) {
            return _ad!!
        }
        _ad = Builder(name = "Ad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 5.0f)
                lineTo(24.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(12.633f, 18.0f)
                lineTo(8.348f, 6.0f)
                horizontalLineToRelative(-0.695f)
                lineTo(3.367f, 18.0f)
                horizontalLineToRelative(2.124f)
                lineToRelative(0.714f, -2.0f)
                horizontalLineToRelative(3.591f)
                lineToRelative(0.714f, 2.0f)
                horizontalLineToRelative(2.124f)
                close()
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.351f)
                curveToRelative(-0.456f, -0.219f, -0.961f, -0.351f, -1.5f, -0.351f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.539f, 0.0f, 1.044f, -0.133f, 1.5f, -0.351f)
                verticalLineToRelative(0.351f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(6.919f, 14.0f)
                horizontalLineToRelative(2.162f)
                lineToRelative(-1.081f, -3.027f)
                lineToRelative(-1.081f, 3.027f)
                close()
            }
        }
        .build()
        return _ad!!
    }

private var _ad: ImageVector? = null
