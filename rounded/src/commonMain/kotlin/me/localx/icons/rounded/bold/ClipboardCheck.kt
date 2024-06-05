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

public val Icons.Bold.ClipboardCheck: ImageVector
    get() {
        if (_clipboardCheck != null) {
            return _clipboardCheck!!
        }
        _clipboardCheck = Builder(name = "ClipboardCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.061f, 11.433f)
                lineToRelative(-3.562f, 3.562f)
                curveToRelative(-0.67f, 0.67f, -1.547f, 1.008f, -2.426f, 1.008f)
                curveToRelative(-0.829f, 0.0f, -1.659f, -0.3f, -2.318f, -0.904f)
                lineToRelative(-1.768f, -1.621f)
                curveToRelative(-0.61f, -0.56f, -0.652f, -1.509f, -0.092f, -2.12f)
                curveToRelative(0.56f, -0.61f, 1.509f, -0.652f, 2.12f, -0.092f)
                lineToRelative(1.768f, 1.621f)
                curveToRelative(0.17f, 0.157f, 0.431f, 0.15f, 0.595f, -0.013f)
                lineToRelative(3.562f, -3.562f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.663f, 2.002f)
                curveToRelative(-0.562f, -1.183f, -1.769f, -2.002f, -3.163f, -2.002f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.395f, 0.0f, -2.601f, 0.819f, -3.163f, 2.002f)
                curveToRelative(-2.958f, 0.086f, -5.337f, 2.52f, -5.337f, 5.498f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(22.0f, 7.5f)
                curveToRelative(0.0f, -2.978f, -2.379f, -5.411f, -5.337f, -5.498f)
                close()
                moveTo(19.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(5.0f, 7.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _clipboardCheck!!
    }

private var _clipboardCheck: ImageVector? = null
