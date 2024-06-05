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

public val Icons.Bold.TruckCouch: ImageVector
    get() {
        if (_truckCouch != null) {
            return _truckCouch!!
        }
        _truckCouch = Builder(name = "TruckCouch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 3.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.0f, 3.5f)
                verticalLineTo(16.36f)
                lineTo(4.1f, 19.944f)
                lineToRelative(-0.723f, -2.876f)
                lineTo(15.0f, 13.983f)
                verticalLineTo(7.258f)
                lineToRelative(-0.151f, -0.61f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -4.275f, -2.535f)
                lineTo(4.635f, 5.723f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.543f, 4.24f)
                lineToRelative(0.536f, 2.16f)
                arcTo(3.507f, 3.507f, 0.0f, false, false, 0.105f, 16.366f)
                lineToRelative(1.1f, 4.381f)
                lineTo(0.1f, 21.055f)
                lineToRelative(0.8f, 2.89f)
                lineToRelative(16.267f, -4.518f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 17.0f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, false, -0.5f, 0.036f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 20.5f, 3.0f)
                close()
                moveTo(5.394f, 8.625f)
                lineToRelative(5.939f, -1.609f)
                arcToRelative(0.519f, 0.519f, 0.0f, false, true, 0.378f, 0.055f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.226f, 0.3f)
                lineToRelative(1.013f, 4.046f)
                lineTo(6.006f, 13.245f)
                lineTo(5.0f, 9.239f)
                arcTo(0.509f, 0.509f, 0.0f, false, true, 5.394f, 8.625f)
                close()
            }
        }
        .build()
        return _truckCouch!!
    }

private var _truckCouch: ImageVector? = null
