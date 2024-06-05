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

public val Icons.Bold.PersonPraying: ImageVector
    get() {
        if (_personPraying != null) {
            return _personPraying!!
        }
        _personPraying = Builder(name = "PersonPraying", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 2.468f)
                curveTo(13.0f, 1.087f, 14.119f, -0.032f, 15.5f, -0.032f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(22.252f, 8.674f)
                curveToRelative(-0.456f, -0.692f, -1.386f, -0.881f, -2.078f, -0.426f)
                lineToRelative(-3.093f, 2.04f)
                lineToRelative(-1.253f, -1.862f)
                curveToRelative(-0.514f, -0.979f, -1.358f, -1.731f, -2.394f, -2.127f)
                curveToRelative(-0.736f, -0.321f, -1.522f, -0.384f, -2.272f, -0.181f)
                curveToRelative(-0.974f, 0.263f, -1.788f, 0.933f, -2.263f, 1.906f)
                lineToRelative(-2.472f, 5.757f)
                curveToRelative(-0.557f, 1.134f, -0.817f, 2.815f, 1.071f, 4.353f)
                lineToRelative(3.311f, 2.866f)
                horizontalLineToRelative(-5.309f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.744f, -0.189f, -1.139f, -0.519f, -1.424f)
                lineToRelative(-4.355f, -3.768f)
                lineToRelative(2.713f, -6.465f)
                lineToRelative(1.584f, 2.353f)
                curveToRelative(0.46f, 0.684f, 1.386f, 0.868f, 2.07f, 0.415f)
                lineToRelative(4.333f, -2.859f)
                curveToRelative(0.691f, -0.456f, 0.882f, -1.387f, 0.426f, -2.078f)
                close()
            }
        }
        .build()
        return _personPraying!!
    }

private var _personPraying: ImageVector? = null
