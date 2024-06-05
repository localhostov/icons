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

public val Icons.Bold.TurnLeftDown: ImageVector
    get() {
        if (_turnLeftDown != null) {
            return _turnLeftDown!!
        }
        _turnLeftDown = Builder(name = "TurnLeftDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 3.5f)
                verticalLineToRelative(15.847f)
                lineToRelative(4.443f, -4.412f)
                lineToRelative(2.114f, 2.129f)
                lineToRelative(-6.221f, 6.177f)
                curveToRelative(-0.487f, 0.487f, -1.141f, 0.759f, -1.836f, 0.759f)
                reflectiveCurveToRelative(-1.349f, -0.271f, -1.84f, -0.763f)
                lineToRelative(-6.217f, -6.173f)
                lineToRelative(2.114f, -2.129f)
                lineToRelative(4.443f, 4.412f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _turnLeftDown!!
    }

private var _turnLeftDown: ImageVector? = null
