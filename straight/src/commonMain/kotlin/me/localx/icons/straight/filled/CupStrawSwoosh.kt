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

public val Icons.Filled.CupStrawSwoosh: ImageVector
    get() {
        if (_cupStrawSwoosh != null) {
            return _cupStrawSwoosh!!
        }
        _cupStrawSwoosh = Builder(name = "CupStrawSwoosh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.499f, 14.864f)
                lineToRelative(-0.766f, 6.487f)
                curveToRelative(-0.179f, 1.51f, -1.459f, 2.648f, -2.979f, 2.648f)
                lineTo(7.323f, 23.999f)
                curveToRelative(-1.52f, 0.0f, -2.801f, -1.139f, -2.979f, -2.648f)
                lineToRelative(-0.634f, -5.371f)
                curveToRelative(1.227f, -0.825f, 3.387f, -1.981f, 4.79f, -1.981f)
                curveToRelative(0.808f, 0.0f, 1.987f, 0.472f, 3.128f, 0.929f)
                curveToRelative(1.317f, 0.526f, 2.679f, 1.071f, 3.872f, 1.071f)
                curveToRelative(1.866f, 0.0f, 3.642f, -0.551f, 4.999f, -1.136f)
                close()
                moveTo(14.545f, 5.0f)
                lineToRelative(0.376f, -3.0f)
                horizontalLineToRelative(5.117f)
                lineTo(20.038f, 0.0f)
                horizontalLineToRelative(-6.883f)
                lineToRelative(-0.627f, 5.0f)
                lineTo(1.038f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.611f)
                lineToRelative(0.802f, 6.793f)
                curveToRelative(1.396f, -0.836f, 3.371f, -1.793f, 5.049f, -1.793f)
                curveToRelative(1.192f, 0.0f, 2.554f, 0.545f, 3.872f, 1.071f)
                curveToRelative(1.141f, 0.457f, 2.321f, 0.929f, 3.128f, 0.929f)
                curveToRelative(2.095f, 0.0f, 4.17f, -0.89f, 5.273f, -1.456f)
                lineToRelative(0.654f, -5.544f)
                horizontalLineToRelative(1.611f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.493f)
                close()
            }
        }
        .build()
        return _cupStrawSwoosh!!
    }

private var _cupStrawSwoosh: ImageVector? = null
