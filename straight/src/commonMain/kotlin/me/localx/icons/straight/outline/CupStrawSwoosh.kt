package me.localx.icons.straight.outline

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

public val Icons.Outline.CupStrawSwoosh: ImageVector
    get() {
        if (_cupStrawSwoosh != null) {
            return _cupStrawSwoosh!!
        }
        _cupStrawSwoosh = Builder(name = "CupStrawSwoosh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 5.0f)
                horizontalLineToRelative(-8.493f)
                lineToRelative(0.376f, -3.0f)
                horizontalLineToRelative(5.117f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-6.883f)
                lineToRelative(-0.627f, 5.0f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.611f)
                lineToRelative(1.694f, 14.352f)
                curveToRelative(0.179f, 1.509f, 1.459f, 2.648f, 2.979f, 2.648f)
                horizontalLineToRelative(9.431f)
                curveToRelative(1.52f, 0.0f, 2.801f, -1.139f, 2.979f, -2.648f)
                lineToRelative(1.694f, -14.352f)
                horizontalLineToRelative(1.611f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.715f, 22.0f)
                lineTo(7.285f, 22.0f)
                curveToRelative(-0.507f, 0.0f, -0.934f, -0.38f, -0.993f, -0.883f)
                lineToRelative(-0.672f, -5.696f)
                curveToRelative(0.836f, -0.574f, 2.299f, -1.422f, 3.381f, -1.422f)
                curveToRelative(0.764f, 0.0f, 1.633f, 0.435f, 2.553f, 0.895f)
                curveToRelative(1.087f, 0.543f, 2.211f, 1.105f, 3.447f, 1.105f)
                curveToRelative(1.198f, 0.0f, 2.462f, -0.547f, 3.442f, -1.101f)
                lineToRelative(-0.734f, 6.218f)
                curveToRelative(-0.06f, 0.503f, -0.486f, 0.883f, -0.993f, 0.883f)
                close()
                moveTo(18.747f, 12.316f)
                curveToRelative(-0.688f, 0.522f, -2.479f, 1.684f, -3.747f, 1.684f)
                curveToRelative(-0.764f, 0.0f, -1.633f, -0.435f, -2.553f, -0.895f)
                curveToRelative(-1.087f, -0.543f, -2.211f, -1.105f, -3.447f, -1.105f)
                curveToRelative(-1.283f, 0.0f, -2.637f, 0.627f, -3.641f, 1.218f)
                lineToRelative(-0.734f, -6.218f)
                horizontalLineToRelative(14.75f)
                lineToRelative(-0.628f, 5.316f)
                close()
            }
        }
        .build()
        return _cupStrawSwoosh!!
    }

private var _cupStrawSwoosh: ImageVector? = null
