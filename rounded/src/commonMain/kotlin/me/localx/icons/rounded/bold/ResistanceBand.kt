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

public val Icons.Bold.ResistanceBand: ImageVector
    get() {
        if (_resistanceBand != null) {
            return _resistanceBand!!
        }
        _resistanceBand = Builder(name = "ResistanceBand", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 15.276f)
                verticalLineToRelative(-4.776f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(4.776f)
                curveToRelative(-1.742f, 0.621f, -3.0f, 2.271f, -3.0f, 4.224f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.953f, -1.258f, -3.602f, -3.0f, -4.224f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(21.0f, 15.276f)
                verticalLineToRelative(-6.276f)
                curveTo(21.0f, 4.067f, 17.01f, 0.053f, 12.089f, 0.005f)
                curveToRelative(-0.007f, 0.0f, -0.014f, 0.0f, -0.021f, -0.001f)
                curveToRelative(-0.023f, 0.0f, -0.045f, -0.003f, -0.068f, -0.003f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.193f, 0.0f, 2.346f, -0.35f, 3.334f, -1.012f)
                curveToRelative(0.688f, -0.46f, 0.873f, -1.392f, 0.412f, -2.08f)
                curveToRelative(-0.461f, -0.689f, -1.392f, -0.875f, -2.081f, -0.412f)
                curveToRelative(-0.493f, 0.329f, -1.069f, 0.504f, -1.666f, 0.504f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(6.276f)
                curveToRelative(-1.742f, 0.621f, -3.0f, 2.271f, -3.0f, 4.224f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.953f, -1.258f, -3.602f, -3.0f, -4.224f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _resistanceBand!!
    }

private var _resistanceBand: ImageVector? = null
