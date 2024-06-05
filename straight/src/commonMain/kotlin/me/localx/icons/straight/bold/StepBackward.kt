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

public val Icons.Bold.StepBackward: ImageVector
    get() {
        if (_stepBackward != null) {
            return _stepBackward!!
        }
        _stepBackward = Builder(name = "StepBackward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.063f)
                lineTo(6.0f, 10.19f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-10.19f)
                lineToRelative(15.0f, 10.127f)
                lineTo(21.0f, 0.063f)
                close()
                moveTo(18.0f, 18.292f)
                lineToRelative(-9.319f, -6.292f)
                lineToRelative(9.319f, -6.292f)
                verticalLineToRelative(12.583f)
                close()
            }
        }
        .build()
        return _stepBackward!!
    }

private var _stepBackward: ImageVector? = null
