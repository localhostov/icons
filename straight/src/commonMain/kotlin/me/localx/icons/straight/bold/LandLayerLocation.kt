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

public val Icons.Bold.LandLayerLocation: ImageVector
    get() {
        if (_landLayerLocation != null) {
            return _landLayerLocation!!
        }
        _landLayerLocation = Builder(name = "LandLayerLocation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.242f, 1.757f)
                curveToRelative(-1.134f, -1.133f, -2.641f, -1.757f, -4.242f, -1.757f)
                reflectiveCurveToRelative(-3.11f, 0.624f, -4.242f, 1.757f)
                curveToRelative(-1.134f, 1.133f, -1.758f, 2.64f, -1.758f, 4.243f)
                reflectiveCurveToRelative(0.624f, 3.11f, 1.77f, 4.254f)
                lineToRelative(4.23f, 4.138f)
                lineToRelative(4.242f, -4.149f)
                curveToRelative(1.134f, -1.133f, 1.758f, -2.64f, 1.758f, -4.243f)
                reflectiveCurveToRelative(-0.624f, -3.11f, -1.758f, -4.243f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(24.0f, 15.701f)
                verticalLineToRelative(1.099f)
                lineToRelative(-12.0f, 7.2f)
                lineTo(0.0f, 16.8f)
                verticalLineToRelative(-1.099f)
                lineToRelative(6.494f, -3.897f)
                lineToRelative(2.217f, 2.169f)
                lineToRelative(-3.796f, 2.277f)
                lineToRelative(7.084f, 4.25f)
                lineToRelative(7.084f, -4.25f)
                lineToRelative(-3.796f, -2.277f)
                lineToRelative(2.217f, -2.168f)
                lineToRelative(6.494f, 3.896f)
                close()
            }
        }
        .build()
        return _landLayerLocation!!
    }

private var _landLayerLocation: ImageVector? = null
