package me.localx.icons.straight.bold

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

public val Icons.Bold.CircleQ: ImageVector
    get() {
        if (_circleQ != null) {
            return _circleQ!!
        }
        _circleQ = Builder(name = "CircleQ", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.992f, 13.39f)
                verticalLineToRelative(-2.779f)
                curveToRelative(0.0f, -2.68f, -2.239f, -4.86f, -4.992f, -4.86f)
                reflectiveCurveToRelative(-5.008f, 2.181f, -5.008f, 4.86f)
                verticalLineToRelative(2.779f)
                curveToRelative(0.0f, 2.68f, 2.246f, 4.86f, 5.008f, 4.86f)
                curveToRelative(0.904f, 0.0f, 1.752f, -0.235f, 2.484f, -0.645f)
                lineToRelative(0.956f, 0.956f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.023f, -1.023f)
                curveToRelative(0.292f, -0.617f, 0.455f, -1.304f, 0.455f, -2.026f)
                close()
                moveTo(12.0f, 15.25f)
                curveToRelative(-1.107f, 0.0f, -2.008f, -0.835f, -2.008f, -1.86f)
                verticalLineToRelative(-2.779f)
                curveToRelative(0.0f, -1.025f, 0.9f, -1.86f, 2.008f, -1.86f)
                curveToRelative(1.117f, 0.0f, 1.992f, 0.817f, 1.992f, 1.86f)
                verticalLineToRelative(2.261f)
                lineToRelative(-0.432f, -0.432f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(0.686f, 0.686f)
                curveToRelative(-0.041f, 0.002f, -0.083f, 0.004f, -0.125f, 0.004f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _circleQ!!
    }

private var _circleQ: ImageVector? = null
