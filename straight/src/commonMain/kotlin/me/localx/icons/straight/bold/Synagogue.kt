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

public val Icons.Bold.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.731f)
                lineToRelative(0.9f, 1.5f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-1.05f, 1.75f)
                lineToRelative(1.05f, 1.75f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(-0.9f, 1.5f)
                lineToRelative(-0.9f, -1.5f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(1.05f, -1.75f)
                lineToRelative(-1.05f, -1.75f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -1.5f)
                close()
                moveTo(24.0f, 12.055f)
                verticalLineToRelative(11.945f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-11.945f)
                lineToRelative(4.0f, -2.91f)
                lineToRelative(1.0f, 0.727f)
                verticalLineToRelative(-4.636f)
                lineTo(12.0f, 0.145f)
                lineToRelative(7.0f, 5.091f)
                verticalLineToRelative(4.636f)
                lineToRelative(1.0f, -0.727f)
                lineToRelative(4.0f, 2.91f)
                close()
                moveTo(5.0f, 13.582f)
                lineToRelative(-1.0f, -0.727f)
                lineToRelative(-1.0f, 0.727f)
                verticalLineToRelative(7.418f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.418f)
                close()
                moveTo(16.0f, 6.764f)
                lineToRelative(-4.0f, -2.909f)
                lineToRelative(-4.0f, 2.909f)
                verticalLineToRelative(14.236f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 6.764f)
                close()
                moveTo(21.0f, 13.582f)
                lineToRelative(-1.0f, -0.727f)
                lineToRelative(-1.0f, 0.727f)
                verticalLineToRelative(7.418f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.418f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
