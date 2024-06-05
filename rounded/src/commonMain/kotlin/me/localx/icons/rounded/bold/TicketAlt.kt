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

public val Icons.Bold.TicketAlt: ImageVector
    get() {
        if (_ticketAlt != null) {
            return _ticketAlt!!
        }
        _ticketAlt = Builder(name = "TicketAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 21.0f)
                horizontalLineTo(5.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.853f, 0.0f, 1.521f, -0.668f, 1.521f, -1.521f)
                curveToRelative(0.0f, -0.843f, -0.654f, -1.479f, -1.521f, -1.479f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveTo(0.0f, 5.467f, 2.467f, 3.0f, 5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(3.102f, 16.207f)
                curveToRelative(0.306f, 1.035f, 1.265f, 1.793f, 2.398f, 1.793f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.134f, 0.0f, 2.093f, -0.758f, 2.398f, -1.794f)
                curveToRelative(-1.693f, -0.646f, -2.898f, -2.288f, -2.898f, -4.206f)
                reflectiveCurveToRelative(1.206f, -3.559f, 2.898f, -4.206f)
                curveToRelative(-0.305f, -1.036f, -1.265f, -1.794f, -2.398f, -1.794f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.128f, 0.0f, -2.085f, 0.751f, -2.395f, 1.78f)
                curveToRelative(1.72f, 0.629f, 2.915f, 2.25f, 2.915f, 4.199f)
                curveToRelative(0.0f, 1.929f, -1.214f, 3.58f, -2.919f, 4.228f)
                close()
            }
        }
        .build()
        return _ticketAlt!!
    }

private var _ticketAlt: ImageVector? = null
