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

public val Icons.Bold.CrossSmall: ImageVector
    get() {
        if (_crossSmall != null) {
            return _crossSmall!!
        }
        _crossSmall = Builder(name = "CrossSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0611f, 7.0611f)
                lineTo(16.9391f, 4.9391f)
                lineTo(12.0001f, 9.8791f)
                lineTo(7.0611f, 4.9391f)
                lineTo(4.9391f, 7.0611f)
                lineTo(9.8791f, 12.0001f)
                lineTo(4.9391f, 16.9391f)
                lineTo(7.0611f, 19.0611f)
                lineTo(12.0001f, 14.1211f)
                lineTo(16.9391f, 19.0611f)
                lineTo(19.0611f, 16.9391f)
                lineTo(14.1211f, 12.0001f)
                lineTo(19.0611f, 7.0611f)
                close()
            }
        }
        .build()
        return _crossSmall!!
    }

private var _crossSmall: ImageVector? = null
