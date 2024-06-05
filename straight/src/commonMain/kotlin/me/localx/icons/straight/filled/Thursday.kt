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

public val Icons.Filled.Thursday: ImageVector
    get() {
        if (_thursday != null) {
            return _thursday!!
        }
        _thursday = Builder(name = "Thursday", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 17.6f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.65f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(16.9f, 16.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.413f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.15f)
                horizontalLineToRelative(1.413f)
                verticalLineToRelative(3.15f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(22.4f, 16.0f)
                verticalLineToRelative(5.73f)
                curveToRelative(0.0f, 0.386f, -0.314f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.314f, -0.7f, -0.7f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(5.73f)
                curveToRelative(0.0f, 1.269f, 1.031f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.031f, 2.3f, -2.3f)
                verticalLineToRelative(-5.73f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(0.0f, 10.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(7.65f)
                verticalLineToRelative(-4.431f)
                horizontalLineToRelative(-1.65f)
                verticalLineToRelative(-5.569f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 10.0f)
                close()
            }
        }
        .build()
        return _thursday!!
    }

private var _thursday: ImageVector? = null
