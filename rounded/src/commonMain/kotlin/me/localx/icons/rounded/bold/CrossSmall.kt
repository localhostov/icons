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

public val Icons.Bold.CrossSmall: ImageVector
    get() {
        if (_crossSmall != null) {
            return _crossSmall!!
        }
        _crossSmall = Builder(name = "CrossSmall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.121f, 12.0f)
                lineTo(18.0f, 8.117f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.883f, 6.0f)
                lineTo(12.0f, 9.879f)
                lineTo(8.11f, 5.988f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 5.988f, 8.11f)
                lineTo(9.879f, 12.0f)
                lineTo(6.0f, 15.882f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.118f, 18.0f)
                lineTo(12.0f, 14.121f)
                lineTo(15.878f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 15.878f)
                close()
            }
        }
        .build()
        return _crossSmall!!
    }

private var _crossSmall: ImageVector? = null
