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

public val Icons.Outline.Comet: ImageVector
    get() {
        if (_comet != null) {
            return _comet!!
        }
        _comet = Builder(name = "Comet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 24.0f)
                curveToRelative(-2.27f, 0.0f, -4.404f, -0.884f, -6.011f, -2.489f)
                curveToRelative(-1.605f, -1.606f, -2.489f, -3.741f, -2.489f, -6.011f)
                curveTo(0.0f, 8.579f, 5.978f, 4.723f, 11.251f, 1.32f)
                lineTo(13.0f, 0.191f)
                lineTo(13.0f, 4.313f)
                curveTo(17.743f, 1.833f, 21.98f, 0.647f, 22.176f, 0.594f)
                lineToRelative(1.699f, -0.469f)
                lineToRelative(-0.469f, 1.699f)
                curveToRelative(-0.054f, 0.195f, -1.239f, 4.433f, -3.72f, 9.176f)
                horizontalLineToRelative(4.122f)
                lineToRelative(-1.129f, 1.749f)
                curveToRelative(-3.402f, 5.273f, -7.259f, 11.251f, -14.18f, 11.251f)
                close()
                moveTo(11.0f, 3.866f)
                curveTo(6.374f, 6.892f, 2.0f, 10.18f, 2.0f, 15.5f)
                curveToRelative(0.0f, 1.736f, 0.676f, 3.368f, 1.903f, 4.597f)
                curveToRelative(1.229f, 1.228f, 2.86f, 1.903f, 4.597f, 1.903f)
                curveToRelative(5.32f, 0.0f, 8.608f, -4.374f, 11.634f, -9.0f)
                horizontalLineToRelative(-3.858f)
                lineToRelative(0.856f, -1.497f)
                curveToRelative(1.853f, -3.235f, 3.102f, -6.468f, 3.769f, -8.403f)
                curveToRelative(-1.936f, 0.667f, -5.168f, 1.916f, -8.403f, 3.769f)
                lineToRelative(-1.497f, 0.856f)
                lineTo(11.001f, 3.866f)
                close()
                moveTo(9.0f, 19.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(9.0f, 13.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _comet!!
    }

private var _comet: ImageVector? = null
