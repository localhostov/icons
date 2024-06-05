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

public val Icons.Bold.ManHead: ImageVector
    get() {
        if (_manHead != null) {
            return _manHead!!
        }
        _manHead = Builder(name = "ManHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, -3.623f, 3.982f)
                arcTo(9.441f, 9.441f, 0.0f, false, true, 17.0f, 19.332f)
                lineTo(17.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                lineTo(14.0f, 20.743f)
                arcToRelative(7.808f, 7.808f, 0.0f, false, true, -4.0f, -0.007f)
                lineTo(10.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 19.326f)
                arcTo(9.3f, 9.3f, 0.0f, false, true, 3.331f, 14.0f)
                lineTo(3.5f, 14.0f)
                arcToRelative(12.839f, 12.839f, 0.0f, false, false, 2.841f, -0.421f)
                arcTo(6.267f, 6.267f, 0.0f, false, false, 12.0f, 18.0f)
                arcToRelative(6.262f, 6.262f, 0.0f, false, false, 5.784f, -4.814f)
                lineTo(18.039f, 12.0f)
                lineTo(20.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.034f, -2.0f)
                lineToRelative(-1.252f, -0.045f)
                lineTo(18.6f, 8.714f)
                arcTo(6.7f, 6.7f, 0.0f, false, false, 12.0f, 3.0f)
                arcTo(7.012f, 7.012f, 0.0f, false, false, 5.11f, 8.761f)
                arcTo(12.633f, 12.633f, 0.0f, false, false, 11.345f, 5.0f)
                lineTo(12.0f, 5.0f)
                arcToRelative(4.634f, 4.634f, 0.0f, false, true, 2.588f, 0.807f)
                arcToRelative(16.787f, 16.787f, 0.0f, false, true, -4.78f, 4.225f)
                arcToRelative(1.507f, 1.507f, 0.0f, true, true, -1.671f, 0.849f)
                arcTo(12.8f, 12.8f, 0.0f, false, true, 3.5f, 12.0f)
                lineTo(2.0f, 12.0f)
                lineTo(2.0f, 10.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(9.727f, 9.727f, 0.0f, false, true, 9.36f, 7.233f)
                arcTo(3.988f, 3.988f, 0.0f, false, true, 24.0f, 11.0f)
                close()
                moveTo(16.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 11.5f)
                close()
            }
        }
        .build()
        return _manHead!!
    }

private var _manHead: ImageVector? = null
