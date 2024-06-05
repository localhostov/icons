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

public val Icons.Bold.MailboxFlagUp: ImageVector
    get() {
        if (_mailboxFlagUp != null) {
            return _mailboxFlagUp!!
        }
        _mailboxFlagUp = Builder(name = "MailboxFlagUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 8.5f)
                verticalLineToRelative(13.5f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-13.5f)
                curveTo(0.0f, 4.916f, 2.916f, 2.0f, 6.5f, 2.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.032f)
                curveToRelative(0.65f, 1.012f, 1.032f, 2.211f, 1.032f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -0.539f, -0.133f, -1.044f, -0.351f, -1.5f)
                horizontalLineToRelative(3.169f)
                curveToRelative(0.115f, 0.482f, 0.182f, 0.983f, 0.182f, 1.5f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                close()
            }
        }
        .build()
        return _mailboxFlagUp!!
    }

private var _mailboxFlagUp: ImageVector? = null
