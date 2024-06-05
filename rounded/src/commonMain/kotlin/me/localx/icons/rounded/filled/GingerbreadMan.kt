package me.localx.icons.rounded.filled

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

public val Icons.Filled.GingerbreadMan: ImageVector
    get() {
        if (_gingerbreadMan != null) {
            return _gingerbreadMan!!
        }
        _gingerbreadMan = Builder(name = "GingerbreadMan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 7.277f)
                arcToRelative(2.578f, 2.578f, 0.0f, false, false, -3.112f, -1.129f)
                lineToRelative(-2.846f, 0.886f)
                arcToRelative(0.443f, 0.443f, 0.0f, false, true, -0.485f, -0.689f)
                arcToRelative(4.006f, 4.006f, 0.0f, true, false, -6.5f, 0.0f)
                arcToRelative(0.443f, 0.443f, 0.0f, false, true, -0.485f, 0.689f)
                lineTo(5.417f, 6.148f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -1.734f, 4.691f)
                lineToRelative(1.6f, 0.661f)
                curveToRelative(2.106f, 0.745f, 2.021f, 3.561f, 1.023f, 5.175f)
                lineTo(4.427f, 20.061f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.147f, 2.794f)
                lineTo(11.43f, 18.3f)
                arcToRelative(0.688f, 0.688f, 0.0f, false, true, 1.14f, 0.0f)
                lineToRelative(2.856f, 4.552f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.147f, -2.794f)
                lineTo(17.7f, 16.675f)
                curveToRelative(-1.0f, -1.613f, -1.083f, -4.43f, 1.023f, -5.175f)
                lineToRelative(1.6f, -0.661f)
                arcTo(2.516f, 2.516f, 0.0f, false, false, 21.7f, 7.277f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _gingerbreadMan!!
    }

private var _gingerbreadMan: ImageVector? = null
