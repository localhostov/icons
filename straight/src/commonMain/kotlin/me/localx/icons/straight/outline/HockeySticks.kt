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

public val Icons.Outline.HockeySticks: ImageVector
    get() {
        if (_hockeySticks != null) {
            return _hockeySticks!!
        }
        _hockeySticks = Builder(name = "HockeySticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.974f, 17.963f)
                arcToRelative(5.52f, 5.52f, 0.0f, false, false, -4.024f, -4.719f)
                lineTo(23.971f, 0.0f)
                lineTo(20.105f, 0.0f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, -2.871f, 2.128f)
                lineTo(14.8f, 10.162f)
                arcTo(3.965f, 3.965f, 0.0f, false, true, 12.0f, 12.856f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.79f, -2.694f)
                lineTo(6.766f, 2.128f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 3.9f, 0.0f)
                lineTo(0.029f, 0.0f)
                lineTo(4.055f, 13.26f)
                arcTo(5.465f, 5.465f, 0.0f, false, false, 5.5f, 24.0f)
                lineTo(9.269f, 24.0f)
                arcToRelative(10.075f, 10.075f, 0.0f, false, false, 2.758f, -0.389f)
                lineToRelative(0.0f, 0.016f)
                arcTo(9.969f, 9.969f, 0.0f, false, false, 14.73f, 24.0f)
                lineTo(18.5f, 24.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.474f, -6.037f)
                close()
                moveTo(3.9f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.957f, 0.709f)
                lineToRelative(2.439f, 8.034f)
                arcTo(5.984f, 5.984f, 0.0f, false, false, 8.576f, 13.0f)
                lineTo(6.067f, 13.0f)
                lineTo(2.727f, 2.0f)
                close()
                moveTo(5.5f, 22.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.483f, -3.847f)
                arcTo(3.632f, 3.632f, 0.0f, false, true, 5.693f, 15.0f)
                horizontalLineToRelative(5.275f)
                arcToRelative(5.966f, 5.966f, 0.0f, false, false, 5.741f, -4.257f)
                lineToRelative(2.439f, -8.034f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.105f, 2.0f)
                horizontalLineToRelative(1.168f)
                lineTo(16.924f, 16.324f)
                arcTo(7.954f, 7.954f, 0.0f, false, true, 9.269f, 22.0f)
                close()
                moveTo(21.091f, 20.853f)
                arcTo(3.508f, 3.508f, 0.0f, false, true, 18.5f, 22.0f)
                lineTo(15.288f, 22.0f)
                arcToRelative(9.975f, 9.975f, 0.0f, false, false, 3.55f, -5.095f)
                lineToRelative(0.532f, -1.751f)
                arcToRelative(3.523f, 3.523f, 0.0f, false, true, 2.613f, 3.0f)
                arcTo(3.47f, 3.47f, 0.0f, false, true, 21.091f, 20.853f)
                close()
            }
        }
        .build()
        return _hockeySticks!!
    }

private var _hockeySticks: ImageVector? = null
