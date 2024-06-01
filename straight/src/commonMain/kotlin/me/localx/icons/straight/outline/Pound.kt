package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Pound: ImageVector
    get() {
        if (_pound != null) {
            return _pound!!
        }
        _pound = Builder(name = "Pound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0001f, 22.0f)
                    horizontalLineTo(6.4601f)
                    curveTo(7.451f, 20.9033f, 7.9997f, 19.478f, 8.0001f, 18.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(8.0f)
                    curveTo(8.0001f, 6.4087f, 8.6323f, 4.8826f, 9.7575f, 3.7574f)
                    curveTo(10.8827f, 2.6321f, 12.4088f, 2.0f, 14.0001f, 2.0f)
                    curveTo(15.5914f, 2.0f, 17.1175f, 2.6321f, 18.2428f, 3.7574f)
                    curveTo(19.368f, 4.8826f, 20.0001f, 6.4087f, 20.0001f, 8.0f)
                    horizontalLineTo(22.0001f)
                    curveTo(22.0001f, 5.8783f, 21.1573f, 3.8434f, 19.657f, 2.3431f)
                    curveTo(18.1567f, 0.8429f, 16.1219f, 0.0f, 14.0001f, 0.0f)
                    curveTo(11.8784f, 0.0f, 9.8436f, 0.8429f, 8.3433f, 2.3431f)
                    curveTo(6.843f, 3.8434f, 6.0001f, 5.8783f, 6.0001f, 8.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(3.0001f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(18.0f)
                    curveTo(6.0001f, 19.0609f, 5.5787f, 20.0783f, 4.8285f, 20.8284f)
                    curveTo(4.0784f, 21.5786f, 3.061f, 22.0f, 2.0001f, 22.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _pound!!
    }

private var _pound: ImageVector? = null
