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

public val Icons.Filled.StepForward: ImageVector
    get() {
        if (_stepForward != null) {
            return _stepForward!!
        }
        _stepForward = Builder(name = "StepForward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                verticalLineToRelative(10.793f)
                lineTo(3.0f, -0.009f)
                verticalLineToRelative(24.018f)
                lineToRelative(16.0f, -10.802f)
                verticalLineToRelative(10.793f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _stepForward!!
    }

private var _stepForward: ImageVector? = null
