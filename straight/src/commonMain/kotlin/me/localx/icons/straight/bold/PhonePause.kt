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

public val Icons.Bold.PhonePause: ImageVector
    get() {
        if (_phonePause != null) {
            return _phonePause!!
        }
        _phonePause = Builder(name = "PhonePause", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.942f, 23.942f)
                curveTo(8.791f, 23.942f, 0.0f, 15.152f, 0.0f, 8.0f)
                arcTo(6.055f, 6.055f, 0.0f, false, true, 1.766f, 3.677f)
                lineTo(5.41f, 0.033f)
                lineToRelative(6.642f, 6.641f)
                lineTo(9.089f, 9.637f)
                arcTo(10.69f, 10.69f, 0.0f, false, false, 14.3f, 14.864f)
                lineToRelative(2.974f, -2.973f)
                lineToRelative(6.641f, 6.641f)
                lineToRelative(-3.645f, 3.646f)
                arcTo(6.061f, 6.061f, 0.0f, false, true, 15.942f, 23.942f)
                close()
                moveTo(5.41f, 4.275f)
                lineTo(3.886f, 5.8f)
                arcTo(3.076f, 3.076f, 0.0f, false, false, 3.0f, 8.0f)
                curveToRelative(0.0f, 5.875f, 7.949f, 12.942f, 12.942f, 12.942f)
                arcToRelative(3.079f, 3.079f, 0.0f, false, false, 2.2f, -0.885f)
                lineToRelative(1.525f, -1.525f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(-2.255f, 2.255f)
                lineToRelative(-0.909f, -0.346f)
                arcTo(13.936f, 13.936f, 0.0f, false, true, 5.911f, 9.861f)
                lineToRelative(-0.369f, -0.919f)
                lineTo(7.81f, 6.674f)
                close()
                moveTo(23.0f, 0.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 0.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
