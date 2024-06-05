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

public val Icons.Outline.MailboxFlagUp: ImageVector
    get() {
        if (_mailboxFlagUp != null) {
            return _mailboxFlagUp!!
        }
        _mailboxFlagUp = Builder(name = "MailboxFlagUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(-12.0f)
                curveTo(0.0f, 5.691f, 2.691f, 3.0f, 6.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.54f)
                curveToRelative(0.954f, 1.063f, 1.54f, 2.462f, 1.54f, 4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -0.732f, -0.212f, -1.409f, -0.556f, -2.0f)
                horizontalLineToRelative(2.206f)
                curveToRelative(0.223f, 0.627f, 0.35f, 1.298f, 0.35f, 2.0f)
                close()
                moveTo(2.0f, 19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _mailboxFlagUp!!
    }

private var _mailboxFlagUp: ImageVector? = null
