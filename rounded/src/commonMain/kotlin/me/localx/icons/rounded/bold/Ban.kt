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

public val Icons.Bold.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.615f, 0.0f, 0.0f, 114.615f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.615f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.615f, 256.0f, -256.0f)
                curveTo(511.847f, 114.678f, 397.322f, 0.153f, 256.0f, 0.0f)
                close()
                moveTo(256.0f, 64.0f)
                curveToRelative(39.843f, 0.004f, 78.686f, 12.477f, 111.083f, 35.669f)
                lineTo(99.669f, 367.061f)
                curveToRelative(-61.503f, -86.178f, -41.499f, -205.897f, 44.679f, -267.4f)
                curveTo(176.93f, 76.409f, 215.972f, 63.939f, 256.0f, 64.0f)
                close()
                moveTo(256.0f, 448.0f)
                curveToRelative(-39.837f, -0.002f, -78.673f, -12.475f, -111.061f, -35.669f)
                lineToRelative(267.392f, -267.413f)
                curveToRelative(61.514f, 86.17f, 41.527f, 205.891f, -44.643f, 267.406f)
                curveTo(335.098f, 435.588f, 296.042f, 448.064f, 256.0f, 448.0f)
                close()
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
