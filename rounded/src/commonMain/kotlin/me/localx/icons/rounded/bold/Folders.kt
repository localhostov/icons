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

public val Icons.Bold.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 21.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 23.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.0f, 8.5f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 7.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                lineTo(9.5f, 18.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(2.056f)
                curveToRelative(0.54f, 0.0f, 1.081f, 0.128f, 1.564f, 0.369f)
                lineToRelative(3.156f, 1.578f)
                curveToRelative(0.068f, 0.034f, 0.146f, 0.053f, 0.224f, 0.053f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(21.0f, 13.5f)
                verticalLineToRelative(-5.5f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null
