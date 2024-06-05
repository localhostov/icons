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

public val Icons.Filled.CloudShowersHeavy: ImageVector
    get() {
        if (_cloudShowersHeavy != null) {
            return _cloudShowersHeavy!!
        }
        _cloudShowersHeavy = Builder(name = "CloudShowersHeavy", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.975f, 24.0f)
                lineToRelative(-1.846f, -0.772f)
                lineToRelative(3.0f, -7.172f)
                lineToRelative(1.846f, 0.771f)
                close()
                moveTo(13.705f, 16.827f)
                lineTo(11.86f, 16.056f)
                lineTo(8.86f, 23.228f)
                lineTo(10.705f, 24.0f)
                close()
                moveTo(9.416f, 16.827f)
                lineTo(7.571f, 16.056f)
                lineTo(4.571f, 23.228f)
                lineTo(6.416f, 24.0f)
                close()
                moveTo(17.44f, 5.059f)
                curveTo(13.553f, -4.066f, 0.024f, 0.218f, 2.266f, 10.05f)
                arcToRelative(5.537f, 5.537f, 0.0f, false, false, 1.593f, 9.7f)
                lineToRelative(1.666f, -3.923f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.286f, 14.0f)
                horizontalLineToRelative(9.975f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.859f, 2.738f)
                lineToRelative(-1.126f, 2.835f)
                curveTo(26.348f, 16.991f, 25.253f, 6.02f, 17.44f, 5.059f)
                close()
            }
        }
        .build()
        return _cloudShowersHeavy!!
    }

private var _cloudShowersHeavy: ImageVector? = null
