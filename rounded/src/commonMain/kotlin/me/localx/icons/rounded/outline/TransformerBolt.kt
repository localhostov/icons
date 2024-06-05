package me.localx.icons.rounded.outline

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

public val Icons.Outline.TransformerBolt: ImageVector
    get() {
        if (_transformerBolt != null) {
            return _transformerBolt!!
        }
        _transformerBolt = Builder(name = "TransformerBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(16.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(15.309f, 13.846f)
                curveToRelative(0.28f, 0.521f, 0.25f, 1.151f, -0.077f, 1.645f)
                lineToRelative(-2.37f, 4.018f)
                curveToRelative(-0.187f, 0.316f, -0.52f, 0.492f, -0.862f, 0.492f)
                curveToRelative(-0.173f, 0.0f, -0.348f, -0.044f, -0.507f, -0.139f)
                curveToRelative(-0.476f, -0.281f, -0.634f, -0.894f, -0.353f, -1.37f)
                lineToRelative(2.062f, -3.492f)
                horizontalLineToRelative(-3.085f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.653f)
                reflectiveCurveToRelative(-0.396f, -0.943f, -0.249f, -1.43f)
                curveToRelative(0.021f, -0.07f, 2.454f, -4.408f, 2.454f, -4.408f)
                curveToRelative(0.271f, -0.481f, 0.878f, -0.652f, 1.362f, -0.381f)
                curveToRelative(0.481f, 0.271f, 0.652f, 0.881f, 0.381f, 1.362f)
                lineToRelative(-1.976f, 3.509f)
                horizontalLineToRelative(3.104f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.846f)
                close()
            }
        }
        .build()
        return _transformerBolt!!
    }

private var _transformerBolt: ImageVector? = null
