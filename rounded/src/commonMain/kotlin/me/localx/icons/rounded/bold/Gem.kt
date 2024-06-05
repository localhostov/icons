package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.762f, 8.375f)
                horizontalLineToRelative(0.0f)
                lineTo(0.98f, 9.382f)
                arcToRelative(4.653f, 4.653f, 0.0f, false, false, 0.581f, 6.332f)
                lineTo(9.2f, 22.955f)
                arcToRelative(4.214f, 4.214f, 0.0f, false, false, 2.779f, 1.038f)
                arcToRelative(4.327f, 4.327f, 0.0f, false, false, 2.859f, -1.081f)
                lineToRelative(7.56f, -7.143f)
                arcToRelative(4.63f, 4.63f, 0.0f, false, false, 0.671f, -6.3f)
                lineToRelative(-0.752f, -1.007f)
                arcTo(6.191f, 6.191f, 0.0f, false, false, 17.376f, 6.0f)
                lineTo(6.639f, 6.0f)
                arcTo(6.208f, 6.208f, 0.0f, false, false, 1.762f, 8.375f)
                close()
                moveTo(3.352f, 11.221f)
                lineTo(4.131f, 10.215f)
                arcTo(3.19f, 3.19f, 0.0f, false, true, 6.639f, 9.0f)
                lineTo(9.064f, 9.0f)
                lineToRelative(-0.573f, 1.406f)
                arcTo(5.17f, 5.17f, 0.0f, false, false, 8.124f, 12.5f)
                horizontalLineToRelative(7.717f)
                arcToRelative(5.152f, 5.152f, 0.0f, false, false, -0.357f, -2.214f)
                lineTo(14.961f, 9.0f)
                horizontalLineToRelative(2.415f)
                arcToRelative(3.179f, 3.179f, 0.0f, false, true, 2.541f, 1.261f)
                lineToRelative(0.752f, 1.007f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, true, 0.3f, 1.232f)
                lineTo(15.841f, 12.5f)
                arcToRelative(5.163f, 5.163f, 0.0f, false, true, -0.319f, 1.6f)
                lineToRelative(-2.969f, 6.75f)
                arcToRelative(1.229f, 1.229f, 0.0f, false, true, -1.117f, 0.0f)
                lineTo(8.454f, 14.224f)
                arcToRelative(5.179f, 5.179f, 0.0f, false, true, -0.33f, -1.724f)
                horizontalLineToRelative(-5.1f)
                arcTo(1.638f, 1.638f, 0.0f, false, true, 3.352f, 11.221f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.439f, 0.439f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(1.0f, -1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.439f, 0.439f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.561f, 1.439f)
                lineToRelative(-1.0f, -1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.439f, 2.561f)
                lineToRelative(1.0f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 1.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
