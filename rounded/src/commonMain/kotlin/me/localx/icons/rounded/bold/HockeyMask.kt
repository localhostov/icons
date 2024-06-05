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

public val Icons.Bold.HockeyMask: ImageVector
    get() {
        if (_hockeyMask != null) {
            return _hockeyMask!!
        }
        _hockeyMask = Builder(name = "HockeyMask", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(10.778f, 10.778f, 0.0f, false, false, 1.0f, 10.515f)
                curveTo(1.0f, 15.945f, 5.619f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(11.0f, -8.055f, 11.0f, -13.485f)
                arcTo(10.778f, 10.778f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.416f, 0.0f, -8.0f, -6.344f, -8.0f, -10.485f)
                arcTo(7.778f, 7.778f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(7.778f, 7.778f, 0.0f, false, true, 8.0f, 7.515f)
                curveTo(20.0f, 14.656f, 16.416f, 21.0f, 12.0f, 21.0f)
                close()
                moveTo(19.0f, 11.0f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, true, -2.5f, 2.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 14.0f, 11.0f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, true, 2.5f, -2.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 19.0f, 11.0f)
                close()
                moveTo(10.0f, 11.0f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, true, -2.5f, 2.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 5.0f, 11.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 7.5f, 9.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 10.0f, 11.0f)
                close()
                moveTo(13.5f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 14.5f)
                close()
                moveTo(13.5f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 18.5f)
                close()
                moveTo(13.5f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 6.5f)
                close()
            }
        }
        .build()
        return _hockeyMask!!
    }

private var _hockeyMask: ImageVector? = null
