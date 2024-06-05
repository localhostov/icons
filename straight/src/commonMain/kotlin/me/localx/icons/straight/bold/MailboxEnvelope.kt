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

public val Icons.Bold.MailboxEnvelope: ImageVector
    get() {
        if (_mailboxEnvelope != null) {
            return _mailboxEnvelope!!
        }
        _mailboxEnvelope = Builder(name = "MailboxEnvelope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.121f, 20.123f)
                lineToRelative(3.879f, -3.879f)
                verticalLineToRelative(7.756f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-7.756f)
                lineToRelative(3.879f, 3.879f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.121f, 0.877f)
                reflectiveCurveToRelative(1.536f, -0.292f, 2.121f, -0.877f)
                close()
                moveTo(5.293f, 18.709f)
                curveToRelative(0.378f, 0.377f, 1.036f, 0.377f, 1.414f, 0.0f)
                lineToRelative(3.708f, -3.708f)
                lineTo(1.584f, 15.001f)
                lineToRelative(3.709f, 3.708f)
                close()
                moveTo(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveTo(2.916f, 0.0f, 0.0f, 2.916f, 0.0f, 6.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.289f, -0.382f, -2.488f, -1.032f, -3.5f)
                horizontalLineToRelative(5.532f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(5.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _mailboxEnvelope!!
    }

private var _mailboxEnvelope: ImageVector? = null
