package me.localx.icons.rounded.filled

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
                moveToRelative(23.968f, 2.506f)
                curveToRelative(0.0f, 0.678f, -0.264f, 1.316f, -0.744f, 1.795f)
                lineToRelative(-9.547f, 9.547f)
                lineToRelative(-3.59f, -3.59f)
                lineTo(19.635f, 0.711f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0.0f)
                curveToRelative(0.479f, 0.479f, 0.744f, 1.117f, 0.744f, 1.795f)
                close()
                moveTo(8.2f, 11.2f)
                lineToRelative(-3.556f, 1.09f)
                curveToRelative(-1.438f, 0.452f, -2.546f, 1.645f, -2.891f, 3.113f)
                lineTo(0.091f, 22.495f)
                lineToRelative(5.202f, -5.202f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-5.202f, 5.202f)
                lineToRelative(7.093f, -1.663f)
                curveToRelative(1.468f, -0.345f, 2.66f, -1.452f, 3.112f, -2.89f)
                lineToRelative(1.111f, -3.534f)
                lineToRelative(-4.622f, -4.622f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
