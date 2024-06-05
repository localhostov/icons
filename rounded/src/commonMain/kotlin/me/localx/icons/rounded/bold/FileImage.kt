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

public val Icons.Bold.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(22.0f, 8.157f)
                verticalLineToRelative(10.343f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(2.0f, 5.5f)
                curveTo(2.0f, 2.467f, 4.467f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(6.343f)
                curveToRelative(1.469f, 0.0f, 2.85f, 0.572f, 3.889f, 1.611f)
                lineToRelative(2.657f, 2.657f)
                curveToRelative(1.039f, 1.039f, 1.611f, 2.419f, 1.611f, 3.889f)
                close()
                moveTo(5.0f, 5.5f)
                verticalLineToRelative(11.379f)
                lineToRelative(3.708f, -3.708f)
                curveToRelative(1.539f, -1.539f, 4.044f, -1.539f, 5.583f, 0.0f)
                lineToRelative(0.615f, 0.615f)
                curveToRelative(0.327f, 0.327f, 0.859f, 0.327f, 1.187f, 0.0f)
                curveToRelative(0.0f, 0.0f, 2.886f, -2.885f, 2.907f, -2.903f)
                verticalLineToRelative(-1.882f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                close()
                moveTo(19.0f, 18.5f)
                verticalLineToRelative(-3.379f)
                lineToRelative(-0.786f, 0.786f)
                curveToRelative(-1.496f, 1.497f, -3.933f, 1.497f, -5.429f, 0.0f)
                lineToRelative(-0.615f, -0.615f)
                curveToRelative(-0.37f, -0.369f, -0.971f, -0.369f, -1.341f, 0.0f)
                lineToRelative(-5.034f, 5.034f)
                curveToRelative(0.447f, 0.418f, 1.046f, 0.674f, 1.705f, 0.674f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
