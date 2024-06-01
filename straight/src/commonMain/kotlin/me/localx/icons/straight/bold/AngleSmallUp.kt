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

public val Icons.Bold.AngleSmallUp: ImageVector
    get() {
        if (_angleSmallUp != null) {
            return _angleSmallUp!!
        }
        _angleSmallUp = Builder(name = "AngleSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9391f, 15.561f)
                lineTo(12.0001f, 10.621f)
                lineTo(7.0611f, 15.561f)
                lineTo(4.9391f, 13.439f)
                lineTo(10.2321f, 8.146f)
                curveTo(10.4642f, 7.9138f, 10.7399f, 7.7296f, 11.0432f, 7.6039f)
                curveTo(11.3466f, 7.4783f, 11.6717f, 7.4136f, 12.0001f, 7.4136f)
                curveTo(12.3284f, 7.4136f, 12.6536f, 7.4783f, 12.9569f, 7.6039f)
                curveTo(13.2603f, 7.7296f, 13.5359f, 7.9138f, 13.7681f, 8.146f)
                lineTo(19.0611f, 13.439f)
                lineTo(16.9391f, 15.561f)
                close()
            }
        }
        .build()
        return _angleSmallUp!!
    }

private var _angleSmallUp: ImageVector? = null
