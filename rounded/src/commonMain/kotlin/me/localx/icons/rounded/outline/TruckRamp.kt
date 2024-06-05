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

public val Icons.Outline.TruckRamp: ImageVector
    get() {
        if (_truckRamp != null) {
            return _truckRamp!!
        }
        _truckRamp = Builder(name = "TruckRamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                lineTo(20.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                lineTo(18.0f, 16.279f)
                lineTo(0.684f, 22.051f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.632f, 1.9f)
                lineToRelative(14.807f, -4.936f)
                arcTo(4.017f, 4.017f, 0.0f, false, false, 20.0f, 24.0f)
                curveTo(25.274f, 23.862f, 25.274f, 16.137f, 20.0f, 16.0f)
                close()
                moveTo(20.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _truckRamp!!
    }

private var _truckRamp: ImageVector? = null
