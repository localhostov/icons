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

public val Icons.Outline.CarBump: ImageVector
    get() {
        if (_carBump != null) {
            return _carBump!!
        }
        _carBump = Builder(name = "CarBump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.229f, 23.973f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.2f, -0.744f)
                curveToRelative(-0.7f, -2.946f, -5.316f, -2.915f, -6.057f, 0.016f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.94f, -0.49f)
                curveToRelative(1.231f, -4.947f, 8.773f, -4.935f, 9.943f, 0.016f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.229f, 23.973f)
                close()
                moveTo(8.854f, 19.251f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.707f, 1.5f)
                lineToRelative(-0.076f, -0.185f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, -4.027f, -2.483f)
                lineToRelative(-0.529f, -1.3f)
                arcTo(9.919f, 9.919f, 0.0f, false, true, 0.0f, 13.385f)
                reflectiveCurveTo(0.121f, 8.143f, 0.125f, 8.106f)
                arcTo(5.012f, 5.012f, 0.0f, false, true, 3.2f, 4.138f)
                lineToRelative(7.108f, -2.775f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.958f, 0.7f)
                lineToRelative(3.818f, 3.476f)
                arcTo(7.281f, 7.281f, 0.0f, false, true, 21.175f, 8.5f)
                lineToRelative(0.53f, 1.3f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, -0.973f, 4.429f)
                lineToRelative(0.069f, 0.168f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.681f, 1.563f)
                close()
                moveTo(2.115f, 8.321f)
                lineTo(2.0f, 13.383f)
                lineTo(17.8f, 7.07f)
                horizontalLineToRelative(0.0f)
                lineTo(13.974f, 3.593f)
                arcToRelative(2.988f, 2.988f, 0.0f, false, false, -2.927f, -0.372f)
                lineTo(3.939f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.115f, 8.321f)
                close()
                moveTo(5.5f, 18.432f)
                lineTo(18.755f, 13.16f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.1f, -2.6f)
                lineToRelative(-0.529f, -1.3f)
                curveToRelative(-0.076f, -0.186f, -0.159f, -0.367f, -0.247f, -0.54f)
                lineToRelative(-1.834f, 0.733f)
                lineToRelative(0.381f, 0.937f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.853f, 0.753f)
                lineToRelative(-0.385f, -0.948f)
                lineTo(5.866f, 13.992f)
                lineToRelative(0.363f, 0.915f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.858f, 0.738f)
                lineToRelative(-0.362f, -0.911f)
                lineTo(2.2f, 15.458f)
                arcToRelative(3.637f, 3.637f, 0.0f, false, false, 0.172f, 0.57f)
                lineToRelative(0.529f, 1.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.5f, 18.432f)
                close()
            }
        }
        .build()
        return _carBump!!
    }

private var _carBump: ImageVector? = null
