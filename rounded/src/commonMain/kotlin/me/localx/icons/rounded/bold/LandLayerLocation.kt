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
                moveToRelative(10.252f, 12.682f)
                curveToRelative(0.972f, 0.95f, 2.524f, 0.95f, 3.496f, 0.0f)
                lineToRelative(2.494f, -2.439f)
                curveToRelative(1.134f, -1.133f, 1.758f, -2.64f, 1.758f, -4.243f)
                reflectiveCurveToRelative(-0.624f, -3.11f, -1.758f, -4.243f)
                curveToRelative(-1.134f, -1.133f, -2.641f, -1.757f, -4.242f, -1.757f)
                reflectiveCurveToRelative(-3.11f, 0.624f, -4.242f, 1.757f)
                curveToRelative(-1.134f, 1.133f, -1.758f, 2.64f, -1.758f, 4.243f)
                reflectiveCurveToRelative(0.624f, 3.11f, 1.77f, 4.254f)
                lineToRelative(2.482f, 2.428f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(24.0f, 16.5f)
                curveToRelative(0.0f, 0.524f, -0.274f, 1.012f, -0.724f, 1.283f)
                lineToRelative(-9.413f, 5.696f)
                curveToRelative(-0.574f, 0.348f, -1.219f, 0.522f, -1.863f, 0.522f)
                reflectiveCurveToRelative(-1.289f, -0.175f, -1.864f, -0.522f)
                lineTo(0.724f, 17.783f)
                curveToRelative(-0.449f, -0.271f, -0.724f, -0.759f, -0.724f, -1.283f)
                reflectiveCurveToRelative(0.274f, -1.012f, 0.724f, -1.283f)
                lineToRelative(4.957f, -3.0f)
                curveToRelative(0.706f, -0.428f, 1.63f, -0.202f, 2.06f, 0.506f)
                curveToRelative(0.429f, 0.708f, 0.202f, 1.631f, -0.507f, 2.06f)
                lineToRelative(-2.836f, 1.717f)
                lineToRelative(7.292f, 4.413f)
                curveToRelative(0.191f, 0.115f, 0.429f, 0.115f, 0.62f, 0.0f)
                lineToRelative(7.293f, -4.413f)
                lineToRelative(-2.836f, -1.717f)
                curveToRelative(-0.709f, -0.429f, -0.936f, -1.352f, -0.507f, -2.06f)
                curveToRelative(0.43f, -0.708f, 1.353f, -0.935f, 2.06f, -0.506f)
                lineToRelative(4.957f, 3.0f)
                curveToRelative(0.449f, 0.271f, 0.724f, 0.759f, 0.724f, 1.283f)
                close()
            }
        }
        .build()
        return _landLayerLocation!!
    }

private var _landLayerLocation: ImageVector? = null
