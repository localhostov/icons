package me.localx.icons.straight.filled

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

public val Icons.Filled.Pumpkin: ImageVector
    get() {
        if (_pumpkin != null) {
            return _pumpkin!!
        }
        _pumpkin = Builder(name = "Pumpkin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.0f)
                curveToRelative(0.0f, 4.881f, -4.485f, 9.0f, -7.3f, 9.0f)
                horizontalLineToRelative(-0.115f)
                arcTo(11.831f, 11.831f, 0.0f, false, false, 21.0f, 15.0f)
                arcToRelative(11.674f, 11.674f, 0.0f, false, false, -4.564f, -8.969f)
                curveToRelative(0.094f, -0.009f, 0.183f, -0.031f, 0.279f, -0.031f)
                curveTo(19.525f, 6.0f, 24.0f, 10.119f, 24.0f, 15.0f)
                close()
                moveTo(3.0f, 15.0f)
                arcTo(11.674f, 11.674f, 0.0f, false, true, 7.564f, 6.031f)
                curveTo(7.47f, 6.022f, 7.381f, 6.0f, 7.285f, 6.0f)
                curveTo(4.475f, 6.0f, 0.0f, 10.119f, 0.0f, 15.0f)
                reflectiveCurveToRelative(4.485f, 9.0f, 7.3f, 9.0f)
                horizontalLineToRelative(0.115f)
                arcTo(11.831f, 11.831f, 0.0f, false, true, 3.0f, 15.0f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(0.0f, 3.646f, 2.99f, 7.756f, 4.949f, 9.0f)
                arcTo(22.572f, 22.572f, 0.0f, false, true, 8.0f, 15.0f)
                arcTo(18.079f, 18.079f, 0.0f, false, true, 9.949f, 6.037f)
                curveTo(7.839f, 7.641f, 5.0f, 11.385f, 5.0f, 15.0f)
                close()
                moveTo(14.051f, 6.037f)
                arcTo(18.079f, 18.079f, 0.0f, false, true, 16.0f, 15.0f)
                arcToRelative(22.572f, 22.572f, 0.0f, false, true, -1.949f, 9.0f)
                curveTo(16.01f, 22.756f, 19.0f, 18.646f, 19.0f, 15.0f)
                curveTo(19.0f, 11.385f, 16.161f, 7.641f, 14.051f, 6.037f)
                close()
                moveTo(13.0f, 7.0f)
                curveToRelative(0.0f, -4.943f, 2.97f, -5.0f, 3.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(17.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                arcToRelative(4.771f, 4.771f, 0.0f, false, false, -3.99f, 2.563f)
                arcTo(5.868f, 5.868f, 0.0f, false, false, 9.447f, 0.105f)
                lineTo(8.553f, 1.9f)
                curveTo(10.2f, 2.718f, 11.0f, 4.388f, 11.0f, 7.0f)
                lineTo(11.0f, 8.1f)
                arcTo(23.935f, 23.935f, 0.0f, false, false, 10.0f, 15.0f)
                curveToRelative(0.0f, 4.465f, 1.271f, 8.381f, 2.0f, 8.963f)
                curveToRelative(0.729f, -0.582f, 2.0f, -4.5f, 2.0f, -8.963f)
                arcToRelative(23.935f, 23.935f, 0.0f, false, false, -1.0f, -6.9f)
                close()
            }
        }
        .build()
        return _pumpkin!!
    }

private var _pumpkin: ImageVector? = null
