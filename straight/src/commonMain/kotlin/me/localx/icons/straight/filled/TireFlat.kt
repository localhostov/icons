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

public val Icons.Filled.TireFlat: ImageVector
    get() {
        if (_tireFlat != null) {
            return _tireFlat!!
        }
        _tireFlat = Builder(name = "TireFlat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.142f, 20.358f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.284f, -1.436f)
                curveToRelative(5.317f, -7.268f, 0.108f, -18.347f, -8.92f, -18.886f)
                arcTo(12.05f, 12.05f, 0.0f, false, false, 2.165f, 18.945f)
                curveToRelative(0.718f, 1.079f, -0.785f, 1.439f, -1.038f, 2.331f)
                arcTo(2.009f, 2.009f, 0.0f, false, false, 3.0f, 24.0f)
                lineTo(20.893f, 24.0f)
                arcTo(2.013f, 2.013f, 0.0f, false, false, 22.142f, 20.358f)
                close()
                moveTo(13.0f, 5.08f)
                arcToRelative(7.006f, 7.006f, 0.0f, false, true, 5.029f, 3.381f)
                lineTo(15.19f, 9.646f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 13.0f, 8.163f)
                close()
                moveTo(12.0f, 10.636f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 1.291f, 0.869f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, false, -0.446f, 1.592f)
                arcToRelative(3.81f, 3.81f, 0.0f, false, false, -1.69f, 0.0f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, false, -0.446f, -1.592f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 0.71f, -0.362f)
                arcTo(3.618f, 3.618f, 0.0f, false, false, 12.0f, 10.636f)
                close()
                moveTo(11.0f, 5.08f)
                lineTo(11.0f, 8.163f)
                arcTo(1.6f, 1.6f, 0.0f, false, true, 8.815f, 9.649f)
                lineTo(5.956f, 8.485f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 11.0f, 5.08f)
                close()
                moveTo(7.014f, 16.9f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.807f, -6.565f)
                lineToRelative(2.63f, 1.073f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, true, 0.924f, 3.239f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(6.949f, 6.949f, 0.0f, false, true, -3.395f, -0.883f)
                lineTo(10.4f, 15.8f)
                arcToRelative(2.053f, 2.053f, 0.0f, false, true, 3.208f, 0.011f)
                lineToRelative(1.78f, 2.31f)
                arcTo(6.958f, 6.958f, 0.0f, false, true, 12.0f, 19.0f)
                close()
                moveTo(16.981f, 16.911f)
                lineTo(15.248f, 14.662f)
                arcToRelative(2.127f, 2.127f, 0.0f, false, true, 0.93f, -3.256f)
                lineToRelative(2.608f, -1.091f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.981f, 16.911f)
                close()
            }
        }
        .build()
        return _tireFlat!!
    }

private var _tireFlat: ImageVector? = null
