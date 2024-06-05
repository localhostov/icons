package me.localx.icons.rounded.bold

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

public val Icons.Bold.MapMarkerCheck: ImageVector
    get() {
        if (_mapMarkerCheck != null) {
            return _mapMarkerCheck!!
        }
        _mapMarkerCheck = Builder(name = "MapMarkerCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.506f, 0.0f, -2.928f, -0.583f, -4.004f, -1.64f)
                lineToRelative(-3.734f, -3.466f)
                curveTo(-0.065f, 14.548f, -0.065f, 7.543f, 4.219f, 3.238f)
                curveTo(6.297f, 1.15f, 9.061f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.702f, 1.15f, 7.781f, 3.238f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.284f, 4.305f, 4.284f, 11.31f, 0.0f, 15.615f)
                lineToRelative(-3.809f, 3.537f)
                curveToRelative(-1.045f, 1.028f, -2.467f, 1.61f, -3.973f, 1.61f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-2.136f, 0.0f, -4.144f, 0.836f, -5.654f, 2.354f)
                curveToRelative(-3.124f, 3.138f, -3.124f, 8.245f, 0.0f, 11.383f)
                lineToRelative(3.723f, 3.455f)
                curveToRelative(1.084f, 1.063f, 2.811f, 1.034f, 3.832f, 0.029f)
                lineToRelative(3.797f, -3.525f)
                curveToRelative(3.081f, -3.097f, 3.081f, -8.204f, -0.043f, -11.342f)
                curveToRelative(-1.511f, -1.518f, -3.52f, -2.354f, -5.654f, -2.354f)
                close()
                moveTo(10.504f, 15.0f)
                curveToRelative(-0.641f, 0.0f, -1.283f, -0.244f, -1.771f, -0.732f)
                lineToRelative(-2.272f, -2.187f)
                curveToRelative(-0.597f, -0.574f, -0.615f, -1.524f, -0.041f, -2.121f)
                curveToRelative(0.575f, -0.597f, 1.524f, -0.616f, 2.121f, -0.041f)
                lineToRelative(1.957f, 1.883f)
                lineToRelative(4.452f, -4.373f)
                curveToRelative(0.592f, -0.58f, 1.541f, -0.571f, 2.121f, 0.02f)
                curveToRelative(0.58f, 0.591f, 0.571f, 1.541f, -0.02f, 2.121f)
                lineToRelative(-4.793f, 4.707f)
                curveToRelative(-0.481f, 0.481f, -1.117f, 0.723f, -1.754f, 0.723f)
                close()
            }
        }
        .build()
        return _mapMarkerCheck!!
    }

private var _mapMarkerCheck: ImageVector? = null
