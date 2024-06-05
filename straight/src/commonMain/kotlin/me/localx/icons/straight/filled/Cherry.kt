package me.localx.icons.straight.filled

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

public val Icons.Filled.Cherry: ImageVector
    get() {
        if (_cherry != null) {
            return _cherry!!
        }
        _cherry = Builder(name = "Cherry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.679f, 14.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, -1.786f, 0.483f)
                curveToRelative(-0.407f, -1.423f, -2.584f, -8.654f, -6.084f, -13.448f)
                lineTo(12.037f, -0.025f)
                lineTo(11.219f, 1.0f)
                curveTo(7.48f, 5.659f, 5.481f, 12.977f, 5.1f, 14.481f)
                arcTo(3.952f, 3.952f, 0.0f, false, false, 3.294f, 14.0f)
                curveTo(1.675f, 14.0f, 0.0f, 15.523f, 0.0f, 18.078f)
                arcToRelative(5.956f, 5.956f, 0.0f, false, false, 6.0f, 5.9f)
                arcToRelative(5.956f, 5.956f, 0.0f, false, false, 6.0f, -5.9f)
                curveTo(12.0f, 15.523f, 10.312f, 14.0f, 8.679f, 14.0f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, false, -1.468f, 0.332f)
                arcTo(40.658f, 40.658f, 0.0f, false, true, 11.967f, 3.346f)
                arcToRelative(49.477f, 49.477f, 0.0f, false, true, 4.79f, 10.976f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 15.294f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.053f, 0.9f)
                arcTo(6.713f, 6.713f, 0.0f, false, true, 14.0f, 18.078f)
                arcToRelative(7.747f, 7.747f, 0.0f, false, true, -0.831f, 3.482f)
                arcTo(6.023f, 6.023f, 0.0f, false, false, 18.0f, 23.975f)
                arcToRelative(5.956f, 5.956f, 0.0f, false, false, 6.0f, -5.9f)
                curveTo(24.0f, 15.523f, 22.312f, 14.0f, 20.679f, 14.0f)
                close()
            }
        }
        .build()
        return _cherry!!
    }

private var _cherry: ImageVector? = null
