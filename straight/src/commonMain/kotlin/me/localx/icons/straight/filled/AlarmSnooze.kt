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

public val Icons.Filled.AlarmSnooze: ImageVector
    get() {
        if (_alarmSnooze != null) {
            return _alarmSnooze!!
        }
        _alarmSnooze = Builder(name = "AlarmSnooze", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.68f, 5.12f)
                lineTo(0.017f, 4.011f)
                curveTo(1.219f, 2.419f, 2.726f, 1.068f, 4.456f, 0.056f)
                lineToRelative(1.067f, 1.689f)
                curveToRelative(-1.493f, 0.863f, -2.798f, 2.014f, -3.843f, 3.375f)
                close()
                moveTo(22.32f, 5.12f)
                lineToRelative(1.663f, -1.109f)
                curveToRelative(-1.202f, -1.593f, -2.709f, -2.943f, -4.439f, -3.955f)
                lineToRelative(-1.067f, 1.689f)
                curveToRelative(1.493f, 0.863f, 2.798f, 2.014f, 3.843f, 3.375f)
                close()
                moveTo(23.0f, 13.0f)
                curveToRelative(0.0f, 2.88f, -1.121f, 5.496f, -2.939f, 7.459f)
                lineToRelative(1.928f, 2.118f)
                lineToRelative(-1.479f, 1.346f)
                lineToRelative(-1.935f, -2.126f)
                curveToRelative(-1.837f, 1.377f, -4.109f, 2.203f, -6.576f, 2.203f)
                reflectiveCurveToRelative(-4.739f, -0.826f, -6.576f, -2.203f)
                lineToRelative(-1.935f, 2.126f)
                lineToRelative(-1.479f, -1.346f)
                lineToRelative(1.928f, -2.118f)
                curveToRelative(-1.817f, -1.963f, -2.938f, -4.579f, -2.938f, -7.459f)
                curveTo(1.0f, 7.272f, 5.402f, 2.558f, 11.0f, 2.051f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 2.051f)
                curveToRelative(5.598f, 0.508f, 10.0f, 5.221f, 10.0f, 10.949f)
                close()
                moveTo(16.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.953f)
                lineToRelative(-4.953f, 3.969f)
                verticalLineToRelative(2.031f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.841f)
                lineToRelative(4.841f, -3.879f)
                verticalLineToRelative(-2.121f)
                close()
            }
        }
        .build()
        return _alarmSnooze!!
    }

private var _alarmSnooze: ImageVector? = null
