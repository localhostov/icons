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

public val Icons.Filled.Mound: ImageVector
    get() {
        if (_mound != null) {
            return _mound!!
        }
        _mound = Builder(name = "Mound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.762f, 24.045f)
                horizontalLineTo(3.238f)
                curveToRelative(-1.143f, 0.0f, -2.178f, -0.586f, -2.769f, -1.567f)
                curveToRelative(-0.592f, -0.983f, -0.626f, -2.174f, -0.093f, -3.189f)
                lineToRelative(3.734f, -7.391f)
                curveToRelative(1.513f, -2.994f, 4.536f, -4.853f, 7.89f, -4.853f)
                reflectiveCurveToRelative(6.377f, 1.859f, 7.89f, 4.853f)
                lineToRelative(3.738f, 7.398f)
                curveToRelative(0.53f, 1.0f, 0.497f, 2.196f, -0.097f, 3.182f)
                curveToRelative(-0.591f, 0.981f, -1.626f, 1.567f, -2.769f, 1.567f)
                close()
            }
        }
        .build()
        return _mound!!
    }

private var _mound: ImageVector? = null
