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

public val Icons.Outline.LaptopCode: ImageVector
    get() {
        if (_laptopCode != null) {
            return _laptopCode!!
        }
        _laptopCode = Builder(name = "LaptopCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.207f, 12.475f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.257f, -2.257f)
                curveToRelative(-0.775f, -0.775f, -0.775f, -2.036f, 0.0f, -2.812f)
                lineToRelative(2.255f, -2.255f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.255f, 2.255f)
                lineToRelative(2.257f, 2.241f)
                close()
                moveTo(15.207f, 13.889f)
                lineToRelative(2.257f, -2.257f)
                curveToRelative(0.775f, -0.775f, 0.775f, -2.036f, 0.0f, -2.812f)
                lineToRelative(-2.255f, -2.255f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.255f, 2.239f)
                lineToRelative(-2.257f, 2.257f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 15.0f)
                lineTo(2.0f, 3.0f)
                lineTo(22.0f, 3.0f)
                lineTo(22.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(4.914f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(4.172f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(4.914f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 15.0f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(-6.086f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-5.828f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                lineTo(21.0f, 19.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _laptopCode!!
    }

private var _laptopCode: ImageVector? = null
