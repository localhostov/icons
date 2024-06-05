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

public val Icons.Bold.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.833f, 1.167f)
                arcToRelative(4.079f, 4.079f, 0.0f, false, false, -5.634f, 0.0f)
                lineToRelative(-9.849f, 9.85f)
                curveToRelative(-0.115f, -0.007f, -0.229f, -0.017f, -0.345f, -0.017f)
                arcToRelative(5.956f, 5.956f, 0.0f, false, false, -4.238f, 1.755f)
                curveToRelative(-2.051f, 2.051f, -2.56f, 8.293f, -2.642f, 9.524f)
                lineToRelative(-0.112f, 1.708f)
                lineToRelative(1.708f, -0.112f)
                curveToRelative(1.23f, -0.082f, 7.472f, -0.59f, 9.523f, -2.641f)
                arcToRelative(5.961f, 5.961f, 0.0f, false, false, 1.722f, -4.566f)
                lineToRelative(9.867f, -9.868f)
                arcToRelative(3.986f, 3.986f, 0.0f, false, false, 0.0f, -5.633f)
                close()
                moveTo(9.123f, 19.112f)
                curveToRelative(-0.678f, 0.678f, -3.276f, 1.288f, -5.836f, 1.6f)
                curveToRelative(0.314f, -2.56f, 0.923f, -5.158f, 1.6f, -5.836f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, true, 4.235f, 4.235f)
                close()
                moveTo(20.712f, 4.679f)
                lineTo(11.869f, 13.522f)
                arcToRelative(5.938f, 5.938f, 0.0f, false, false, -0.625f, -0.767f)
                arcToRelative(6.208f, 6.208f, 0.0f, false, false, -0.756f, -0.634f)
                lineToRelative(8.832f, -8.832f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 1.392f, 0.0f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, true, 0.0f, 1.39f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
