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

public val Icons.Bold.LayerPlus: ImageVector
    get() {
        if (_layerPlus != null) {
            return _layerPlus!!
        }
        _layerPlus = Builder(name = "LayerPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, -0.524f, -0.274f, -1.012f, -0.724f, -1.283f)
                lineTo(13.864f, 1.521f)
                curveToRelative(-1.15f, -0.695f, -2.578f, -0.697f, -3.728f, 0.0f)
                lineTo(0.724f, 7.217f)
                curveToRelative(-0.449f, 0.271f, -0.724f, 0.759f, -0.724f, 1.283f)
                reflectiveCurveToRelative(0.274f, 1.012f, 0.724f, 1.283f)
                lineToRelative(9.412f, 5.696f)
                curveToRelative(0.575f, 0.348f, 1.22f, 0.522f, 1.864f, 0.522f)
                reflectiveCurveToRelative(1.289f, -0.174f, 1.863f, -0.522f)
                lineToRelative(9.413f, -5.696f)
                curveToRelative(0.449f, -0.271f, 0.724f, -0.759f, 0.724f, -1.283f)
                close()
                moveTo(12.31f, 12.913f)
                curveToRelative(-0.19f, 0.114f, -0.428f, 0.114f, -0.62f, 0.0f)
                lineToRelative(-7.292f, -4.413f)
                lineToRelative(7.292f, -4.413f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.189f, -0.115f, 0.427f, -0.116f, 0.62f, 0.0f)
                lineToRelative(7.292f, 4.413f)
                lineToRelative(-7.293f, 4.413f)
                close()
                moveTo(24.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.786f, 21.271f)
                curveToRelative(-0.281f, 0.469f, -0.778f, 0.729f, -1.288f, 0.729f)
                curveToRelative(-0.263f, 0.0f, -0.529f, -0.068f, -0.771f, -0.214f)
                lineTo(0.822f, 15.843f)
                curveToRelative(-0.71f, -0.426f, -0.94f, -1.348f, -0.514f, -2.058f)
                curveToRelative(0.426f, -0.711f, 1.348f, -0.942f, 2.058f, -0.515f)
                lineToRelative(9.906f, 5.943f)
                curveToRelative(0.71f, 0.426f, 0.94f, 1.348f, 0.514f, 2.058f)
                close()
            }
        }
        .build()
        return _layerPlus!!
    }

private var _layerPlus: ImageVector? = null
