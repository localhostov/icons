package me.localx.icons.straight.outline

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

public val Icons.Outline.HouseCrackAlt: ImageVector
    get() {
        if (_houseCrackAlt != null) {
            return _houseCrackAlt!!
        }
        _houseCrackAlt = Builder(name = "HouseCrackAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.813f, 7.635f)
                lineTo(13.908f, 0.659f)
                curveToRelative(-1.125f, -0.881f, -2.692f, -0.88f, -3.816f, 0.0f)
                lineTo(1.188f, 7.635f)
                curveToRelative(-0.755f, 0.591f, -1.188f, 1.48f, -1.188f, 2.439f)
                verticalLineToRelative(13.926f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.958f, -0.433f, -1.847f, -1.187f, -2.439f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-6.086f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(-4.457f, -4.457f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.043f, 3.043f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(4.5f, 4.5f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-11.926f)
                curveToRelative(0.0f, -0.34f, 0.153f, -0.655f, 0.421f, -0.865f)
                lineTo(11.326f, 2.233f)
                curveToRelative(0.397f, -0.312f, 0.951f, -0.311f, 1.349f, 0.0f)
                lineToRelative(8.905f, 6.977f)
                curveToRelative(0.264f, 0.207f, 0.421f, 0.53f, 0.421f, 0.865f)
                verticalLineToRelative(11.926f)
                close()
            }
        }
        .build()
        return _houseCrackAlt!!
    }

private var _houseCrackAlt: ImageVector? = null
