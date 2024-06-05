package me.localx.icons.straight.bold

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
                moveTo(16.257f, 14.436f)
                lineToRelative(5.742f, -3.829f)
                lineToRelative(-1.664f, -2.496f)
                lineToRelative(-3.258f, 2.171f)
                lineToRelative(-1.249f, -1.856f)
                curveToRelative(-0.514f, -0.979f, -1.358f, -1.731f, -2.394f, -2.127f)
                curveToRelative(-0.736f, -0.321f, -1.522f, -0.384f, -2.272f, -0.181f)
                curveToRelative(-0.974f, 0.263f, -1.788f, 0.933f, -2.263f, 1.906f)
                lineToRelative(-2.472f, 5.757f)
                curveToRelative(-0.557f, 1.134f, -0.817f, 2.815f, 1.071f, 4.353f)
                lineToRelative(3.311f, 2.866f)
                horizontalLineToRelative(-5.809f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.475f)
                lineToRelative(-4.874f, -4.217f)
                lineToRelative(2.717f, -6.476f)
                lineToRelative(2.413f, 3.604f)
                close()
            }
        }
        .build()
        return _personPraying!!
    }

private var _personPraying: ImageVector? = null
