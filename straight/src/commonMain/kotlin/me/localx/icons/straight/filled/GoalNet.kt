package me.localx.icons.straight.filled

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

public val Icons.Filled.GoalNet: ImageVector
    get() {
        if (_goalNet != null) {
            return _goalNet!!
        }
        _goalNet = Builder(name = "GoalNet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(1.747f)
                lineToRelative(3.364f, -3.369f)
                lineToRelative(3.458f, 3.457f)
                lineToRelative(3.466f, -3.466f)
                lineToRelative(3.466f, 3.466f)
                lineToRelative(3.464f, -3.464f)
                lineToRelative(3.374f, 3.375f)
                horizontalLineToRelative(1.661f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.689f, 9.277f)
                lineToRelative(-1.689f, 1.689f)
                verticalLineToRelative(-3.378f)
                lineToRelative(1.689f, 1.689f)
                close()
                moveTo(5.103f, 10.691f)
                lineToRelative(2.058f, 2.058f)
                lineToRelative(-2.051f, 2.053f)
                lineToRelative(-2.059f, -2.059f)
                lineToRelative(2.052f, -2.052f)
                close()
                moveTo(6.517f, 9.277f)
                lineToRelative(2.052f, -2.051f)
                lineToRelative(2.055f, 2.056f)
                lineToRelative(-2.05f, 2.052f)
                lineToRelative(-2.057f, -2.057f)
                close()
                moveTo(10.794f, 5.0f)
                horizontalLineToRelative(2.481f)
                lineToRelative(0.813f, 0.813f)
                lineToRelative(-2.051f, 2.054f)
                lineToRelative(-2.054f, -2.055f)
                lineToRelative(0.812f, -0.811f)
                close()
                moveTo(12.038f, 10.696f)
                lineToRelative(2.048f, 2.048f)
                lineToRelative(-2.051f, 2.051f)
                lineToRelative(-2.047f, -2.047f)
                lineToRelative(2.05f, -2.052f)
                close()
                moveTo(13.451f, 9.281f)
                lineToRelative(2.052f, -2.054f)
                lineToRelative(2.05f, 2.05f)
                lineToRelative(-2.053f, 2.053f)
                lineToRelative(-2.049f, -2.049f)
                close()
                moveTo(18.967f, 10.691f)
                lineToRelative(2.052f, 2.052f)
                lineToRelative(-2.053f, 2.053f)
                lineToRelative(-2.052f, -2.052f)
                lineToRelative(2.053f, -2.053f)
                close()
                moveTo(20.381f, 9.277f)
                lineToRelative(1.619f, -1.619f)
                verticalLineToRelative(3.238f)
                lineToRelative(-1.619f, -1.619f)
                close()
                moveTo(21.0f, 5.0f)
                curveToRelative(0.233f, 0.0f, 0.447f, 0.08f, 0.617f, 0.214f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(-2.051f, -2.051f)
                lineToRelative(0.811f, -0.812f)
                horizontalLineToRelative(3.272f)
                close()
                moveTo(6.344f, 5.0f)
                lineToRelative(0.811f, 0.811f)
                lineToRelative(-2.052f, 2.052f)
                lineToRelative(-2.68f, -2.679f)
                curveToRelative(0.163f, -0.115f, 0.362f, -0.184f, 0.577f, -0.184f)
                horizontalLineToRelative(3.344f)
                close()
                moveTo(2.0f, 17.916f)
                verticalLineToRelative(-3.396f)
                lineToRelative(1.697f, 1.697f)
                lineToRelative(-1.697f, 1.699f)
                close()
                moveTo(8.569f, 18.261f)
                lineToRelative(-2.045f, -2.044f)
                lineToRelative(2.051f, -2.053f)
                lineToRelative(2.046f, 2.046f)
                lineToRelative(-2.052f, 2.052f)
                close()
                moveTo(15.501f, 18.261f)
                lineToRelative(-2.052f, -2.052f)
                lineToRelative(2.05f, -2.05f)
                lineToRelative(2.051f, 2.052f)
                lineToRelative(-2.05f, 2.05f)
                close()
                moveTo(20.379f, 16.211f)
                lineToRelative(1.621f, -1.621f)
                verticalLineToRelative(3.242f)
                lineToRelative(-1.621f, -1.621f)
                close()
            }
        }
        .build()
        return _goalNet!!
    }

private var _goalNet: ImageVector? = null
