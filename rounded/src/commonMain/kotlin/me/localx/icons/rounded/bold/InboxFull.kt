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

public val Icons.Bold.InboxFull: ImageVector
    get() {
        if (_inboxFull != null) {
            return _inboxFull!!
        }
        _inboxFull = Builder(name = "InboxFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.879f, 11.699f)
                lineToRelative(-1.903f, -10.468f)
                curveToRelative(-0.148f, -0.815f, -0.932f, -1.355f, -1.744f, -1.207f)
                curveToRelative(-0.815f, 0.148f, -1.355f, 0.929f, -1.207f, 1.744f)
                lineToRelative(1.679f, 9.231f)
                horizontalLineToRelative(-3.703f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.703f)
                lineTo(4.976f, 1.769f)
                curveToRelative(0.148f, -0.815f, -0.392f, -1.596f, -1.207f, -1.744f)
                curveToRelative(-0.812f, -0.148f, -1.596f, 0.392f, -1.744f, 1.207f)
                lineTo(0.121f, 11.699f)
                curveToRelative(-0.081f, 0.44f, -0.121f, 0.892f, -0.121f, 1.342f)
                verticalLineToRelative(5.459f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-5.459f)
                curveToRelative(0.0f, -0.45f, -0.041f, -0.901f, -0.121f, -1.342f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.25f, 2.247f, 2.16f, 4.0f, 4.472f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.312f, 0.0f, 4.223f, -1.753f, 4.472f, -4.0f)
                horizontalLineToRelative(2.528f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(7.0f, 1.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 6.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(7.5f, 8.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _inboxFull!!
    }

private var _inboxFull: ImageVector? = null
