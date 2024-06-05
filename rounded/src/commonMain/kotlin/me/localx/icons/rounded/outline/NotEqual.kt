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

public val Icons.Outline.NotEqual: ImageVector
    get() {
        if (_notEqual != null) {
            return _notEqual!!
        }
        _notEqual = Builder(name = "NotEqual", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-12.174f)
                lineToRelative(-2.915f, 6.414f)
                curveToRelative(-0.167f, 0.368f, -0.53f, 0.586f, -0.911f, 0.586f)
                curveToRelative(-0.138f, 0.0f, -0.278f, -0.028f, -0.413f, -0.09f)
                curveToRelative(-0.503f, -0.229f, -0.725f, -0.821f, -0.496f, -1.324f)
                lineToRelative(2.539f, -5.586f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.538f)
                lineToRelative(2.727f, -6.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.174f)
                lineToRelative(2.915f, -6.414f)
                curveToRelative(0.228f, -0.501f, 0.816f, -0.728f, 1.324f, -0.496f)
                curveToRelative(0.503f, 0.229f, 0.725f, 0.821f, 0.496f, 1.324f)
                lineToRelative(-2.539f, 5.586f)
                horizontalLineToRelative(7.629f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-8.538f)
                lineToRelative(-2.727f, 6.0f)
                horizontalLineToRelative(11.265f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _notEqual!!
    }

private var _notEqual: ImageVector? = null
