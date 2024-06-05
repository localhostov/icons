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

public val Icons.Filled.CaravanAlt: ImageVector
    get() {
        if (_caravanAlt != null) {
            return _caravanAlt!!
        }
        _caravanAlt = Builder(name = "CaravanAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                lineTo(4.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                close()
                moveTo(7.5f, 17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.5f, 17.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(18.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(12.968f, 21.0f)
                curveToRelative(0.386f, -7.931f, -11.311f, -7.933f, -10.943f, 0.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(22.0f, 19.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(20.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _caravanAlt!!
    }

private var _caravanAlt: ImageVector? = null
