package me.localx.icons.rounded.filled

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

public val Icons.Filled.TruckBolt: ImageVector
    get() {
        if (_truckBolt != null) {
            return _truckBolt!!
        }
        _truckBolt = Builder(name = "TruckBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(15.057f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(-4.885f)
                close()
                moveTo(18.999f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(16.999f, 18.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(14.999f, 5.0f)
                verticalLineToRelative(13.0f)
                lineTo(4.0f, 18.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.791f, 1.791f, 1.0f, 4.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                close()
                moveTo(10.806f, 8.845f)
                curveToRelative(-0.279f, -0.521f, -0.821f, -0.845f, -1.412f, -0.845f)
                horizontalLineToRelative(-3.028f)
                lineToRelative(1.965f, -2.945f)
                curveToRelative(0.307f, -0.459f, 0.183f, -1.08f, -0.277f, -1.387f)
                curveToRelative(-0.459f, -0.307f, -1.079f, -0.183f, -1.387f, 0.277f)
                curveToRelative(0.0f, 0.0f, -2.57f, 3.878f, -2.599f, 3.973f)
                curveToRelative(-0.147f, 0.486f, -0.054f, 1.021f, 0.249f, 1.43f)
                curveToRelative(0.304f, 0.408f, 0.788f, 0.652f, 1.297f, 0.652f)
                horizontalLineToRelative(3.035f)
                lineToRelative(-1.979f, 2.941f)
                curveToRelative(-0.309f, 0.458f, -0.188f, 1.08f, 0.271f, 1.388f)
                curveToRelative(0.172f, 0.116f, 0.365f, 0.171f, 0.558f, 0.171f)
                curveToRelative(0.321f, 0.0f, 0.638f, -0.154f, 0.83f, -0.441f)
                lineToRelative(2.403f, -3.569f)
                curveToRelative(0.326f, -0.493f, 0.355f, -1.124f, 0.075f, -1.645f)
                close()
            }
        }
        .build()
        return _truckBolt!!
    }

private var _truckBolt: ImageVector? = null
