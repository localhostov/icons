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

public val Icons.Bold.ClothesHanger: ImageVector
    get() {
        if (_clothesHanger != null) {
            return _clothesHanger!!
        }
        _clothesHanger = Builder(name = "ClothesHanger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.598f, 16.689f)
                lineToRelative(-8.179f, -6.017f)
                curveToRelative(2.097f, -1.842f, 3.054f, -3.184f, 2.449f, -5.832f)
                curveToRelative(-0.419f, -1.834f, -1.875f, -3.29f, -3.71f, -3.708f)
                curveToRelative(-1.517f, -0.348f, -3.077f, 0.002f, -4.274f, 0.958f)
                curveToRelative(-1.198f, 0.955f, -1.884f, 2.38f, -1.884f, 3.911f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.612f, 0.275f, -1.183f, 0.754f, -1.565f)
                curveToRelative(0.486f, -0.388f, 1.101f, -0.525f, 1.737f, -0.378f)
                curveToRelative(0.707f, 0.161f, 1.291f, 0.745f, 1.452f, 1.452f)
                curveToRelative(0.293f, 1.283f, 0.232f, 1.48f, -2.87f, 4.066f)
                lineTo(1.381f, 16.705f)
                curveToRelative(-0.865f, 0.659f, -1.381f, 1.702f, -1.381f, 2.789f)
                curveToRelative(0.0f, 1.934f, 1.573f, 3.506f, 3.506f, 3.506f)
                horizontalLineToRelative(16.987f)
                curveToRelative(1.934f, 0.0f, 3.506f, -1.573f, 3.506f, -3.506f)
                curveToRelative(0.0f, -1.087f, -0.517f, -2.13f, -1.402f, -2.804f)
                close()
                moveTo(20.494f, 20.0f)
                lineTo(3.506f, 20.0f)
                curveToRelative(-0.279f, 0.0f, -0.506f, -0.227f, -0.506f, -0.506f)
                curveToRelative(0.0f, -0.157f, 0.075f, -0.307f, 0.179f, -0.387f)
                lineToRelative(8.821f, -6.489f)
                lineToRelative(8.8f, 6.474f)
                curveToRelative(0.125f, 0.095f, 0.2f, 0.246f, 0.2f, 0.402f)
                curveToRelative(0.0f, 0.279f, -0.227f, 0.506f, -0.506f, 0.506f)
                close()
            }
        }
        .build()
        return _clothesHanger!!
    }

private var _clothesHanger: ImageVector? = null
