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

public val Icons.Filled.EnvelopeOpenDollar: ImageVector
    get() {
        if (_envelopeOpenDollar != null) {
            return _envelopeOpenDollar!!
        }
        _envelopeOpenDollar = Builder(name = "EnvelopeOpenDollar", defaultWidth = 512.0.dp,
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
                curveToRelative(0.975f, 0.975f, 2.255f, 1.462f, 3.536f, 1.462f)
                reflectiveCurveToRelative(2.561f, -0.487f, 3.536f, -1.462f)
                lineToRelative(8.047f, -8.048f)
                close()
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(7.243f)
                lineToRelative(-6.878f, 6.879f)
                curveToRelative(-1.17f, 1.168f, -3.073f, 1.168f, -4.243f, 0.0f)
                lineTo(3.0f, 10.243f)
                lineTo(3.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.36f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.042f, 0.507f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.76f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.76f)
                close()
            }
        }
        .build()
        return _envelopeOpenDollar!!
    }

private var _envelopeOpenDollar: ImageVector? = null
