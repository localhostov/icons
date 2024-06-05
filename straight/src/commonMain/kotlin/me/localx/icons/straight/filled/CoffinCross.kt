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

public val Icons.Filled.CoffinCross: ImageVector
    get() {
        if (_coffinCross != null) {
            return _coffinCross!!
        }
        _coffinCross = Builder(name = "CoffinCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.932f, 1.885f)
                curveToRelative(-0.459f, -1.145f, -1.552f, -1.885f, -2.786f, -1.885f)
                lineTo(7.854f, 0.0f)
                curveToRelative(-1.234f, 0.0f, -2.327f, 0.74f, -2.786f, 1.886f)
                lineToRelative(-2.608f, 6.522f)
                lineToRelative(3.226f, 15.592f)
                horizontalLineToRelative(12.629f)
                lineToRelative(3.226f, -15.592f)
                lineToRelative(-2.608f, -6.523f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _coffinCross!!
    }

private var _coffinCross: ImageVector? = null
