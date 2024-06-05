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

public val Icons.Bold.FeatherPointed: ImageVector
    get() {
        if (_featherPointed != null) {
            return _featherPointed!!
        }
        _featherPointed = Builder(name = "FeatherPointed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.139f, 0.203f)
                curveToRelative(-2.624f, 0.288f, -10.609f, 1.163f, -16.873f, 7.446f)
                curveToRelative(-1.561f, 1.565f, -2.396f, 3.732f, -2.29f, 5.944f)
                curveToRelative(0.069f, 1.434f, 0.532f, 2.812f, 1.317f, 3.991f)
                lineTo(0.007f, 21.872f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(4.272f, -4.272f)
                curveToRelative(1.289f, 0.876f, 2.792f, 1.306f, 4.31f, 1.306f)
                curveToRelative(2.165f, 0.0f, 4.357f, -0.876f, 5.99f, -2.58f)
                curveToRelative(3.971f, -4.146f, 6.425f, -9.887f, 7.096f, -16.604f)
                lineTo(23.979f, 0.002f)
                lineToRelative(-1.84f, 0.201f)
                close()
                moveTo(5.974f, 13.45f)
                curveToRelative(-0.066f, -1.371f, 0.451f, -2.714f, 1.417f, -3.683f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.435f, -4.448f, 9.953f, -5.831f, 13.176f, -6.337f)
                curveToRelative(-0.256f, 1.6f, -0.627f, 3.127f, -1.109f, 4.569f)
                horizontalLineToRelative(-5.578f)
                lineToRelative(-7.399f, 7.399f)
                curveToRelative(-0.299f, -0.598f, -0.473f, -1.257f, -0.506f, -1.949f)
                close()
                moveTo(18.237f, 11.0f)
                curveToRelative(-0.338f, 0.693f, -0.705f, 1.36f, -1.101f, 2.0f)
                horizontalLineToRelative(-4.014f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineToRelative(3.116f)
                close()
                moveTo(8.587f, 17.534f)
                lineToRelative(1.534f, -1.534f)
                horizontalLineToRelative(4.758f)
                curveToRelative(-0.114f, 0.125f, -0.229f, 0.25f, -0.346f, 0.372f)
                curveToRelative(-1.613f, 1.684f, -4.061f, 2.115f, -5.946f, 1.162f)
                close()
            }
        }
        .build()
        return _featherPointed!!
    }

private var _featherPointed: ImageVector? = null
