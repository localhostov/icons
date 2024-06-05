package me.localx.icons.straight.bold

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

public val Icons.Bold.SortNumericDownAlt: ImageVector
    get() {
        if (_sortNumericDownAlt != null) {
            return _sortNumericDownAlt!!
        }
        _sortNumericDownAlt = Builder(name = "SortNumericDownAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.79f, 14.0f)
                lineToRelative(-3.862f, 3.951f)
                lineToRelative(2.146f, 2.098f)
                lineToRelative(0.927f, -0.949f)
                verticalLineToRelative(4.9f)
                horizontalLineToRelative(3.0f)
                lineTo(22.001f, 14.0f)
                horizontalLineToRelative(-2.21f)
                close()
                moveTo(23.0f, 4.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 3.706f, -3.009f, 6.5f, -7.0f, 6.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.056f, 0.0f, 2.119f, -0.339f, 2.883f, -1.002f)
                curveToRelative(-2.152f, -0.062f, -3.883f, -1.831f, -3.883f, -3.998f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(19.0f, 5.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(13.018f, 18.518f)
                lineToRelative(-4.75f, 4.75f)
                curveToRelative(-0.487f, 0.487f, -1.127f, 0.731f, -1.768f, 0.731f)
                reflectiveCurveToRelative(-1.28f, -0.244f, -1.768f, -0.731f)
                lineTo(-0.018f, 18.518f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.896f, 2.896f)
                lineTo(4.999f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.999f, 19.293f)
                lineToRelative(2.896f, -2.896f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _sortNumericDownAlt!!
    }

private var _sortNumericDownAlt: ImageVector? = null
