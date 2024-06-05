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

public val Icons.Bold.GraphCurve: ImageVector
    get() {
        if (_graphCurve != null) {
            return _graphCurve!!
        }
        _graphCurve = Builder(name = "GraphCurve", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(5.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                verticalLineTo(1.5f)
                curveTo(0.0f, 0.672f, 0.671f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(12.085f)
                curveToRelative(2.874f, -5.056f, 8.532f, -8.585f, 14.879f, -8.585f)
                horizontalLineToRelative(1.121f)
                verticalLineToRelative(-1.563f)
                curveToRelative(0.0f, -0.863f, 1.043f, -1.295f, 1.653f, -0.685f)
                lineToRelative(3.063f, 3.063f)
                curveToRelative(0.378f, 0.378f, 0.378f, 0.991f, 0.0f, 1.369f)
                lineToRelative(-3.063f, 3.063f)
                curveToRelative(-0.61f, 0.61f, -1.653f, 0.178f, -1.653f, -0.685f)
                verticalLineToRelative(-1.563f)
                horizontalLineToRelative(-1.121f)
                curveToRelative(-7.218f, 0.0f, -13.553f, 5.793f, -13.851f, 12.511f)
                curveToRelative(0.414f, 0.304f, 0.92f, 0.489f, 1.472f, 0.489f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _graphCurve!!
    }

private var _graphCurve: ImageVector? = null
