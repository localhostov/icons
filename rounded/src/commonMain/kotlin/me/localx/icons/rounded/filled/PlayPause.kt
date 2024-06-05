package me.localx.icons.rounded.filled

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

public val Icons.Filled.PlayPause: ImageVector
    get() {
        if (_playPause != null) {
            return _playPause!!
        }
        _playPause = Builder(name = "PlayPause", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                lineTo(23.0f, 20.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(17.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                lineTo(19.0f, 20.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(4.327f, 20.729f)
                curveToRelative(-0.509f, 0.0f, -1.023f, -0.122f, -1.509f, -0.367f)
                curveToRelative(-1.139f, -0.578f, -1.818f, -1.683f, -1.818f, -2.958f)
                lineTo(1.0f, 6.597f)
                curveToRelative(0.0f, -1.275f, 0.679f, -2.381f, 1.817f, -2.958f)
                curveToRelative(1.119f, -0.567f, 2.452f, -0.457f, 3.46f, 0.285f)
                lineToRelative(7.368f, 5.402f)
                curveToRelative(0.86f, 0.631f, 1.354f, 1.606f, 1.354f, 2.674f)
                reflectiveCurveToRelative(-0.494f, 2.043f, -1.355f, 2.674f)
                lineToRelative(-7.368f, 5.403f)
                curveToRelative(-0.588f, 0.432f, -1.265f, 0.651f, -1.949f, 0.651f)
                close()
            }
        }
        .build()
        return _playPause!!
    }

private var _playPause: ImageVector? = null
