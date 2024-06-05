package me.localx.icons.straight.bold

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

public val Icons.Bold.Walker: ImageVector
    get() {
        if (_walker != null) {
            return _walker!!
        }
        _walker = Builder(name = "Walker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 17.337f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-7.78f)
                curveToRelative(-1.479f, 0.0f, -2.804f, 0.937f, -3.299f, 2.329f)
                lineTo(0.086f, 22.998f)
                lineToRelative(2.828f, 1.004f)
                lineToRelative(4.259f, -12.002f)
                horizontalLineToRelative(11.827f)
                verticalLineToRelative(5.337f)
                curveToRelative(-1.182f, 0.562f, -2.0f, 1.767f, -2.0f, 3.163f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.396f, -0.818f, -2.601f, -2.0f, -3.163f)
                close()
                moveTo(8.238f, 9.0f)
                lineToRelative(2.011f, -5.667f)
                curveToRelative(0.07f, -0.199f, 0.26f, -0.333f, 0.471f, -0.333f)
                horizontalLineToRelative(7.78f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-10.762f)
                close()
            }
        }
        .build()
        return _walker!!
    }

private var _walker: ImageVector? = null
