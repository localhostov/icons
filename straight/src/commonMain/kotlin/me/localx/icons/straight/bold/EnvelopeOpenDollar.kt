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

public val Icons.Bold.EnvelopeOpenDollar: ImageVector
    get() {
        if (_envelopeOpenDollar != null) {
            return _envelopeOpenDollar!!
        }
        _envelopeOpenDollar = Builder(name = "EnvelopeOpenDollar", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.615f, 8.981f)
                lineToRelative(-1.615f, -1.546f)
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
                curveToRelative(0.0f, -1.221f, -0.505f, -2.406f, -1.385f, -3.25f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                curveToRelative(0.0f, -0.294f, -0.177f, -0.555f, -0.45f, -0.665f)
                lineToRelative(-2.215f, -0.886f)
                curveToRelative(-1.419f, -0.567f, -2.335f, -1.922f, -2.335f, -3.45f)
                curveToRelative(0.0f, -1.58f, 1.059f, -2.903f, 2.5f, -3.337f)
                verticalLineToRelative(-1.163f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.163f)
                curveToRelative(1.441f, 0.434f, 2.5f, 1.757f, 2.5f, 3.337f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.294f, 0.177f, 0.555f, 0.45f, 0.665f)
                lineToRelative(2.215f, 0.886f)
                curveToRelative(1.419f, 0.567f, 2.335f, 1.922f, 2.335f, 3.45f)
                curveToRelative(0.0f, 1.58f, -1.059f, 2.903f, -2.5f, 3.337f)
                verticalLineToRelative(1.163f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.163f)
                curveToRelative(-1.441f, -0.434f, -2.5f, -1.757f, -2.5f, -3.337f)
                verticalLineToRelative(-0.5f)
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
        return _envelopeOpenDollar!!
    }

private var _envelopeOpenDollar: ImageVector? = null
