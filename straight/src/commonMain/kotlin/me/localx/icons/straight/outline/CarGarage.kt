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

public val Icons.Outline.CarGarage: ImageVector
    get() {
        if (_carGarage != null) {
            return _carGarage!!
        }
        _carGarage = Builder(name = "CarGarage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.447f, 8.658f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 16.764f, 7.0f)
                lineTo(7.236f, 7.0f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 4.553f, 8.658f)
                lineTo(2.267f, 13.23f)
                arcTo(12.059f, 12.059f, 0.0f, false, false, 1.0f, 18.6f)
                lineTo(1.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 18.6f)
                arcToRelative(12.059f, 12.059f, 0.0f, false, false, -1.267f, -5.367f)
                close()
                moveTo(6.347f, 9.558f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 7.236f, 9.0f)
                horizontalLineToRelative(9.528f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 0.894f, 0.553f)
                lineTo(19.882f, 14.0f)
                lineTo(4.118f, 14.0f)
                close()
                moveTo(21.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                lineTo(3.0f, 18.6f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 3.345f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(7.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(19.0f, 16.0f)
                horizontalLineToRelative(1.655f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 21.0f, 18.6f)
                close()
                moveTo(23.94f, 5.528f)
                lineToRelative(-0.883f, 1.8f)
                lineTo(12.441f, 2.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, 0.0f)
                lineTo(0.943f, 7.323f)
                lineTo(0.06f, 5.528f)
                lineTo(10.676f, 0.308f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, true, 2.648f, 0.0f)
                close()
            }
        }
        .build()
        return _carGarage!!
    }

private var _carGarage: ImageVector? = null
