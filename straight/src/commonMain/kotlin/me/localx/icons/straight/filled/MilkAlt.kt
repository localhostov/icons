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

public val Icons.Filled.MilkAlt: ImageVector
    get() {
        if (_milkAlt != null) {
            return _milkAlt!!
        }
        _milkAlt = Builder(name = "MilkAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 13.949f)
                verticalLineToRelative(10.051f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-7.0f)
                lineTo(4.16f, 12.0f)
                curveToRelative(0.143f, -0.945f, 0.378f, -1.874f, 0.729f, -2.773f)
                lineToRelative(1.633f, -4.188f)
                curveToRelative(0.317f, -0.814f, 0.479f, -1.67f, 0.479f, -2.544f)
                verticalLineToRelative(-0.495f)
                horizontalLineToRelative(-1.0f)
                lineTo(6.001f, 0.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.495f)
                curveToRelative(0.0f, 0.874f, 0.161f, 1.729f, 0.479f, 2.544f)
                lineToRelative(1.633f, 4.188f)
                curveToRelative(0.59f, 1.512f, 0.889f, 3.101f, 0.889f, 4.723f)
                close()
                moveTo(14.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _milkAlt!!
    }

private var _milkAlt: ImageVector? = null
