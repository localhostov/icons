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

public val Icons.Outline.ClothesHanger: ImageVector
    get() {
        if (_clothesHanger != null) {
            return _clothesHanger!!
        }
        _clothesHanger = Builder(name = "ClothesHanger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.751f, 17.411f)
                lineToRelative(-9.108f, -6.47f)
                curveToRelative(2.639f, -2.166f, 3.844f, -3.16f, 3.175f, -6.087f)
                curveToRelative(-0.417f, -1.822f, -1.862f, -3.268f, -3.684f, -3.684f)
                curveToRelative(-1.514f, -0.345f, -3.068f, 0.0f, -4.259f, 0.952f)
                curveToRelative(-1.192f, 0.95f, -1.875f, 2.369f, -1.875f, 3.891f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.911f, 0.409f, -1.759f, 1.122f, -2.328f)
                curveToRelative(0.724f, -0.578f, 1.635f, -0.779f, 2.568f, -0.565f)
                curveToRelative(1.061f, 0.242f, 1.937f, 1.118f, 2.179f, 2.179f)
                curveToRelative(0.383f, 1.678f, 0.148f, 1.927f, -2.505f, 4.106f)
                lineToRelative(-0.968f, 0.799f)
                lineTo(1.222f, 17.431f)
                curveToRelative(-0.765f, 0.583f, -1.222f, 1.506f, -1.222f, 2.467f)
                curveToRelative(0.0f, 1.71f, 1.392f, 3.102f, 3.102f, 3.102f)
                horizontalLineToRelative(17.796f)
                curveToRelative(1.71f, 0.0f, 3.102f, -1.392f, 3.102f, -3.102f)
                curveToRelative(0.0f, -0.961f, -0.457f, -1.884f, -1.249f, -2.487f)
                close()
                moveTo(20.898f, 21.0f)
                lineTo(3.102f, 21.0f)
                curveToRelative(-0.608f, 0.0f, -1.102f, -0.494f, -1.102f, -1.102f)
                curveToRelative(0.0f, -0.341f, 0.163f, -0.669f, 0.407f, -0.856f)
                lineToRelative(9.593f, -6.815f)
                lineToRelative(9.565f, 6.795f)
                curveToRelative(0.272f, 0.207f, 0.435f, 0.535f, 0.435f, 0.876f)
                curveToRelative(0.0f, 0.608f, -0.494f, 1.102f, -1.102f, 1.102f)
                close()
            }
        }
        .build()
        return _clothesHanger!!
    }

private var _clothesHanger: ImageVector? = null
