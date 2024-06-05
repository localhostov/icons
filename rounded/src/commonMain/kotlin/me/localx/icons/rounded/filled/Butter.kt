package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Butter: ImageVector
    get() {
        if (_butter != null) {
            return _butter!!
        }
        _butter = Builder(name = "Butter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 15.0f)
                lineTo(1.0f, 15.0f)
                lineTo(1.0f, 6.5f)
                curveToRelative(0.0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(18.5f, 2.0f)
                horizontalLineToRelative(-1.04f)
                curveToRelative(0.954f, 1.063f, 1.54f, 2.462f, 1.54f, 4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(23.0f, 6.5f)
                curveToRelative(0.0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23.0f, 17.0f)
                lineTo(1.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.278f)
                curveToRelative(0.626f, 1.758f, 2.308f, 3.0f, 4.222f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.914f, 0.0f, 3.595f, -1.242f, 4.222f, -3.0f)
                horizontalLineToRelative(0.278f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _butter!!
    }

private var _butter: ImageVector? = null
