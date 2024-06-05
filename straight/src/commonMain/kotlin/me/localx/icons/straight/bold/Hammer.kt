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

public val Icons.Bold.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.269f, 9.557f)
                lineToRelative(-7.07f, -7.071f)
                curveTo(12.884f, -0.829f, 7.491f, -0.829f, 4.178f, 2.486f)
                lineToRelative(-1.061f, 1.061f)
                lineToRelative(7.254f, 7.254f)
                lineTo(0.0f, 21.172f)
                lineToRelative(2.828f, 2.828f)
                lineTo(13.2f, 13.629f)
                lineToRelative(2.999f, 2.999f)
                curveToRelative(0.487f, 0.487f, 1.127f, 0.731f, 1.768f, 0.731f)
                reflectiveCurveToRelative(1.28f, -0.244f, 1.768f, -0.731f)
                lineToRelative(3.535f, -3.535f)
                curveToRelative(0.975f, -0.975f, 0.975f, -2.561f, 0.0f, -3.535f)
                close()
                moveTo(7.507f, 3.694f)
                curveToRelative(2.094f, -1.168f, 4.793f, -0.863f, 6.57f, 0.913f)
                lineToRelative(2.474f, 2.475f)
                lineToRelative(-2.828f, 2.828f)
                lineTo(7.507f, 3.694f)
                close()
                moveTo(17.966f, 14.153f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(2.828f, -2.828f)
                lineToRelative(2.121f, 2.122f)
                lineToRelative(-2.828f, 2.828f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
