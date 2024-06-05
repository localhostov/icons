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

public val Icons.Bold.PingPong: ImageVector
    get() {
        if (_pingPong != null) {
            return _pingPong!!
        }
        _pingPong = Builder(name = "PingPong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.226f, 2.774f)
                arcTo(9.887f, 9.887f, 0.0f, false, false, 8.73f, 1.7f)
                arcToRelative(4.989f, 4.989f, 0.0f, true, false, -4.7f, 8.2f)
                arcTo(11.369f, 11.369f, 0.0f, false, false, 5.081f, 15.0f)
                arcTo(0.483f, 0.483f, 0.0f, false, true, 5.0f, 15.578f)
                lineTo(1.282f, 18.153f)
                arcTo(3.363f, 3.363f, 0.0f, false, false, 0.0f, 20.566f)
                arcToRelative(2.824f, 2.824f, 0.0f, false, false, 0.853f, 2.151f)
                lineToRelative(0.445f, 0.422f)
                arcTo(2.948f, 2.948f, 0.0f, false, false, 3.381f, 24.0f)
                arcToRelative(3.261f, 3.261f, 0.0f, false, false, 2.275f, -1.08f)
                lineTo(8.4f, 19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.6f, -0.119f)
                arcTo(10.371f, 10.371f, 0.0f, false, false, 13.5f, 20.0f)
                curveToRelative(0.5f, 0.0f, 1.81f, -0.182f, 1.841f, -0.187f)
                arcToRelative(9.963f, 9.963f, 0.0f, false, false, 5.516f, -2.774f)
                arcTo(10.565f, 10.565f, 0.0f, false, false, 24.0f, 9.876f)
                arcTo(9.518f, 9.518f, 0.0f, false, false, 21.226f, 2.774f)
                close()
                moveTo(5.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 7.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 7.0f)
                close()
                moveTo(18.736f, 14.918f)
                arcToRelative(6.92f, 6.92f, 0.0f, false, true, -3.4f, 1.845f)
                lineTo(7.746f, 9.171f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 10.0f, 5.0f)
                curveToRelative(0.0f, -0.164f, -0.033f, -0.319f, -0.048f, -0.479f)
                arcTo(7.048f, 7.048f, 0.0f, false, true, 19.1f, 4.9f)
                arcTo(6.543f, 6.543f, 0.0f, false, true, 21.0f, 9.785f)
                arcTo(7.587f, 7.587f, 0.0f, false, true, 18.736f, 14.918f)
                close()
            }
        }
        .build()
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
