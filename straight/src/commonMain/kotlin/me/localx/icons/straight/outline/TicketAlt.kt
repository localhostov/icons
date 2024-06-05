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

public val Icons.Outline.TicketAlt: ImageVector
    get() {
        if (_ticketAlt != null) {
            return _ticketAlt!!
        }
        _ticketAlt = Builder(name = "TicketAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-3.922f)
                lineToRelative(1.096f, 0.003f)
                curveToRelative(1.1f, -0.029f, 1.986f, -0.933f, 1.986f, -2.04f)
                reflectiveCurveToRelative(-0.884f, -2.009f, -1.982f, -2.04f)
                lineToRelative(-1.1f, 0.003f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineTo(21.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-0.888f)
                curveToRelative(-0.997f, 0.0f, -1.922f, 0.679f, -2.084f, 1.662f)
                curveToRelative(-0.206f, 1.252f, 0.758f, 2.338f, 1.972f, 2.338f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineTo(21.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.126f)
                curveToRelative(-1.723f, -0.445f, -3.0f, -2.013f, -3.0f, -3.874f)
                reflectiveCurveToRelative(1.277f, -3.428f, 3.0f, -3.874f)
                verticalLineToRelative(-2.126f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.115f)
                curveToRelative(1.767f, 0.432f, 3.082f, 2.028f, 3.082f, 3.926f)
                reflectiveCurveToRelative(-1.315f, 3.494f, -3.082f, 3.926f)
                verticalLineToRelative(2.033f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _ticketAlt!!
    }

private var _ticketAlt: ImageVector? = null
