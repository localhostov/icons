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

public val Icons.Bold.HatWinter: ImageVector
    get() {
        if (_hatWinter != null) {
            return _hatWinter!!
        }
        _hatWinter = Builder(name = "HatWinter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.42f, 18.358f)
                curveToRelative(-0.508f, -5.38f, -3.399f, -11.933f, -7.843f, -13.824f)
                curveToRelative(0.268f, -0.449f, 0.423f, -0.974f, 0.423f, -1.534f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.56f, 0.155f, 1.085f, 0.423f, 1.534f)
                curveToRelative(-4.444f, 1.891f, -7.335f, 8.444f, -7.843f, 13.824f)
                curveToRelative(-0.94f, 0.507f, -1.58f, 1.501f, -1.58f, 2.642f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.141f, -0.64f, -2.135f, -1.58f, -2.642f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(3.518f, 0.0f, 6.692f, 5.711f, 7.368f, 11.0f)
                horizontalLineTo(4.632f)
                curveToRelative(0.128f, -0.999f, 0.344f, -2.012f, 0.635f, -3.0f)
                horizontalLineToRelative(9.232f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(6.427f)
                curveToRelative(1.401f, -2.866f, 3.423f, -5.0f, 5.573f, -5.0f)
                close()
            }
        }
        .build()
        return _hatWinter!!
    }

private var _hatWinter: ImageVector? = null
