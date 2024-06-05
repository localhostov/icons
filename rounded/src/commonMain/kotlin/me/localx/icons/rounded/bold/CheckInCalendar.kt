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

public val Icons.Bold.CheckInCalendar: ImageVector
    get() {
        if (_checkInCalendar != null) {
            return _checkInCalendar!!
        }
        _checkInCalendar = Builder(name = "CheckInCalendar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-2.511f, 0.0f, -4.701f, -1.697f, -5.327f, -4.126f)
                curveToRelative(-0.207f, -0.802f, 0.276f, -1.62f, 1.079f, -1.827f)
                curveToRelative(0.804f, -0.208f, 1.62f, 0.277f, 1.827f, 1.079f)
                curveToRelative(0.284f, 1.104f, 1.28f, 1.874f, 2.421f, 1.874f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-9.5f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveTo(0.0f, 4.467f, 2.467f, 2.0f, 5.5f, 2.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(8.654f, 18.248f)
                lineToRelative(3.063f, -3.063f)
                curveToRelative(0.378f, -0.378f, 0.378f, -0.991f, 0.0f, -1.369f)
                lineToRelative(-3.063f, -3.063f)
                curveToRelative(-0.61f, -0.61f, -1.653f, -0.178f, -1.653f, 0.685f)
                verticalLineToRelative(1.563f)
                lineTo(1.5f, 13.001f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.501f)
                verticalLineToRelative(1.563f)
                curveToRelative(0.0f, 0.863f, 1.043f, 1.295f, 1.653f, 0.685f)
                close()
            }
        }
        .build()
        return _checkInCalendar!!
    }

private var _checkInCalendar: ImageVector? = null
