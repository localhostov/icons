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

public val Icons.Bold.BoxCheck: ImageVector
    get() {
        if (_boxCheck != null) {
            return _boxCheck!!
        }
        _boxCheck = Builder(name = "BoxCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.456f, 15.577f)
                lineToRelative(2.088f, -2.154f)
                lineToRelative(2.454f, 2.378f)
                lineToRelative(4.452f, -4.371f)
                lineToRelative(2.102f, 2.141f)
                lineToRelative(-4.793f, 4.707f)
                curveToRelative(-0.481f, 0.481f, -1.117f, 0.723f, -1.754f, 0.723f)
                curveToRelative(-0.641f, 0.0f, -1.283f, -0.244f, -1.771f, -0.732f)
                lineToRelative(-2.776f, -2.69f)
                close()
                moveTo(24.0f, 10.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(14.0f)
                lineTo(1.0f, 24.0f)
                lineTo(1.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(3.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(20.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(11.0f)
                lineTo(20.0f, 21.0f)
                lineTo(20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _boxCheck!!
    }

private var _boxCheck: ImageVector? = null
