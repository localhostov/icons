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

public val Icons.Filled.CircleM: ImageVector
    get() {
        if (_circleM != null) {
            return _circleM!!
        }
        _circleM = Builder(name = "CircleM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.086f)
                lineToRelative(-4.0f, 6.642f)
                lineToRelative(-4.0f, -6.638f)
                verticalLineToRelative(9.082f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 7.676f)
                curveToRelative(0.0f, -0.755f, 0.445f, -1.383f, 1.134f, -1.6f)
                curveToRelative(0.696f, -0.221f, 1.452f, 0.042f, 1.88f, 0.654f)
                lineToRelative(2.985f, 4.951f)
                lineToRelative(2.949f, -4.895f)
                curveToRelative(0.464f, -0.668f, 1.219f, -0.93f, 1.917f, -0.711f)
                curveToRelative(0.688f, 0.217f, 1.134f, 0.845f, 1.134f, 1.6f)
                verticalLineToRelative(10.324f)
                close()
            }
        }
        .build()
        return _circleM!!
    }

private var _circleM: ImageVector? = null
