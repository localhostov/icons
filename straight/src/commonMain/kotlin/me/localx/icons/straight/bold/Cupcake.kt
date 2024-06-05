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

public val Icons.Bold.Cupcake: ImageVector
    get() {
        if (_cupcake != null) {
            return _cupcake!!
        }
        _cupcake = Builder(name = "Cupcake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.591f)
                curveToRelative(0.0f, -5.245f, -4.59f, -9.733f, -10.342f, -10.472f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.315f, 0.0f)
                curveTo(4.64f, 3.864f, 0.091f, 8.35f, 0.091f, 13.591f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, 1.563f, 2.9f)
                lineToRelative(0.821f, 4.618f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.921f, 24.0f)
                lineTo(18.08f, 24.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.445f, -2.887f)
                lineToRelative(0.81f, -4.553f)
                arcTo(3.466f, 3.466f, 0.0f, false, false, 24.0f, 13.591f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(4.794f, 0.0f, 9.0f, 3.547f, 9.0f, 7.561f)
                curveToRelative(-0.021f, 0.439f, -0.191f, 0.439f, -0.409f, 0.439f)
                lineTo(18.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(13.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(3.5f, 14.0f)
                curveToRelative(-0.217f, 0.0f, -0.389f, 0.0f, -0.409f, -0.409f)
                curveTo(3.091f, 9.547f, 7.254f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(18.08f, 21.0f)
                lineTo(5.921f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.492f, -0.412f)
                lineToRelative(-0.574f, -3.223f)
                arcTo(3.972f, 3.972f, 0.0f, false, false, 9.5f, 17.1f)
                arcToRelative(3.961f, 3.961f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(3.972f, 3.972f, 0.0f, false, false, 4.645f, 0.268f)
                lineToRelative(-0.573f, 3.223f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 18.08f, 21.0f)
                close()
            }
        }
        .build()
        return _cupcake!!
    }

private var _cupcake: ImageVector? = null
