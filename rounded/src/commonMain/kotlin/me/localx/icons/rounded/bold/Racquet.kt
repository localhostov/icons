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

public val Icons.Bold.Racquet: ImageVector
    get() {
        if (_racquet != null) {
            return _racquet!!
        }
        _racquet = Builder(name = "Racquet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.777f, 2.225f)
                arcToRelative(7.938f, 7.938f, 0.0f, false, false, -6.6f, -2.171f)
                arcTo(11.365f, 11.365f, 0.0f, false, false, 8.4f, 3.406f)
                arcToRelative(11.128f, 11.128f, 0.0f, false, false, -3.391f, 7.9f)
                curveTo(5.005f, 11.371f, 5.0f, 14.5f, 5.0f, 14.5f)
                curveToRelative(0.0f, 1.22f, 0.0f, 2.372f, -0.555f, 2.934f)
                lineToRelative(-0.006f, 0.005f)
                lineToRelative(-0.009f, 0.01f)
                lineTo(0.439f, 21.441f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.121f)
                lineToRelative(3.99f, -3.991f)
                lineToRelative(0.01f, -0.009f)
                curveToRelative(0.611f, -0.611f, 2.232f, -0.58f, 3.412f, -0.561f)
                curveToRelative(1.422f, 0.027f, 2.562f, 0.0f, 2.561f, 0.0f)
                lineToRelative(0.036f, 0.0f)
                curveToRelative(0.082f, 0.0f, 0.912f, -0.014f, 1.251f, -0.049f)
                arcTo(11.376f, 11.376f, 0.0f, false, false, 20.6f, 15.6f)
                curveTo(24.608f, 11.585f, 25.138f, 5.586f, 21.777f, 2.225f)
                close()
                moveTo(15.492f, 3.038f)
                arcTo(6.27f, 6.27f, 0.0f, false, true, 16.17f, 3.0f)
                arcToRelative(5.253f, 5.253f, 0.0f, false, true, 2.237f, 0.473f)
                lineTo(14.541f, 7.34f)
                lineTo(11.718f, 4.517f)
                arcTo(7.979f, 7.979f, 0.0f, false, true, 15.492f, 3.038f)
                close()
                moveTo(9.584f, 6.625f)
                lineTo(12.42f, 9.461f)
                lineTo(8.471f, 13.41f)
                arcTo(6.857f, 6.857f, 0.0f, false, true, 9.584f, 6.625f)
                close()
                moveTo(13.508f, 15.966f)
                arcToRelative(5.473f, 5.473f, 0.0f, false, true, -2.915f, -0.436f)
                lineToRelative(3.948f, -3.948f)
                lineToRelative(2.836f, 2.836f)
                arcTo(8.024f, 8.024f, 0.0f, false, true, 13.508f, 15.966f)
                close()
                moveTo(19.484f, 12.284f)
                lineTo(16.662f, 9.461f)
                lineTo(20.53f, 5.593f)
                arcTo(6.825f, 6.825f, 0.0f, false, true, 19.484f, 12.284f)
                close()
            }
        }
        .build()
        return _racquet!!
    }

private var _racquet: ImageVector? = null
