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

public val Icons.Bold.AlarmExclamation: ImageVector
    get() {
        if (_alarmExclamation != null) {
            return _alarmExclamation!!
        }
        _alarmExclamation = Builder(name = "AlarmExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                curveToRelative(0.0f, -5.004f, -3.695f, -9.162f, -8.5f, -9.888f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 3.112f)
                curveTo(5.695f, 3.838f, 2.0f, 7.996f, 2.0f, 13.0f)
                curveToRelative(0.0f, 2.432f, 0.873f, 4.664f, 2.322f, 6.399f)
                lineToRelative(-2.416f, 2.575f)
                lineToRelative(2.188f, 2.053f)
                lineToRelative(2.473f, -2.635f)
                curveToRelative(1.565f, 1.017f, 3.432f, 1.609f, 5.433f, 1.609f)
                reflectiveCurveToRelative(3.868f, -0.592f, 5.433f, -1.609f)
                lineToRelative(2.473f, 2.635f)
                lineToRelative(2.188f, -2.053f)
                lineToRelative(-2.416f, -2.575f)
                curveToRelative(1.449f, -1.735f, 2.322f, -3.967f, 2.322f, -6.399f)
                close()
                moveTo(5.0f, 13.0f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                close()
                moveTo(2.511f, 5.674f)
                lineTo(0.017f, 4.011f)
                curveTo(1.219f, 2.419f, 2.726f, 1.068f, 4.456f, 0.056f)
                lineToRelative(1.598f, 2.53f)
                curveToRelative(-1.377f, 0.788f, -2.578f, 1.84f, -3.543f, 3.088f)
                close()
                moveTo(17.946f, 2.586f)
                lineTo(19.544f, 0.056f)
                curveToRelative(1.73f, 1.012f, 3.238f, 2.363f, 4.439f, 3.955f)
                lineToRelative(-2.494f, 1.662f)
                curveToRelative(-0.965f, -1.248f, -2.167f, -2.3f, -3.543f, -3.088f)
                close()
                moveTo(10.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(10.5f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _alarmExclamation!!
    }

private var _alarmExclamation: ImageVector? = null
