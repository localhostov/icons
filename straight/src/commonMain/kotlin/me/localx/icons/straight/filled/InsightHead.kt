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

public val Icons.Filled.InsightHead: ImageVector
    get() {
        if (_insightHead != null) {
            return _insightHead!!
        }
        _insightHead = Builder(name = "InsightHead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 20.414f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.247f)
                curveToRelative(-1.5f, 0.0f, -2.778f, -1.121f, -2.974f, -2.606f)
                lineToRelative(-0.449f, -3.394f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.212f)
                lineToRelative(0.724f, -1.647f)
                curveToRelative(1.18f, -2.706f, 2.294f, -5.262f, 3.476f, -6.722f)
                curveTo(6.638f, 1.163f, 10.511f, -0.448f, 14.547f, 0.106f)
                curveToRelative(4.996f, 0.686f, 8.952f, 4.84f, 9.407f, 9.876f)
                curveToRelative(0.265f, 2.936f, -0.622f, 5.793f, -2.497f, 8.045f)
                curveToRelative(-0.002f, 0.003f, -0.004f, 0.006f, -0.006f, 0.009f)
                lineToRelative(-3.566f, -3.566f)
                curveToRelative(0.699f, -0.981f, 1.115f, -2.177f, 1.115f, -3.471f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.294f, 0.0f, 2.49f, -0.416f, 3.471f, -1.115f)
                lineToRelative(4.529f, 4.529f)
                close()
                moveTo(13.0f, 7.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _insightHead!!
    }

private var _insightHead: ImageVector? = null
