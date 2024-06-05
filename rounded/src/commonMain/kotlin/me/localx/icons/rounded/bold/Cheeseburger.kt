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

public val Icons.Bold.Cheeseburger: ImageVector
    get() {
        if (_cheeseburger != null) {
            return _cheeseburger!!
        }
        _cheeseburger = Builder(name = "Cheeseburger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 15.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.879f)
                lineToRelative(-3.061f, 3.061f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineToRelative(-3.061f, -3.061f)
                lineTo(2.5f, 17.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(1.573f, 11.097f)
                curveToRelative(-0.476f, -0.57f, -0.672f, -1.314f, -0.54f, -2.041f)
                curveTo(1.992f, 3.808f, 6.604f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.032f, 3.812f, 10.969f, 9.063f)
                curveToRelative(0.129f, 0.727f, -0.069f, 1.469f, -0.545f, 2.038f)
                curveToRelative(-0.479f, 0.572f, -1.18f, 0.899f, -1.924f, 0.899f)
                lineTo(3.5f, 12.0f)
                curveToRelative(-0.746f, 0.0f, -1.448f, -0.329f, -1.927f, -0.903f)
                close()
                moveTo(4.117f, 9.0f)
                horizontalLineToRelative(15.77f)
                curveToRelative(-0.906f, -3.511f, -4.13f, -6.0f, -7.887f, -6.0f)
                curveToRelative(-3.675f, 0.0f, -6.959f, 2.54f, -7.883f, 6.0f)
                close()
                moveTo(21.5f, 19.0f)
                horizontalLineToRelative(-1.05f)
                lineToRelative(-2.475f, 2.475f)
                curveToRelative(-0.661f, 0.661f, -1.54f, 1.025f, -2.475f, 1.025f)
                reflectiveCurveToRelative(-1.813f, -0.364f, -2.475f, -1.025f)
                lineToRelative(-2.475f, -2.475f)
                lineTo(2.5f, 19.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _cheeseburger!!
    }

private var _cheeseburger: ImageVector? = null
