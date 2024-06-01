package me.localx.icons.rounded.filled

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.9991f)
                curveTo(7.0317f, 14.0046f, 3.0055f, 18.0308f, 3.0f, 22.9991f)
                curveTo(3.0f, 23.5514f, 3.4477f, 23.9991f, 4.0f, 23.9991f)
                horizontalLineTo(20.0f)
                curveTo(20.5522f, 23.9991f, 21.0f, 23.5514f, 21.0f, 22.9991f)
                curveTo(20.9945f, 18.0308f, 16.9683f, 14.0046f, 12.0f, 13.9991f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
