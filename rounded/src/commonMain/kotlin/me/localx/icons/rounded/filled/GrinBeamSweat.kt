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

public val Icons.Filled.GrinBeamSweat: ImageVector
    get() {
        if (_grinBeamSweat != null) {
            return _grinBeamSweat!!
        }
        _grinBeamSweat = Builder(name = "GrinBeamSweat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.927f, 0.269f)
                curveTo(21.162f, -1.126f, 23.071f, 3.414f, 23.0f, 4.5f)
                curveTo(22.523f, 9.264f, 14.458f, 6.91f, 19.927f, 0.269f)
                close()
                moveTo(24.0f, 12.0f)
                curveTo(23.412f, 27.9f, 0.586f, 27.9f, 0.0f, 12.0f)
                curveTo(-0.206f, 3.434f, 9.364f, -2.633f, 17.008f, 1.105f)
                curveToRelative(-1.071f, 1.872f, -1.514f, 4.4f, -0.051f, 6.136f)
                curveTo(14.794f, 6.194f, 12.972f, 8.781f, 13.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, 0.68f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                curveToRelative(1.782f, -0.217f, 0.8f, -2.706f, 0.193f, -3.657f)
                arcTo(4.447f, 4.447f, 0.0f, false, false, 23.3f, 7.994f)
                arcTo(11.952f, 11.952f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.892f, -1.232f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveTo(5.0f, 9.108f, 5.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 12.0f)
                close()
                moveTo(16.789f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 7.2f, 14.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.052f, 1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, false, 5.842f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.789f, 14.024f)
                close()
            }
        }
        .build()
        return _grinBeamSweat!!
    }

private var _grinBeamSweat: ImageVector? = null
