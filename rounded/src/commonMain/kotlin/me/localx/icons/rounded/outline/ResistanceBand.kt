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

public val Icons.Outline.ResistanceBand: ImageVector
    get() {
        if (_resistanceBand != null) {
            return _resistanceBand!!
        }
        _resistanceBand = Builder(name = "ResistanceBand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 16.142f)
                verticalLineToRelative(-7.142f)
                curveTo(21.0f, 4.037f, 16.962f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.906f, 0.0f, 3.655f, -0.875f, 4.8f, -2.399f)
                curveToRelative(0.332f, -0.441f, 0.242f, -1.068f, -0.199f, -1.4f)
                curveToRelative(-0.442f, -0.331f, -1.068f, -0.242f, -1.4f, 0.199f)
                curveToRelative(-0.764f, 1.018f, -1.93f, 1.601f, -3.201f, 1.601f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.141f, 7.0f, 7.0f)
                verticalLineToRelative(7.142f)
                curveToRelative(-1.72f, 0.447f, -3.0f, 1.999f, -3.0f, 3.858f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.859f, -1.28f, -3.411f, -3.0f, -3.858f)
                close()
                moveTo(22.0f, 21.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(5.0f, 16.142f)
                verticalLineToRelative(-7.142f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(7.142f)
                curveToRelative(-1.72f, 0.447f, -3.0f, 1.999f, -3.0f, 3.858f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.859f, -1.28f, -3.411f, -3.0f, -3.858f)
                close()
                moveTo(6.0f, 21.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _resistanceBand!!
    }

private var _resistanceBand: ImageVector? = null
