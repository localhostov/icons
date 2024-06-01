package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.UserAdd: ImageVector
    get() {
        if (_userAdd != null) {
            return _userAdd!!
        }
        _userAdd = Builder(name = "UserAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 12.0f)
                    curveTo(12.3137f, 12.0f, 15.0f, 9.3137f, 15.0f, 6.0f)
                    curveTo(15.0f, 2.6863f, 12.3137f, 0.0f, 9.0f, 0.0f)
                    curveTo(5.6863f, 0.0f, 3.0f, 2.6863f, 3.0f, 6.0f)
                    curveTo(3.0f, 9.3137f, 5.6863f, 12.0f, 9.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.043f, 14.0006f)
                    horizontalLineTo(4.957f)
                    curveTo(3.6428f, 14.0022f, 2.3829f, 14.525f, 1.4536f, 15.4542f)
                    curveTo(0.5244f, 16.3835f, 0.0016f, 17.6434f, 0.0f, 18.9576f)
                    lineTo(0.0f, 24.0006f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(18.9576f)
                    curveTo(17.9984f, 17.6434f, 17.4756f, 16.3835f, 16.5464f, 15.4542f)
                    curveTo(15.6171f, 14.525f, 14.3572f, 14.0022f, 13.043f, 14.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.9999f, 9.9994f)
                    verticalLineTo(6.9994f)
                    horizontalLineTo(18.9999f)
                    verticalLineTo(9.9994f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(11.9994f)
                    horizontalLineTo(18.9999f)
                    verticalLineTo(14.9994f)
                    horizontalLineTo(20.9999f)
                    verticalLineTo(11.9994f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(9.9994f)
                    horizontalLineTo(20.9999f)
                    close()
                }
            }
        }
        .build()
        return _userAdd!!
    }

private var _userAdd: ImageVector? = null
