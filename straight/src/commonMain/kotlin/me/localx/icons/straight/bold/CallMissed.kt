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

public val Icons.Bold.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.319f, 15.465f)
                curveToRelative(-4.629f, -4.629f, -16.009f, -4.629f, -20.638f, 0.0f)
                arcToRelative(5.629f, 5.629f, 0.0f, false, false, -1.681f, 4.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.536f)
                arcTo(8.565f, 8.565f, 0.0f, false, true, 11.992f, 20.0f)
                arcTo(8.888f, 8.888f, 0.0f, false, true, 15.0f, 20.551f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(19.467f)
                arcTo(5.63f, 5.63f, 0.0f, false, false, 22.319f, 15.465f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.538f)
                lineToRelative(-0.911f, -0.39f)
                arcTo(12.668f, 12.668f, 0.0f, false, false, 12.007f, 17.0f)
                arcToRelative(12.161f, 12.161f, 0.0f, false, false, -5.12f, 1.159f)
                lineToRelative(-0.887f, 0.4f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.465f)
                arcToRelative(2.648f, 2.648f, 0.0f, false, true, 0.8f, -1.879f)
                curveToRelative(3.163f, -3.163f, 12.674f, -3.722f, 16.4f, 0.0f)
                arcToRelative(2.649f, 2.649f, 0.0f, false, true, 0.8f, 1.88f)
                close()
                moveTo(5.5f, 4.5f)
                lineTo(3.0f, 7.0f)
                verticalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                lineTo(7.627f, 2.373f)
                lineTo(12.5f, 6.892f)
                lineTo(19.189f, 0.2f)
                lineToRelative(2.122f, 2.121f)
                lineTo(14.427f, 9.2f)
                arcTo(2.7f, 2.7f, 0.0f, false, true, 12.5f, 10.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -1.927f, -0.8f)
                close()
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
