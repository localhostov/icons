package me.localx.icons.straight.outline

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
                moveToRelative(23.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                lineTo(1.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(9.17f, 13.121f)
                lineToRelative(2.284f, -4.568f)
                lineToRelative(1.789f, 0.895f)
                lineToRelative(-1.792f, 3.585f)
                horizontalLineToRelative(2.259f)
                curveToRelative(0.454f, 0.0f, 0.87f, 0.229f, 1.114f, 0.611f)
                curveToRelative(0.244f, 0.382f, 0.275f, 0.856f, 0.083f, 1.267f)
                lineToRelative(-2.104f, 4.513f)
                lineToRelative(-1.812f, -0.846f)
                lineToRelative(1.653f, -3.545f)
                horizontalLineToRelative(-2.292f)
                curveToRelative(-0.461f, 0.0f, -0.881f, -0.234f, -1.124f, -0.626f)
                reflectiveCurveToRelative(-0.264f, -0.873f, -0.058f, -1.285f)
                close()
            }
        }
        .build()
        return _transformerBolt!!
    }

private var _transformerBolt: ImageVector? = null
