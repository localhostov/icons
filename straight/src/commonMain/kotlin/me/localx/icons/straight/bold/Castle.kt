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

public val Icons.Bold.Castle: ImageVector
    get() {
        if (_castle != null) {
            return _castle!!
        }
        _castle = Builder(name = "Castle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(5.0f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 24.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.5f, 21.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-7.5f)
                lineTo(21.0f, 13.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _castle!!
    }

private var _castle: ImageVector? = null
