package me.localx.icons.straight.outline

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

public val Icons.Outline.SnowBlowing: ImageVector
    get() {
        if (_snowBlowing != null) {
            return _snowBlowing!!
        }
        _snowBlowing = Builder(name = "SnowBlowing", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(9.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 20.0f)
                close()
                moveTo(20.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                lineTo(16.0f, 7.0f)
                arcToRelative(9.028f, 9.028f, 0.0f, false, true, -0.223f, 2.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(15.064f, 11.0f)
                arcToRelative(9.057f, 9.057f, 0.0f, false, true, -1.356f, 2.0f)
                lineTo(20.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                lineTo(16.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, -4.0f)
                close()
                moveTo(2.955f, 8.386f)
                lineTo(0.591f, 7.745f)
                lineTo(0.068f, 9.675f)
                lineToRelative(1.8f, 0.488f)
                lineToRelative(-0.488f, 1.8f)
                lineToRelative(1.931f, 0.523f)
                lineToRelative(0.641f, -2.365f)
                lineTo(6.0f, 8.945f)
                verticalLineToRelative(2.364f)
                lineTo(4.268f, 13.041f)
                lineToRelative(1.414f, 1.414f)
                lineTo(7.0f, 13.137f)
                lineToRelative(1.318f, 1.318f)
                lineToRelative(1.414f, -1.414f)
                lineTo(8.0f, 11.309f)
                lineTo(8.0f, 8.945f)
                lineToRelative(2.049f, 1.175f)
                lineToRelative(0.641f, 2.365f)
                lineToRelative(1.931f, -0.523f)
                lineToRelative(-0.488f, -1.8f)
                lineToRelative(1.8f, -0.488f)
                lineToRelative(-0.523f, -1.93f)
                lineToRelative(-2.364f, 0.641f)
                lineTo(9.01f, 7.22f)
                lineToRelative(2.034f, -1.166f)
                lineToRelative(2.365f, 0.641f)
                lineToRelative(0.523f, -1.929f)
                lineToRelative(-1.8f, -0.489f)
                lineToRelative(0.488f, -1.8f)
                lineTo(10.69f, 1.955f)
                lineToRelative(-0.641f, 2.364f)
                lineTo(8.0f, 5.494f)
                lineTo(8.0f, 3.132f)
                lineTo(9.732f, 1.4f)
                lineTo(8.318f, -0.015f)
                lineTo(7.0f, 1.3f)
                lineTo(5.682f, -0.015f)
                lineTo(4.268f, 1.4f)
                lineTo(6.0f, 3.132f)
                lineTo(6.0f, 5.494f)
                lineTo(3.951f, 4.319f)
                lineTo(3.31f, 1.955f)
                lineToRelative(-1.931f, 0.524f)
                lineToRelative(0.488f, 1.8f)
                lineToRelative(-1.8f, 0.489f)
                lineTo(0.591f, 6.7f)
                lineToRelative(2.365f, -0.641f)
                lineTo(4.99f, 7.22f)
                close()
            }
        }
        .build()
        return _snowBlowing!!
    }

private var _snowBlowing: ImageVector? = null
