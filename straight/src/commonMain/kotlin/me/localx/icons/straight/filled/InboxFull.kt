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

public val Icons.Filled.InboxFull: ImageVector
    get() {
        if (_inboxFull != null) {
            return _inboxFull!!
        }
        _inboxFull = Builder(name = "InboxFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 16.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(21.721f, 0.0f)
                lineTo(2.287f, 0.0f)
                lineTo(0.0f, 14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.673f, 4.0f)
                horizontalLineToRelative(14.66f)
                lineToRelative(0.326f, 2.0f)
                lineTo(4.347f, 6.0f)
                lineToRelative(0.327f, -2.0f)
                close()
                moveTo(3.693f, 10.0f)
                lineToRelative(0.327f, -2.0f)
                horizontalLineToRelative(15.964f)
                lineToRelative(0.326f, 2.0f)
                lineTo(3.693f, 10.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.005f, 24.0f)
                curveToRelative(-0.803f, 0.0f, -1.557f, -0.313f, -2.124f, -0.881f)
                reflectiveCurveTo(0.003f, 21.795f, 0.005f, 20.993f)
                lineToRelative(-0.003f, -4.993f)
                horizontalLineToRelative(5.998f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _inboxFull!!
    }

private var _inboxFull: ImageVector? = null
