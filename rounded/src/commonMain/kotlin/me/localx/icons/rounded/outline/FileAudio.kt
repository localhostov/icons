package me.localx.icons.rounded.outline

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

public val Icons.Outline.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.95f, 5.536f)
                lineToRelative(-3.485f, -3.485f)
                curveToRelative(-1.322f, -1.322f, -3.08f, -2.05f, -4.95f, -2.05f)
                horizontalLineToRelative(-4.515f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.515f)
                curveToRelative(0.0f, -1.87f, -0.728f, -3.628f, -2.05f, -4.95f)
                close()
                moveTo(18.536f, 6.95f)
                curveToRelative(0.318f, 0.318f, 0.587f, 0.671f, 0.805f, 1.05f)
                horizontalLineToRelative(-4.341f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(14.0f, 2.659f)
                curveToRelative(0.38f, 0.218f, 0.733f, 0.488f, 1.051f, 0.805f)
                lineToRelative(3.485f, 3.485f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.325f, 0.008f, 0.485f, 0.023f)
                verticalLineToRelative(4.977f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.977f)
                curveToRelative(0.015f, 0.16f, 0.023f, 0.322f, 0.023f, 0.485f)
                verticalLineToRelative(8.515f)
                close()
                moveTo(17.0f, 16.02f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(13.0f, 13.02f)
                verticalLineToRelative(5.936f)
                curveToRelative(0.0f, 0.5f, -0.071f, 1.231f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-2.886f, -2.0f, -2.886f, -2.0f)
                horizontalLineToRelative(-0.614f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-0.936f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.614f)
                reflectiveCurveToRelative(1.956f, -1.769f, 2.886f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.5f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
