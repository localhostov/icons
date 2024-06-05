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

public val Icons.Outline.PoliceBox: ImageVector
    get() {
        if (_policeBox != null) {
            return _policeBox!!
        }
        _policeBox = Builder(name = "PoliceBox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 22.0f)
                lineTo(21.0f, 5.766f)
                curveToRelative(0.0f, -1.51f, -1.13f, -2.79f, -2.628f, -2.977f)
                lineToRelative(-5.372f, -0.672f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.117f)
                lineToRelative(-5.372f, 0.672f)
                curveToRelative(-1.498f, 0.187f, -2.628f, 1.467f, -2.628f, 2.977f)
                verticalLineToRelative(16.234f)
                lineTo(1.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(16.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _policeBox!!
    }

private var _policeBox: ImageVector? = null
