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

public val Icons.Outline.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = Builder(name = "Milk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 5.3f)
                verticalLineToRelative(-3.3f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(3.3f)
                lineToRelative(-3.0f, 3.857f)
                verticalLineToRelative(11.843f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-11.843f)
                lineToRelative(-3.0f, -3.857f)
                close()
                moveTo(13.106f, 9.0f)
                lineTo(3.656f, 9.0f)
                lineToRelative(2.333f, -3.0f)
                horizontalLineToRelative(9.784f)
                lineToRelative(-2.667f, 3.0f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.352f, 0.072f, 0.686f, 0.184f, 1.0f)
                lineTo(4.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 21.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-11.12f)
                lineToRelative(3.215f, -3.617f)
                lineToRelative(2.785f, 3.58f)
                verticalLineToRelative(11.157f)
                close()
            }
        }
        .build()
        return _milk!!
    }

private var _milk: ImageVector? = null
