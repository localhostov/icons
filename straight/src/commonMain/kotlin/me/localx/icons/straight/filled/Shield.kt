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

public val Icons.Filled.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.944f, 2.642f)
                lineTo(12.0f, 0.009f)
                lineTo(4.056f, 2.643f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 5.49f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 7.524f, 9.2f, 11.679f, 9.594f, 11.852f)
                lineToRelative(0.354f, 0.157f)
                lineToRelative(0.368f, -0.122f)
                curveTo(12.711f, 23.755f, 22.0f, 20.577f, 22.0f, 12.0f)
                verticalLineTo(5.49f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.944f, 2.642f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
