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

public val Icons.Outline.DongSign: ImageVector
    get() {
        if (_dongSign != null) {
            return _dongSign!!
        }
        _dongSign = Builder(name = "DongSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(22.0f, 22.0f)
                close()
                moveTo(6.0f, 14.0f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                curveToRelative(1.54f, 0.0f, 2.94f, 0.59f, 4.0f, 1.54f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.54f)
                curveToRelative(-1.06f, 0.95f, -2.46f, 1.54f, -4.0f, 1.54f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _dongSign!!
    }

private var _dongSign: ImageVector? = null
