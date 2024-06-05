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

public val Icons.Filled.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.251f)
                verticalLineTo(24.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.255f)
                arcToRelative(11.951f, 11.951f, 0.0f, false, false, -4.06f, -0.755f)
                arcTo(10.941f, 10.941f, 0.0f, false, false, 8.0f, 19.244f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(20.25f)
                arcToRelative(5.327f, 5.327f, 0.0f, false, true, 1.593f, -3.788f)
                curveTo(3.741f, 14.314f, 7.63f, 13.021f, 12.0f, 13.0f)
                curveToRelative(4.364f, 0.013f, 8.192f, 1.241f, 10.412f, 3.462f)
                arcTo(5.328f, 5.328f, 0.0f, false, true, 24.0f, 20.251f)
                close()
                moveTo(5.0f, 4.389f)
                lineToRelative(5.928f, 5.949f)
                arcToRelative(2.206f, 2.206f, 0.0f, false, false, 1.572f, 0.653f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 1.57f, -0.65f)
                lineToRelative(6.884f, -6.884f)
                lineTo(19.543f, 2.043f)
                lineTo(12.659f, 8.927f)
                arcToRelative(0.218f, 0.218f, 0.0f, false, true, -0.156f, 0.064f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, true, -0.157f, -0.065f)
                lineTo(6.439f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.5f)
                arcTo(2.488f, 2.488f, 0.0f, false, false, 3.0f, 3.471f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
