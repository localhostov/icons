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

public val Icons.Outline.FonduePot: ImageVector
    get() {
        if (_fonduePot != null) {
            return _fonduePot!!
        }
        _fonduePot = Builder(name = "FonduePot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 8.0f)
                horizontalLineToRelative(-3.866f)
                lineToRelative(3.228f, -5.493f)
                curveToRelative(0.279f, -0.477f, 0.12f, -1.089f, -0.355f, -1.369f)
                curveToRelative(-0.478f, -0.279f, -1.089f, -0.121f, -1.369f, 0.355f)
                lineToRelative(-3.823f, 6.507f)
                horizontalLineToRelative(-2.653f)
                lineToRelative(1.804f, -6.742f)
                curveToRelative(0.143f, -0.533f, -0.174f, -1.082f, -0.707f, -1.224f)
                curveToRelative(-0.531f, -0.142f, -1.082f, 0.174f, -1.225f, 0.708f)
                lineToRelative(-1.942f, 7.258f)
                horizontalLineToRelative(-4.907f)
                lineTo(3.362f, 1.494f)
                curveToRelative(-0.28f, -0.477f, -0.894f, -0.635f, -1.369f, -0.356f)
                curveToRelative(-0.477f, 0.28f, -0.636f, 0.893f, -0.356f, 1.369f)
                lineToRelative(3.228f, 5.494f)
                lineTo(1.0f, 8.001f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 3.462f, 1.77f, 6.517f, 4.451f, 8.313f)
                curveToRelative(-1.438f, 0.607f, -2.451f, 2.03f, -2.451f, 3.687f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.657f, -1.012f, -3.081f, -2.451f, -3.687f)
                curveToRelative(2.681f, -1.796f, 4.451f, -4.851f, 4.451f, -8.313f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(20.0f, 11.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _fonduePot!!
    }

private var _fonduePot: ImageVector? = null
