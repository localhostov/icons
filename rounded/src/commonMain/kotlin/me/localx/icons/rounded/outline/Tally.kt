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

public val Icons.Outline.Tally: ImageVector
    get() {
        if (_tally != null) {
            return _tally!!
        }
        _tally = Builder(name = "Tally", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.912f, 6.655f)
                curveToRelative(-0.225f, -0.504f, -0.816f, -0.73f, -1.321f, -0.503f)
                lineToRelative(-0.591f, 0.265f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineTo(7.314f)
                lineToRelative(-4.0f, 1.795f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineTo(10.006f)
                lineToRelative(-4.0f, 1.795f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineTo(12.698f)
                lineToRelative(-4.0f, 1.795f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineTo(15.39f)
                lineToRelative(-1.409f, 0.632f)
                curveToRelative(-0.504f, 0.226f, -0.729f, 0.817f, -0.503f, 1.321f)
                curveToRelative(0.166f, 0.371f, 0.531f, 0.591f, 0.913f, 0.591f)
                curveToRelative(0.137f, 0.0f, 0.276f, -0.028f, 0.409f, -0.088f)
                lineToRelative(0.591f, -0.265f)
                verticalLineToRelative(5.418f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-6.316f)
                lineToRelative(4.0f, -1.794f)
                verticalLineToRelative(8.11f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineTo(13.993f)
                lineToRelative(4.0f, -1.794f)
                verticalLineToRelative(10.802f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineTo(11.301f)
                lineToRelative(4.0f, -1.794f)
                verticalLineToRelative(13.494f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineTo(8.609f)
                lineToRelative(1.409f, -0.632f)
                curveToRelative(0.504f, -0.226f, 0.729f, -0.818f, 0.503f, -1.322f)
                close()
            }
        }
        .build()
        return _tally!!
    }

private var _tally: ImageVector? = null
