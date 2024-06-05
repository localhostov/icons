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

public val Icons.Filled.LinkHorizontal: ImageVector
    get() {
        if (_linkHorizontal != null) {
            return _linkHorizontal!!
        }
        _linkHorizontal = Builder(name = "LinkHorizontal", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.5f)
                curveToRelative(0.0f, 3.584f, -2.916f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.916f, -6.5f, 6.5f, -6.5f)
                horizontalLineToRelative(1.471f)
                curveToRelative(-0.137f, 1.14f, -0.764f, 2.0f, -1.971f, 2.0f)
                curveToRelative(-2.236f, 0.26f, -4.0f, 2.196f, -4.0f, 4.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -1.778f, -1.045f, -3.304f, -2.545f, -4.034f)
                curveToRelative(0.236f, -0.631f, 0.404f, -1.295f, 0.484f, -1.987f)
                curveToRelative(2.378f, 0.967f, 4.061f, 3.3f, 4.061f, 6.021f)
                close()
                moveTo(2.0f, 8.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                curveToRelative(0.0f, 2.304f, -1.764f, 4.24f, -4.0f, 4.5f)
                curveToRelative(-1.207f, 0.0f, -1.834f, 0.86f, -1.971f, 2.0f)
                horizontalLineToRelative(1.471f)
                curveToRelative(3.584f, 0.0f, 6.5f, -2.916f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.916f, -6.5f, -6.5f, -6.5f)
                horizontalLineTo(6.5f)
                curveTo(2.916f, 2.0f, 0.0f, 4.916f, 0.0f, 8.5f)
                curveToRelative(0.0f, 2.721f, 1.683f, 5.054f, 4.061f, 6.021f)
                curveToRelative(0.08f, -0.692f, 0.247f, -1.355f, 0.484f, -1.987f)
                curveToRelative(-1.5f, -0.731f, -2.545f, -2.256f, -2.545f, -4.034f)
                close()
            }
        }
        .build()
        return _linkHorizontal!!
    }

private var _linkHorizontal: ImageVector? = null
