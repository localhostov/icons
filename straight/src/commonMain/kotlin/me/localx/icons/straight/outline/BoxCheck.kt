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

public val Icons.Outline.BoxCheck: ImageVector
    get() {
        if (_boxCheck != null) {
            return _boxCheck!!
        }
        _boxCheck = Builder(name = "BoxCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.112f, 15.526f)
                lineToRelative(1.394f, -1.436f)
                lineToRelative(2.984f, 2.898f)
                lineToRelative(5.808f, -5.701f)
                lineToRelative(1.404f, 1.424f)
                lineToRelative(-5.793f, 5.707f)
                curveToRelative(-0.386f, 0.387f, -0.896f, 0.581f, -1.407f, 0.581f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.586f)
                lineToRelative(-2.974f, -2.888f)
                close()
                moveTo(24.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(15.0f)
                lineTo(1.0f, 24.0f)
                lineTo(1.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(2.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(21.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(13.0f)
                lineTo(21.0f, 22.0f)
                lineTo(21.0f, 9.0f)
                close()
            }
        }
        .build()
        return _boxCheck!!
    }

private var _boxCheck: ImageVector? = null
