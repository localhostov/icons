package me.localx.icons.rounded.bold

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

public val Icons.Bold.MarkerTime: ImageVector
    get() {
        if (_markerTime != null) {
            return _markerTime!!
        }
        _markerTime = Builder(name = "MarkerTime", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.78f, 3.238f)
                arcToRelative(10.967f, 10.967f, 0.0f, false, false, -15.561f, 0.0f)
                arcToRelative(11.1f, 11.1f, 0.0f, false, false, 0.043f, 15.656f)
                lineToRelative(3.738f, 3.466f)
                arcToRelative(5.707f, 5.707f, 0.0f, false, false, 7.977f, 0.03f)
                lineToRelative(3.807f, -3.537f)
                arcToRelative(11.093f, 11.093f, 0.0f, false, false, -0.004f, -15.615f)
                close()
                moveTo(17.7f, 16.7f)
                lineTo(13.9f, 20.225f)
                arcToRelative(2.754f, 2.754f, 0.0f, false, true, -3.832f, -0.03f)
                lineToRelative(-3.722f, -3.458f)
                arcToRelative(8.084f, 8.084f, 0.0f, false, true, 0.0f, -11.383f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, 11.307f, 0.0f)
                arcToRelative(8.074f, 8.074f, 0.0f, false, true, 0.047f, 11.346f)
                close()
                moveTo(15.565f, 14.565f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 0.0f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.443f, -1.065f)
                verticalLineToRelative(-3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(2.879f)
                lineToRelative(2.061f, 2.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.122f)
                close()
            }
        }
        .build()
        return _markerTime!!
    }

private var _markerTime: ImageVector? = null
