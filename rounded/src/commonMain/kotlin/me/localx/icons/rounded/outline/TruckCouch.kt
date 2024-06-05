package me.localx.icons.rounded.outline

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

public val Icons.Outline.TruckCouch: ImageVector
    get() {
        if (_truckCouch != null) {
            return _truckCouch!!
        }
        _truckCouch = Builder(name = "TruckCouch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                verticalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineTo(16.279f)
                lineTo(3.158f, 21.226f)
                lineTo(2.1f, 18.051f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.272f, -2.53f)
                lineToRelative(0.027f, -0.009f)
                lineToRelative(0.391f, 1.155f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.541f, 1.25f)
                lineToRelative(7.74f, -2.648f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.247f, -2.534f)
                lineToRelative(-0.379f, -1.122f)
                lineToRelative(0.377f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.64f, -1.9f)
                lineToRelative(-0.376f, 0.127f)
                lineToRelative(-0.559f, -1.654f)
                arcToRelative(4.021f, 4.021f, 0.0f, false, false, -5.082f, -2.5f)
                lineTo(4.706f, 6.918f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, false, -2.493f, 5.07f)
                lineToRelative(0.55f, 1.629f)
                lineToRelative(-0.022f, 0.008f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 0.205f, 18.682f)
                lineTo(1.26f, 21.859f)
                lineToRelative(-0.576f, 0.192f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.632f, 1.9f)
                lineToRelative(14.807f, -4.936f)
                arcTo(4.017f, 4.017f, 0.0f, false, false, 20.0f, 24.0f)
                curveTo(25.274f, 23.862f, 25.274f, 16.137f, 20.0f, 16.0f)
                close()
                moveTo(5.354f, 8.811f)
                lineTo(9.311f, 7.458f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.54f, 1.248f)
                lineToRelative(1.579f, 4.67f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-7.741f, 2.65f)
                lineToRelative(-1.581f, -4.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.354f, 8.811f)
                close()
                moveTo(20.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _truckCouch!!
    }

private var _truckCouch: ImageVector? = null
