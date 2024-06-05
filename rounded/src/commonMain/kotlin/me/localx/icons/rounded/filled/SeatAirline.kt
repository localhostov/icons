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

public val Icons.Filled.SeatAirline: ImageVector
    get() {
        if (_seatAirline != null) {
            return _seatAirline!!
        }
        _seatAirline = Builder(name = "SeatAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.503f, 0.0f, -0.762f, -0.332f, -0.851f, -0.474f)
                curveToRelative(-0.088f, -0.144f, -0.269f, -0.523f, -0.044f, -0.974f)
                lineToRelative(0.99f, -1.979f)
                curveToRelative(0.715f, 0.269f, 1.48f, 0.426f, 2.276f, 0.426f)
                horizontalLineToRelative(8.129f)
                curveToRelative(0.734f, 0.0f, 1.429f, -0.321f, 1.905f, -0.881f)
                reflectiveCurveToRelative(0.681f, -1.302f, 0.562f, -2.035f)
                curveToRelative(-0.194f, -1.188f, -1.3f, -2.084f, -2.573f, -2.084f)
                horizontalLineTo(11.385f)
                curveToRelative(-0.674f, 0.0f, -1.27f, -0.454f, -1.447f, -1.104f)
                lineToRelative(-0.788f, -2.896f)
                horizontalLineToRelative(9.85f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.606f)
                lineTo(6.967f, 1.98f)
                curveTo(6.631f, 0.701f, 5.401f, -0.153f, 4.162f, 0.023f)
                curveToRelative(-0.704f, 0.104f, -1.332f, 0.503f, -1.723f, 1.095f)
                curveToRelative(-0.391f, 0.592f, -0.512f, 1.325f, -0.331f, 2.015f)
                lineToRelative(2.99f, 11.068f)
                curveToRelative(0.374f, 1.379f, 1.184f, 2.55f, 2.252f, 3.393f)
                lineToRelative(-1.033f, 2.065f)
                curveToRelative(-0.468f, 0.938f, -0.419f, 2.028f, 0.132f, 2.919f)
                reflectiveCurveToRelative(1.504f, 1.423f, 2.552f, 1.423f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _seatAirline!!
    }

private var _seatAirline: ImageVector? = null
