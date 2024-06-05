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

public val Icons.Bold.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.821f, 377.6f)
                curveToRelative(37.49f, 37.491f, 98.274f, 37.491f, 135.765f, 0.001f)
                curveToRelative(0.0f, 0.0f, 0.001f, -0.001f, 0.001f, -0.001f)
                lineToRelative(68.523f, -68.523f)
                curveToRelative(12.712f, -12.278f, 13.064f, -32.536f, 0.786f, -45.248f)
                curveToRelative(-12.278f, -12.712f, -32.536f, -13.064f, -45.248f, -0.786f)
                curveToRelative(-0.267f, 0.257f, -0.529f, 0.52f, -0.786f, 0.786f)
                lineToRelative(-59.371f, 59.349f)
                lineTo(288.0f, 32.0f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                lineToRelative(0.448f, 290.709f)
                lineToRelative(-58.901f, -58.901f)
                curveToRelative(-12.712f, -12.278f, -32.97f, -11.926f, -45.248f, 0.786f)
                curveToRelative(-11.977f, 12.401f, -11.977f, 32.061f, 0.0f, 44.462f)
                lineTo(188.821f, 377.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 309.333f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(97.941f)
                curveToRelative(-0.012f, 4.814f, -3.911f, 8.714f, -8.725f, 8.725f)
                horizontalLineTo(72.725f)
                curveToRelative(-4.814f, -0.012f, -8.714f, -3.911f, -8.725f, -8.725f)
                verticalLineToRelative(-97.941f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.327f, -32.0f, 32.0f)
                verticalLineToRelative(97.941f)
                curveTo(0.047f, 479.42f, 32.58f, 511.953f, 72.725f, 512.0f)
                horizontalLineToRelative(366.549f)
                curveToRelative(40.146f, -0.047f, 72.678f, -32.58f, 72.725f, -72.725f)
                verticalLineToRelative(-97.941f)
                curveTo(512.0f, 323.66f, 497.673f, 309.333f, 480.0f, 309.333f)
                close()
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
