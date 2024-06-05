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

public val Icons.Bold.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.022f, viewportHeight = 512.022f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.558f, 141.889f)
                lineToRelative(59.328f, -59.349f)
                lineToRelative(0.448f, 290.816f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(17.673f, 0.0f, 32.0f, -14.327f, 32.0f, -32.0f)
                lineToRelative(-0.448f, -290.453f)
                lineToRelative(58.987f, 58.987f)
                curveToRelative(12.278f, 12.712f, 32.536f, 13.064f, 45.248f, 0.786f)
                reflectiveCurveToRelative(13.064f, -32.536f, 0.786f, -45.248f)
                curveToRelative(-0.258f, -0.267f, -0.52f, -0.529f, -0.786f, -0.786f)
                lineToRelative(-68.523f, -68.523f)
                curveToRelative(-37.49f, -37.491f, -98.274f, -37.491f, -135.765f, -0.001f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.001f, -0.001f, 0.001f)
                lineTo(120.31f, 96.641f)
                curveToRelative(-12.278f, 12.712f, -11.926f, 32.97f, 0.786f, 45.248f)
                curveTo(133.497f, 153.866f, 153.157f, 153.866f, 165.558f, 141.889f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.011f, 309.355f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(97.941f)
                curveToRelative(-0.012f, 4.814f, -3.911f, 8.714f, -8.725f, 8.725f)
                horizontalLineTo(72.736f)
                curveToRelative(-4.814f, -0.012f, -8.714f, -3.911f, -8.725f, -8.725f)
                verticalLineToRelative(-97.941f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(97.941f)
                curveToRelative(0.047f, 40.146f, 32.58f, 72.678f, 72.725f, 72.725f)
                horizontalLineToRelative(366.549f)
                curveToRelative(40.146f, -0.047f, 72.678f, -32.58f, 72.725f, -72.725f)
                verticalLineToRelative(-97.941f)
                curveTo(512.011f, 323.682f, 497.684f, 309.355f, 480.011f, 309.355f)
                close()
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
