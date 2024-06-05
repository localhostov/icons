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

public val Icons.Bold.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 15.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(22.0f, 8.157f)
                verticalLineToRelative(10.343f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(2.0f, 5.5f)
                curveTo(2.0f, 2.467f, 4.468f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(6.343f)
                curveToRelative(1.47f, 0.0f, 2.851f, 0.572f, 3.89f, 1.611f)
                lineToRelative(2.656f, 2.657f)
                curveToRelative(1.039f, 1.039f, 1.611f, 2.42f, 1.611f, 3.889f)
                close()
                moveTo(19.0f, 18.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(-0.929f, 0.231f, -2.886f, 2.0f, -2.886f, 2.0f)
                horizontalLineToRelative(-0.614f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.936f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.614f)
                reflectiveCurveToRelative(1.956f, 1.769f, 2.886f, 2.0f)
                reflectiveCurveToRelative(1.0f, -0.5f, 1.0f, -1.0f)
                verticalLineToRelative(-5.936f)
                curveToRelative(0.0f, -0.5f, -0.071f, -1.231f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
