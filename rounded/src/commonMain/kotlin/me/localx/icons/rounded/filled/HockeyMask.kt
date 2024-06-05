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

public val Icons.Filled.HockeyMask: ImageVector
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
                curveTo(5.935f, 0.0f, 1.0f, 4.686f, 1.0f, 10.444f)
                curveTo(1.0f, 15.9f, 5.619f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(11.0f, -8.1f, 11.0f, -13.556f)
                curveTo(23.0f, 4.686f, 18.065f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 4.0f)
                close()
                moveTo(10.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 9.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 4.0f)
                close()
                moveTo(5.0f, 11.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 7.5f, 9.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 10.0f, 11.0f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, true, -2.5f, 2.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 5.0f, 11.0f)
                close()
                moveTo(10.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 20.0f)
                close()
                moveTo(10.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 17.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 9.0f)
                close()
                moveTo(14.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 20.0f)
                close()
                moveTo(14.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 17.0f)
                close()
                moveTo(16.5f, 13.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 14.0f, 11.0f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, true, 2.5f, -2.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 19.0f, 11.0f)
                arcTo(2.292f, 2.292f, 0.0f, false, true, 16.5f, 13.0f)
                close()
            }
        }
        .build()
        return _hockeyMask!!
    }

private var _hockeyMask: ImageVector? = null
