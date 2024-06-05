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

public val Icons.Bold.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(8.938f, 8.938f, 0.0f, false, true, 1.688f, -5.227f)
                arcToRelative(7.085f, 7.085f, 0.0f, false, true, 1.284f, 1.573f)
                lineToRelative(-1.03f, 0.307f)
                lineToRelative(0.858f, 2.875f)
                lineToRelative(1.15f, -0.342f)
                arcToRelative(7.087f, 7.087f, 0.0f, false, true, 0.05f, 0.814f)
                arcToRelative(7.087f, 7.087f, 0.0f, false, true, -0.05f, 0.814f)
                lineToRelative(-1.15f, -0.342f)
                lineToRelative(-0.858f, 2.875f)
                lineToRelative(1.03f, 0.307f)
                arcToRelative(7.085f, 7.085f, 0.0f, false, true, -1.284f, 1.573f)
                arcToRelative(8.938f, 8.938f, 0.0f, false, true, -1.688f, -5.227f)
                close()
                moveTo(6.81f, 19.34f)
                arcToRelative(10.066f, 10.066f, 0.0f, false, false, 2.1f, -2.809f)
                lineToRelative(1.517f, 0.452f)
                lineToRelative(0.857f, -2.875f)
                lineToRelative(-1.445f, -0.431f)
                arcToRelative(10.039f, 10.039f, 0.0f, false, false, 0.161f, -1.677f)
                arcToRelative(10.039f, 10.039f, 0.0f, false, false, -0.157f, -1.677f)
                lineToRelative(1.445f, -0.431f)
                lineToRelative(-0.857f, -2.875f)
                lineToRelative(-1.517f, 0.452f)
                arcToRelative(10.066f, 10.066f, 0.0f, false, false, -2.104f, -2.809f)
                arcToRelative(8.943f, 8.943f, 0.0f, false, true, 10.38f, 0.0f)
                arcToRelative(10.066f, 10.066f, 0.0f, false, false, -2.1f, 2.809f)
                lineToRelative(-1.517f, -0.452f)
                lineToRelative(-0.857f, 2.875f)
                lineToRelative(1.445f, 0.431f)
                arcToRelative(10.039f, 10.039f, 0.0f, false, false, -0.161f, 1.677f)
                arcToRelative(10.039f, 10.039f, 0.0f, false, false, 0.157f, 1.677f)
                lineToRelative(-1.445f, 0.431f)
                lineToRelative(0.857f, 2.875f)
                lineToRelative(1.517f, -0.452f)
                arcToRelative(10.066f, 10.066f, 0.0f, false, false, 2.1f, 2.809f)
                arcToRelative(8.943f, 8.943f, 0.0f, false, true, -10.38f, 0.0f)
                close()
                moveTo(19.31f, 17.227f)
                arcToRelative(7.085f, 7.085f, 0.0f, false, true, -1.284f, -1.573f)
                lineToRelative(1.03f, -0.307f)
                lineToRelative(-0.856f, -2.875f)
                lineToRelative(-1.15f, 0.342f)
                arcToRelative(6.651f, 6.651f, 0.0f, false, true, 0.0f, -1.628f)
                lineToRelative(1.15f, 0.342f)
                lineToRelative(0.858f, -2.875f)
                lineToRelative(-1.03f, -0.307f)
                arcToRelative(7.085f, 7.085f, 0.0f, false, true, 1.284f, -1.573f)
                arcToRelative(8.937f, 8.937f, 0.0f, false, true, 0.0f, 10.454f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
