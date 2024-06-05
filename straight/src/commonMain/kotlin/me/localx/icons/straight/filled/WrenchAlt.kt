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

public val Icons.Filled.WrenchAlt: ImageVector
    get() {
        if (_wrenchAlt != null) {
            return _wrenchAlt!!
        }
        _wrenchAlt = Builder(name = "WrenchAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.013f, 3.776f)
                lineToRelative(-4.598f, 4.598f)
                curveToRelative(-0.781f, 0.781f, -2.047f, 0.781f, -2.828f, 0.0f)
                curveToRelative(-0.781f, -0.781f, -0.781f, -2.047f, 0.0f, -2.828f)
                lineTo(20.172f, 0.959f)
                lineToRelative(-0.292f, -0.148f)
                curveToRelative(-1.062f, -0.539f, -2.2f, -0.812f, -3.381f, -0.812f)
                curveToRelative(-4.136f, 0.0f, -7.5f, 3.364f, -7.5f, 7.5f)
                curveToRelative(0.0f, 0.959f, 0.178f, 1.886f, 0.531f, 2.767f)
                lineTo(0.918f, 18.879f)
                curveToRelative(-1.168f, 1.17f, -1.168f, 3.072f, 0.0f, 4.242f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.121f, 0.877f)
                reflectiveCurveToRelative(1.537f, -0.292f, 2.122f, -0.877f)
                lineToRelative(8.631f, -8.631f)
                curveToRelative(0.865f, 0.339f, 1.773f, 0.51f, 2.708f, 0.51f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                curveToRelative(0.0f, -1.208f, -0.283f, -2.366f, -0.841f, -3.442f)
                lineToRelative(-0.146f, -0.282f)
                close()
            }
        }
        .build()
        return _wrenchAlt!!
    }

private var _wrenchAlt: ImageVector? = null
