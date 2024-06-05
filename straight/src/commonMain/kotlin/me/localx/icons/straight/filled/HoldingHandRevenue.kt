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

public val Icons.Filled.HoldingHandRevenue: ImageVector
    get() {
        if (_holdingHandRevenue != null) {
            return _holdingHandRevenue!!
        }
        _holdingHandRevenue = Builder(name = "HoldingHandRevenue", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.998f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.002f, -9.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.002f, 9.0f)
                close()
                moveTo(13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(-0.002f, 6.999f, -0.002f, 6.999f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(0.002f, -6.999f, 0.002f, -6.999f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(-0.002f, 4.999f, -0.002f, 4.999f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(0.002f, -4.999f, 0.002f, -4.999f)
                close()
                moveTo(23.341f, 12.345f)
                lineToRelative(-10.674f, 11.655f)
                lineTo(3.003f, 24.0f)
                curveTo(1.349f, 24.0f, 0.003f, 22.654f, 0.003f, 21.0f)
                verticalLineToRelative(-7.0f)
                curveTo(0.003f, 12.346f, 1.349f, 11.0f, 3.003f, 11.0f)
                horizontalLineToRelative(8.787f)
                curveToRelative(1.22f, 0.0f, 2.213f, 0.993f, 2.213f, 2.213f)
                curveToRelative(0.0f, 1.094f, -0.816f, 2.036f, -1.9f, 2.191f)
                lineToRelative(-4.241f, 0.606f)
                lineToRelative(0.283f, 1.979f)
                lineToRelative(4.241f, -0.606f)
                curveToRelative(2.062f, -0.294f, 3.617f, -2.087f, 3.617f, -4.17f)
                curveToRelative(0.0f, -0.219f, -0.032f, -0.429f, -0.065f, -0.638f)
                lineToRelative(3.541f, -3.737f)
                curveToRelative(0.455f, -0.5f, 1.097f, -0.803f, 1.794f, -0.835f)
                curveToRelative(0.692f, -0.034f, 1.363f, 0.209f, 1.878f, 0.678f)
                curveToRelative(1.052f, 0.958f, 1.138f, 2.602f, 0.189f, 3.665f)
                close()
            }
        }
        .build()
        return _holdingHandRevenue!!
    }

private var _holdingHandRevenue: ImageVector? = null
