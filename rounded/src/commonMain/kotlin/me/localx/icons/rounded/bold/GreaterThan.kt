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

public val Icons.Bold.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) {
            return _greaterThan!!
        }
        _greaterThan = Builder(name = "GreaterThan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.501f, 24.0f)
                curveToRelative(-0.594f, 0.0f, -1.156f, -0.354f, -1.392f, -0.938f)
                curveToRelative(-0.311f, -0.768f, 0.061f, -1.643f, 0.829f, -1.952f)
                lineToRelative(19.155f, -7.735f)
                curveToRelative(0.859f, -0.348f, 0.927f, -1.14f, 0.927f, -1.375f)
                curveToRelative(0.0f, -0.234f, -0.067f, -1.026f, -0.927f, -1.373f)
                lineTo(0.938f, 2.891f)
                curveTo(0.17f, 2.581f, -0.201f, 1.707f, 0.109f, 0.938f)
                curveTo(0.418f, 0.17f, 1.292f, -0.205f, 2.062f, 0.109f)
                lineToRelative(19.155f, 7.736f)
                curveToRelative(1.702f, 0.687f, 2.803f, 2.318f, 2.804f, 4.154f)
                curveToRelative(0.0f, 1.837f, -1.101f, 3.468f, -2.803f, 4.156f)
                lineTo(2.062f, 23.891f)
                curveToRelative(-0.184f, 0.074f, -0.374f, 0.109f, -0.561f, 0.109f)
                close()
            }
        }
        .build()
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
