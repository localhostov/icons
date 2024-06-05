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

public val Icons.Bold.HandshakeTrust: ImageVector
    get() {
        if (_handshakeTrust != null) {
            return _handshakeTrust!!
        }
        _handshakeTrust = Builder(name = "HandshakeTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 5.443f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0.0f, -0.647f, 0.414f, -1.22f, 1.028f, -1.424f)
                lineToRelative(2.972f, -0.985f)
                lineToRelative(2.972f, 0.985f)
                curveToRelative(0.614f, 0.203f, 1.028f, 0.777f, 1.028f, 1.424f)
                verticalLineToRelative(3.033f)
                curveToRelative(0.0f, 3.026f, -3.104f, 4.51f, -3.999f, 4.87f)
                curveToRelative(-0.897f, -0.448f, -4.001f, -2.207f, -4.001f, -4.87f)
                close()
                moveTo(9.851f, 11.394f)
                curveToRelative(-0.737f, -0.476f, -1.637f, -1.171f, -2.383f, -2.085f)
                curveToRelative(-0.113f, 0.045f, -1.351f, 0.692f, -1.351f, 0.692f)
                lineTo(0.0f, 10.001f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.883f)
                lineToRelative(2.967f, -1.607f)
                close()
                moveTo(17.884f, 10.001f)
                reflectiveCurveToRelative(-1.153f, -0.61f, -1.222f, -0.64f)
                curveToRelative(-0.711f, 0.919f, -1.588f, 1.579f, -2.349f, 2.036f)
                lineToRelative(2.804f, 1.605f)
                horizontalLineToRelative(6.883f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.117f)
                close()
                moveTo(12.842f, 12.13f)
                lineToRelative(-0.929f, 0.374f)
                lineToRelative(-0.984f, -0.492f)
                curveToRelative(-0.131f, -0.065f, -0.303f, -0.158f, -0.492f, -0.265f)
                lineToRelative(-1.863f, 1.973f)
                curveToRelative(-0.675f, 0.675f, -0.767f, 1.719f, -0.218f, 2.483f)
                curveToRelative(0.33f, 0.457f, 0.839f, 0.745f, 1.399f, 0.791f)
                curveToRelative(0.0f, 0.0f, 0.772f, 0.083f, 1.526f, -0.572f)
                lineToRelative(0.806f, -0.835f)
                lineToRelative(3.423f, 3.051f)
                lineToRelative(-3.026f, 2.362f)
                horizontalLineToRelative(-0.968f)
                lineToRelative(-5.125f, -4.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.359f)
                lineToRelative(5.125f, 4.0f)
                horizontalLineToRelative(3.032f)
                lineToRelative(5.125f, -4.0f)
                horizontalLineToRelative(5.359f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.806f)
                lineToRelative(-5.353f, -4.87f)
                close()
            }
        }
        .build()
        return _handshakeTrust!!
    }

private var _handshakeTrust: ImageVector? = null
