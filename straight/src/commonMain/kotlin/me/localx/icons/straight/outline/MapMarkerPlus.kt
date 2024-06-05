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

public val Icons.Outline.MapMarkerPlus: ImageVector
    get() {
        if (_mapMarkerPlus != null) {
            return _mapMarkerPlus!!
        }
        _mapMarkerPlus = Builder(name = "MapMarkerPlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.668f, 511.885f)
                lineToRelative(150.667f, -147.364f)
                curveToRelative(83.577f, -82.846f, 84.169f, -217.758f, 1.323f, -301.334f)
                reflectiveCurveToRelative(-217.758f, -84.169f, -301.334f, -1.323f)
                curveToRelative(-0.443f, 0.439f, -0.884f, 0.88f, -1.323f, 1.323f)
                curveToRelative(-83.211f, 83.213f, -83.21f, 218.126f, 0.003f, 301.337f)
                curveToRelative(0.056f, 0.056f, 0.112f, 0.112f, 0.168f, 0.168f)
                lineTo(255.668f, 511.885f)
                close()
                moveTo(135.13f, 93.316f)
                curveToRelative(66.524f, -66.618f, 174.458f, -66.695f, 241.076f, -0.17f)
                reflectiveCurveToRelative(66.695f, 174.458f, 0.17f, 241.076f)
                lineTo(255.668f, 452.266f)
                lineTo(135.13f, 334.392f)
                curveToRelative(-66.571f, -66.568f, -66.574f, -174.498f, -0.006f, -241.07f)
                curveTo(135.126f, 93.32f, 135.128f, 93.318f, 135.13f, 93.316f)
                lineTo(135.13f, 93.316f)
                close()
                moveTo(234.36f, 235.162f)
                horizontalLineToRelative(-63.923f)
                verticalLineToRelative(-42.616f)
                horizontalLineToRelative(63.923f)
                verticalLineToRelative(-63.923f)
                horizontalLineToRelative(42.615f)
                verticalLineToRelative(63.923f)
                horizontalLineToRelative(63.923f)
                verticalLineToRelative(42.616f)
                horizontalLineToRelative(-63.923f)
                verticalLineToRelative(63.923f)
                horizontalLineTo(234.36f)
                verticalLineTo(235.162f)
                close()
            }
        }
        .build()
        return _mapMarkerPlus!!
    }

private var _mapMarkerPlus: ImageVector? = null
