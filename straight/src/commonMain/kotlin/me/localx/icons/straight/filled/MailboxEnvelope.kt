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
                moveToRelative(12.0f, 16.244f)
                verticalLineToRelative(7.756f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-7.756f)
                lineToRelative(3.879f, 3.879f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.121f, 0.877f)
                reflectiveCurveToRelative(1.536f, -0.292f, 2.121f, -0.877f)
                lineToRelative(3.879f, -3.879f)
                close()
                moveTo(6.707f, 18.709f)
                lineToRelative(3.708f, -3.708f)
                lineTo(1.584f, 15.001f)
                lineToRelative(3.709f, 3.708f)
                curveToRelative(0.378f, 0.377f, 1.036f, 0.377f, 1.414f, 0.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 5.0f)
                curveToRelative(0.0f, -1.957f, -0.807f, -3.729f, -2.106f, -5.0f)
                horizontalLineToRelative(8.106f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 5.0f)
                verticalLineToRelative(8.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _mailboxEnvelope!!
    }

private var _mailboxEnvelope: ImageVector? = null
