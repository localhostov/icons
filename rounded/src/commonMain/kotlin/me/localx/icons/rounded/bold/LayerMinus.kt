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

public val Icons.Bold.LayerMinus: ImageVector
    get() {
        if (_layerMinus != null) {
            return _layerMinus!!
        }
        _layerMinus = Builder(name = "LayerMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.002f)
                curveToRelative(-0.645f, 0.0f, -1.289f, -0.175f, -1.864f, -0.522f)
                lineTo(0.724f, 9.783f)
                curveToRelative(-0.449f, -0.271f, -0.724f, -0.759f, -0.724f, -1.283f)
                reflectiveCurveToRelative(0.274f, -1.012f, 0.724f, -1.283f)
                lineTo(10.137f, 1.521f)
                curveToRelative(1.149f, -0.697f, 2.577f, -0.695f, 3.728f, 0.0f)
                lineToRelative(9.412f, 5.696f)
                curveToRelative(0.449f, 0.271f, 0.724f, 0.759f, 0.724f, 1.283f)
                reflectiveCurveToRelative(-0.274f, 1.012f, -0.724f, 1.283f)
                lineToRelative(-9.413f, 5.696f)
                curveToRelative(-0.574f, 0.349f, -1.219f, 0.522f, -1.863f, 0.522f)
                close()
                moveTo(4.397f, 8.5f)
                lineToRelative(7.292f, 4.413f)
                curveToRelative(0.192f, 0.114f, 0.43f, 0.114f, 0.62f, 0.0f)
                lineToRelative(7.293f, -4.413f)
                lineToRelative(-7.292f, -4.413f)
                curveToRelative(-0.193f, -0.116f, -0.431f, -0.115f, -0.62f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-7.292f, 4.413f)
                close()
                moveTo(24.0f, 19.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(12.786f, 21.271f)
                curveToRelative(0.426f, -0.71f, 0.196f, -1.632f, -0.514f, -2.058f)
                lineTo(2.366f, 13.271f)
                curveToRelative(-0.71f, -0.428f, -1.632f, -0.196f, -2.058f, 0.515f)
                curveToRelative(-0.426f, 0.71f, -0.196f, 1.632f, 0.514f, 2.058f)
                lineToRelative(9.906f, 5.943f)
                curveToRelative(0.242f, 0.146f, 0.508f, 0.214f, 0.771f, 0.214f)
                curveToRelative(0.51f, 0.0f, 1.006f, -0.26f, 1.288f, -0.729f)
                close()
            }
        }
        .build()
        return _layerMinus!!
    }

private var _layerMinus: ImageVector? = null
