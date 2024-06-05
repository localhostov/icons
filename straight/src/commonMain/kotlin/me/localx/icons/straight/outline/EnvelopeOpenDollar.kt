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

public val Icons.Outline.EnvelopeOpenDollar: ImageVector
    get() {
        if (_envelopeOpenDollar != null) {
            return _envelopeOpenDollar!!
        }
        _envelopeOpenDollar = Builder(name = "EnvelopeOpenDollar", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.769f, 9.343f)
                lineToRelative(-1.769f, -1.694f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineTo(7.651f)
                lineToRelative(-1.766f, 1.691f)
                curveTo(0.451f, 10.093f, 0.001f, 11.146f, 0.001f, 12.231f)
                verticalLineToRelative(11.769f)
                horizontalLineTo(24.0f)
                verticalLineTo(12.231f)
                curveToRelative(0.0f, -1.086f, -0.449f, -2.139f, -1.231f, -2.889f)
                close()
                moveTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineTo(12.243f)
                lineToRelative(-4.878f, 4.879f)
                curveToRelative(-1.17f, 1.168f, -3.073f, 1.168f, -4.243f, 0.0f)
                lineToRelative(-4.878f, -4.879f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.231f)
                curveToRelative(0.001f, -0.051f, 0.004f, -0.102f, 0.008f, -0.153f)
                lineToRelative(6.456f, 6.457f)
                curveToRelative(0.975f, 0.975f, 2.255f, 1.462f, 3.536f, 1.462f)
                reflectiveCurveToRelative(2.561f, -0.487f, 3.536f, -1.462f)
                lineToRelative(6.458f, -6.458f)
                curveToRelative(0.004f, 0.051f, 0.007f, 0.102f, 0.007f, 0.154f)
                verticalLineToRelative(9.769f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(0.0f, -0.378f, -0.271f, -0.698f, -0.644f, -0.76f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-1.341f, -0.223f, -2.315f, -1.373f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.378f, 0.271f, 0.698f, 0.644f, 0.76f)
                lineToRelative(3.042f, 0.507f)
                curveToRelative(1.341f, 0.223f, 2.315f, 1.373f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _envelopeOpenDollar!!
    }

private var _envelopeOpenDollar: ImageVector? = null
