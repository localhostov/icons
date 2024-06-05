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

public val Icons.Filled.Trademark: ImageVector
    get() {
        if (_trademark != null) {
            return _trademark!!
        }
        _trademark = Builder(name = "Trademark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.79f, 5.07f)
                curveToRelative(-0.73f, -0.22f, -1.5f, 0.08f, -1.95f, 0.76f)
                lineToRelative(-3.33f, 5.45f)
                lineToRelative(-3.35f, -5.48f)
                curveToRelative(-0.43f, -0.66f, -1.21f, -0.95f, -1.94f, -0.74f)
                curveToRelative(-0.74f, 0.22f, -1.21f, 0.9f, -1.21f, 1.72f)
                verticalLineToRelative(12.21f)
                horizontalLineToRelative(2.0f)
                lineTo(13.01f, 7.76f)
                reflectiveCurveToRelative(4.5f, 7.36f, 4.5f, 7.36f)
                lineToRelative(4.5f, -7.37f)
                verticalLineToRelative(11.24f)
                horizontalLineToRelative(2.0f)
                lineTo(24.01f, 6.79f)
                curveToRelative(0.0f, -0.83f, -0.48f, -1.5f, -1.21f, -1.72f)
                close()
            }
        }
        .build()
        return _trademark!!
    }

private var _trademark: ImageVector? = null
