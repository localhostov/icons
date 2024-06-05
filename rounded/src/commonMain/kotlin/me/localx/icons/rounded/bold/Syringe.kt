package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 4.439f)
                lineToRelative(-4.0f, -4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 2.122f)
                lineToRelative(0.94f, 0.939f)
                lineToRelative(-1.339f, 1.339f)
                arcToRelative(5.457f, 5.457f, 0.0f, false, false, -6.778f, 0.771f)
                lineToRelative(-5.082f, 5.073f)
                arcToRelative(7.452f, 7.452f, 0.0f, false, false, -2.195f, 5.3f)
                verticalLineToRelative(2.9f)
                lineToRelative(-2.548f, 2.559f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.126f, 2.116f)
                lineToRelative(2.546f, -2.558f)
                horizontalLineToRelative(2.891f)
                arcToRelative(7.438f, 7.438f, 0.0f, false, false, 5.3f, -2.2f)
                lineToRelative(5.082f, -5.073f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.781f, -6.767f)
                lineToRelative(1.337f, -1.339f)
                lineToRelative(0.939f, 0.94f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                close()
                moveTo(16.255f, 11.61f)
                lineTo(11.173f, 16.683f)
                arcToRelative(4.464f, 4.464f, 0.0f, false, true, -3.173f, 1.317f)
                horizontalLineToRelative(-2.015f)
                verticalLineToRelative(-2.015f)
                arcToRelative(4.515f, 4.515f, 0.0f, false, true, 0.3f, -1.582f)
                lineToRelative(1.157f, 1.158f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                lineToRelative(-1.45f, -1.447f)
                lineToRelative(1.88f, -1.877f)
                lineToRelative(1.445f, 1.446f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.122f)
                lineToRelative(-1.444f, -1.439f)
                lineToRelative(0.265f, -0.265f)
                arcToRelative(2.555f, 2.555f, 0.0f, false, true, 3.529f, 0.0f)
                lineToRelative(0.343f, 0.344f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.001f, 3.531f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
