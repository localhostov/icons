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

public val Icons.Bold.Camcorder: ImageVector
    get() {
        if (_camcorder != null) {
            return _camcorder!!
        }
        _camcorder = Builder(name = "Camcorder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.25f)
                lineToRelative(-3.0f, -2.25f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 9.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(11.564f, 6.0f)
                lineToRelative(-2.727f, -3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 0.0f)
                lineTo(10.163f, 0.0f)
                lineToRelative(5.447f, 5.991f)
                lineToRelative(-0.01f, 0.009f)
                horizontalLineToRelative(1.899f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(3.0f, -2.25f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(18.0f, 9.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 9.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(15.0f)
                lineTo(18.0f, 9.5f)
                close()
                moveTo(16.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 11.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _camcorder!!
    }

private var _camcorder: ImageVector? = null
