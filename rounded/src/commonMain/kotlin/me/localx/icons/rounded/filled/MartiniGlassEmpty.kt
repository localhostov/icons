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

public val Icons.Filled.MartiniGlassEmpty: ImageVector
    get() {
        if (_martiniGlassEmpty != null) {
            return _martiniGlassEmpty!!
        }
        _martiniGlassEmpty = Builder(name = "MartiniGlassEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.782f, 2.025f)
                curveToRelative(-0.481f, -1.23f, -1.635f, -2.025f, -2.938f, -2.025f)
                horizontalLineTo(3.156f)
                curveTo(1.853f, 0.0f, 0.699f, 0.795f, 0.218f, 2.025f)
                curveToRelative(-0.466f, 1.19f, -0.183f, 2.459f, 0.771f, 3.34f)
                lineToRelative(8.149f, 7.528f)
                curveToRelative(0.548f, 0.498f, 1.19f, 0.829f, 1.863f, 0.992f)
                verticalLineToRelative(8.115f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-8.116f)
                curveToRelative(0.674f, -0.164f, 1.318f, -0.496f, 1.869f, -0.997f)
                lineToRelative(8.173f, -7.551f)
                curveToRelative(0.922f, -0.853f, 1.206f, -2.121f, 0.74f, -3.312f)
                close()
            }
        }
        .build()
        return _martiniGlassEmpty!!
    }

private var _martiniGlassEmpty: ImageVector? = null
