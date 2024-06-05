package me.localx.icons.rounded.filled

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

public val Icons.Filled.BinBottles: ImageVector
    get() {
        if (_binBottles != null) {
            return _binBottles!!
        }
        _binBottles = Builder(name = "BinBottles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(14.739f, 5.0f)
                curveToRelative(0.787f, 0.952f, 1.261f, 2.172f, 1.261f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.761f)
                close()
                moveTo(14.0f, 8.5f)
                curveToRelative(0.0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 5.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, 1.567f, -3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                lineTo(14.0f, 9.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(9.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(23.318f, 11.96f)
                curveToRelative(-0.53f, -0.61f, -1.297f, -0.96f, -2.105f, -0.96f)
                lineTo(2.784f, 11.0f)
                curveToRelative(-0.808f, 0.0f, -1.574f, 0.35f, -2.104f, 0.96f)
                reflectiveCurveTo(-0.088f, 13.379f, 0.03f, 14.2f)
                lineToRelative(0.981f, 5.016f)
                curveToRelative(0.39f, 2.727f, 2.761f, 4.783f, 5.516f, 4.783f)
                horizontalLineToRelative(10.944f)
                curveToRelative(2.754f, 0.0f, 5.125f, -2.057f, 5.512f, -4.763f)
                lineToRelative(0.988f, -5.056f)
                curveToRelative(0.114f, -0.801f, -0.124f, -1.61f, -0.654f, -2.22f)
                close()
                moveTo(7.997f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(12.997f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.997f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _binBottles!!
    }

private var _binBottles: ImageVector? = null
