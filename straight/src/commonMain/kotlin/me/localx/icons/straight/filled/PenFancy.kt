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

public val Icons.Filled.PenFancy: ImageVector
    get() {
        if (_penFancy != null) {
            return _penFancy!!
        }
        _penFancy = Builder(name = "PenFancy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.127f, 12.4f)
                lineToRelative(-4.519f, 1.004f)
                lineTo(0.113f, 22.536f)
                lineToRelative(6.009f, -6.009f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-6.009f, 6.009f)
                lineToRelative(9.132f, -2.495f)
                lineToRelative(1.004f, -4.519f)
                lineToRelative(-4.536f, -4.536f)
                close()
                moveTo(23.256f, 0.742f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-10.685f, 10.684f)
                lineToRelative(3.59f, 3.59f)
                lineToRelative(10.684f, -10.684f)
                curveToRelative(0.479f, -0.48f, 0.744f, -1.117f, 0.744f, -1.795f)
                reflectiveCurveToRelative(-0.264f, -1.316f, -0.744f, -1.795f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
