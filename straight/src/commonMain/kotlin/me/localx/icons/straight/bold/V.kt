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

public val Icons.Bold.V: ImageVector
    get() {
        if (_v != null) {
            return _v!!
        }
        _v = Builder(name = "V", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.761f, 0.0f)
                lineTo(12.419f, 20.791f)
                curveToRelative(-0.104f, 0.203f, -0.7f, 0.261f, -0.851f, -0.038f)
                lineTo(3.25f, 0.0f)
                horizontalLineTo(0.0f)
                lineTo(8.84f, 21.998f)
                curveToRelative(0.621f, 1.254f, 1.803f, 2.002f, 3.162f, 2.002f)
                curveToRelative(1.335f, 0.0f, 2.535f, -0.742f, 3.146f, -1.968f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-3.239f)
                close()
            }
        }
        .build()
        return _v!!
    }

private var _v: ImageVector? = null
