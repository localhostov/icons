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
                arcToRelative(5.524f, 5.524f, 0.0f, false, false, -4.015f, -4.726f)
                lineTo(22.875f, 3.7f)
                arcTo(2.866f, 2.866f, 0.0f, false, false, 20.133f, 0.0f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, -2.87f, 2.125f)
                lineTo(14.8f, 10.162f)
                arcTo(3.972f, 3.972f, 0.0f, false, true, 12.0f, 12.865f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.8f, -2.7f)
                lineTo(6.766f, 2.128f)
                arcTo(2.983f, 2.983f, 0.0f, false, false, 3.9f, 0.0f)
                arcTo(2.866f, 2.866f, 0.0f, false, false, 1.152f, 3.7f)
                lineToRelative(2.9f, 9.539f)
                arcTo(5.459f, 5.459f, 0.0f, false, false, 1.43f, 22.2f)
                arcTo(5.509f, 5.509f, 0.0f, false, false, 5.5f, 24.0f)
                lineTo(9.269f, 24.0f)
                arcToRelative(10.121f, 10.121f, 0.0f, false, false, 2.743f, -0.377f)
                lineToRelative(0.011f, 0.0f)
                arcTo(9.969f, 9.969f, 0.0f, false, false, 14.73f, 24.0f)
                lineTo(18.5f, 24.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.474f, -6.037f)
                close()
                moveTo(3.2f, 2.351f)
                arcTo(0.858f, 0.858f, 0.0f, false, true, 3.9f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.957f, 0.709f)
                lineToRelative(2.439f, 8.034f)
                arcTo(5.989f, 5.989f, 0.0f, false, false, 8.562f, 13.0f)
                lineTo(6.067f, 13.0f)
                lineToRelative(-3.0f, -9.882f)
                arcTo(0.859f, 0.859f, 0.0f, false, true, 3.2f, 2.351f)
                close()
                moveTo(5.5f, 22.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.483f, -3.847f)
                arcTo(3.634f, 3.634f, 0.0f, false, true, 5.693f, 15.0f)
                horizontalLineToRelative(5.275f)
                arcToRelative(5.965f, 5.965f, 0.0f, false, false, 5.74f, -4.254f)
                lineToRelative(2.467f, -8.034f)
                verticalLineToRelative(0.0f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 20.133f, 2.0f)
                arcToRelative(0.867f, 0.867f, 0.0f, false, true, 0.829f, 1.116f)
                lineTo(16.924f, 16.324f)
                arcTo(7.954f, 7.954f, 0.0f, false, true, 9.269f, 22.0f)
                close()
                moveTo(21.091f, 20.853f)
                arcTo(3.508f, 3.508f, 0.0f, false, true, 18.5f, 22.0f)
                lineTo(15.292f, 22.0f)
                arcToRelative(9.976f, 9.976f, 0.0f, false, false, 3.545f, -5.093f)
                lineToRelative(0.537f, -1.757f)
                arcToRelative(3.524f, 3.524f, 0.0f, false, true, 2.609f, 3.0f)
                arcTo(3.47f, 3.47f, 0.0f, false, true, 21.091f, 20.853f)
                close()
            }
        }
        .build()
        return _hockeySticks!!
    }

private var _hockeySticks: ImageVector? = null
