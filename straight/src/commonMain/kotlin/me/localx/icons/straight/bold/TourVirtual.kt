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

public val Icons.Bold.TourVirtual: ImageVector
    get() {
        if (_tourVirtual != null) {
            return _tourVirtual!!
        }
        _tourVirtual = Builder(name = "TourVirtual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.919f, -1.365f, 3.64f, -3.844f, 4.845f)
                lineToRelative(-2.156f, 1.049f)
                verticalLineToRelative(-14.336f)
                lineToRelative(0.844f, -0.41f)
                curveToRelative(1.33f, -0.647f, 2.156f, -1.47f, 2.156f, -2.147f)
                curveToRelative(0.0f, -1.427f, -3.506f, -3.5f, -9.0f, -3.5f)
                reflectiveCurveTo(3.0f, 5.073f, 3.0f, 6.5f)
                curveToRelative(0.0f, 0.678f, 0.826f, 1.5f, 2.156f, 2.147f)
                lineToRelative(0.844f, 0.41f)
                verticalLineToRelative(14.336f)
                lineToRelative(-2.156f, -1.049f)
                curveToRelative(-2.479f, -1.205f, -3.844f, -2.926f, -3.844f, -4.845f)
                lineTo(0.0f, 6.5f)
                curveTo(0.0f, 2.794f, 5.159f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 2.794f, 12.0f, 6.5f)
                close()
                moveTo(14.5f, 7.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(16.0f, 14.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _tourVirtual!!
    }

private var _tourVirtual: ImageVector? = null
