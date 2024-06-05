package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Mp3File: ImageVector
    get() {
        if (_mp3File != null) {
            return _mp3File!!
        }
        _mp3File = Builder(name = "Mp3File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 19.0f)
                horizontalLineToRelative(4.414f)
                lineToRelative(-4.414f, 4.414f)
                verticalLineToRelative(-4.414f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(9.31f, 11.069f)
                lineToRelative(-0.385f, -5.31f)
                curveToRelative(-0.032f, -0.535f, -0.358f, -0.759f, -0.749f, -0.759f)
                curveToRelative(-0.26f, 0.0f, -0.501f, 0.184f, -0.638f, 0.486f)
                lineToRelative(-0.883f, 1.942f)
                lineToRelative(-0.883f, -1.942f)
                curveToRelative(-0.137f, -0.302f, -0.378f, -0.486f, -0.638f, -0.486f)
                curveToRelative(-0.391f, 0.0f, -0.717f, 0.224f, -0.749f, 0.759f)
                lineToRelative(-0.385f, 5.31f)
                horizontalLineToRelative(1.217f)
                lineToRelative(0.242f, -3.339f)
                lineToRelative(1.196f, 2.631f)
                lineToRelative(1.196f, -2.631f)
                lineToRelative(0.242f, 3.339f)
                horizontalLineToRelative(1.217f)
                close()
                moveTo(14.478f, 6.985f)
                curveToRelative(0.0f, -1.094f, -0.902f, -1.985f, -2.012f, -1.985f)
                horizontalLineToRelative(-1.967f)
                verticalLineToRelative(6.069f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.096f)
                lineToRelative(0.717f, -0.003f)
                curveToRelative(1.109f, 0.0f, 2.012f, -0.891f, 2.012f, -1.985f)
                close()
                moveTo(18.796f, 8.04f)
                curveToRelative(0.283f, -0.322f, 0.46f, -0.736f, 0.46f, -1.194f)
                curveToRelative(0.0f, -1.01f, -0.833f, -1.832f, -1.857f, -1.832f)
                lineToRelative(-2.018f, -0.002f)
                verticalLineToRelative(1.286f)
                horizontalLineToRelative(2.018f)
                curveToRelative(0.316f, 0.0f, 0.573f, 0.246f, 0.573f, 0.548f)
                reflectiveCurveToRelative(-0.257f, 0.548f, -0.573f, 0.548f)
                horizontalLineToRelative(-1.146f)
                reflectiveCurveToRelative(0.0f, 1.295f, 0.0f, 1.295f)
                horizontalLineToRelative(1.135f)
                curveToRelative(0.316f, 0.0f, 0.573f, 0.246f, 0.573f, 0.549f)
                reflectiveCurveToRelative(-0.257f, 0.548f, -0.573f, 0.548f)
                horizontalLineToRelative(-2.028f)
                verticalLineToRelative(1.294f)
                horizontalLineToRelative(2.028f)
                curveToRelative(1.03f, 0.0f, 1.868f, -0.827f, 1.868f, -1.843f)
                curveToRelative(0.0f, -0.459f, -0.177f, -0.875f, -0.46f, -1.198f)
                close()
                moveTo(12.466f, 6.25f)
                horizontalLineToRelative(-0.715f)
                lineToRelative(0.005f, 1.473f)
                lineToRelative(0.71f, -0.003f)
                curveToRelative(0.413f, 0.0f, 0.762f, -0.336f, 0.762f, -0.735f)
                reflectiveCurveToRelative(-0.349f, -0.735f, -0.762f, -0.735f)
                close()
            }
        }
        .build()
        return _mp3File!!
    }

private var _mp3File: ImageVector? = null
