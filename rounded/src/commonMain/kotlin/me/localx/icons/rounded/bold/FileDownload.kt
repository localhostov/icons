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

public val Icons.Bold.FileDownload: ImageVector
    get() {
        if (_fileDownload != null) {
            return _fileDownload!!
        }
        _fileDownload = Builder(name = "FileDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.389f, 4.268f)
                lineToRelative(-2.656f, -2.657f)
                curveToRelative(-1.039f, -1.039f, -2.42f, -1.611f, -3.89f, -1.611f)
                horizontalLineToRelative(-6.343f)
                curveTo(4.468f, 0.0f, 2.0f, 2.467f, 2.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-10.343f)
                curveToRelative(0.0f, -1.469f, -0.572f, -2.85f, -1.611f, -3.889f)
                close()
                moveTo(16.5f, 21.0f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(5.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(15.748f, 15.654f)
                lineToRelative(-3.063f, 3.063f)
                curveToRelative(-0.378f, 0.378f, -0.991f, 0.378f, -1.369f, 0.0f)
                lineToRelative(-3.063f, -3.063f)
                curveToRelative(-0.61f, -0.61f, -0.178f, -1.653f, 0.685f, -1.653f)
                horizontalLineToRelative(1.563f)
                verticalLineToRelative(-2.501f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.501f)
                horizontalLineToRelative(1.563f)
                curveToRelative(0.863f, 0.0f, 1.295f, 1.043f, 0.685f, 1.653f)
                close()
            }
        }
        .build()
        return _fileDownload!!
    }

private var _fileDownload: ImageVector? = null
