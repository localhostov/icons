package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Spoon: ImageVector
    get() {
        if (_spoon != null) {
            return _spoon!!
        }
        _spoon = Builder(name = "Spoon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.769f, 1.231f)
                curveToRelative(-2.9f, -2.9f, -9.38f, -0.108f, -11.8f, 2.316f)
                arcToRelative(6.715f, 6.715f, 0.0f, false, false, -0.936f, 8.3f)
                lineTo(0.443f, 21.436f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 2.121f)
                lineToRelative(9.586f, -9.586f)
                arcToRelative(6.706f, 6.706f, 0.0f, false, false, 8.3f, -0.937f)
                curveTo(22.877f, 10.61f, 25.665f, 4.128f, 22.769f, 1.231f)
                close()
                moveTo(18.333f, 10.913f)
                arcToRelative(3.709f, 3.709f, 0.0f, false, true, -5.246f, -5.246f)
                arcToRelative(11.117f, 11.117f, 0.0f, false, true, 6.34f, -2.676f)
                arcToRelative(1.717f, 1.717f, 0.0f, false, true, 1.221f, 0.361f)
                curveTo(21.754f, 4.459f, 20.121f, 9.125f, 18.333f, 10.913f)
                close()
            }
        }
        .build()
        return _spoon!!
    }

private var _spoon: ImageVector? = null
