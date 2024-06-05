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

public val Icons.Bold.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(9.864f, 24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                arcToRelative(5.027f, 5.027f, 0.0f, false, false, 2.081f, -0.435f)
                arcTo(10.017f, 10.017f, 0.0f, false, true, 2.0f, 11.0f)
                curveTo(2.0f, 4.523f, 6.991f, 0.0f, 14.136f, 0.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                arcToRelative(5.027f, 5.027f, 0.0f, false, false, -2.081f, 0.435f)
                arcTo(10.017f, 10.017f, 0.0f, false, true, 22.0f, 13.0f)
                curveTo(22.0f, 19.477f, 17.009f, 24.0f, 9.864f, 24.0f)
                close()
                moveTo(10.28f, 3.619f)
                arcTo(7.543f, 7.543f, 0.0f, false, false, 5.0f, 11.0f)
                arcToRelative(6.926f, 6.926f, 0.0f, false, false, 7.0f, 7.0f)
                horizontalLineToRelative(3.061f)
                reflectiveCurveToRelative(-1.291f, 2.3f, -1.341f, 2.381f)
                arcTo(7.543f, 7.543f, 0.0f, false, false, 19.0f, 13.0f)
                arcToRelative(6.926f, 6.926f, 0.0f, false, false, -7.0f, -7.0f)
                horizontalLineTo(8.939f)
                reflectiveCurveTo(10.23f, 3.7f, 10.28f, 3.619f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
