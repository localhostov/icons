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
                moveTo(13.5f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.786f)
                curveToRelative(0.0f, -2.371f, 1.388f, -4.442f, 3.909f, -5.832f)
                curveToRelative(1.905f, -1.05f, 2.891f, -3.131f, 2.51f, -5.301f)
                curveToRelative(-0.352f, -2.003f, -1.997f, -3.648f, -4.0f, -4.0f)
                curveToRelative(-1.513f, -0.265f, -2.979f, 0.121f, -4.131f, 1.087f)
                curveToRelative(-1.136f, 0.954f, -1.787f, 2.351f, -1.787f, 3.832f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.37f, 1.042f, -4.604f, 2.858f, -6.129f)
                curveTo(8.673f, 0.347f, 11.074f, -0.287f, 13.437f, 0.126f)
                curveToRelative(3.224f, 0.566f, 5.871f, 3.213f, 6.437f, 6.437f)
                curveToRelative(0.597f, 3.399f, -1.018f, 6.794f, -4.017f, 8.447f)
                curveToRelative(-1.564f, 0.862f, -2.357f, 1.939f, -2.357f, 3.204f)
                verticalLineToRelative(0.786f)
                close()
                moveTo(13.5f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
