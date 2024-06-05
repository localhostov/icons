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

public val Icons.Bold.CurveAlt: ImageVector
    get() {
        if (_curveAlt != null) {
            return _curveAlt!!
        }
        _curveAlt = Builder(name = "CurveAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                curveToRelative(4.566f, 0.0f, 8.439f, -3.939f, 9.009f, -9.163f)
                curveTo(11.245f, 5.089f, 16.4f, 0.0f, 22.5f, 0.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-4.566f, 0.0f, -8.439f, 3.939f, -9.009f, 9.163f)
                curveToRelative(-0.736f, 6.748f, -5.892f, 11.837f, -11.991f, 11.837f)
                close()
            }
        }
        .build()
        return _curveAlt!!
    }

private var _curveAlt: ImageVector? = null
