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

public val Icons.Outline.Mercury: ImageVector
    get() {
        if (_mercury != null) {
            return _mercury!!
        }
        _mercury = Builder(name = "Mercury", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 10.0f)
                curveToRelative(0.0f, -3.007f, -1.668f, -5.631f, -4.126f, -6.997f)
                curveToRelative(0.623f, -0.346f, 1.203f, -0.777f, 1.725f, -1.289f)
                curveToRelative(0.394f, -0.387f, 0.4f, -1.02f, 0.014f, -1.414f)
                curveToRelative(-0.388f, -0.393f, -1.021f, -0.402f, -1.415f, -0.014f)
                curveToRelative(-1.127f, 1.105f, -2.619f, 1.714f, -4.198f, 1.714f)
                reflectiveCurveToRelative(-3.071f, -0.608f, -4.198f, -1.714f)
                curveToRelative(-0.395f, -0.388f, -1.026f, -0.378f, -1.415f, 0.014f)
                curveToRelative(-0.386f, 0.395f, -0.38f, 1.027f, 0.014f, 1.414f)
                curveToRelative(0.522f, 0.512f, 1.102f, 0.943f, 1.725f, 1.289f)
                curveToRelative(-2.458f, 1.367f, -4.126f, 3.991f, -4.126f, 6.997f)
                curveToRelative(0.0f, 4.073f, 3.059f, 7.444f, 7.0f, 7.938f)
                verticalLineToRelative(2.062f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.062f)
                curveToRelative(3.941f, -0.494f, 7.0f, -3.865f, 7.0f, -7.938f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _mercury!!
    }

private var _mercury: ImageVector? = null
