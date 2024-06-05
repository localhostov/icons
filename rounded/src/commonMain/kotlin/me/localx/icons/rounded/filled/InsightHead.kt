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
                verticalLineToRelative(0.586f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(-0.494f)
                curveToRelative(-2.498f, 0.0f, -4.629f, -1.868f, -4.957f, -4.344f)
                lineToRelative(-0.219f, -1.656f)
                horizontalLineToRelative(-0.33f)
                curveToRelative(-1.299f, 0.0f, -2.0f, -1.03f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.419f, 2.932f, -7.014f, 4.199f, -8.582f)
                curveTo(6.638f, 1.163f, 10.511f, -0.448f, 14.547f, 0.106f)
                curveToRelative(4.996f, 0.686f, 8.952f, 4.839f, 9.407f, 9.876f)
                curveToRelative(0.25f, 2.768f, -0.537f, 5.5f, -2.215f, 7.692f)
                curveToRelative(-0.094f, 0.123f, -0.174f, 0.261f, -0.251f, 0.4f)
                lineToRelative(-3.603f, -3.603f)
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
