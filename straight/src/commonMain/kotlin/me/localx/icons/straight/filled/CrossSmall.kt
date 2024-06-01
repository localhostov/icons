package me.localx.icons.straight.filled

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

public val Icons.Filled.CrossSmall: ImageVector
    get() {
        if (_crossSmall != null) {
            return _crossSmall!!
        }
        _crossSmall = Builder(name = "CrossSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7068f, 6.7069f)
                lineTo(17.2928f, 5.2929f)
                lineTo(11.9998f, 10.5858f)
                lineTo(6.7069f, 5.2929f)
                lineTo(5.2929f, 6.7069f)
                lineTo(10.5858f, 11.9998f)
                lineTo(5.2929f, 17.2928f)
                lineTo(6.7069f, 18.7068f)
                lineTo(11.9998f, 13.4138f)
                lineTo(17.2928f, 18.7068f)
                lineTo(18.7068f, 17.2928f)
                lineTo(13.4138f, 11.9998f)
                lineTo(18.7068f, 6.7069f)
                close()
            }
        }
        .build()
        return _crossSmall!!
    }

private var _crossSmall: ImageVector? = null
