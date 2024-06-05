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

public val Icons.Filled.Spoon: ImageVector
    get() {
        if (_spoon != null) {
            return _spoon!!
        }
        _spoon = Builder(name = "Spoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.919f, 1.081f)
                curveToRelative(-2.58f, -2.58f, -8.744f, -0.04f, -11.1f, 2.316f)
                arcToRelative(6.206f, 6.206f, 0.0f, false, false, -0.635f, 8.0f)
                lineTo(0.043f, 22.543f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.6f, 12.816f)
                arcToRelative(6.174f, 6.174f, 0.0f, false, false, 8.005f, -0.635f)
                curveTo(22.959f, 9.824f, 25.5f, 3.661f, 22.919f, 1.081f)
                close()
            }
        }
        .build()
        return _spoon!!
    }

private var _spoon: ImageVector? = null
