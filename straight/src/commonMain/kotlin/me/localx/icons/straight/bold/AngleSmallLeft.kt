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

public val Icons.Bold.AngleSmallLeft: ImageVector
    get() {
        if (_angleSmallLeft != null) {
            return _angleSmallLeft!!
        }
        _angleSmallLeft = Builder(name = "AngleSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4218f, 19.061f)
                lineTo(8.1288f, 13.768f)
                curveTo(7.8966f, 13.5358f, 7.7123f, 13.2602f, 7.5867f, 12.9568f)
                curveTo(7.461f, 12.6535f, 7.3963f, 12.3283f, 7.3963f, 12.0f)
                curveTo(7.3963f, 11.6716f, 7.461f, 11.3465f, 7.5867f, 11.0431f)
                curveTo(7.7123f, 10.7397f, 7.8966f, 10.4641f, 8.1288f, 10.232f)
                lineTo(13.4218f, 4.939f)
                lineTo(15.5428f, 7.061f)
                lineTo(10.5998f, 12.0f)
                lineTo(15.5388f, 16.939f)
                lineTo(13.4218f, 19.061f)
                close()
            }
        }
        .build()
        return _angleSmallLeft!!
    }

private var _angleSmallLeft: ImageVector? = null
