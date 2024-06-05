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

public val Icons.Outline.HockeyMask: ImageVector
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
                curveTo(5.619f, 24.0f, 1.0f, 15.9f, 1.0f, 10.444f)
                curveTo(1.0f, 4.686f, 5.935f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(23.0f, 4.686f, 23.0f, 10.444f)
                curveTo(23.0f, 15.9f, 18.381f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(8.746f, 8.746f, 0.0f, false, false, -9.0f, 8.444f)
                curveTo(3.0f, 15.008f, 7.032f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveToRelative(9.0f, -6.992f, 9.0f, -11.556f)
                arcTo(8.746f, 8.746f, 0.0f, false, false, 12.0f, 2.0f)
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
                moveTo(10.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 15.0f)
                close()
                moveTo(14.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 15.0f)
                close()
                moveTo(10.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 4.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 7.0f)
                close()
                moveTo(14.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 4.0f)
                close()
                moveTo(10.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 18.0f)
                close()
                moveTo(14.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 18.0f)
                close()
            }
        }
        .build()
        return _hockeyMask!!
    }

private var _hockeyMask: ImageVector? = null
