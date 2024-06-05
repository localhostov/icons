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

public val Icons.Bold.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.615f, 8.982f)
                lineToRelative(-1.615f, -1.547f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.938f)
                lineToRelative(-1.611f, 1.543f)
                curveTo(0.507f, 9.826f, 0.001f, 11.011f, 0.001f, 12.231f)
                verticalLineToRelative(11.769f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 12.231f)
                curveToRelative(0.0f, -1.222f, -0.505f, -2.407f, -1.385f, -3.25f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 12.28f)
                lineToRelative(5.111f, 5.11f)
                curveToRelative(1.072f, 1.072f, 2.48f, 1.607f, 3.889f, 1.607f)
                reflectiveCurveToRelative(2.817f, -0.536f, 3.889f, -1.608f)
                lineToRelative(5.111f, -5.111f)
                verticalLineToRelative(8.722f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
