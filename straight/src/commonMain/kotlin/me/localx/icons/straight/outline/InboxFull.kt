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

public val Icons.Outline.InboxFull: ImageVector
    get() {
        if (_inboxFull != null) {
            return _inboxFull!!
        }
        _inboxFull = Builder(name = "InboxFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.721f, 0.0f)
                horizontalLineToRelative(-2.047f)
                lineToRelative(2.209f, 12.0f)
                horizontalLineToRelative(-5.883f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.118f, 12.0f)
                lineTo(4.338f, 0.0f)
                horizontalLineToRelative(-2.051f)
                lineTo(0.0f, 12.227f)
                lineToRelative(0.005f, 8.766f)
                curveToRelative(-0.002f, 0.802f, 0.309f, 1.558f, 0.876f, 2.126f)
                reflectiveCurveToRelative(1.321f, 0.881f, 2.124f, 0.881f)
                horizontalLineToRelative(17.995f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-8.5f)
                lineTo(21.721f, 0.0f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                lineTo(3.005f, 22.0f)
                curveToRelative(-0.268f, 0.0f, -0.519f, -0.104f, -0.708f, -0.294f)
                reflectiveCurveToRelative(-0.292f, -0.441f, -0.292f, -0.711f)
                lineToRelative(-0.004f, -6.995f)
                horizontalLineToRelative(3.999f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(18.009f, 2.0f)
                lineTo(6.002f, 2.0f)
                lineToRelative(0.37f, -2.0f)
                horizontalLineToRelative(11.269f)
                lineToRelative(0.368f, 2.0f)
                close()
                moveTo(19.481f, 10.0f)
                lineTo(4.522f, 10.0f)
                lineToRelative(0.37f, -2.0f)
                horizontalLineToRelative(14.221f)
                lineToRelative(0.368f, 2.0f)
                close()
                moveTo(18.745f, 6.0f)
                lineTo(5.262f, 6.0f)
                lineToRelative(0.37f, -2.0f)
                horizontalLineToRelative(12.745f)
                lineToRelative(0.368f, 2.0f)
                close()
            }
        }
        .build()
        return _inboxFull!!
    }

private var _inboxFull: ImageVector? = null
