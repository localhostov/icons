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

public val Icons.Filled.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 511.786f, viewportHeight = 511.786f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.382f, 426.694f)
                curveToRelative(49.214f, 0.064f, 96.923f, -16.963f, 134.976f, -48.171f)
                lineToRelative(127.275f, 127.253f)
                curveToRelative(8.475f, 8.185f, 21.98f, 7.95f, 30.165f, -0.525f)
                curveToRelative(7.984f, -8.267f, 7.984f, -21.373f, 0.0f, -29.641f)
                lineTo(378.545f, 348.337f)
                curveToRelative(74.545f, -91.24f, 61.011f, -225.636f, -30.229f, -300.181f)
                reflectiveCurveTo(122.68f, -12.855f, 48.135f, 78.385f)
                reflectiveCurveTo(-12.876f, 304.02f, 78.364f, 378.566f)
                curveTo(116.472f, 409.701f, 164.172f, 426.704f, 213.382f, 426.694f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
