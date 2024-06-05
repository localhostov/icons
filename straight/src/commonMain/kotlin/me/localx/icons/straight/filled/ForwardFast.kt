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

public val Icons.Filled.ForwardFast: ImageVector
    get() {
        if (_forwardFast != null) {
            return _forwardFast!!
        }
        _forwardFast = Builder(name = "ForwardFast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 0.0f)
                lineToRelative(0.0f, 9.293f)
                lineToRelative(-12.999f, -9.195f)
                lineToRelative(-0.001f, 6.902f)
                lineToRelative(-9.0f, -6.943f)
                lineToRelative(0.0f, 23.887f)
                lineToRelative(9.0f, -6.944f)
                lineToRelative(0.001f, 6.903f)
                lineToRelative(12.999f, -9.196f)
                lineToRelative(0.0f, 9.293f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(-2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _forwardFast!!
    }

private var _forwardFast: ImageVector? = null
