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

public val Icons.Filled.PumpMedical: ImageVector
    get() {
        if (_pumpMedical != null) {
            return _pumpMedical!!
        }
        _pumpMedical = Builder(name = "PumpMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.238f)
                curveToRelative(0.791f, 0.0f, 1.558f, 0.232f, 2.218f, 0.671f)
                lineToRelative(2.503f, 1.669f)
                lineToRelative(-1.109f, 1.664f)
                lineToRelative(-2.502f, -1.668f)
                curveToRelative(-0.33f, -0.22f, -0.714f, -0.336f, -1.109f, -0.336f)
                horizontalLineToRelative(-4.238f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(15.826f, 7.0f)
                horizontalLineToRelative(-7.651f)
                curveToRelative(-2.513f, 1.384f, -4.174f, 4.057f, -4.174f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -2.943f, -1.661f, -5.616f, -4.174f, -7.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
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
        return _pumpMedical!!
    }

private var _pumpMedical: ImageVector? = null
