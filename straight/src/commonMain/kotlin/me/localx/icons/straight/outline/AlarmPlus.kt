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

public val Icons.Outline.AlarmPlus: ImageVector
    get() {
        if (_alarmPlus != null) {
            return _alarmPlus!!
        }
        _alarmPlus = Builder(name = "AlarmPlus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.051f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 2.051f)
                curveTo(5.402f, 2.558f, 1.0f, 7.272f, 1.0f, 13.0f)
                curveToRelative(0.0f, 2.88f, 1.121f, 5.496f, 2.938f, 7.459f)
                lineToRelative(-1.928f, 2.118f)
                lineToRelative(1.479f, 1.346f)
                lineToRelative(1.935f, -2.126f)
                curveToRelative(1.837f, 1.377f, 4.109f, 2.203f, 6.576f, 2.203f)
                reflectiveCurveToRelative(4.739f, -0.826f, 6.576f, -2.203f)
                lineToRelative(1.935f, 2.126f)
                lineToRelative(1.479f, -1.346f)
                lineToRelative(-1.928f, -2.118f)
                curveToRelative(1.817f, -1.963f, 2.938f, -4.579f, 2.938f, -7.459f)
                curveToRelative(0.0f, -5.728f, -4.402f, -10.442f, -10.0f, -10.949f)
                close()
                moveTo(3.0f, 13.0f)
                curveToRelative(0.0f, -4.962f, 4.038f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 17.962f, 3.0f, 13.0f)
                close()
                moveTo(1.68f, 5.12f)
                lineTo(0.017f, 4.011f)
                curveTo(1.219f, 2.419f, 2.726f, 1.068f, 4.456f, 0.056f)
                lineToRelative(1.067f, 1.689f)
                curveToRelative(-1.493f, 0.863f, -2.798f, 2.014f, -3.843f, 3.375f)
                close()
                moveTo(18.477f, 1.745f)
                lineTo(19.544f, 0.056f)
                curveToRelative(1.73f, 1.012f, 3.238f, 2.363f, 4.439f, 3.955f)
                lineToRelative(-1.663f, 1.109f)
                curveToRelative(-1.045f, -1.361f, -2.35f, -2.513f, -3.843f, -3.375f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _alarmPlus!!
    }

private var _alarmPlus: ImageVector? = null
