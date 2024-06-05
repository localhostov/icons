package me.localx.icons.rounded.outline

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

public val Icons.Outline.SortCircle: ImageVector
    get() {
        if (_sortCircle != null) {
            return _sortCircle!!
        }
        _sortCircle = Builder(name = "SortCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.756f, 14.521f)
                lineToRelative(-4.607f, 4.503f)
                curveToRelative(-0.635f, 0.635f, -1.663f, 0.635f, -2.298f, 0.0f)
                lineToRelative(-4.607f, -4.503f)
                curveToRelative(-0.569f, -0.556f, -0.175f, -1.521f, 0.62f, -1.521f)
                horizontalLineToRelative(10.272f)
                curveToRelative(0.795f, 0.0f, 1.189f, 0.966f, 0.62f, 1.521f)
                close()
                moveTo(13.149f, 4.976f)
                curveToRelative(-0.635f, -0.635f, -1.663f, -0.635f, -2.298f, 0.0f)
                lineToRelative(-4.607f, 4.503f)
                curveToRelative(-0.569f, 0.556f, -0.175f, 1.521f, 0.62f, 1.521f)
                horizontalLineToRelative(10.272f)
                curveToRelative(0.795f, 0.0f, 1.189f, -0.966f, 0.62f, -1.521f)
                lineToRelative(-4.607f, -4.503f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _sortCircle!!
    }

private var _sortCircle: ImageVector? = null
