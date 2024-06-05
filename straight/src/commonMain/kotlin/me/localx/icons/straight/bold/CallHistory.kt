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

public val Icons.Bold.CallHistory: ImageVector
    get() {
        if (_callHistory != null) {
            return _callHistory!!
        }
        _callHistory = Builder(name = "CallHistory", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.942f, 24.0f)
                curveTo(8.791f, 24.0f, 0.0f, 15.209f, 0.0f, 8.058f)
                arcTo(6.055f, 6.055f, 0.0f, false, true, 1.766f, 3.734f)
                lineTo(5.41f, 0.09f)
                lineToRelative(6.642f, 6.641f)
                lineTo(9.089f, 9.7f)
                arcTo(10.69f, 10.69f, 0.0f, false, false, 14.3f, 14.922f)
                lineToRelative(2.974f, -2.973f)
                lineTo(23.91f, 18.59f)
                lineToRelative(-3.645f, 3.645f)
                arcTo(6.055f, 6.055f, 0.0f, false, true, 15.942f, 24.0f)
                close()
                moveTo(5.41f, 4.333f)
                lineTo(3.886f, 5.856f)
                arcTo(3.077f, 3.077f, 0.0f, false, false, 3.0f, 8.058f)
                curveTo(3.0f, 13.933f, 10.949f, 21.0f, 15.942f, 21.0f)
                arcToRelative(3.079f, 3.079f, 0.0f, false, false, 2.2f, -0.885f)
                lineToRelative(1.525f, -1.525f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(-2.255f, 2.255f)
                lineToRelative(-0.909f, -0.347f)
                arcTo(13.936f, 13.936f, 0.0f, false, true, 5.911f, 9.918f)
                lineTo(5.542f, 9.0f)
                lineTo(7.81f, 6.731f)
                close()
                moveTo(12.234f, 4.085f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, true, 7.681f, 7.681f)
                lineToRelative(2.139f, 2.14f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -11.96f, -11.96f)
                close()
                moveTo(16.439f, 11.439f)
                lineTo(14.0f, 9.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(17.0f, 7.758f)
                lineToRelative(1.561f, 1.56f)
                close()
            }
        }
        .build()
        return _callHistory!!
    }

private var _callHistory: ImageVector? = null
