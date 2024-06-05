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

public val Icons.Outline.HandshakeAngle: ImageVector
    get() {
        if (_handshakeAngle != null) {
            return _handshakeAngle!!
        }
        _handshakeAngle = Builder(name = "HandshakeAngle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.93f, 9.59f)
                lineToRelative(-1.38f, -1.45f)
                lineToRelative(-1.96f, 1.86f)
                horizontalLineToRelative(-7.6f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(7.1f)
                curveToRelative(0.0f, -1.37f, 0.93f, -2.56f, 2.25f, -2.9f)
                lineToRelative(5.01f, -1.29f)
                lineToRelative(1.45f, -1.45f)
                lineTo(16.29f, 0.04f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(-4.48f, 1.16f)
                curveToRelative(-2.18f, 0.56f, -3.71f, 2.5f, -3.75f, 4.74f)
                curveToRelative(-2.24f, 0.04f, -4.18f, 1.57f, -4.74f, 3.75f)
                lineToRelative(-1.16f, 4.48f)
                lineTo(0.04f, 16.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.45f, -1.45f)
                lineToRelative(1.29f, -5.01f)
                curveToRelative(0.33f, -1.29f, 1.48f, -2.2f, 2.81f, -2.25f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.42f)
                lineToRelative(-1.64f, 5.83f)
                curveToRelative(-0.36f, 1.28f, -1.54f, 2.18f, -2.87f, 2.19f)
                lineToRelative(-5.33f, 0.03f)
                lineToRelative(-2.51f, 2.55f)
                lineToRelative(1.43f, 1.4f)
                lineToRelative(1.93f, -1.96f)
                lineToRelative(4.5f, -0.02f)
                curveToRelative(2.22f, -0.01f, 4.19f, -1.51f, 4.79f, -3.65f)
                lineToRelative(1.83f, -6.5f)
                lineToRelative(2.4f, -2.27f)
                close()
            }
        }
        .build()
        return _handshakeAngle!!
    }

private var _handshakeAngle: ImageVector? = null
