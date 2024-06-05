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

public val Icons.Filled.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.583f, 10.488f)
                curveToRelative(0.263f, 0.541f, 0.417f, 1.134f, 0.417f, 1.744f)
                verticalLineToRelative(11.769f)
                lineTo(0.0f, 24.001f)
                lineTo(0.0f, 12.231f)
                curveToRelative(0.001f, -0.609f, 0.156f, -1.201f, 0.419f, -1.742f)
                lineToRelative(8.046f, 8.046f)
                curveToRelative(0.945f, 0.944f, 2.2f, 1.464f, 3.536f, 1.464f)
                reflectiveCurveToRelative(2.591f, -0.52f, 3.535f, -1.464f)
                lineToRelative(8.048f, -8.048f)
                close()
                moveTo(3.0f, 10.243f)
                lineTo(3.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.242f)
                lineToRelative(-6.879f, 6.879f)
                curveToRelative(-1.133f, 1.133f, -3.109f, 1.133f, -4.243f, 0.0f)
                lineTo(3.0f, 10.243f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
