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

public val Icons.Filled.HandshakeAngle: ImageVector
    get() {
        if (_handshakeAngle != null) {
            return _handshakeAngle!!
        }
        _handshakeAngle = Builder(name = "HandshakeAngle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                reflectiveCurveToRelative(0.01f, 0.0f, 0.02f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -2.26f, 1.5f, -4.17f, 3.73f, -4.74f)
                lineToRelative(4.3f, -1.1f)
                lineToRelative(1.28f, -1.15f)
                horizontalLineToRelative(7.67f)
                lineTo(24.0f, 8.92f)
                lineToRelative(-2.0f, 2.08f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(12.87f, 14.0f)
                curveToRelative(-0.45f, 1.72f, -2.01f, 3.0f, -3.87f, 3.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                lineTo(5.0f, 7.46f)
                curveToRelative(-1.33f, 0.61f, -2.36f, 1.8f, -2.74f, 3.29f)
                lineToRelative(-1.26f, 4.25f)
                lineToRelative(-1.0f, 1.03f)
                verticalLineToRelative(7.97f)
                lineTo(8.08f, 24.0f)
                lineToRelative(2.35f, -2.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.22f, -0.01f, 4.19f, -1.5f, 4.79f, -3.63f)
                lineToRelative(1.51f, -5.37f)
                lineTo(13.0f, 13.0f)
                lineToRelative(-0.13f, 1.0f)
                close()
            }
        }
        .build()
        return _handshakeAngle!!
    }

private var _handshakeAngle: ImageVector? = null
