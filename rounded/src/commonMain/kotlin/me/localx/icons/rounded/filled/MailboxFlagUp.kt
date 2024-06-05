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
                moveToRelative(4.5f, 3.024f)
                curveTo(1.903f, 3.278f, 0.0f, 5.613f, 0.0f, 8.223f)
                verticalLineToRelative(9.277f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -2.922f, -2.519f, -5.266f, -5.5f, -4.976f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(18.0f, 3.0f)
                horizontalLineToRelative(-8.106f)
                curveToRelative(1.299f, 1.271f, 2.106f, 3.043f, 2.106f, 5.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.328f, -0.474f, 2.548f, -1.261f, 3.5f)
                horizontalLineToRelative(9.761f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -3.314f, -2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _mailboxFlagUp!!
    }

private var _mailboxFlagUp: ImageVector? = null
