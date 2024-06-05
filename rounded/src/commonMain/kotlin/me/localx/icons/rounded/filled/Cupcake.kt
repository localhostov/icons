package me.localx.icons.rounded.filled

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

public val Icons.Filled.Cupcake: ImageVector
    get() {
        if (_cupcake != null) {
            return _cupcake!!
        }
        _cupcake = Builder(name = "Cupcake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 2.0f)
                close()
                moveTo(19.848f, 18.636f)
                arcTo(4.984f, 4.984f, 0.0f, false, true, 16.0f, 18.575f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, true, -3.851f, 0.061f)
                arcToRelative(5.305f, 5.305f, 0.0f, false, true, -1.632f, 0.357f)
                lineToRelative(0.157f, 0.882f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 7.6f, 24.0f)
                lineTo(16.4f, 24.0f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, false, 4.922f, -4.125f)
                lineToRelative(0.157f, -0.882f)
                arcTo(5.274f, 5.274f, 0.0f, false, true, 19.848f, 18.636f)
                close()
                moveTo(23.524f, 11.412f)
                arcTo(11.888f, 11.888f, 0.0f, false, false, 15.2f, 4.383f)
                arcToRelative(4.012f, 4.012f, 0.0f, false, true, -6.393f, 0.0f)
                arcToRelative(11.891f, 11.891f, 0.0f, false, false, -8.33f, 7.03f)
                arcTo(9.12f, 9.12f, 0.0f, false, false, 0.0f, 14.462f)
                arcTo(2.406f, 2.406f, 0.0f, false, false, 2.385f, 17.0f)
                curveToRelative(0.454f, 0.0f, 1.563f, -0.308f, 1.685f, -0.723f)
                arcTo(2.982f, 2.982f, 0.0f, false, false, 8.0f, 16.22f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 3.93f, 0.057f)
                curveToRelative(0.122f, 0.415f, 1.232f, 0.723f, 1.685f, 0.723f)
                arcTo(2.408f, 2.408f, 0.0f, false, false, 24.0f, 14.462f)
                arcTo(9.121f, 9.121f, 0.0f, false, false, 23.524f, 11.412f)
                close()
            }
        }
        .build()
        return _cupcake!!
    }

private var _cupcake: ImageVector? = null
