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

public val Icons.Bold.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -1.938f, 1.352f, -3.709f, 3.909f, -5.118f)
                curveToRelative(1.905f, -1.05f, 2.891f, -3.131f, 2.51f, -5.301f)
                curveToRelative(-0.352f, -2.003f, -1.997f, -3.648f, -4.0f, -4.0f)
                curveToRelative(-1.445f, -0.254f, -2.865f, 0.092f, -4.001f, 0.974f)
                curveToRelative(-1.115f, 0.867f, -1.816f, 2.164f, -1.922f, 3.559f)
                curveToRelative(-0.063f, 0.825f, -0.785f, 1.445f, -1.609f, 1.382f)
                curveToRelative(-0.826f, -0.063f, -1.445f, -0.783f, -1.382f, -1.609f)
                curveToRelative(0.17f, -2.237f, 1.29f, -4.315f, 3.073f, -5.7f)
                curveTo(8.89f, 0.278f, 11.149f, -0.275f, 13.437f, 0.126f)
                curveToRelative(3.224f, 0.566f, 5.871f, 3.213f, 6.437f, 6.437f)
                curveToRelative(0.597f, 3.399f, -1.018f, 6.794f, -4.017f, 8.447f)
                curveToRelative(-1.476f, 0.813f, -2.357f, 1.744f, -2.357f, 2.49f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.5f, 22.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
