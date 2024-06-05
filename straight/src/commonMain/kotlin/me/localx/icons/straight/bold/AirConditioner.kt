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

public val Icons.Bold.AirConditioner: ImageVector
    get() {
        if (_airConditioner != null) {
            return _airConditioner!!
        }
        _airConditioner = Builder(name = "AirConditioner", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(7.5f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 8.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.188f, -4.5f, 4.0f, -4.5f)
                verticalLineToRelative(3.0f)
                lineToRelative(0.039f, -0.002f)
                curveToRelative(-0.251f, 0.047f, -1.039f, 0.675f, -1.039f, 1.502f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(22.0f, 19.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.788f, -1.455f, -1.039f, -1.502f)
                lineToRelative(0.039f, -2.998f)
                curveToRelative(1.812f, 0.0f, 4.0f, 2.007f, 4.0f, 4.5f)
                close()
            }
        }
        .build()
        return _airConditioner!!
    }

private var _airConditioner: ImageVector? = null
