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

public val Icons.Outline.CloudShowersHeavy: ImageVector
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
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.0f, 8.0f)
                arcToRelative(7.968f, 7.968f, 0.0f, false, false, 0.266f, 2.05f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 1.593f, 9.7f)
                lineToRelative(0.777f, -1.858f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.725f, -6.511f)
                lineToRelative(0.8f, -0.407f)
                lineToRelative(-0.318f, -0.839f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.0f, 2.0f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, true, 5.752f, 4.289f)
                lineToRelative(0.206f, 0.691f)
                lineTo(16.679f, 7.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 3.607f, 9.483f)
                lineToRelative(-1.292f, 3.087f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 17.44f, 5.059f)
                close()
            }
        }
        .build()
        return _cloudShowersHeavy!!
    }

private var _cloudShowersHeavy: ImageVector? = null
