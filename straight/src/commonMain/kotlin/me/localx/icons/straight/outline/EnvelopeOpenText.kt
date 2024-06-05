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

public val Icons.Outline.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.769f, 9.343f)
                lineToRelative(-1.769f, -1.694f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(3.0f, 7.651f)
                lineToRelative(-1.766f, 1.691f)
                curveTo(0.451f, 10.093f, 0.001f, 11.146f, 0.001f, 12.231f)
                verticalLineToRelative(11.769f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 12.231f)
                curveToRelative(0.0f, -1.086f, -0.448f, -2.139f, -1.231f, -2.889f)
                close()
                moveTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                lineTo(19.0f, 12.242f)
                lineToRelative(-4.879f, 4.879f)
                curveToRelative(-1.133f, 1.133f, -3.109f, 1.133f, -4.243f, 0.0f)
                lineToRelative(-4.878f, -4.879f)
                lineTo(5.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 12.231f)
                curveToRelative(0.001f, -0.051f, 0.004f, -0.102f, 0.008f, -0.153f)
                lineToRelative(6.456f, 6.457f)
                curveToRelative(0.945f, 0.944f, 2.2f, 1.464f, 3.536f, 1.464f)
                reflectiveCurveToRelative(2.591f, -0.52f, 3.535f, -1.464f)
                lineToRelative(6.458f, -6.459f)
                curveToRelative(0.004f, 0.051f, 0.007f, 0.103f, 0.007f, 0.154f)
                verticalLineToRelative(9.769f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                lineTo(15.0f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
