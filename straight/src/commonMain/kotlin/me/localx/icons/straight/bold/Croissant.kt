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

public val Icons.Bold.Croissant: ImageVector
    get() {
        if (_croissant != null) {
            return _croissant!!
        }
        _croissant = Builder(name = "Croissant", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.258f, 4.947f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -9.317f, -3.91f)
                arcTo(3.234f, 3.234f, 0.0f, false, false, 13.3f, 0.5f)
                arcTo(3.336f, 3.336f, 0.0f, false, false, 10.537f, 0.155f)
                arcTo(15.717f, 15.717f, 0.0f, false, false, 1.153f, 8.109f)
                arcTo(15.954f, 15.954f, 0.0f, false, false, 0.147f, 10.6f)
                arcTo(3.325f, 3.325f, 0.0f, false, false, 0.5f, 13.337f)
                arcToRelative(3.293f, 3.293f, 0.0f, false, false, 0.552f, 0.651f)
                arcToRelative(11.005f, 11.005f, 0.0f, false, false, 3.907f, 9.268f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 2.7f, 0.678f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 2.3f, -1.743f)
                lineToRelative(2.949f, -5.761f)
                lineToRelative(0.471f, 0.073f)
                lineTo(16.51f, 13.36f)
                lineToRelative(-0.074f, -0.459f)
                lineToRelative(5.757f, -2.952f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.74f, -2.3f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 23.258f, 4.947f)
                close()
                moveTo(3.015f, 11.483f)
                arcToRelative(12.83f, 12.83f, 0.0f, false, true, 8.421f, -8.466f)
                arcToRelative(0.344f, 0.344f, 0.0f, false, true, 0.281f, 0.032f)
                arcToRelative(0.273f, 0.273f, 0.0f, false, true, 0.132f, 0.2f)
                lineToRelative(1.457f, 9.08f)
                lineToRelative(-0.971f, 0.976f)
                lineToRelative(-9.083f, -1.42f)
                arcToRelative(0.287f, 0.287f, 0.0f, false, true, -0.2f, -0.135f)
                arcTo(0.31f, 0.31f, 0.0f, false, true, 3.015f, 11.483f)
                close()
                moveTo(7.293f, 20.825f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, true, -0.406f, 0.131f)
                arcTo(7.941f, 7.941f, 0.0f, false, true, 4.04f, 15.043f)
                lineToRelative(5.751f, 0.9f)
                close()
                moveTo(20.825f, 7.279f)
                lineTo(15.936f, 9.785f)
                lineToRelative(-0.925f, -5.768f)
                arcToRelative(7.933f, 7.933f, 0.0f, false, true, 5.944f, 2.852f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.038f, 0.185f)
                arcTo(0.322f, 0.322f, 0.0f, false, true, 20.825f, 7.279f)
                close()
            }
        }
        .build()
        return _croissant!!
    }

private var _croissant: ImageVector? = null
