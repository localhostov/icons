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

public val Icons.Filled.Branching: ImageVector
    get() {
        if (_branching != null) {
            return _branching!!
        }
        _branching = Builder(name = "Branching", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(4.163f)
                curveToRelative(0.434f, 1.441f, 1.757f, 2.5f, 3.337f, 2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.58f, 0.0f, -2.903f, 1.059f, -3.337f, 2.5f)
                horizontalLineToRelative(-4.163f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(4.163f)
                curveToRelative(0.434f, 1.441f, 1.757f, 2.5f, 3.337f, 2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.58f, 0.0f, -2.903f, 1.059f, -3.337f, 2.5f)
                horizontalLineToRelative(-6.163f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.837f)
                curveToRelative(-0.434f, -1.441f, -1.757f, -2.5f, -3.337f, -2.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.58f, 0.0f, 2.903f, -1.059f, 3.337f, -2.5f)
                horizontalLineToRelative(4.163f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(6.163f)
                curveToRelative(0.434f, 1.441f, 1.757f, 2.5f, 3.337f, 2.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.58f, 0.0f, -2.903f, 1.059f, -3.337f, 2.5f)
                horizontalLineToRelative(-4.163f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _branching!!
    }

private var _branching: ImageVector? = null
