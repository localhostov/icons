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

public val Icons.Filled.Auction: ImageVector
    get() {
        if (_auction != null) {
            return _auction!!
        }
        _auction = Builder(name = "Auction", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.051f)
                curveToRelative(0.232f, -1.14f, 1.242f, -2.0f, 2.449f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.208f, 0.0f, 2.217f, 0.86f, 2.449f, 2.0f)
                horizontalLineToRelative(1.051f)
                close()
                moveTo(14.487f, 1.442f)
                lineTo(13.074f, 0.029f)
                lineToRelative(-7.89f, 7.89f)
                lineToRelative(1.413f, 1.413f)
                lineTo(14.487f, 1.442f)
                close()
                moveTo(13.26f, 13.945f)
                lineToRelative(5.871f, -5.871f)
                lineToRelative(-4.224f, -4.224f)
                lineToRelative(-5.871f, 5.871f)
                lineToRelative(1.414f, 1.414f)
                lineTo(0.023f, 21.562f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(10.427f, -10.427f)
                lineToRelative(1.396f, 1.396f)
                close()
                moveTo(15.094f, 17.829f)
                lineToRelative(7.889f, -7.89f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-7.889f, 7.89f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _auction!!
    }

private var _auction: ImageVector? = null
