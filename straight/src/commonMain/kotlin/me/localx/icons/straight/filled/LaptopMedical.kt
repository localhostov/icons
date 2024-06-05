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

public val Icons.Filled.LaptopMedical: ImageVector
    get() {
        if (_laptopMedical != null) {
            return _laptopMedical!!
        }
        _laptopMedical = Builder(name = "LaptopMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.991f, 18.0f)
                lineToRelative(-0.846f, -1.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.14f)
                lineToRelative(-0.847f, 1.0f)
                horizontalLineToRelative(-6.022f)
                close()
                moveTo(2.0f, 3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(7.082f)
                lineToRelative(0.847f, 1.0f)
                horizontalLineToRelative(4.157f)
                lineToRelative(0.846f, -1.0f)
                horizontalLineToRelative(7.068f)
                lineTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _laptopMedical!!
    }

private var _laptopMedical: ImageVector? = null
