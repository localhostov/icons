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

public val Icons.Filled.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.726f, 9.0f)
                lineToRelative(-3.726f, 15.0f)
                lineToRelative(-3.726f, -15.0f)
                close()
                moveTo(10.973f, 0.0f)
                lineTo(8.428f, 7.0f)
                horizontalLineToRelative(7.144f)
                lineToRelative(-2.545f, -7.0f)
                close()
                moveTo(17.7f, 7.0f)
                horizontalLineToRelative(6.141f)
                arcToRelative(2.974f, 2.974f, 0.0f, false, false, -0.4f, -0.8f)
                lineToRelative(-3.531f, -4.943f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.441f, -1.257f)
                horizontalLineToRelative(-2.314f)
                close()
                moveTo(17.785f, 9.0f)
                lineTo(15.02f, 20.3f)
                lineTo(23.359f, 9.8f)
                arcToRelative(2.962f, 2.962f, 0.0f, false, false, 0.441f, -0.8f)
                close()
                moveTo(6.215f, 9.0f)
                horizontalLineToRelative(-6.015f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, 0.445f, 0.8f)
                lineToRelative(8.335f, 10.5f)
                close()
                moveTo(6.3f, 7.0f)
                lineTo(8.845f, 0.0f)
                horizontalLineToRelative(-2.314f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.441f, 1.257f)
                lineToRelative(-3.531f, 4.943f)
                arcToRelative(2.946f, 2.946f, 0.0f, false, false, -0.4f, 0.8f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
