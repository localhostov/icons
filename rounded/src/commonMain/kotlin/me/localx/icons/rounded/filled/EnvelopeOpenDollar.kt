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
                moveTo(23.5f, 10.57f)
                curveToRelative(0.316f, 0.665f, 0.5f, 1.392f, 0.5f, 2.137f)
                verticalLineToRelative(6.292f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.999f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.292f)
                curveToRelative(0.0f, -0.746f, 0.184f, -1.472f, 0.5f, -2.137f)
                lineToRelative(7.965f, 7.966f)
                curveToRelative(1.862f, 1.939f, 5.21f, 1.94f, 7.071f, 0.0f)
                lineToRelative(7.965f, -7.966f)
                close()
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(6.242f)
                lineToRelative(-6.879f, 6.879f)
                curveToRelative(-1.133f, 1.133f, -3.109f, 1.133f, -4.243f, 0.0f)
                lineTo(3.0f, 10.243f)
                lineTo(3.0f, 4.0f)
                curveTo(3.0f, 1.794f, 4.794f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                lineToRelative(-3.042f, -0.507f)
                curveToRelative(-1.086f, -0.211f, -0.64f, -1.825f, 0.356f, -1.76f)
                horizontalLineToRelative(2.268f)
                curveToRelative(0.356f, 0.0f, 0.688f, 0.192f, 0.867f, 0.5f)
                curveToRelative(0.277f, 0.479f, 0.89f, 0.642f, 1.366f, 0.365f)
                curveToRelative(0.479f, -0.277f, 0.642f, -0.888f, 0.365f, -1.366f)
                curveToRelative(-0.535f, -0.925f, -1.531f, -1.5f, -2.598f, -1.5f)
                horizontalLineToRelative(-0.268f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.307f, -2.0f, 0.0f)
                curveToRelative(-3.435f, -0.019f, -4.184f, 5.084f, -0.685f, 5.733f)
                lineToRelative(3.042f, 0.507f)
                curveToRelative(1.086f, 0.211f, 0.64f, 1.825f, -0.356f, 1.76f)
                horizontalLineToRelative(-2.268f)
                curveToRelative(-0.356f, 0.0f, -0.688f, -0.192f, -0.867f, -0.5f)
                curveToRelative(-0.277f, -0.479f, -0.89f, -0.643f, -1.366f, -0.365f)
                curveToRelative(-1.533f, 1.221f, 0.913f, 2.989f, 2.233f, 2.865f)
                horizontalLineToRelative(0.268f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.307f, 2.0f, 0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _envelopeOpenDollar!!
    }

private var _envelopeOpenDollar: ImageVector? = null
