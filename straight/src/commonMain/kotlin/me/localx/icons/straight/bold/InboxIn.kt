package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.InboxIn: ImageVector
    get() {
        if (_inboxIn != null) {
            return _inboxIn!!
        }
        _inboxIn = Builder(name = "InboxIn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.015f, 10.591f)
                curveToRelative(0.544f, 0.545f, 1.427f, 0.545f, 1.972f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(4.594f, -4.592f)
                horizontalLineToRelative(-4.082f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.418f)
                lineToRelative(4.597f, 4.591f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 11.0f)
                verticalLineToRelative(2.636f)
                curveToRelative(-0.001f, 0.753f, -0.611f, 1.363f, -1.364f, 1.364f)
                horizontalLineToRelative(-4.272f)
                curveToRelative(-0.753f, -0.001f, -1.363f, -0.611f, -1.364f, -1.364f)
                verticalLineToRelative(-2.636f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                lineTo(21.0f, 24.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                lineTo(24.0f, 11.0f)
                lineTo(15.5f, 11.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.515f)
                curveToRelative(0.192f, 2.26f, 2.081f, 3.997f, 4.349f, 4.0f)
                horizontalLineToRelative(4.272f)
                curveToRelative(2.268f, -0.003f, 4.157f, -1.74f, 4.349f, -4.0f)
                horizontalLineToRelative(2.515f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _inboxIn!!
    }

private var _inboxIn: ImageVector? = null
