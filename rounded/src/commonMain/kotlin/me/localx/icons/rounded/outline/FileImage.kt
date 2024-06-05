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

public val Icons.Outline.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(22.0f, 10.485f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(2.0f, 5.0f)
                curveTo(2.0f, 2.243f, 4.243f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(1.87f, 0.0f, 3.627f, 0.728f, 4.95f, 2.05f)
                lineToRelative(3.485f, 3.485f)
                curveToRelative(1.322f, 1.322f, 2.05f, 3.08f, 2.05f, 4.95f)
                close()
                moveTo(15.05f, 3.464f)
                curveToRelative(-0.318f, -0.318f, -0.671f, -0.587f, -1.05f, -0.805f)
                verticalLineToRelative(4.341f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.341f)
                curveToRelative(-0.218f, -0.379f, -0.487f, -0.733f, -0.805f, -1.05f)
                lineToRelative(-3.485f, -3.485f)
                close()
                moveTo(4.0f, 19.0f)
                curveToRelative(0.0f, 0.028f, 0.001f, 0.056f, 0.002f, 0.084f)
                lineToRelative(5.06f, -5.06f)
                curveToRelative(1.344f, -1.345f, 3.532f, -1.345f, 4.876f, 0.0f)
                lineToRelative(0.615f, 0.615f)
                curveToRelative(0.522f, 0.521f, 1.371f, 0.521f, 1.894f, 0.0f)
                lineToRelative(3.553f, -3.553f)
                verticalLineToRelative(-0.601f)
                curveToRelative(0.0f, -0.163f, -0.008f, -0.325f, -0.023f, -0.485f)
                horizontalLineToRelative(-4.977f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(12.0f, 2.023f)
                curveToRelative(-0.16f, -0.015f, -0.322f, -0.023f, -0.485f, -0.023f)
                horizontalLineToRelative(-4.515f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(20.0f, 19.0f)
                verticalLineToRelative(-5.086f)
                lineToRelative(-2.139f, 2.139f)
                curveToRelative(-1.302f, 1.302f, -3.42f, 1.302f, -4.722f, 0.0f)
                lineToRelative(-0.615f, -0.615f)
                curveToRelative(-0.564f, -0.564f, -1.483f, -0.564f, -2.048f, 0.0f)
                lineToRelative(-5.638f, 5.638f)
                curveToRelative(0.546f, 0.569f, 1.313f, 0.924f, 2.162f, 0.924f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
