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

public val Icons.Bold.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 513.749f, viewportHeight = 513.749f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.352f, 459.061f)
                lineToRelative(-99.435f, -99.477f)
                curveToRelative(74.402f, -99.427f, 54.115f, -240.344f, -45.312f, -314.746f)
                reflectiveCurveTo(119.261f, -9.277f, 44.859f, 90.15f)
                reflectiveCurveTo(-9.256f, 330.494f, 90.171f, 404.896f)
                curveToRelative(79.868f, 59.766f, 189.565f, 59.766f, 269.434f, 0.0f)
                lineToRelative(99.477f, 99.477f)
                curveToRelative(12.501f, 12.501f, 32.769f, 12.501f, 45.269f, 0.0f)
                curveToRelative(12.501f, -12.501f, 12.501f, -32.769f, 0.0f, -45.269f)
                lineTo(504.352f, 459.061f)
                close()
                moveTo(225.717f, 385.696f)
                curveToRelative(-88.366f, 0.0f, -160.0f, -71.634f, -160.0f, -160.0f)
                reflectiveCurveToRelative(71.634f, -160.0f, 160.0f, -160.0f)
                reflectiveCurveToRelative(160.0f, 71.634f, 160.0f, 160.0f)
                curveTo(385.623f, 314.022f, 314.044f, 385.602f, 225.717f, 385.696f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
