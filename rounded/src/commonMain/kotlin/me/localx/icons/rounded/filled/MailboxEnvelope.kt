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

public val Icons.Filled.MailboxEnvelope: ImageVector
    get() {
        if (_mailboxEnvelope != null) {
            return _mailboxEnvelope!!
        }
        _mailboxEnvelope = Builder(name = "MailboxEnvelope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.622f, 15.038f)
                curveToRelative(0.123f, -0.023f, 0.248f, -0.038f, 0.378f, -0.038f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.129f, 0.0f, 0.255f, 0.015f, 0.377f, 0.038f)
                lineToRelative(-3.67f, 3.67f)
                curveToRelative(-0.378f, 0.377f, -1.036f, 0.377f, -1.414f, 0.0f)
                lineToRelative(-3.671f, -3.67f)
                close()
                moveTo(8.121f, 20.122f)
                curveToRelative(-0.585f, 0.585f, -1.353f, 0.877f, -2.121f, 0.877f)
                reflectiveCurveToRelative(-1.536f, -0.292f, -2.121f, -0.877f)
                lineTo(0.115f, 16.359f)
                curveToRelative(-0.069f, 0.202f, -0.115f, 0.416f, -0.115f, 0.641f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.226f, -0.046f, -0.439f, -0.115f, -0.642f)
                lineToRelative(-3.764f, 3.764f)
                close()
                moveTo(0.0f, 13.557f)
                lineTo(0.0f, 5.223f)
                curveTo(0.0f, 2.613f, 1.903f, 0.278f, 4.5f, 0.024f)
                curveToRelative(2.98f, -0.291f, 5.5f, 2.054f, 5.5f, 4.976f)
                verticalLineToRelative(8.0f)
                lineTo(1.999f, 13.0f)
                curveToRelative(-0.731f, 0.0f, -1.409f, 0.212f, -1.999f, 0.557f)
                close()
                moveTo(3.0f, 7.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.474f, -0.81f, -2.75f, -2.0f, -3.444f)
                lineTo(12.0f, 5.0f)
                curveToRelative(0.0f, -1.957f, -0.807f, -3.729f, -2.106f, -5.0f)
                horizontalLineToRelative(8.106f)
                curveToRelative(3.314f, 0.0f, 6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(21.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _mailboxEnvelope!!
    }

private var _mailboxEnvelope: ImageVector? = null
