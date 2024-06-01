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

public val Icons.Filled.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.043f, 14.0006f)
                    horizontalLineTo(7.957f)
                    curveTo(6.6428f, 14.0022f, 5.3829f, 14.525f, 4.4536f, 15.4542f)
                    curveTo(3.5243f, 16.3835f, 3.0016f, 17.6434f, 3.0f, 18.9576f)
                    verticalLineTo(24.0006f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.9576f)
                    curveTo(20.9984f, 17.6434f, 20.4756f, 16.3835f, 19.5464f, 15.4542f)
                    curveTo(18.6171f, 14.525f, 17.3572f, 14.0022f, 16.043f, 14.0006f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 12.0f)
                    curveTo(15.3137f, 12.0f, 18.0f, 9.3137f, 18.0f, 6.0f)
                    curveTo(18.0f, 2.6863f, 15.3137f, 0.0f, 12.0f, 0.0f)
                    curveTo(8.6863f, 0.0f, 6.0f, 2.6863f, 6.0f, 6.0f)
                    curveTo(6.0f, 9.3137f, 8.6863f, 12.0f, 12.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
