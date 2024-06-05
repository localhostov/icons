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

public val Icons.Bold.ForwardFast: ImageVector
    get() {
        if (_forwardFast != null) {
            return _forwardFast!!
        }
        _forwardFast = Builder(name = "ForwardFast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                verticalLineToRelative(8.741f)
                lineTo(8.0f, 0.121f)
                verticalLineToRelative(5.593f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(23.606f)
                lineToRelative(8.0f, -5.714f)
                verticalLineToRelative(5.713f)
                lineToRelative(13.0f, -9.28f)
                verticalLineToRelative(9.674f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(19.437f, 11.755f)
                lineToRelative(-8.437f, 6.022f)
                verticalLineToRelative(-5.715f)
                lineToRelative(-8.0f, 5.714f)
                lineTo(3.0f, 5.83f)
                lineToRelative(8.0f, 5.714f)
                verticalLineToRelative(-5.835f)
                lineToRelative(8.436f, 5.594f)
                curveToRelative(0.072f, 0.051f, 0.117f, 0.138f, 0.117f, 0.227f)
                curveToRelative(0.0f, 0.088f, -0.044f, 0.175f, -0.116f, 0.226f)
                close()
            }
        }
        .build()
        return _forwardFast!!
    }

private var _forwardFast: ImageVector? = null
