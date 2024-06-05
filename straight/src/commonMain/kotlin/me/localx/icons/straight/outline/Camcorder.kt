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

public val Icons.Outline.Camcorder: ImageVector
    get() {
        if (_camcorder != null) {
            return _camcorder!!
        }
        _camcorder = Builder(name = "Camcorder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(12.0f)
                lineTo(16.0f, 10.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(24.0f, 8.0f)
                lineToRelative(-4.0f, 3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.086f)
                lineTo(9.914f, 1.0f)
                lineTo(0.0f, 1.0f)
                lineTo(0.0f, 3.0f)
                lineTo(9.086f, 3.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                lineTo(20.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(4.0f, 3.0f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(18.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 9.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(22.0f, 18.0f)
                lineToRelative(-2.0f, -1.5f)
                verticalLineToRelative(-3.0f)
                lineToRelative(2.0f, -1.5f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _camcorder!!
    }

private var _camcorder: ImageVector? = null
