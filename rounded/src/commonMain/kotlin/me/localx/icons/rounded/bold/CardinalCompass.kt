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

public val Icons.Bold.CardinalCompass: ImageVector
    get() {
        if (_cardinalCompass != null) {
            return _cardinalCompass!!
        }
        _cardinalCompass = Builder(name = "CardinalCompass", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.057f, 10.607f)
                lineToRelative(-4.478f, -1.791f)
                lineToRelative(1.3f, -2.726f)
                curveToRelative(0.241f, -0.564f, 0.115f, -1.218f, -0.318f, -1.651f)
                reflectiveCurveToRelative(-1.088f, -0.559f, -1.651f, -0.318f)
                lineToRelative(-2.725f, 1.3f)
                lineTo(13.393f, 0.943f)
                curveToRelative(-0.228f, -0.569f, -0.779f, -0.943f, -1.393f, -0.943f)
                reflectiveCurveToRelative(-1.165f, 0.374f, -1.393f, 0.943f)
                lineToRelative(-1.791f, 4.478f)
                lineToRelative(-2.725f, -1.3f)
                curveToRelative(-0.562f, -0.241f, -1.218f, -0.116f, -1.651f, 0.318f)
                curveToRelative(-0.434f, 0.434f, -0.56f, 1.087f, -0.318f, 1.651f)
                lineToRelative(1.3f, 2.725f)
                lineTo(0.943f, 10.607f)
                curveToRelative(-0.569f, 0.228f, -0.943f, 0.779f, -0.943f, 1.393f)
                reflectiveCurveToRelative(0.374f, 1.165f, 0.943f, 1.393f)
                lineToRelative(4.497f, 1.799f)
                lineToRelative(-1.319f, 2.808f)
                curveToRelative(-0.241f, 0.563f, -0.115f, 1.218f, 0.318f, 1.651f)
                curveToRelative(0.434f, 0.435f, 1.089f, 0.559f, 1.651f, 0.318f)
                lineToRelative(2.742f, -1.35f)
                lineToRelative(1.775f, 4.437f)
                curveToRelative(0.228f, 0.57f, 0.779f, 0.943f, 1.393f, 0.943f)
                reflectiveCurveToRelative(1.165f, -0.373f, 1.393f, -0.943f)
                lineToRelative(1.792f, -4.477f)
                lineToRelative(2.725f, 1.3f)
                curveToRelative(0.19f, 0.081f, 0.392f, 0.121f, 0.591f, 0.121f)
                curveToRelative(0.39f, 0.0f, 0.773f, -0.152f, 1.061f, -0.439f)
                curveToRelative(0.434f, -0.434f, 0.56f, -1.088f, 0.318f, -1.651f)
                lineToRelative(-1.3f, -2.725f)
                lineToRelative(4.477f, -1.792f)
                curveToRelative(0.57f, -0.228f, 0.943f, -0.779f, 0.943f, -1.393f)
                reflectiveCurveToRelative(-0.373f, -1.165f, -0.943f, -1.393f)
                close()
                moveTo(12.0f, 18.461f)
                lineToRelative(-1.607f, -4.018f)
                curveToRelative(-0.152f, -0.382f, -0.454f, -0.684f, -0.835f, -0.836f)
                lineToRelative(-4.018f, -1.607f)
                lineToRelative(4.018f, -1.607f)
                curveToRelative(0.381f, -0.152f, 0.683f, -0.454f, 0.835f, -0.835f)
                lineToRelative(1.607f, -4.018f)
                lineToRelative(1.607f, 4.018f)
                curveToRelative(0.152f, 0.381f, 0.454f, 0.683f, 0.836f, 0.835f)
                lineToRelative(4.018f, 1.607f)
                lineToRelative(-4.018f, 1.607f)
                curveToRelative(-0.382f, 0.152f, -0.684f, 0.454f, -0.836f, 0.836f)
                lineToRelative(-1.607f, 4.018f)
                close()
            }
        }
        .build()
        return _cardinalCompass!!
    }

private var _cardinalCompass: ImageVector? = null
