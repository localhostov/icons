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

public val Icons.Filled.Messages: ImageVector
    get() {
        if (_messages != null) {
            return _messages!!
        }
        _messages = Builder(name = "Messages", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.34f, 19.643f)
                lineToRelative(3.963f, -2.643f)
                horizontalLineToRelative(10.697f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(14.854f)
                curveToRelative(0.0f, 0.793f, 0.435f, 1.519f, 1.134f, 1.894f)
                curveToRelative(0.318f, 0.171f, 0.667f, 0.255f, 1.015f, 0.255f)
                curveToRelative(0.416f, 0.0f, 0.831f, -0.121f, 1.191f, -0.36f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(14.854f)
                curveToRelative(0.0f, 0.793f, -0.435f, 1.519f, -1.134f, 1.894f)
                curveToRelative(-0.318f, 0.171f, -0.667f, 0.255f, -1.015f, 0.256f)
                curveToRelative(-0.416f, 0.0f, -0.831f, -0.121f, -1.19f, -0.36f)
                lineToRelative(-3.964f, -2.644f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-0.727f)
                lineToRelative(1.908f, -1.273f)
                horizontalLineToRelative(12.092f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _messages!!
    }

private var _messages: ImageVector? = null
