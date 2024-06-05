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

public val Icons.Bold.Skewer: ImageVector
    get() {
        if (_skewer != null) {
            return _skewer!!
        }
        _skewer = Builder(name = "Skewer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.969f, 2.159f)
                lineTo(21.842f, 0.033f)
                lineTo(19.9f, 1.978f)
                lineTo(17.952f, 0.033f)
                lineTo(15.825f, 2.159f)
                lineToRelative(1.946f, 1.946f)
                lineTo(16.514f, 5.363f)
                lineTo(14.568f, 3.417f)
                lineTo(12.441f, 5.543f)
                lineTo(14.388f, 7.49f)
                lineTo(12.63f, 9.248f)
                lineTo(10.368f, 6.987f)
                arcToRelative(4.683f, 4.683f, 0.0f, false, false, -0.871f, 5.4f)
                lineTo(8.47f, 13.411f)
                lineTo(6.521f, 11.462f)
                lineTo(4.394f, 13.589f)
                lineToRelative(1.949f, 1.949f)
                lineToRelative(-0.595f, 0.595f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.576f, 0.056f)
                arcTo(4.011f, 4.011f, 0.0f, true, false, 3.481f, 24.0f)
                arcTo(3.892f, 3.892f, 0.0f, false, false, 4.0f, 24.033f)
                arcToRelative(3.984f, 3.984f, 0.0f, false, false, 2.829f, -1.176f)
                lineTo(4.7f, 20.73f)
                arcTo(1.008f, 1.008f, 0.0f, false, true, 3.1f, 20.5f)
                arcToRelative(0.983f, 0.983f, 0.0f, false, true, 0.0f, -0.952f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, true, 1.186f, -0.481f)
                arcToRelative(3.522f, 3.522f, 0.0f, false, false, 3.591f, -0.8f)
                lineToRelative(0.6f, -0.6f)
                lineToRelative(1.941f, 1.94f)
                lineToRelative(2.127f, -2.127f)
                lineTo(10.6f, 15.537f)
                lineToRelative(1.029f, -1.029f)
                arcToRelative(4.686f, 4.686f, 0.0f, false, false, 5.388f, -0.876f)
                lineToRelative(-2.257f, -2.257f)
                lineToRelative(1.758f, -1.758f)
                lineToRelative(1.942f, 1.942f)
                lineToRelative(2.127f, -2.126f)
                lineTo(18.641f, 7.489f)
                lineTo(19.9f, 6.232f)
                lineToRelative(1.944f, 1.943f)
                lineToRelative(2.127f, -2.126f)
                lineTo(22.025f, 4.105f)
                close()
            }
        }
        .build()
        return _skewer!!
    }

private var _skewer: ImageVector? = null
