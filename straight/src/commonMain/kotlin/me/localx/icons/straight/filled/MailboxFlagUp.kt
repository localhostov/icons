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

public val Icons.Filled.MailboxFlagUp: ImageVector
    get() {
        if (_mailboxFlagUp != null) {
            return _mailboxFlagUp!!
        }
        _mailboxFlagUp = Builder(name = "MailboxFlagUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveTo(0.0f, 5.243f, 0.0f, 8.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 3.0f)
                horizontalLineToRelative(-8.106f)
                curveToRelative(1.299f, 1.271f, 2.106f, 3.043f, 2.106f, 5.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(20.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                reflectiveCurveToRelative(0.0f, 4.0f, 0.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _mailboxFlagUp!!
    }

private var _mailboxFlagUp: ImageVector? = null
