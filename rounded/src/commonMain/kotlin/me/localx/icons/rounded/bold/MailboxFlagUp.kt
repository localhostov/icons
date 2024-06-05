package me.localx.icons.rounded.bold

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
                moveToRelative(16.0f, 8.5f)
                lineTo(16.0f, 3.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 9.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 8.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-10.0f)
                curveTo(0.0f, 4.916f, 2.916f, 2.0f, 6.5f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.532f)
                curveToRelative(0.65f, 1.012f, 1.032f, 2.211f, 1.032f, 3.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.171f, -0.027f, 0.335f, -0.051f, 0.5f)
                horizontalLineToRelative(7.551f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -0.236f, -0.023f, -0.472f, -0.07f, -0.703f)
                curveToRelative(-0.165f, -0.812f, 0.361f, -1.603f, 1.173f, -1.768f)
                curveToRelative(0.808f, -0.167f, 1.603f, 0.36f, 1.768f, 1.173f)
                curveToRelative(0.086f, 0.426f, 0.13f, 0.862f, 0.13f, 1.297f)
                close()
                moveTo(10.0f, 8.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                verticalLineToRelative(-10.0f)
                close()
            }
        }
        .build()
        return _mailboxFlagUp!!
    }

private var _mailboxFlagUp: ImageVector? = null
