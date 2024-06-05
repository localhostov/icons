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

public val Icons.Outline.CoffeePot: ImageVector
    get() {
        if (_coffeePot != null) {
            return _coffeePot!!
        }
        _coffeePot = Builder(name = "CoffeePot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4f, 2.0f)
                arcTo(25.115f, 25.115f, 0.0f, false, true, 22.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                arcTo(26.226f, 26.226f, 0.0f, false, false, 20.856f, 0.485f)
                lineTo(20.565f, 0.0f)
                lineTo(1.525f, 0.0f)
                lineTo(3.886f, 5.9f)
                curveTo(3.0f, 7.416f, 0.4f, 12.535f, 0.0f, 20.856f)
                arcTo(3.008f, 3.008f, 0.0f, false, false, 3.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, 3.0f, -3.144f)
                curveToRelative(-0.414f, -8.723f, -3.259f, -13.927f, -4.0f, -15.146f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(18.723f, 21.688f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.049f)
                arcTo(37.871f, 37.871f, 0.0f, false, true, 2.96f, 14.0f)
                lineTo(15.974f, 14.0f)
                curveToRelative(-0.184f, -0.725f, -0.379f, -1.394f, -0.577f, -2.0f)
                lineTo(3.5f, 12.0f)
                arcTo(25.186f, 25.186f, 0.0f, false, true, 5.566f, 7.0f)
                horizontalLineToRelative(9.868f)
                arcTo(31.961f, 31.961f, 0.0f, false, true, 19.0f, 20.951f)
                arcTo(0.992f, 0.992f, 0.0f, false, true, 18.725f, 21.688f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(5.678f, 5.0f)
                lineToRelative(-1.2f, -3.0f)
                lineTo(15.0f, 2.0f)
                close()
            }
        }
        .build()
        return _coffeePot!!
    }

private var _coffeePot: ImageVector? = null
