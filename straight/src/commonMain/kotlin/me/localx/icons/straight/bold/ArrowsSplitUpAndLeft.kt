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

public val Icons.Bold.ArrowsSplitUpAndLeft: ImageVector
    get() {
        if (_arrowsSplitUpAndLeft != null) {
            return _arrowsSplitUpAndLeft!!
        }
        _arrowsSplitUpAndLeft = Builder(name = "ArrowsSplitUpAndLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(15.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineTo(4.648f)
                lineToRelative(2.917f, 2.944f)
                lineToRelative(-2.131f, 2.111f)
                lineTo(0.757f, 15.335f)
                curveToRelative(-1.01f, -1.01f, -1.01f, -2.66f, 0.005f, -3.675f)
                lineTo(5.435f, 6.944f)
                lineToRelative(2.131f, 2.111f)
                lineToRelative(-2.917f, 2.944f)
                horizontalLineToRelative(7.352f)
                verticalLineTo(4.648f)
                lineToRelative(-2.944f, 2.917f)
                lineToRelative(-2.111f, -2.131f)
                lineTo(11.665f, 0.757f)
                curveToRelative(1.009f, -1.01f, 2.661f, -1.009f, 3.675f, 0.005f)
                lineToRelative(4.716f, 4.672f)
                lineToRelative(-2.111f, 2.131f)
                lineToRelative(-2.944f, -2.917f)
                verticalLineToRelative(15.852f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(8.5f)
                close()
            }
        }
        .build()
        return _arrowsSplitUpAndLeft!!
    }

private var _arrowsSplitUpAndLeft: ImageVector? = null
