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

public val Icons.Outline.StarChristmas: ImageVector
    get() {
        if (_starChristmas != null) {
            return _starChristmas!!
        }
        _starChristmas = Builder(name = "StarChristmas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.986f, 10.487f)
                lineToRelative(-4.566f, -1.88f)
                lineToRelative(3.414f, -5.12f)
                curveToRelative(0.572f, -0.866f, -0.456f, -1.894f, -1.322f, -1.322f)
                lineToRelative(-5.125f, 3.401f)
                lineToRelative(-1.874f, -4.554f)
                curveToRelative(-0.254f, -0.615f, -0.849f, -1.013f, -1.514f, -1.013f)
                reflectiveCurveToRelative(-1.26f, 0.397f, -1.514f, 1.013f)
                lineToRelative(-1.874f, 4.553f)
                lineTo(3.487f, 2.165f)
                curveToRelative(-0.866f, -0.572f, -1.894f, 0.455f, -1.322f, 1.322f)
                lineToRelative(3.414f, 5.12f)
                lineToRelative(-4.565f, 1.88f)
                curveToRelative(-0.616f, 0.253f, -1.015f, 0.847f, -1.015f, 1.513f)
                reflectiveCurveToRelative(0.398f, 1.26f, 1.014f, 1.513f)
                lineToRelative(4.559f, 1.877f)
                lineToRelative(-3.407f, 5.11f)
                curveToRelative(-0.572f, 0.866f, 0.456f, 1.894f, 1.322f, 1.322f)
                lineToRelative(5.121f, -3.398f)
                lineToRelative(1.878f, 4.564f)
                curveToRelative(0.254f, 0.615f, 0.849f, 1.013f, 1.514f, 1.013f)
                reflectiveCurveToRelative(1.26f, -0.397f, 1.514f, -1.013f)
                lineToRelative(1.878f, -4.563f)
                lineToRelative(5.121f, 3.398f)
                curveToRelative(0.866f, 0.572f, 1.894f, -0.455f, 1.322f, -1.322f)
                lineToRelative(-3.407f, -5.11f)
                lineToRelative(4.558f, -1.877f)
                curveToRelative(0.616f, -0.253f, 1.015f, -0.847f, 1.015f, -1.513f)
                reflectiveCurveToRelative(-0.398f, -1.26f, -1.014f, -1.513f)
                close()
                moveTo(15.129f, 14.586f)
                curveToRelative(-0.246f, 0.102f, -0.442f, 0.297f, -0.544f, 0.544f)
                lineToRelative(-2.585f, 6.28f)
                lineToRelative(-2.585f, -6.28f)
                curveToRelative(-0.102f, -0.247f, -0.298f, -0.442f, -0.544f, -0.544f)
                lineToRelative(-6.279f, -2.585f)
                lineToRelative(6.279f, -2.585f)
                curveToRelative(0.246f, -0.102f, 0.442f, -0.297f, 0.544f, -0.544f)
                lineToRelative(2.585f, -6.28f)
                lineToRelative(2.585f, 6.28f)
                curveToRelative(0.102f, 0.247f, 0.298f, 0.442f, 0.544f, 0.544f)
                lineToRelative(6.279f, 2.585f)
                lineToRelative(-6.279f, 2.585f)
                close()
            }
        }
        .build()
        return _starChristmas!!
    }

private var _starChristmas: ImageVector? = null
