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

public val Icons.Bold.ClipboardCheck: ImageVector
    get() {
        if (_clipboardCheck != null) {
            return _clipboardCheck!!
        }
        _clipboardCheck = Builder(name = "ClipboardCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.497f, 12.802f)
                lineToRelative(4.453f, -4.373f)
                lineToRelative(2.102f, 2.141f)
                lineToRelative(-4.793f, 4.707f)
                curveToRelative(-0.481f, 0.481f, -1.117f, 0.723f, -1.754f, 0.723f)
                curveToRelative(-0.641f, 0.0f, -1.283f, -0.244f, -1.771f, -0.732f)
                lineToRelative(-2.272f, -2.187f)
                lineToRelative(2.08f, -2.161f)
                lineToRelative(1.957f, 1.883f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(18.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(5.338f)
                curveToRelative(0.563f, -1.182f, 1.769f, -2.0f, 3.162f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.394f, 0.0f, 2.6f, 0.818f, 3.162f, 2.0f)
                horizontalLineToRelative(5.338f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                lineTo(19.0f, 5.0f)
                close()
            }
        }
        .build()
        return _clipboardCheck!!
    }

private var _clipboardCheck: ImageVector? = null
