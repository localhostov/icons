package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.AlarmClock: ImageVector
    get() {
        if (_alarmClock != null) {
            return _alarmClock!!
        }
        _alarmClock = Builder(name = "AlarmClock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 13.0f)
                arcToRelative(11.01f, 11.01f, 0.0f, false, false, -10.0f, -10.949f)
                verticalLineToRelative(-2.051f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.051f)
                arcToRelative(10.977f, 10.977f, 0.0f, false, false, -7.062f, 18.408f)
                lineToRelative(-1.928f, 2.118f)
                lineToRelative(1.48f, 1.346f)
                lineToRelative(1.934f, -2.123f)
                arcToRelative(10.916f, 10.916f, 0.0f, false, false, 13.152f, 0.0f)
                lineToRelative(1.934f, 2.126f)
                lineToRelative(1.48f, -1.346f)
                lineToRelative(-1.928f, -2.118f)
                arcToRelative(10.948f, 10.948f, 0.0f, false, false, 2.938f, -7.462f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 9.0f, -9.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, true, -9.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.523f, 1.745f)
                lineToRelative(-1.067f, -1.689f)
                arcToRelative(15.17f, 15.17f, 0.0f, false, false, -4.439f, 3.955f)
                lineToRelative(1.663f, 1.109f)
                arcToRelative(13.144f, 13.144f, 0.0f, false, true, 3.843f, -3.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.32f, 5.12f)
                lineToRelative(1.663f, -1.109f)
                arcToRelative(15.17f, 15.17f, 0.0f, false, false, -4.439f, -3.955f)
                lineToRelative(-1.067f, 1.689f)
                arcToRelative(13.144f, 13.144f, 0.0f, false, true, 3.843f, 3.375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 7.0f)
                verticalLineToRelative(5.414f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.707f, -2.707f)
                verticalLineToRelative(-4.586f)
                close()
            }
        }
        .build()
        return _alarmClock!!
    }

private var _alarmClock: ImageVector? = null
