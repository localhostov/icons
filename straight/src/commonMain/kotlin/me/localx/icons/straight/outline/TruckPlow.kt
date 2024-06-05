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

public val Icons.Outline.TruckPlow: ImageVector
    get() {
        if (_truckPlow != null) {
            return _truckPlow!!
        }
        _truckPlow = Builder(name = "TruckPlow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.586f)
                lineTo(22.0f, 9.414f)
                lineToRelative(1.957f, -1.957f)
                lineTo(22.543f, 6.043f)
                lineTo(20.0f, 8.586f)
                lineTo(20.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.441f, -2.947f)
                lineTo(10.84f, 3.285f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.379f, 2.0f)
                lineTo(4.0f, 2.0f)
                verticalLineToRelative(8.0f)
                lineTo(3.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                lineTo(1.0f, 18.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(1.0f)
                lineTo(18.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.414f)
                lineToRelative(2.605f, 2.606f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(6.0f, 4.0f)
                lineTo(8.379f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.82f, 0.428f)
                lineTo(13.084f, 10.0f)
                lineTo(6.0f, 10.0f)
                close()
                moveTo(2.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(15.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 16.0f)
                close()
                moveTo(6.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(3.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                close()
                moveTo(15.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(12.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _truckPlow!!
    }

private var _truckPlow: ImageVector? = null
