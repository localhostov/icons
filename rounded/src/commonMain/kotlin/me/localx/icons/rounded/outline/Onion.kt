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

public val Icons.Outline.Onion: ImageVector
    get() {
        if (_onion != null) {
            return _onion!!
        }
        _onion = Builder(name = "Onion", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                curveToRelative(0.0f, -5.675f, -4.866f, -8.712f, -8.0f, -9.745f)
                arcTo(3.026f, 3.026f, 0.0f, false, false, 13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                arcTo(3.026f, 3.026f, 0.0f, false, false, 8.0f, 3.255f)
                curveTo(-1.667f, 6.134f, -3.988f, 19.441f, 9.056f, 21.761f)
                lineToRelative(-0.611f, 0.407f)
                arcTo(1.006f, 1.006f, 0.0f, false, false, 9.0f, 24.0f)
                curveToRelative(0.447f, 0.066f, 1.627f, -0.94f, 2.0f, -1.132f)
                arcToRelative(1.006f, 1.006f, 0.0f, true, false, 2.0f, 0.0f)
                curveToRelative(0.381f, 0.2f, 1.546f, 1.2f, 2.0f, 1.132f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 0.556f, -1.832f)
                lineToRelative(-0.611f, -0.407f)
                curveTo(20.4f, 20.876f, 24.0f, 17.525f, 24.0f, 13.0f)
                close()
                moveTo(10.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(14.0f, 4.0f)
                arcToRelative(1.058f, 1.058f, 0.0f, false, false, 0.291f, 0.706f)
                arcTo(14.422f, 14.422f, 0.0f, false, true, 18.0f, 14.0f)
                arcToRelative(5.579f, 5.579f, 0.0f, false, true, -2.614f, 4.821f)
                curveToRelative(2.074f, -5.833f, -1.453f, -12.669f, -2.679f, -13.528f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                curveToRelative(-1.228f, 0.862f, -4.753f, 7.7f, -2.679f, 13.528f)
                curveTo(2.69f, 15.092f, 8.468f, 5.562f, 9.707f, 4.707f)
                arcTo(1.062f, 1.062f, 0.0f, false, false, 10.0f, 4.0f)
                close()
                moveTo(10.0f, 15.0f)
                arcToRelative(13.451f, 13.451f, 0.0f, false, true, 2.0f, -7.354f)
                arcTo(13.451f, 13.451f, 0.0f, false, true, 14.0f, 15.0f)
                curveToRelative(0.0f, 2.088f, -0.761f, 5.0f, -2.0f, 5.0f)
                reflectiveCurveTo(10.0f, 17.088f, 10.0f, 15.0f)
                close()
                moveTo(2.0f, 13.0f)
                arcTo(7.694f, 7.694f, 0.0f, false, true, 6.072f, 6.356f)
                curveTo(4.4f, 8.989f, 2.8f, 15.252f, 5.362f, 18.4f)
                arcTo(6.088f, 6.088f, 0.0f, false, true, 2.0f, 13.0f)
                close()
                moveTo(18.638f, 18.4f)
                curveToRelative(2.561f, -3.146f, 0.958f, -9.4f, -0.71f, -12.039f)
                curveTo(22.3f, 8.635f, 24.0f, 15.494f, 18.638f, 18.4f)
                close()
            }
        }
        .build()
        return _onion!!
    }

private var _onion: ImageVector? = null
