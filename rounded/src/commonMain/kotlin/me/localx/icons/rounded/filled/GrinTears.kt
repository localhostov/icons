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

public val Icons.Filled.GrinTears: ImageVector
    get() {
        if (_grinTears != null) {
            return _grinTears!!
        }
        _grinTears = Builder(name = "GrinTears", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.382f, 16.38f)
                arcTo(7.092f, 7.092f, 0.0f, false, true, 19.0f, 12.693f)
                arcTo(0.638f, 0.638f, 0.0f, false, true, 19.689f, 12.0f)
                curveToRelative(1.186f, 0.131f, 3.535f, 0.634f, 4.125f, 2.036f)
                arcToRelative(11.99f, 11.99f, 0.0f, true, false, -23.628f, 0.0f)
                curveToRelative(0.589f, -1.4f, 2.939f, -1.906f, 4.125f, -2.036f)
                arcTo(0.638f, 0.638f, 0.0f, false, true, 5.0f, 12.693f)
                curveTo(4.885f, 14.618f, 3.514f, 18.23f, 0.927f, 16.626f)
                curveToRelative(4.055f, 9.774f, 18.1f, 9.768f, 22.146f, 0.0f)
                arcTo(2.112f, 2.112f, 0.0f, false, true, 20.382f, 16.38f)
                close()
                moveTo(5.0f, 10.0f)
                curveToRelative(0.248f, -5.285f, 5.753f, -5.282f, 6.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 10.0f)
                close()
                moveTo(17.842f, 15.542f)
                arcTo(6.827f, 6.827f, 0.0f, false, true, 12.0f, 19.0f)
                arcToRelative(6.836f, 6.836f, 0.0f, false, true, -5.848f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.2f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 12.0f, 15.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 4.792f, -0.976f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.842f, 15.542f)
                close()
                moveTo(18.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -1.892f, 1.232f, -4.0f, 3.0f, -4.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 11.0f)
                close()
            }
        }
        .build()
        return _grinTears!!
    }

private var _grinTears: ImageVector? = null
