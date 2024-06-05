package me.localx.icons.straight.bold

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
                moveTo(12.0f, 24.0f)
                curveTo(5.619f, 24.0f, 1.0f, 15.945f, 1.0f, 10.515f)
                arcTo(10.778f, 10.778f, 0.0f, false, true, 12.0f, 0.0f)
                arcTo(10.778f, 10.778f, 0.0f, false, true, 23.0f, 10.515f)
                curveTo(23.0f, 15.945f, 18.381f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(7.778f, 7.778f, 0.0f, false, false, -8.0f, 7.515f)
                curveTo(4.0f, 14.656f, 7.584f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveToRelative(8.0f, -6.344f, 8.0f, -10.485f)
                arcTo(7.778f, 7.778f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(16.5f, 9.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, false, 14.0f, 11.0f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, false, 2.5f, 2.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, false, 19.0f, 11.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, false, 16.5f, 9.0f)
                close()
                moveTo(7.5f, 9.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, false, 5.0f, 11.0f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, false, 2.5f, 2.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, false, 10.0f, 11.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, false, 7.5f, 9.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _hockeyMask!!
    }

private var _hockeyMask: ImageVector? = null
