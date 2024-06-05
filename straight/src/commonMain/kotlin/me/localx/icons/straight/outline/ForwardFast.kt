package me.localx.icons.straight.outline

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

public val Icons.Outline.ForwardFast: ImageVector
    get() {
        if (_forwardFast != null) {
            return _forwardFast!!
        }
        _forwardFast = Builder(name = "ForwardFast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 0.0f)
                verticalLineToRelative(9.047f)
                lineTo(9.001f, 0.098f)
                verticalLineToRelative(6.388f)
                lineTo(0.0f, 0.057f)
                verticalLineToRelative(23.888f)
                lineToRelative(9.001f, -6.429f)
                verticalLineToRelative(6.388f)
                lineToRelative(12.999f, -8.95f)
                verticalLineToRelative(9.047f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(21.596f, 12.804f)
                lineToRelative(-10.594f, 7.295f)
                verticalLineToRelative(-6.47f)
                lineToRelative(-9.001f, 6.429f)
                lineTo(2.001f, 3.943f)
                lineToRelative(9.001f, 6.429f)
                lineTo(11.002f, 3.902f)
                lineToRelative(10.581f, 7.284f)
                curveToRelative(0.262f, 0.187f, 0.418f, 0.49f, 0.418f, 0.813f)
                reflectiveCurveToRelative(-0.156f, 0.626f, -0.404f, 0.804f)
                close()
            }
        }
        .build()
        return _forwardFast!!
    }

private var _forwardFast: ImageVector? = null
